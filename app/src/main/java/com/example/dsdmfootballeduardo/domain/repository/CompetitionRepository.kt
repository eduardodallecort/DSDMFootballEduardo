package com.example.dsdmfootballeduardo.domain.repository


import com.example.dsdmfootballeduardo.data.service.factory.CompetitionServiceFactory
import com.example.dsdmfootballeduardo.domain.dto.CompetitionDto


class CompetitionRepository {

    private val serviceC = CompetitionServiceFactory.getServiceC()

//    suspend fun getList(): List<CompetitionDto> {
//        val responseC = serviceC.getList()
//
//        return responseC.competitions.stream().map { competition ->
//            CompetitionDto(
//                competition.area,
//                competition.name
//            )
//        }
//
//    }
}