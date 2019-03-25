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
        Log.d("TAG","-------onCreate2")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worker)
        btn1.setOnClickListener{
            startBackgroundWork();
        }

    }

    override fun onStart() {
        Log.d("TAG","-------onStart2")
        super.onStart()
    }

    override fun onRestart() {
        Log.d("TAG","-------onRestart2")
        super.onRestart()
    }

    override fun onResume() {
        Log.d("TAG","-------onResume2")
        super.onResume()
    }

    override fun onPause() {
        Log.d("TAG","-------onPause2")
        super.onPause()
    }

    override fun onStop() {
        Log.d("TAG","-------onStop2")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("TAG","-------onDestroy2")
        super.onDestroy()
    }

    private fun startBackgroundWork() {
        Log.d("TAG", "************ startBackgroundWork")
        val photoCheckBuilder =
                PeriodicWorkRequestBuilder<Worker>(15, TimeUnit.MINUTES)
        val photoCheckWork = photoCheckBuilder.build()
        WorkManager.getInstance().enqueueUniquePeriodicWork("OBC_DATA_SYNC",
                ExistingPeriodicWorkPolicy.REPLACE, photoCheckWork)
    }


}
