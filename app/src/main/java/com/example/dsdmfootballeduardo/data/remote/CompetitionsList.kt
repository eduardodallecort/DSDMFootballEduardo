package com.example.dsdmfootballeduardo.data.remote

import com.squareup.moshi.Json

data class CompetitionsList(
    @field:Json(name = "competitions") private val competitions: List<Competition>
)
