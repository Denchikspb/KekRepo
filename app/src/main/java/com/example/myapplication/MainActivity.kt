package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.feature.navigation.NavigationLearnActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationLearnBtn.setOnClickListener {

            val intent = Intent(this, NavigationLearnActivity::class.java)
            startActivity(intent)
        }
    }
}
