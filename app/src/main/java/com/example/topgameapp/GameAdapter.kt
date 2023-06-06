package com.example.topgameapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(val gameslist:ArrayList<GameModel>):
    RecyclerView.Adapter<GameAdapter.MyViewHolder>(){

        inner class MyViewHolder(itemview: View):RecyclerView.ViewHolder(itemview)
        {
            lateinit var gameimg:ImageView
            lateinit var gametitle:TextView
            init{
                gameimg=itemview.findViewById(R.id.cardimg)
                gametitle=itemview.findViewById(R.id.cardtext)

                itemview.setOnClickListener()
                {
                    Toast.makeText(itemview.context,"You Choose: " +
                            "${gameslist[adapterPosition].gametitle}",
                        Toast.LENGTH_LONG).show()
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v=LayoutInflater.from(parent.context)
            .inflate(R.layout.card_item_list,parent,false)

        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return gameslist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.gameimg.setImageResource(gameslist[position].img)
        holder.gametitle.setText(gameslist[position].gametitle)


    }
}