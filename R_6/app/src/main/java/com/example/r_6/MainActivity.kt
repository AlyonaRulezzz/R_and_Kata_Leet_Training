package com.example.r_6

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.example.r_6.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

//    lateinit var helloWorldTextView : TextView
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with (binding.helloWorldTextView) {
            setTextColor(Color.MAGENTA)
            text = "fdsyrt "
            setLines(2)
        }

        with (binding.bearPicture) {
            setBackgroundResource(R.drawable.ic_launcher_background)
            setImageResource(R.drawable.ic_launcher_foreground)
        }

        binding.bearPicture.requestLayout()
        Glide.with(this)
            .load("https://images.unsplash.com/photo-1540236261390-89c218511f2b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1374&q=80")
            .error(R.drawable.bear)
            .into(binding.bearPicture)

        val currentTextValue = binding.helloWorldTextView.text.toString()
        Log.d("TEST_LOG", "Current text value: $currentTextValue")

        val newTextValue = "${binding.helloWorldTextView.text} ${Random.nextInt(100)}"

        binding.helloWorldTextView.text = newTextValue
        Log.d("TEST_LOG", "New text value: $newTextValue")
//        helloWorldTextView = findViewById(R.id.helloWorldTextView)
//        helloWorldTextView.setTextColor(Color.GREEN)

    }

}