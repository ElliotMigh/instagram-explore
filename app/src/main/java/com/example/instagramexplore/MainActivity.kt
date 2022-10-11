package com.example.instagramexplore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.instagramexplore.databinding.ActivityMainBinding
import jp.wasabeef.glide.transformations.BlurTransformation
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val url = listOf(
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img1.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img2.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img3.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img4.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img5.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img6.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img7.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img8.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img9.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img10.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img11.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img12.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img13.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img14.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img15.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img16.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img17.png",
            "https://dunijet.ir/YaghootAndroidFiles/ExplorePics/img18.png"
        )
        if (NetWorkChecker(this).isInternetConnected) {
            //use glide:
            val glide = Glide.with(this)

            glide.load(url[0])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image1)

            glide.load(url[1])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image2)

            glide.load(url[2])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image3)

            glide.load(url[3])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image4)

            glide.load(url[4])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image5)

            glide.load(url[5])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image6)

            glide.load(url[6])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image7)

            glide.load(url[7])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image8)

            glide.load(url[8])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image9)

            glide.load(url[9])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image10)

            glide.load(url[10])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image11)

            glide.load(url[11])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image12)

            glide.load(url[12])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image13)

            glide.load(url[13])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image14)

            glide.load(url[14])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image15)

            glide.load(url[15])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image16)

            glide.load(url[16])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image17)

            glide.load(url[17])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.image18)

        } else {
            Toast.makeText(this, "Check your internet first", Toast.LENGTH_SHORT).show()
        }
    }
}