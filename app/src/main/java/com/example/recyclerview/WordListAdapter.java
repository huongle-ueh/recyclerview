package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;



public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder>{
    private List<Article> articleList;
    private final LayoutInflater mInflator;
    public WordListAdapter (Context context, List<Article> articleList){
        mInflator = LayoutInflater.from(context);
        this.articleList = articleList;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new WordViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        Article mCurrent = articleList.get(position);
        holder.image.setImageResource(mCurrent.getImageResource());
        holder.txt_title.setText(mCurrent.getTitle());
        holder.txt_content.setText(mCurrent.getContent());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DisplayActivity.class);
                intent.putExtra("image", mCurrent.getImageResource());
                intent.putExtra("title", mCurrent.getTitle());
                intent.putExtra("content", mCurrent.getContent());
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }


}