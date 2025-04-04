package com.example.mywinningmeal

import android.os.Bundle
import android.widget.EditText
import android.widget.Switch
import android.widget.ToggleButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.AlbumsTab.value
import androidx.collection.emptyLongSet
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mywinningmeal.ui.theme.MyWinningMealTheme
import kotlin.reflect.KProperty


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

                )
                Spacer(modifier = Modifier.size(30.dp))

//Welcome Message to Hera
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
                        Text(text = "You can now type in the meal time you want!")
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

                    Spacer(modifier = Modifier.size(200.dp))


                    // Clearing the users input
                    Button(onClick = {
                        userInput =""
                        mealSuggestion = ""
                    }) {

                        Text(text = "Reset")
                    }
                }
                
                
                Row {
                    Text(text = mealSuggestion)

                    Spacer(modifier = Modifier.size(100.dp))



                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    Text(text = howTo,
                        fontSize = 20.sp,
                        fontStyle = FontStyle.Italic)
                }

                Spacer(modifier = Modifier.size(40.dp))

                //The how to button that will give the user instructions on how to use the App
                Column{


                    Button(onClick = { /*TODO*/
                        howTo = "Hi Hera. Type the meal time(Morning, Morning Snack, Afternoon, Afternoon Snack,Evening, Evening Snack) and click on Suggest Button"


                    }) {
                        Text(text = "How to")
                    }

                }




                }




                }

            }
        }








