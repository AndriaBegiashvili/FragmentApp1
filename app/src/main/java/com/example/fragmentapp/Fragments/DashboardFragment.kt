package com.example.fragmentapp.Fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmentapp.R

class DashboardFragment: Fragment(R.layout.dashboard) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.textView).text =
            DashboardFragmentArgs.fromBundle(requireArguments()).amount.toString()



    }
}