package com.example.dsdmfootballeduardo.data.remote

import com.squareup.moshi.Json

data class FullTimeScore(
    @field:Json(name = "homeTeam") val homeTeamScore: Int,
    @field:Json(name = "awayTeam") val awayTeamScore: Int
)
