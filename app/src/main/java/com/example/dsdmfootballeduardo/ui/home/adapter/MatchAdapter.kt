package com.example.dsdmfootballeduardo.ui.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dsdmfootballeduardo.R
import com.example.dsdmfootballeduardo.databinding.ItemMatchBinding
import com.example.dsdmfootballeduardo.domain.dto.MatchDto

class MatchAdapter : RecyclerView.Adapter<MatchAdapter.MatchViewHolder>(){

    var matches: List<MatchDto> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_match, parent, false)
        return MatchViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MatchViewHolder, position: Int) {
        holder.bind(matches[position])
    }

    override fun getItemCount() = matches.size


    inner class MatchViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding = ItemMatchBinding.bind(itemView)

        fun bind(match: MatchDto) {
            binding.tvTeamOne.text = match.homeTeam.name
            binding.tvTeamTwo.text = match.awayTeam.name
            binding.tvScoreOne.text = match.score.fullTimeScore.homeTeamScore.toString()
            binding.tvScoreTwo.text = match.score.fullTimeScore.awayTeamScore.toString()

        }
    }

}