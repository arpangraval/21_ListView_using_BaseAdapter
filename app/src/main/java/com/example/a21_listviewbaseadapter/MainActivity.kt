package com.example.a21_listviewbaseadapter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var names = arrayOf("Arpan","Sweta","Alexa","Krishna","Maithili")
        var photos = arrayOf(R.drawable.pass3,R.drawable.pass2,R.drawable.pass1,R.drawable.pass4,R.drawable.pass5)
        var adapter = CustomAdapter(applicationContext,names,photos)
        imagenamelist.adapter = adapter
        imagenamelist.setOnItemClickListener { parent, view, position, l ->
            val selectedItem = names[position]
            when(selectedItem){
                "Arpan" ->{startActivity(Intent(this, NewActivity1::class.java))
                Toast.makeText(this,"You have clicked on Arpan",Toast.LENGTH_LONG).show()}
                "Sweta" ->{startActivity(Intent(this, NewActivity1::class.java))}
                "Alexa" ->{startActivity(Intent(this, NewActivity1::class.java))}
                "Krishna" ->{startActivity(Intent(this, NewActivity1::class.java))}
                "Maithili" ->{startActivity(Intent(this, NewActivity1::class.java))}
            }

        }
    }
}