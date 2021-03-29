package com.example.test_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btn.setOnClickListener{
//            Toast.makeText(this, "토스트", Toast.LENGTH_SHORT).show()
//        }
    }

    fun DDuck(v : View) {
        tv.text = "뚝"
    }

}