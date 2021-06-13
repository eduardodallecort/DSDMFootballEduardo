package com.example.dsdmfootballeduardo.data.remote

import com.squareup.moshi.Json

data class Match(
    @field:Json(name = "homeTeam") val homeTeam: HomeTeam,
    @field:Json(name = "awayTeam") val awayTeam: AwayTeam,
    @field:Json(name = "score") val score: Score
)
