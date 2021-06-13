package com.example.dsdmfootballeduardo.data.service

import com.example.dsdmfootballeduardo.data.remote.CompetitionsList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CompetitionsService {

    @GET(COMPETITION_GET_LIST)
    suspend fun getList(
        @Query(PARAM_API_KEY) apiKey: String = API_KEY_VALUE
    ): CompetitionsList

}