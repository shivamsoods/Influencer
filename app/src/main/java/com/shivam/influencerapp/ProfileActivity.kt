package com.shivam.influencerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        val list:ArrayList<ExampleList> = ArrayList()

        list.add(ExampleList(R.drawable.video,"Cool Video 1","Some awesome long 1 description"))
        list.add(ExampleList(R.drawable.ic_launcher_background,"Cool Video 2","Some awesome long 2 description"))
        list.add(ExampleList(R.drawable.video,"Cool Video 3","Some awesome long 3 description"))
        list.add(ExampleList(R.drawable.ic_phone,"Cool Video 4","Some awesome long 4 description"))
        list.add(ExampleList(R.drawable.ic_location,"Cool Video 5","Some awesome long 5 description"))
        list.add(ExampleList(R.drawable.video,"Cool Video 6","Some awesome long 6 description"))


        rvProfileVideos.adapter=ProfileAdapter(list)
        rvProfileVideos.setHasFixedSize(true)
    }
}
