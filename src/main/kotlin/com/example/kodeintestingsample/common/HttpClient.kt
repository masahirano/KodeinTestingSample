package com.example.kodeintestingsample.common

interface HttpClient {

    suspend fun get(): HttpResponse

    suspend fun post()
}
