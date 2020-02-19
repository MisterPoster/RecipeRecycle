package com.example.reciperecycle;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import static androidx.recyclerview.widget.RecyclerView.*;

public class MainActivity extends AppCompatActivity
{
    RecyclerView rc;
    ArrayList<String> items = new ArrayList<>();
    ArrayList<String> des = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        writeRecipes ();
    }

    public void writeRecipes ()
    {
        items.add ("Teriyaki Chicken");
        des.add ("Because it is exotic for many people!");

        items.add ("Two-Minute Chocolate Mug Cake");
        des.add ("Because everyone needs a backup food to eat.");

        items.add ("Homemade Pizza");
        items.add ("Because we all need something to chill to.");

        rcView ();
    }

    public void rcView ()
    {
        rc = findViewById (R.id.recipe);
        RecipeAdapter adapt = new RecipeAdapter (this, items, des);
        rc.setAdapter (adapt);
        rc.setLayoutManager (new LinearLayoutManager (this));
    }
} //END OF PROJECT
