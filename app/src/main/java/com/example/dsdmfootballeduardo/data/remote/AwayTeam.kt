package com.example.dsdmfootballeduardo.data.remote

import com.squareup.moshi.Json

data class AwayTeam(
    @field:Json(name = "name") val name: String
)
