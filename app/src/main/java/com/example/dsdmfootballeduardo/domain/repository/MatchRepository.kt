package com.example.dsdmfootballeduardo.domain.repository

import com.example.dsdmfootballeduardo.data.service.factory.CompetitionServiceFactory
import com.example.dsdmfootballeduardo.data.service.factory.MatchServiceFactory
import com.example.dsdmfootballeduardo.domain.COMPETITION_ID
import com.example.dsdmfootballeduardo.domain.dto.MatchDto

class MatchRepository {

    private val service = MatchServiceFactory.getService()

    suspend fun getList(competitionId: Int): List<MatchDto> {
        val response = service.getList(competitionId)

        return response.matches.map { match ->
            MatchDto(
                match.homeTeam,
                match.awayTeam,
                match.score
            )
        }
    }
}