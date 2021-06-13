package com.example.dsdmfootballeduardo.data.remote

import com.squareup.moshi.Json

data class CompetitionArea(
    @field:Json(name = "name") val name: String
)
