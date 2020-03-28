package com.shivam.influencerapp

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val fadeInAnim =
            AnimationUtils.loadAnimation(applicationContext, R.anim.fade_in_anim)


        val slideInAnim =
            AnimationUtils.loadAnimation(applicationContext, R.anim.slide_in_left)

        cvProfileEarning.startAnimation(slideInAnim)
        ivProfileUser.startAnimation(fadeInAnim)

        val list: ArrayList<ExampleList> = ArrayList()

        list.add(ExampleList(R.drawable.video, "Cool Video 1", "Some awesome long 1 description"))
        list.add(
            ExampleList(
                R.drawable.ic_launcher_background,
                "Cool Video 2",
                "Some awesome long 2 description"
            )
        )
        list.add(ExampleList(R.drawable.video, "Cool Video 3", "Some awesome long 3 description"))
        list.add(
            ExampleList(
                R.drawable.gradient_profile_earning,
                "Cool Video 4",
                "Some awesome long 4 description"
            )
        )
        list.add(
            ExampleList(
                R.drawable.ic_location,
                "Cool Video 5",
                "Some awesome long 5 description"
            )
        )
        list.add(ExampleList(R.drawable.video, "Cool Video 6", "Some awesome long 6 description"))


        rvProfileVideos.adapter = ProfileAdapter(list)
        rvProfileVideos.setHasFixedSize(true)
    }
}
