package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main3.rd1
import kotlinx.android.synthetic.main.activity_main3.rd2
import kotlinx.android.synthetic.main.activity_main3.rd3
import kotlinx.android.synthetic.main.activity_main3.rd4
import kotlinx.android.synthetic.main.activity_main3.rdg
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        button13.setOnClickListener {
            val i = Intent(this, MainActivity3::class.java)
            startActivity(i)
        }
        button7.setOnClickListener {
            val i1 = intent

            var totel = i1.getStringExtra("txt1")

            var num = 0
            if (rd1.isChecked) {

            } else if (rd2.isChecked) {

            } else if (rd3.isChecked) {
                num = 1
            } else if (rd4.isChecked) {

            }
            var pl = (totel.toString().toInt() + num.toInt())
            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("txt1", pl.toString())
            startActivity(i)

        }
        button8.setOnClickListener {
            rdg.clearCheck()
        }
    }
}