package com.jonetech.tabexperiment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.LinkedList;

public class SportListAdapter extends RecyclerView.Adapter<SportListAdapter.SportViewHolder> {

    private final ArrayList<Fun> sportList;
    private LayoutInflater fInflater;
    private  Context fContext;

    public SportListAdapter(Context context, ArrayList<Fun> funList) {

        fContext = context;
        fInflater = LayoutInflater.from(context);
        this.sportList = funList;
    }

    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = fInflater.inflate(R.layout.fun_list_item, parent, false);
        return new SportViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull SportViewHolder holder, int position) {

        Fun currentPosition = sportList.get(position);

        holder.wordItemView.setText(currentPosition.getName());
//        holder.wordImageView.setImageResource(currentPosition.getIcon());
        Glide.with(fContext).load(currentPosition.getIcon()).into(holder.wordImageView);


    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }


    public class SportViewHolder extends RecyclerView.ViewHolder {

        public final TextView wordItemView;
        public final ImageView wordImageView;

        final SportListAdapter adapter;

        public SportViewHolder(View itemView, SportListAdapter
                                adapter) {
            super(itemView);

            wordImageView = itemView.findViewById(R.id.sport_image);
            wordItemView = itemView.findViewById(R.id.sport_text);
            this.adapter = adapter;

        }
    }
}
