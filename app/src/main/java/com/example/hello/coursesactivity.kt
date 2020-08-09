package com.example.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_coursesactivity.*
import layout.CoursesRecyclerViewAdapter


data class Coursesactivity(val courses_id:Int, val courses_name:String, val course_code:Int, val instructor:String, val Description:String)
class coursesactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coursesactivity)
        rvCourses.layoutManager = LinearLayoutManager(baseContext)
        val CoursesAdapter = CoursesRecyclerViewAdapter(
            listOf(

                Coursesactivity(5006, "Kotlin", 4014, "Ndung'u", "Kotlin project1"),
                Coursesactivity(5007, "Kotlin", 4024, "Kimulwa", "Kotlin project1"),
                Coursesactivity(5008, "Kotlin", 4034, "Chebet", "Kotlin project1"),
                Coursesactivity(5009, "Kotlin", 4044, "Wainaina", "Kotlin project1"),
                Coursesactivity(5000, "Kotlin", 4054, "Colins", "Kotlin project1"),
                Coursesactivity(5001, "Kotlin", 4064, "Kamau", "Kotlin project1"),
                Coursesactivity(5002, "Kotlin", 4074, "Shiliza", "Kotlin project1"),
                Coursesactivity(5003, "Kotlin", 40084, "Davy", "Kotlin project1"),
                Coursesactivity(5004, "Kotlin", 40894, "Bridgit", "Kotlin project1"),
                Coursesactivity(5005, "Kotlin", 40674, "Brenda", "Kotlin project1")

            )
        )
        rvCourses.adapter =CoursesAdapter
    }
}


