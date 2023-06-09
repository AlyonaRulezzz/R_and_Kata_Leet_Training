package com.example.r_6_1

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.example.r_6_1.databinding.ActivityMainBinding
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    private var useKeyword = false

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
//            setBackgroundResource(R.drawable.ic_launcher_background)
        }

        binding.button.setOnClickListener {
            shortClick()
        }

        binding.editText.setOnEditorActionListener { textView, i, keyEvent ->
            if (binding.editText.imeActionId == i) {
                return@setOnEditorActionListener shortClick()
            } else {
                return@setOnEditorActionListener false
            }
        }

    }

    private fun shortClick() : Boolean {
        val keyword = binding.editText.text.toString()
        val encodedKeyword = URLEncoder.encode(keyword, StandardCharsets.UTF_8.name())

        binding.progressBar.visibility = View.VISIBLE

        if (keyword.isBlank()) {
            binding.editText.error = "Keyword is empty"
            return true
        }

        Glide.with(this)
            .load("https://loremflickr.com/200/200/$encodedKeyword")
            .listener(object : RequestListener<Drawable> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable>?,
                    isFirstResource: Boolean
                ): Boolean {
                    binding.progressBar.visibility = View.GONE
                    return false
                }

                override fun onResourceReady(
                    resource: Drawable?,
                    model: Any?,
                    target: Target<Drawable>?,
                    dataSource: DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    binding.progressBar.visibility = View.GONE
                    return false
                }

            })
            .error(R.drawable.bear)
//            .placeholder(R.drawable.bear)
            .skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .into(binding.imageView)
        return false
    }

}