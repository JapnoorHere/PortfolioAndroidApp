 package com.example.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var about = findViewById<Button>(R.id.about)
        var skills = findViewById<Button>(R.id.skills)
        var projects = findViewById<Button>(R.id.projects)
        var cvBtn = findViewById<Button>(R.id.cvBtn)

        var toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        about.setOnClickListener {
            var intent = Intent(this@MainActivity, About::class.java)
            startActivity(intent)
        }

        skills.setOnClickListener {
            var intent = Intent(this@MainActivity, Skills::class.java)
            startActivity(intent)
        }

        projects.setOnClickListener {
            var intent = Intent(this@MainActivity, Projects::class.java)
            startActivity(intent)
        }

        cvBtn.setOnClickListener {
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1sVn-1Vu5KAfnuUT5BjLMOuVHijID-e50/view?usp=sharing")
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