package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.rd1
import kotlinx.android.synthetic.main.activity_main2.rd2
import kotlinx.android.synthetic.main.activity_main2.rd3
import kotlinx.android.synthetic.main.activity_main2.rd4
import kotlinx.android.synthetic.main.activity_main2.rdg
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        button12.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
        button5.setOnClickListener {
            val i1 = intent

            var totel = i1.getStringExtra("txt1")

            var num = 0
            if (rd1.isChecked) {

            } else if (rd2.isChecked) {

            } else if (rd3.isChecked) {

            } else if (rd4.isChecked) {
                num = 1
            }
            var pl = (totel.toString().toInt() + num.toInt())
            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("txt1", pl.toString())
            startActivity(i)

        }
        button6.setOnClickListener {
            rdg.clearCheck()
        }
    }
}