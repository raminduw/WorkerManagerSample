package com.example.raminduweeraman.workermanagersample

import android.os.Handler
import android.os.Looper

class BackgroundTask {

    fun startWork( listener: TaskCompleteListener,workOrder:String) {
        // Mock work. I'm creating a handler to delay the answer a couple of seconds
        var x = false  //can change according to task status
        postDelayed(2000) {
            when {
                x -> listener.success(workOrder)
                else -> listener.fail(workOrder)
            }
        }
    }

    private fun postDelayed(delayMillis: Long, task: () -> Unit) {
        Handler(Looper.getMainLooper()).postDelayed(task, delayMillis)
    }


}