package com.example.dsdmfootballeduardo.data.service

import com.example.dsdmfootballeduardo.data.remote.MatchList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MatchesService {

    @GET(MATCH_GET_LIST)
    suspend fun getList(
        @Path(PARAM_ID) id: Int,
        @Query(PARAM_API_KEY) apiKey: String = API_KEY_VALUE
    ): MatchList

}