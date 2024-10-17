package com.example.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AppProjects : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_projects)
        var aes = findViewById<ImageView>(R.id.aes)
        var eagle = findViewById<ImageView>(R.id.eagle)
        var word = findViewById<ImageView>(R.id.word)

        var toolbar : Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        aes.setOnClickListener {
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://github.com/JapnoorHere/AESEncryptionDecryption")
            )
            startActivity(i)
        }

        eagle.setOnClickListener {
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://github.com/JapnoorHere/EagleEyeVigilanceApp")
            )
            startActivity(i)
        }

        word.setOnClickListener {
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://github.com/JapnoorHere/WordGuessingGame")
            )
            startActivity(i)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.linkedin -> {
                val i = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.linkedin.com/in/japnoor-singh/")
                )
                startActivity(i)
                true
            }

            R.id.github -> {
                val i = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://github.com/JapnoorHere")
                )
                startActivity(i)
                true
            }

            R.id.contact -> {
                val i = Intent(Intent.ACTION_DIAL)
                i.setData(Uri.parse("tel:+919041175563"))
                startActivity(i)
                true
            }

            R.id.email -> {
                val i = Intent(
                    this,
                    EmailIntent::class.java
                )
                startActivity(i)
                true
            }

            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }
}