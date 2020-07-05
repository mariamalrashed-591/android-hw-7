package com.example.day7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.example.day7.R.layout.pokemon_list_item;

public class PokemonAdapter extends RecyclerView.Adapter {

    ArrayList<pokemon> pArray;

    public PokemonAdapter(ArrayList<pokemon> pArray) {
        this.pArray = pArray;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).titleTextView.setText(pArray.get(position).getName());
        ((ViewHolder)holder).imageView.setImageResource(pArray.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return pArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView titleTextView;
        public TextView textView3;
        public ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            titleTextView = (TextView) itemView.findViewById(R.id.titleTextView);
            imageView = (ImageView) itemView.findViewById(R.id.picture);



        }
    }





}
