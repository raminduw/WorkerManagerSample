package com.example.raminduweeraman.workermanagersample

interface TaskCompleteListener {

    fun success(workOrder:String)
    fun fail(workOrder:String)

}