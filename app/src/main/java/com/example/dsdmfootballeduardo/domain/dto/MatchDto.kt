package com.example.dsdmfootballeduardo.domain.dto

import com.example.dsdmfootballeduardo.data.remote.AwayTeam
import com.example.dsdmfootballeduardo.data.remote.HomeTeam
import com.example.dsdmfootballeduardo.data.remote.Score

data class MatchDto(
    val homeTeam: HomeTeam,
    val awayTeam: AwayTeam,
    val score: Score
)
