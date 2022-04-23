package com.cansukose.dersbndng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.cansukose.dersbndng.databinding.ActivityPremiumBinding


class PremiumActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPremiumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_premium)
        binding.gopremium.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
