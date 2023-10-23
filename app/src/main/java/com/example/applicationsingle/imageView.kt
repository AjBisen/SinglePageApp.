package com.example.applicationsingle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Toast

class imageView : AppCompatActivity() {

    private lateinit var butt: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)

        butt = findViewById<Button>(R.id.btn)

        butt.setOnClickListener {
            val animationFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            butt.startAnimation(animationFadeOut)
        }

    }
}