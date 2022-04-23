package com.cansukose.dersbndng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.cansukose.dersbndng.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity(){

    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_start)
        binding.button2.setOnClickListener {

            val intent = Intent(this, PremiumActivity::class.java)
            startActivity(intent)
        }
    }

}