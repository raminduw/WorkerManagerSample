package com.example.raminduweeraman.workermanagersample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import kotlinx.android.synthetic.main.activity_worker.*
import java.util.concurrent.TimeUnit

class KotlinWorkerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worker)
        btn1.setOnClickListener{
            startBackgroundWork();
        }

    }


    private fun startBackgroundWork() {
        Log.d("TAG", "************ startBackgroundWork")
        val photoCheckBuilder =
                PeriodicWorkRequestBuilder<Worker>(15, TimeUnit.MINUTES)
        val photoCheckWork = photoCheckBuilder.build()
        WorkManager.getInstance().enqueueUniquePeriodicWork("BACKGROUND_WORKER",
                ExistingPeriodicWorkPolicy.REPLACE, photoCheckWork)
    }


}
