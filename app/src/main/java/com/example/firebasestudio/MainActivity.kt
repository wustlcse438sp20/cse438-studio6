package com.example.firebasestudio

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
    var exerciseList : ArrayList<Exercise> = ArrayList()
    //todo 4: create an instance of FirebaseFireStore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //todo 5: set the instance instance of firebase

    }

    override fun onStart() {
        super.onStart()

        //set recycler view
        val recyclerView = findViewById<RecyclerView>(R.id.exercise_list_view)
        val adapter = ExerciseListAdapter(exerciseList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        //intent to the create exercise activity
        add_exercise_button.setOnClickListener{
            val intent = Intent(this, CreateExercise::class.java)
            startActivity(intent)
        }

        //todo 6: query for all exercises in the collection and add them to exerciseList


        search_date_input.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                //todo 7: query for documents by the chosen data and update the exerciseList

            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })
    }
}
