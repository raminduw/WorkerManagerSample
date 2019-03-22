package com.example.raminduweeraman.workermanagersample

import android.os.Handler
import android.os.Looper

class NetworkManager {

    fun login( listener: DataListener) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        var x = false
        postDelayed(2000) {
            when {
                x -> listener.success("12345")
                else -> listener.fail("12345")
            }
        }
    }

    private fun postDelayed(delayMillis: Long, task: () -> Unit) {
        Handler(Looper.getMainLooper()).postDelayed(task, delayMillis)
    }


}