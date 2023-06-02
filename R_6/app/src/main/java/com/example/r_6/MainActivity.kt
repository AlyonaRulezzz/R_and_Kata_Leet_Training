package com.example.r_6

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

        val currentTextValue = binding.helloWorldTextView.text.toString()
        Log.d("TEST_LOG", "Current text value: $currentTextValue")

        val newTextValue = "${binding.helloWorldTextView.text} ${Random.nextInt(100)}"

        binding.helloWorldTextView.text = newTextValue
        Log.d("TEST_LOG", "New text value: $newTextValue")
//        helloWorldTextView = findViewById(R.id.helloWorldTextView)
//        helloWorldTextView.setTextColor(Color.GREEN)

    }

}