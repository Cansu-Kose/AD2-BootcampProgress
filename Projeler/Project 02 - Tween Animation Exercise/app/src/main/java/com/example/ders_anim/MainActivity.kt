package com.example.ders_anim

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val party:ImageView=findViewById(R.id.party)
        val shutdown:ImageView=findViewById(R.id.shutdown)

        shutdown.setOnClickListener {
            val giff: Animation = AnimationUtils.loadAnimation(this, R.anim.my_anim)
            party.startAnimation(giff)
        }



    }
}