package com.example.raminduweeraman.workermanagersample

import android.content.Context
import androidx.work.Result
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyKotlinWorker(context: Context, params: WorkerParameters)
    : Worker(context, params){

    override fun doWork(): Result {

        // Do the work here--in this case, compress the stored images.
        // In this example no parameters are passed; the task is
        // assumed to be "compress the whole library."
        myWork()

        // Indicate success or failure with your return value:
        return Result.success()

        // (Returning Result.retry() tells WorkManager to try this task again
        // later; Result.failure() says not to try again.)

    }

    fun myWork() {
        AutomaticDataSynManager().startDateSync()
    }

}