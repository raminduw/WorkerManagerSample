package com.example.raminduweeraman.workermanagersample

import android.util.Log

class AutomaticWorkerManager() : TaskCompleteListener {

    fun doWork(workOrder:String) {
        BackgroundTask().startWork(this,workOrder)
    }

    override fun success(workOrder:String) {
         Log.d("TAG","************ success $workOrder ")
    }

    override fun fail(workOrder:String) {
        Log.d("TAG","************ fail $workOrder")
    }
}