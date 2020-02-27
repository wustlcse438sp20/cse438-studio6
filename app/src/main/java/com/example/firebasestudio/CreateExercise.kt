package com.example.firebasestudio

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_exercise.*
import java.util.*


class CreateExercise : AppCompatActivity() {
    //todo 1: create an instance of the FirebaseFireStore


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_exercise)

        //todo 2: initialize an instance of the firebase database

    }

    override fun onStart() {
        super.onStart()

        create_exercise_button.setOnClickListener {
            if (exercise_name_input.text.toString() != "" &&
                exericse_reps_input.text.toString() != "" &&
                exercise_sets_input.text.toString() != "" &&
                exercise_weight_input.text.toString() != "" &&
                exercise_difficulty_input.text.toString() != "" &&
                exercise_date_input.text.toString() != ""
            ) {
                //create a new exercise
                val exercise = Exercise(
                    exercise_name_input.text.toString(),
                    exericse_reps_input.text.toString().toInt(),
                    exercise_sets_input.text.toString().toInt(),
                    exercise_weight_input.text.toString().toDouble(),
                    exercise_difficulty_input.text.toString().toInt(),
                    exercise_date_input.text.toString()
                )

                //todo 3: store the exercise object in the db

            }else{
                Toast.makeText(this, "Values cannot be null", Toast.LENGTH_LONG)
            }
        }
    }
}
