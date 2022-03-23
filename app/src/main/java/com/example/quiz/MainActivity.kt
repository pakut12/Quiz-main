package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener {
            var num = 0
            if (rd1.isChecked) {

            } else if (rd2.isChecked) {

            } else if (rd3.isChecked) {
                num = 1
            } else if (rd4.isChecked) {

            }
            val i = Intent(this,MainActivity2::class.java)
            i.putExtra("txt1",num.toString())
            startActivity(i)

        }
        button2.setOnClickListener {
            rdg.clearCheck()
        }


    }
}