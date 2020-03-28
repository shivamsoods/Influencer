package com.shivam.influencerapp


import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        hideActionBar()

        val topCurveAnim =
            AnimationUtils.loadAnimation(applicationContext, R.anim.top_down)


        val editTextAnim =
            AnimationUtils.loadAnimation(applicationContext, R.anim.edit_text_anim)


        val textViewAnim =
            AnimationUtils.loadAnimation(applicationContext, R.anim.edit_text_anim)
        val centerRevealAnim =
            AnimationUtils.loadAnimation(applicationContext, R.anim.center_reveal_anim)


        btnLoginEmail.setOnClickListener {
            grpLoginButton.visibility = View.GONE
            cvLoginMobile.visibility = View.GONE
            cvLoginEmail.visibility = View.VISIBLE

            etLoginEmail.startAnimation(editTextAnim)
            etLoginPassword.startAnimation(editTextAnim)

            tvLoginEmail.startAnimation(textViewAnim)
            tvLoginPassword.startAnimation(textViewAnim)
        }

        tvLoginSwitchToEmail.setOnClickListener {
            grpLoginButton.visibility = View.GONE
            cvLoginMobile.visibility = View.GONE
            cvLoginEmail.visibility = View.VISIBLE

            etLoginEmail.startAnimation(editTextAnim)
            etLoginPassword.startAnimation(editTextAnim)

            tvLoginEmail.startAnimation(textViewAnim)
            tvLoginPassword.startAnimation(textViewAnim)
        }

        tvLoginSwitchToMobile.setOnClickListener {
            grpLoginButton.visibility = View.GONE
            cvLoginMobile.visibility = View.VISIBLE
            cvLoginEmail.visibility = View.GONE

            etLoginMobile.startAnimation(editTextAnim)
            tvLoginMobile.startAnimation(textViewAnim)
        }


        btnLoginMobile.setOnClickListener {
            grpLoginButton.visibility = View.GONE
            cvLoginMobile.visibility = View.VISIBLE
            cvLoginEmail.visibility = View.GONE

            etLoginMobile.startAnimation(editTextAnim)
            tvLoginMobile.startAnimation(textViewAnim)
        }

        btnLoginEmail2.setOnClickListener {
            Toast.makeText(applicationContext, "Email used", Toast.LENGTH_SHORT).show()
        }

        btnLoginMobile2.setOnClickListener {
            Toast.makeText(applicationContext, "Mobile used", Toast.LENGTH_SHORT).show()
        }



        ivLoginTopShape.startAnimation(topCurveAnim)


    }

    private fun hideActionBar() {
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        supportActionBar?.hide()
    }
}
