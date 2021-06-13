package com.example.dsdmfootballeduardo.data.remote

import com.squareup.moshi.Json

data class Competition(
    @field:Json(name = "area") private val area: CompetitionArea,
    @field:Json(name = "name") private val name: String
    )
