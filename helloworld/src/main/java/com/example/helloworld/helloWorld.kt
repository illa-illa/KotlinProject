package com.example.helloworld

import android.app.Activity
import android.os.Bundle

class helloWorld : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
    }
}