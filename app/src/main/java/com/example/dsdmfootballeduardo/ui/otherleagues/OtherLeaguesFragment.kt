package com.example.dsdmfootballeduardo.ui.otherleagues

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.dsdmfootballeduardo.databinding.FragmentOtherLeaguesBinding

class OtherLeaguesFragment : Fragment() {

    private val binding: FragmentOtherLeaguesBinding by lazy {
        FragmentOtherLeaguesBinding.inflate(layoutInflater)
    }

    private val viewModel: OtherLeaguesViewModel by viewModels()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

}