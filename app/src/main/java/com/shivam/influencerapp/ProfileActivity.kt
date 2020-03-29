package com.shivam.influencerapp

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profile.*


class ProfileActivity : AppCompatActivity() {
    private val list: ArrayList<ExampleList> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val fadeInAnim =
            AnimationUtils.loadAnimation(applicationContext, R.anim.fade_in_anim)


        val slideInAnim =
            AnimationUtils.loadAnimation(applicationContext, R.anim.slide_in_left)

        cvProfileEarning.startAnimation(slideInAnim)
        ivProfileUser.startAnimation(fadeInAnim)

        makeDummyDataList()

        rvProfileVideos.adapter = ProfileAdapter(list)
        rvProfileVideos.setHasFixedSize(true)


        val spinnerList: ArrayList<String> = ArrayList()
        spinnerList.add("Sort by")
        spinnerList.add("Date")
        spinnerList.add("Month")
        spinnerList.add("Year")

        val dataAdapter: ArrayAdapter<String> =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spinnerList)
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spnProfile.adapter = dataAdapter


        spnProfile.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (parent.selectedItem == "Sort by") {
                } else {
                    Toast.makeText(
                        applicationContext,
                        "Selected item is " + parent.getItemAtPosition(position).toString(),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

    }


    private fun makeDummyDataList() {

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

    }
}
