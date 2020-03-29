package com.shivam.influencerapp

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_video_detail.*

class VideoDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_detail)

        val imgRes = intent.getIntExtra("vImgRes", 567)
        val title = intent.getStringExtra("vTitle")
        val description = intent.getStringExtra("vDescription")
        val subDate = intent.getStringExtra("vSubDate")
        val isAccepted = intent.getBooleanExtra("vIsAccepted", false)
        val earning = intent.getIntExtra("vEarning", 0)


        ivDetailVideoItem.setImageResource(imgRes)
        tvDetailVideoTitle.text = title
        tvDetailVideoDescription.text = description
        tvVideoDetailSubDate.text = subDate


        if (isAccepted) {
            tvVideoDetailStatus.setBackgroundColor(Color.parseColor("#30d110"))
            tvVideoDetailStatus.text = "Approved"
            tvVideoDetailEarning.text = "₹ $earning"

        } else {
            tvVideoDetailStatus.setBackgroundColor(Color.RED)
            tvVideoDetailStatus.text = "Not Approved"
            tvVideoDetailEarning.visibility = View.GONE


        }


    }
}
