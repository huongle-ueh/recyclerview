package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder{

    protected LinearLayout item;
    protected TextView txt_title, txt_content;
    protected ImageView image;
    private final WordListAdapter mAdapter;

    public WordViewHolder(@NonNull View itemView, WordListAdapter adapter) {
        super(itemView);
        item = itemView.findViewById(R.id.item);
        image = itemView.findViewById(R.id.image);
        txt_content = itemView.findViewById(R.id.txt_content);
        txt_title = itemView.findViewById(R.id.txt_title);
        this.mAdapter = adapter;
    }
}

