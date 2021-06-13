package com.example.dsdmfootballeduardo.ui.otherleagues.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dsdmfootballeduardo.R
import com.example.dsdmfootballeduardo.databinding.ItemCompetitionBinding
import com.example.dsdmfootballeduardo.domain.dto.CompetitionDto

class CompetitionAdapter : RecyclerView.Adapter<CompetitionAdapter.CompetitionViewHolder>(){

    var competitions: List<CompetitionDto> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompetitionViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_competition, parent, false)
        return CompetitionViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CompetitionViewHolder, position: Int) {
        holder.bind(competitions[position])
    }

    override fun getItemCount() = competitions.size

    inner class CompetitionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding = ItemCompetitionBinding.bind(itemView)

        fun bind(competition: CompetitionDto) {
            binding.tvCompetitionName.text = competition.name
            binding.tvCompetitionCountry.text = competition.area.name
        }

    }
}