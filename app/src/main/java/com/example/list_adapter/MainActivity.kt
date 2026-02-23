package com.example.list_adapter

import User
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.cos

class MainActivity : AppCompatActivity() {
    lateinit var arrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val Name = arrayOf("salman khan","lqman ","zakaya","farhan","numan",)
        val lastmsge  = arrayOf("Hi","everyone","good","good night","good luck")
        val time = arrayOf("2:3 AM","3:33 PM","2:3 AM","3:33 PM","3:43 AM")
        val image = intArrayOf(R.drawable.image1,R.drawable.iamge4,R.drawable.iamge4,R.drawable.image5,R.drawable.image1)

        arrayList = ArrayList()

        for (eacitem in  Name.indices){

            val user = User(Name[eacitem],lastmsge[eacitem],time[eacitem],image[eacitem])
            arrayList.add(user)
        }
        val listview = findViewById<ListView>(R.id.list_view)
        listview.adapter = myadapter(this,arrayList)


    }
    }

