package com.shivam.influencerapp

import java.util.*

data class ExampleList(
    val imgRes: Int,
    val title: String,
    val description: String,
    val subDate: String,
    val isAccepted: Boolean,
    val earnings:Int=0
)