package com.example.a21_listviewbaseadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(
var applicationContext:Context?,
var names: Array<String>,
var photos:Array<Int>
):BaseAdapter(){
    override fun getCount(): Int {
        return names.size
    }

    override fun getItem(p0: Int): Any {
        return p0;
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var inview =LayoutInflater.from(applicationContext).inflate(R.layout.listviewitems,p2,false)
        var name = inview.findViewById<TextView>(R.id.textView)
        var image = inview.findViewById<ImageView>(R.id.imageView)

            name.setText(names[p0])
            image.setImageResource(photos[p0])
        return inview
    }
}