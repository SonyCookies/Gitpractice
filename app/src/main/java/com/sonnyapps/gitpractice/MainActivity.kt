package com.sonnyapps.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is contained in my second commit.")
        println("Hello")
        println("Local change")
        println("this line will be merge")
        println("change 4")
        println("ddeeed")
        println("Hello from your friend.")
    }
}