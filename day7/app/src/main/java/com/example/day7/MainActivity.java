package com.example.day7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AbsListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<pokemon> myPokemons= new ArrayList<>();

        pokemon p1= new pokemon ("Bulbasaur",R.drawable.bulbasaur,49,49,318);
        pokemon p2= new pokemon ("Charizard",R.drawable.charizard,84,78,534);
        pokemon p3= new pokemon ("Squirtle",R.drawable.squirtle,84,67,237);
        pokemon p4= new pokemon ("Blastoise",R.drawable.blastoise,78,23,967);

        myPokemons.add(p1);
        myPokemons.add(p2);
        myPokemons.add(p3);
        myPokemons.add(p4);


        RecyclerView rv = findViewById(R.id.recyclerview);
        rv.setHasFixedSize(true);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

    }
}