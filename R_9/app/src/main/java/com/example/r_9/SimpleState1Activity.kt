package com.example.r_9

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import com.example.r_9.databinding.ActivityCounterBinding
import kotlin.random.Random

class SimpleState1Activity : AppCompatActivity() {

    lateinit var binding: ActivityCounterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCounterBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.incrementButton.setOnClickListener { increment() }
        binding.randomColorButton.setOnClickListener { setRandomColor() }
        binding.switchVisibilityButton.setOnClickListener { switchVisibility() }
    }

    private fun increment() {
        var counter = binding.CounterTextView.text.toString().toInt()
        counter++
        binding.CounterTextView.setText(counter.toString())
    }

    private fun setRandomColor() {
        val randomColor = Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
        binding.CounterTextView.setTextColor(randomColor)
    }

    private fun switchVisibility() = if (binding.CounterTextView.visibility == VISIBLE)
        binding.CounterTextView.visibility = INVISIBLE
                                    else
        binding.CounterTextView.visibility = VISIBLE

}