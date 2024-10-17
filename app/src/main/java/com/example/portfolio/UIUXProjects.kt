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

class UIUXProjects : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_uiuxprojects)
        var nike = findViewById<ImageView>(R.id.nike)
        var jbl = findViewById<ImageView>(R.id.jbl)
        var srishti = findViewById<ImageView>(R.id.srishti)
        var lays = findViewById<ImageView>(R.id.lays)

        var toolbar : Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        nike.setOnClickListener {
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://firebasestorage.googleapis.com/v0/b/portfolio-react-ebfc3.appspot.com/o/UI%20UX%2FNIKE%20AIR%20Shoes%2F2024-02-07%2010-01-52%20(online-video-cutter.com).mp4?alt=media&token=66ffd620-86aa-4dcc-a2ef-f10b7dc86431")
            )
            startActivity(i)
        }

        jbl.setOnClickListener {
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://firebasestorage.googleapis.com/v0/b/portfolio-react-ebfc3.appspot.com/o/UI%20UX%2FHEADPHONE%20Page%2F0324.mp4?alt=media&token=42b59717-02de-4b31-8c60-f7b7b38e681d")
            )
            startActivity(i)
        }
        srishti.setOnClickListener {
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://firebasestorage.googleapis.com/v0/b/portfolio-react-ebfc3.appspot.com/o/UI%20UX%2FSrishti%20Sanwaad%20App%2F2024-06-27%2017-53-24%20(online-video-cutter.com).mp4?alt=media&token=881ffddf-45cf-4155-a871-4d2ea8b451ad")
            )
            startActivity(i)
        }


        lays.setOnClickListener {
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://firebasestorage.googleapis.com/v0/b/portfolio-react-ebfc3.appspot.com/o/UI%20UX%2FLays%20Home%20Page%2F2024-06-27%2017-54-35%20(online-video-cutter.com).mp4?alt=media&token=bde80a0e-2efa-4a56-abcb-9883dba74560")
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