package com.charlie.workout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.charlie.workout.databinding.ActivityWorkoutsBinding
import com.charlie.workout.sport.JumpActivity
import com.charlie.workout.sport.RunActivity
import com.charlie.workout.sport.SwimActivity

class WorkoutsActivity : AppCompatActivity() {

        lateinit var binding: ActivityWorkoutsBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityWorkoutsBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.card1.setOnClickListener{
                startActivity(Intent(this, SwimActivity::class.java))
            }

            binding.card2.setOnClickListener{
                startActivity(Intent(this, RunActivity::class.java))
            }
            binding.card3.setOnClickListener{
                startActivity(Intent(this, JumpActivity::class.java))
            }


    }
}