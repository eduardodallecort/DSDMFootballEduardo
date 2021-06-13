package com.example.dsdmfootballeduardo.data.service.factory

import com.example.dsdmfootballeduardo.data.service.CompetitionsService
import com.example.dsdmfootballeduardo.data.service.URL_BASE
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object CompetitionServiceFactory {

    private val httpClientC = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .build()

    private val retrofitC = Retrofit.Builder()
        .baseUrl(URL_BASE)
        .client(CompetitionServiceFactory.httpClientC)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    fun getServiceC(): CompetitionsService = retrofitC.create(CompetitionsService::class.java)


}