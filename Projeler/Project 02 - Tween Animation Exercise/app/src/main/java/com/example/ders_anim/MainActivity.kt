package com.example.ders_anim

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var image: ImageView
    private lateinit var image1:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        image=findViewById(R.id.party)
        image1=findViewById(R.id.stop)
        val frameanim:AnimationDrawable =image.background as AnimationDrawable

        val shutdown=findViewById(R.id.shutdown) as ImageView
        shutdown.setOnClickListener {
            frameanim.start()
        }
        val stop =findViewById(R.id.stop) as ImageView
        stop.setOnClickListener {
            frameanim.stop()
        }
    }
}