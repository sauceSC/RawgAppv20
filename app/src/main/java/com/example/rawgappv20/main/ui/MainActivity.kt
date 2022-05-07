package com.example.rawgappv20.main.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rawgappv20.R
import com.example.rawgappv20.common.basemvp.BaseActivity
import com.example.rawgappv20.databinding.ActivityMainBinding

class MainActivity() : BaseActivity(){

    private val binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val recyclerFragment = RecyclerFragment()

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        changeFragment(recyclerFragment, R.id.container)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        clearBackStack()
    }


}
