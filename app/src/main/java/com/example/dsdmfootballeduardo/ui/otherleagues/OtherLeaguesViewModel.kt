package com.example.dsdmfootballeduardo.ui.otherleagues

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dsdmfootballeduardo.domain.dto.CompetitionDto
import com.example.dsdmfootballeduardo.domain.repository.CompetitionRepository
import kotlinx.coroutines.launch

class OtherLeaguesViewModel : ViewModel() {

    private val competitionRepository = CompetitionRepository()

    val competitions: MutableLiveData<List<CompetitionDto>> = MutableLiveData()

//    fun getCompetitions() {
//        viewModelScope.launch {
//            val result = competitionRepository.getList()
//            competitions.postValue(result)
//        }
//    }
}