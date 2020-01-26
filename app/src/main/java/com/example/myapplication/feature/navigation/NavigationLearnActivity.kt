package com.example.myapplication.feature.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.feature.navigation.fragments.FirstFragment
import kotlinx.android.synthetic.main.activity_navigation_learn.*

class NavigationLearnActivity : AppCompatActivity() {

//    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_learn)

//        navController = Navigation.findNavController(this,
//            R.id.nav_host_fragment
//        )

        main_nav_button.setOnClickListener {
            val newFragment = FirstFragment.newInstance()

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.content_fragment, newFragment)
                .commit()
        }
    }
}
