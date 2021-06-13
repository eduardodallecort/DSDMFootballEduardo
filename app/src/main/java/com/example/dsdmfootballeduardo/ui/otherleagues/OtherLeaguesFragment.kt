package com.example.dsdmfootballeduardo.ui.otherleagues

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dsdmfootballeduardo.databinding.FragmentOtherLeaguesBinding
import com.example.dsdmfootballeduardo.ui.otherleagues.adapter.CompetitionAdapter

class OtherLeaguesFragment : Fragment() {

    private val binding: FragmentOtherLeaguesBinding by lazy {
        FragmentOtherLeaguesBinding.inflate(layoutInflater)
    }

    private val viewModel: OtherLeaguesViewModel by viewModels()

    private lateinit var adapter: CompetitionAdapter

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ) = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
//        setupListeners()
    }

    private fun setupView() {
        adapter = CompetitionAdapter()

        binding.rvCompetitions.adapter = adapter
        binding.rvCompetitions.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvCompetitions.addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))

    }

//    private fun setupListeners() {
//
//        viewModel.competitions.observe(viewLifecycleOwner) { competitions ->
//            adapter.competitions = competitions
//        }
//
//        viewModel.getCompetitions()
//    }

}