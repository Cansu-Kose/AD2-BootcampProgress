package com.cansukose.ders2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        var button=findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            var intent=Intent(this,PremiumActivity::class.java)
            startActivity(intent)
        }
    }
}