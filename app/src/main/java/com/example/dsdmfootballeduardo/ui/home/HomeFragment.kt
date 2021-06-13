package com.example.dsdmfootballeduardo.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dsdmfootballeduardo.databinding.FragmentHomeBinding
import com.example.dsdmfootballeduardo.ui.home.adapter.MatchAdapter

class HomeFragment : Fragment() {

    private val binding: FragmentHomeBinding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }

    private val viewModel: HomeViewModel by viewModels()

    private lateinit var adapter: MatchAdapter

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ) = binding.root


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
        setupListeners()
    }

    private fun setupView() {
        adapter = MatchAdapter()

        binding.rvMatches.adapter = adapter
        binding.rvMatches.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvMatches.addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))

    }

    private fun setupListeners() {
        viewModel.matches.observe(viewLifecycleOwner) { matches ->
            adapter.matches = matches
        }

        viewModel.getMatches()
    }


}