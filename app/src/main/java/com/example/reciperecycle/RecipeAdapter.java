package com.example.reciperecycle;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.ViewHolder>
{
    Context c;
    ArrayList<String> r;
    ArrayList<String> d;

    public RecipeAdapter (Context c, ArrayList<String> r, ArrayList<String> d)
    {
        this.c = c;
        this.r = r;
        this.d = d;
    }

    public ViewHolder onCreateViewHolder (ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from (parent.getContext ()).inflate (R.layout.activity_recipe, parent, false);
        ViewHolder base = new ViewHolder (view);

        return base;
    }


    public void onBindViewHolder (ViewHolder holder, final int position)
    {
        String name = r.get (position);
        holder.tv_recipe.setText (name);

        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (r.get (position).equals ("Teriyaki Chicken"))
                {
                    Intent i = new Intent (c, teriyakiAct.class);
                    c.startActivity(i);
                }
                if (r.get (position).equals ("Two-Minute Chocolate Mug Cake"))
                {
                    Intent i = new Intent (c, chocolateAct.class);
                    c.startActivity(i);
                }
                if (r.get (position).equals ("Homemade Pizza"))
                {
                    Intent i = new Intent (c, pizzaAct.class);
                    c.startActivity(i);
                }
            }
        });
    }

    public int getItemCount ()
    {
        return r.size ();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tv_recipe;
        TextView tv_des;

        LinearLayout parent;

        public ViewHolder (View itemView)
        {
            super(itemView);

            tv_recipe = (TextView) itemView.findViewById (R.id.title);
            tv_des = (TextView) itemView.findViewById (R.id.body);
            parent = itemView.findViewById (R.id.parent_ly);
        }
    }
}
