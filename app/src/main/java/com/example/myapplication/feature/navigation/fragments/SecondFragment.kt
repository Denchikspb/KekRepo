package com.example.myapplication.feature.navigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    companion object {

        fun newInstance(): Fragment =
            SecondFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        second_nav_button.setOnClickListener {
            val newFragment = ThirdFragment.newInstance()

            fragmentManager?.beginTransaction()
                ?.replace(R.id.content_fragment, newFragment)
                ?.commit()
        }
    }
}
