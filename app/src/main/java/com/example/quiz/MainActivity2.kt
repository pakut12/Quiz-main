package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.rd1
import kotlinx.android.synthetic.main.activity_main.rd2
import kotlinx.android.synthetic.main.activity_main.rd3
import kotlinx.android.synthetic.main.activity_main.rd4
import kotlinx.android.synthetic.main.activity_main.rdg
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button11.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
        button3.setOnClickListener {
            val i1 = intent

            var totel = i1.getStringExtra("txt1")

            var num = 0
            if (rd1.isChecked) {
                num = 1
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
        button4.setOnClickListener {
            rdg.clearCheck()
        }
    }
}