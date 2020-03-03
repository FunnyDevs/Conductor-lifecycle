package com.funnydevs.conductor_lifecycle.sample

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.funnydevs.annotations.OnAttach
import com.funnydevs.annotations.OnDetach


class TestController : Controller() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {

        val view: View =
            inflater.inflate(R.layout.test, container, false)

        return view
    }

    @OnAttach
    private fun start(){
        Log.d("start","ok")
    }

    @OnDetach
    private fun stop(){
        Log.d("stop","ok")
    }
    
}