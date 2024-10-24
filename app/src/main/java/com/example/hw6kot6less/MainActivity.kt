package com.example.hw6kot6less

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sendEmailButton = null
        sendEmailButton.setOnClickListener {
            sendEmail()
        }
    }

    private fun sendEmail() {
        val recipient = "isaevaaliya5@gmail.com"
        val subject = "send email"
        val message = "Good morning"


        val intent = Intent( Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:$recipient" )
            putExtra(Intent.EXTRA_SUBJECT, subject)
            putExtra(Intent.EXTRA_TEXT, message)

        }




        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            

        }
    }
}

private fun Nothing?.setOnClickListener(function: () -> Unit) {

}
