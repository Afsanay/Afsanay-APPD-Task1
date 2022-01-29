package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button=findViewById(R.id.button2)

        val name: TextView =findViewById(R.id.name)
        val bjp:EditText=findViewById(R.id.editText2)
        btn.setOnClickListener(View.OnClickListener{
            val str1:String=name.text.toString()
            if (str1.equals("")){
                Toast.makeText(this, "Please Enter Name",Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Hey $str1 Go Corona Go", Toast.LENGTH_SHORT).show()
            }
        })


    }
}