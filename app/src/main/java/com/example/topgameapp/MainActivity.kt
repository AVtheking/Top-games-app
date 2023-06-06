package com.example.topgameapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerView:RecyclerView=findViewById(R.id.recycleview)
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        var gameslist:ArrayList<GameModel> =ArrayList()

        val g1 = GameModel(R.drawable.card1,"Horizon Chase")
        val g2 = GameModel(R.drawable.card2,"PUBG")
        val g3 = GameModel(R.drawable.card3,"Head Ball 2")
        val g4 = GameModel(R.drawable.card5,"FIFA 2022")
        val g5 = GameModel(R.drawable.card6,"Fortnite")
        val g6 = GameModel(R.drawable.card4,"Hooked on You")
        val g7=GameModel(R.drawable.card7,"Minecraft")

        gameslist.add(g1)
        gameslist.add(g2)
        gameslist.add(g3)
        gameslist.add(g4)
        gameslist.add(g5)
        gameslist.add(g6)
        gameslist.add(g7)

        val adapter=GameAdapter(gameslist)
        recyclerView.adapter=adapter

    }
}