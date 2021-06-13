package com.example.dsdmfootballeduardo.data.remote

import com.squareup.moshi.Json

data class MatchList(
    @field:Json(name = "matches") val matches: List<Match>
)
