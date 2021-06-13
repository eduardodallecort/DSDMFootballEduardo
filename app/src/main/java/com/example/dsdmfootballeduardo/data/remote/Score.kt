package com.example.dsdmfootballeduardo.data.remote

import com.squareup.moshi.Json

data class Score(
    @field:Json(name = "fullTime") val fullTimeScore: FullTimeScore
)
