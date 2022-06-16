package com.example.progressdialogkot9

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val progd=ProgressDialog(this@MainActivity)
        val strb=findViewById<Button>(R.id.button)
        strb.setOnClickListener {
            progd.setTitle("prashant chauhan")
            progd.setMessage("this is progress bar")
            progd.show()
        }
    }
}