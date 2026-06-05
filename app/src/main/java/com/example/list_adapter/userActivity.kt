package com.example.list_adapter

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class userActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user)

        val getName = intent.getStringExtra("name")
        val getlastmassge = intent.getStringExtra("lastmassge")
        val getimage = intent.getIntExtra("image",R.drawable.image1)

        val UserName = findViewById<TextView>(R.id.TV_userName)
        val Userlastmassge = findViewById<TextView>(R.id.TV_userlastmassge)
        val Userimage = findViewById<ImageView>(R.id.IV_useriamge)


        UserName.text = getName.toString()
        Userlastmassge.text = getlastmassge
        Userimage.setImageResource(getimage)
    }
}