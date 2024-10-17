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

class Skills : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_skills)

        var html = findViewById<ImageView>(R.id.html)
        var css = findViewById<ImageView>(R.id.css)
        var js = findViewById<ImageView>(R.id.js)
        var react = findViewById<ImageView>(R.id.react)
        var node = findViewById<ImageView>(R.id.node)
        var android = findViewById<ImageView>(R.id.android)
        var postgre = findViewById<ImageView>(R.id.postgre)
        var firebase = findViewById<ImageView>(R.id.firebase)
        var mongodb = findViewById<ImageView>(R.id.mongodb)
        var figma = findViewById<ImageView>(R.id.figma)
        var java = findViewById<ImageView>(R.id.java)

        var toolbar : Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        html.setOnClickListener{
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.geeksforgeeks.org/html-tutorial/")
            )
            startActivity(i)
        }
        css.setOnClickListener{
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.geeksforgeeks.org/css-introduction/")
            )
            startActivity(i)
        }
        js.setOnClickListener{
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.geeksforgeeks.org/introduction-to-javascript/")
            )
            startActivity(i)
        }
        react.setOnClickListener{
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.geeksforgeeks.org/reactjs-introduction/")
            )
            startActivity(i)
        }
        node.setOnClickListener{
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.geeksforgeeks.org/node-js-introduction/")
            )
            startActivity(i)
        }
        android.setOnClickListener{
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.geeksforgeeks.org/introduction-to-android-development/")
            )
            startActivity(i)
        }
        postgre.setOnClickListener{
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.geeksforgeeks.org/what-is-postgresql-introduction/?ref=lbp")
            )
            startActivity(i)
        }
        firebase.setOnClickListener{
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.geeksforgeeks.org/firebase-introduction/")
            )
            startActivity(i)
        }
        mongodb.setOnClickListener{
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.geeksforgeeks.org/mongodb-an-introduction/")
            )
            startActivity(i)
        }
        figma.setOnClickListener{
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.geeksforgeeks.org/what-is-figma/")
            )
            startActivity(i)
        }
        java.setOnClickListener{
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.geeksforgeeks.org/introduction-to-java/")
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