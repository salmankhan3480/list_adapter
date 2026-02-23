package com.example.list_adapter

import User
import android.annotation.SuppressLint
import android.content.Context
import android.location.GpsStatus
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.collection.floatIntMapOf


class myadapter (val mcontext: Context,val arrayList: ArrayList<User>):
    ArrayAdapter<User>(mcontext,R.layout.listviewdesgin,arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(mcontext)
         val view = inflater.inflate(R.layout.listviewdesgin,null)

        val Name = view.findViewById<TextView>(R.id.TV_name)
        val Lastmassge = view.findViewById<TextView>(R.id.TV_lastmsge)
        val Time = view.findViewById<TextView>(R.id.TV_time)
        val Iage = view.findViewById<ImageView>(R.id.TV_image)


       Name .text = arrayList[position].name
        Lastmassge.text = arrayList[position].lastmassge
        Time.text =arrayList[position].time
        Iage.setImageResource(arrayList[position].image)

        return view
    }

}



