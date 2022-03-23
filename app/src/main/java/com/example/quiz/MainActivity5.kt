package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main4.*
import kotlinx.android.synthetic.main.activity_main4.rd1
import kotlinx.android.synthetic.main.activity_main4.rd2
import kotlinx.android.synthetic.main.activity_main4.rd3
import kotlinx.android.synthetic.main.activity_main4.rd4
import kotlinx.android.synthetic.main.activity_main4.rdg
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        button14.setOnClickListener {
            val i = Intent(this, MainActivity4::class.java)
            startActivity(i)
        }
        button15.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
        button9.setOnClickListener {
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
            Toast.makeText(this, "คำตอบที่ถูกต้องทั้งหมด", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, pl.toString(), Toast.LENGTH_SHORT).show()
        }
        button10.setOnClickListener {
            rdg.clearCheck()
        }
    }
}