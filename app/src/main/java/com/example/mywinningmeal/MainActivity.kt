package com.example.mywinningmeal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Magenta
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            

            var userInput by remember {
                mutableStateOf("")
        }

            var mealSuggestion by remember {
                mutableStateOf("")
            }


            var howTo by remember{
                mutableStateOf("")
            }


            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            )

            {
                Spacer(modifier = Modifier.size(30.dp))

                Text(
                    text = "My Winning Meal",
                    fontSize = 40.sp,
                    fontWeight = Bold,
                    color = Magenta

                )
                Spacer(modifier = Modifier.size(30.dp))
                // Greeting Message to Hera
                Text(text = "Hi Hera!",
                    fontSize = 20.sp)
                
                Text(text = "Let me suggest a meal for you.",
                    fontSize = 20.sp)

                Text(text = "Click the 'how to' button for Instructions",
                    fontSize = 14.sp,
                    fontStyle = FontStyle.Italic)


                Spacer(modifier = Modifier.size(30.dp))


                //Input box: Random Meal Selection by time of day. User will enter time of day and get the suggestion
                OutlinedTextField(value  =userInput,
                    onValueChange = {text -> userInput = text},

                    placeholder = {
                        Text(text = "You can type in the time of day you want!")
                    },



                )
                Spacer(modifier = Modifier.size(20.dp))

                // Suggestion Button: User will click button and the meal suggestion will display.
                Row {
                    Button(onClick = {

                        mealSuggestion = when (userInput) {

                        "Morning"->"Good Morning, Hera. Oatmeal with banana is a healthy way to start the day."
                        "Morning Snack"-> "An apple a day keeps the doctor away"
                        "Afternoon" -> "Good Afternoon, Hera. Would you like some Chicken Mushroom Pie."
                        "Afternoon Snack" ->"A chocolate isn't always bad."
                        "Evening" -> "Good Evening, Hera. Chicken Alfredo is will do you good after a long day."
                        "Evening Snack"->"Popcorn is great before bed."
                        else -> "Hi Hera. You're entry has an error, Try again with the correct meal time."

                    }

                    }
                    )

                    {
                        Text(text = "Suggestion")

                    }

                    Spacer(modifier = Modifier.size(140.dp))


                    // Clearing the users input
                    Button(onClick = {
                        userInput =""
                        mealSuggestion = ""
                    }) {

                        Text(text = "Reset")
                    }
                }
                
                
                Box(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    Text(text = mealSuggestion,
                        fontSize = 25.sp,
                        fontWeight = Bold,
                        color = Magenta,

                    )

                    Spacer(modifier = Modifier.size(150.dp))



                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    Text(text = howTo,
                        fontSize = 18.sp,
                        fontStyle = FontStyle.Italic)
                }

                Spacer(modifier = Modifier.size(40.dp))

                //The how to button that will give the user instructions on how to use the App
                Column{
                    Button(onClick = { /*TODO*/
                        howTo = "Hi Hera. Type the meal time(Morning, Morning Snack, Afternoon, Afternoon Snack,Evening, Evening Snack) and click on Suggest Button'. And Error message will display if the input is typed wrong."

                    }) {
                        Text(text = "How to")
                    }

                }

            }

        }

    }
}








