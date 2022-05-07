package com.example.rawgappv20.main.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.rawgappv20.R


fun Fragment.replaceFragment(fragment: Fragment) {
    val fragmentManager = requireActivity().supportFragmentManager
    val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
    fragmentTransaction.addToBackStack(null)
        .replace(R.id.container, fragment)
        .commit()
}