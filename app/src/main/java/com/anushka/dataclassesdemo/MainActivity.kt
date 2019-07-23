package com.anushka.dataclassesdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data class Student(val name: String, val email: String, val age: Int)

        val student1 = Student("Jane", "jane@gmail.com", 27)
        val student2 = Student("Alex", "alex@gmail.com", 35)

        val sumOfAges = student1.age + student2.age

        Toast.makeText(
            this,
            "Welcome ${student1.name} and ${student2.name} , sum of ages is $sumOfAges",
            Toast.LENGTH_LONG
        ).show()

        Log.i("MyTAG", "Age of ${student1.name} is ${student1.age}")
        Log.i("MyTAG", "Email of ${student2.name} is ${student2.email}")

    }
}