package com.ibrahim.kotlincitysymbol

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ibrahim.kotlincitysymbol.databinding.RecyclerRowBinding


class LandmarkAdapter(val landmarklist: ArrayList<Landmark>):RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>(){
    class LandmarkHolder(val binding:RecyclerRowBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)
    }

    override fun getItemCount(): Int {
        return landmarklist.size
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.recyclerviewtextview.text=landmarklist.get(position).name//sadece isim göster


        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,ActivityDetails::class.java)

            intent.putExtra("Landmark",landmarklist.get(position))

            holder.itemView.context.startActivity(intent)
        }
    }
}