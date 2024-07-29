package com.example.android3lesson5.utils

interface CustomCallback <T>{

    fun onResponse(data: T)

    fun onFailure(t: Throwable)
}