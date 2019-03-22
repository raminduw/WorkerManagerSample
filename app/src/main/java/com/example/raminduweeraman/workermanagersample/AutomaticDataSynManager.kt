package com.example.raminduweeraman.workermanagersample

import android.util.Log

class AutomaticDataSynManager() : DataListener {

    fun startDateSync() {
        NetworkManager().login(this)
    }

    override fun success(tripNo:String) {
         Log.d("TAG","************ success $tripNo ")
    }

    override fun fail(tripNo:String) {
        Log.d("TAG","************ fail $tripNo")
    }
}