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

        //coping data objects
        val student3 = student1.copy(age = 23)
        Log.i("MyTAG", "Age of copied ${student3.name} is ${student3.age}")

        //destructuring student2
        val name = student2.component1() // this will give the String name
        val email = student2.component2() // this will give the String email
        val age = student2.component3() // this will give the Int age

        Log.i("MyTAG", "de structured $name is $age")

        data class Book(val name: String, val pages: Int){
            val price = 34.5

            override fun toString(): String {
                return "Book(name=$name, pages=$pages, price=$price)"
            }
        }

        val book = Book("MyStory",15)

        Log.i("MyTAG"," ${book.name} has ${book.pages} pages. It's price is ${book.price}" )

        Log.i("MyTAG",book.toString() )

        book.
    }
}
