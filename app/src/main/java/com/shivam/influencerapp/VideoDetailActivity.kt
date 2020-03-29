package com.shivam.influencerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class VideoDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_detail)

        val intent1:Intent= intent;
        val title=intent1.getStringExtra("vTitle")

        Toast.makeText(this,"Title is $title",Toast.LENGTH_SHORT).show()
    }
}
