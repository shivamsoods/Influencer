package com.shivam.influencerapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.anilokcun.uwmediapicker.UwMediaPicker
import kotlinx.android.synthetic.main.activity_submit_video.*


class SubmitVideoActivity : AppCompatActivity() {

    val REQUEST_CODE = 879
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit_video)


        btnVideoSelect.setOnClickListener {
            UwMediaPicker
                .with(this)
                .setRequestCode(REQUEST_CODE)
                .setGalleryMode(UwMediaPicker.GalleryMode.VideoGallery)
                .setMaxSelectableMediaCount(1)
                .setLightStatusBar(true)
                .open()
        }

        btnVideoUpload.setOnClickListener {
            Toast.makeText(applicationContext,"Your Video will be uploaded",Toast.LENGTH_LONG).show()
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null && requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            val selectedVideosPathsList =
                data.getStringArrayExtra(UwMediaPicker.UwMediaPickerVideosArrayKey)

            Toast.makeText(
                applicationContext,
                "Link is ${selectedVideosPathsList[0]}",
                Toast.LENGTH_SHORT
            ).show()

            vvVideoPreview.setVideoPath(selectedVideosPathsList[0])
            vvVideoPreview.seekTo(1)
            vvVideoPreview.visibility = View.VISIBLE
        }
    }


}
