package com.example.reciperecycle;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecipeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    Context c;
    String[] r;

    public RecipeAdapter (Context c, String[] r)
    {
        this.c = c;
        this.r = r;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from (c);
        View row = inflater.inflate (R.layout.content_row, parent, false);
        Item item = new Item(row);
        return item;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        ((Item) holder).tv.setText ("Cookies" + position);
    }

    @Override
    public int getItemCount()
    {
        return r.length;
    }

    class Item extends RecyclerView.ViewHolder
    {
        TextView tv;

        public Item(@NonNull View itemView)
        {
            super(itemView);

            tv = (TextView) itemView.findViewById (R.id.head);
        }
    }
}
