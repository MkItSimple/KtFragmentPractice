package com.example.ktfragmentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        val bundle = Bundle()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, FirstFragment::class.java, bundle)
            .commit()
    }
}
