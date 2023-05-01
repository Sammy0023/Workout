package com.charlie.workout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.charlie.workout.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val anim1 = AnimationUtils.loadAnimation(this, R.anim.splash)
        val anim2 = AnimationUtils.loadAnimation(this, R.anim.splashtwo)
        val anim3 = AnimationUtils.loadAnimation(this, R.anim.splashfour)
        val anim4 = AnimationUtils.loadAnimation(this, R.anim.splashthree)
        binding.swimImageView.startAnimation(anim1)
        binding.jumpImageView.startAnimation(anim2)
        binding.runImageView.startAnimation(anim3)
        binding.workoutTextView.startAnimation(anim4)
        anim1.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                startActivity(Intent(this@MainActivity, WorkoutsActivity::class.java))
                finish()
            }

            override fun onAnimationRepeat(animation: Animation?) {
                Toast.makeText(this@MainActivity, "repeat", Toast.LENGTH_SHORT).show()
            }

        })
    }
}