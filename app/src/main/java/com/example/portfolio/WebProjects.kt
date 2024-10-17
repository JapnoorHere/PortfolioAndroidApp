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

class WebProjects : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_web_projects)
        var mss = findViewById<ImageView>(R.id.mss)

        mss.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/JapnoorHere/MadhavSewaSociety"))
            startActivity(i)
        }


        var toolbar : Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

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