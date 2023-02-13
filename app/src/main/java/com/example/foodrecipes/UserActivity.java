package com.example.foodrecipes;


import android.database.Cursor;
import android.os.Bundle;
import android.widget.GridView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;




public class UserActivity extends AppCompatActivity {
    SQLiteHelper sqLiteHelper;
    GridView gridView;
    ArrayList<Food> list;
    FoodListAdapter adapter = null;
    int limit = 10; // number of rows to retrieve at a time
    int offset = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        gridView = (GridView) findViewById(R.id.gridView);
        list = new ArrayList<>();
        adapter = new FoodListAdapter(this, R.layout.food_items, list);
        gridView.setAdapter(adapter);
        sqLiteHelper = new SQLiteHelper (this, "FoodDB.sqlite", null, 1);

        // get all data from sqlite
        Cursor cursor =sqLiteHelper.getData("SELECT * FROM FOOD");
        list.clear();
        while (cursor.moveToNext()) {
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String recipes = cursor.getString(2);
            // byte[] image = cursor.getBlob(3);

            list.add(new Food(name, recipes, id));
        }
        adapter.notifyDataSetChanged();

    }
 }
