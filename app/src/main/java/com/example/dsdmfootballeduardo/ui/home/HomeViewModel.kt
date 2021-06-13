package com.example.dsdmfootballeduardo.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dsdmfootballeduardo.domain.COMPETITION_ID
import com.example.dsdmfootballeduardo.domain.dto.MatchDto
import com.example.dsdmfootballeduardo.domain.repository.MatchRepository
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val matchRepository = MatchRepository()

    val matches: MutableLiveData<List<MatchDto>> = MutableLiveData()

    fun getMatches() {
        viewModelScope.launch {
            val result = matchRepository.getList(COMPETITION_ID)
            matches.postValue(result)
        }
    }

}