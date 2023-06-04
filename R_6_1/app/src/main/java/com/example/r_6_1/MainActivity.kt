package com.example.r_6_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.r_6_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.textView) {
            text = "textViewFromMainActivity"
            setTextColor(Color.CYAN)
            setLines(2)
        }

        with(binding.imageView) {
            setImageResource(R.drawable.ic_launcher_foreground)
            setBackgroundResource(R.drawable.ic_launcher_background)
        }

        Glide.with(this)
            .load("https://loremflickr.com/200/200/")
            .skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .into(binding.imageView)

    }

}