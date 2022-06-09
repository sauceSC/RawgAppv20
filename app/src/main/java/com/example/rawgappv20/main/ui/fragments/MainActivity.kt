package com.example.rawgappv20.main.ui.fragments

import android.os.Bundle
import android.view.WindowManager
import com.example.rawgappv20.R
import com.example.rawgappv20.common.basemvp.BaseActivity
import com.example.rawgappv20.databinding.ActivityMainBinding

class MainActivity : BaseActivity(){

    private val binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val recyclerFragment = RecyclerFragment()

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        changeFragment(recyclerFragment, R.id.container)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        clearBackStack()
    }


}
