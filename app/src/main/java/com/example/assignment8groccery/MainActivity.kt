package com.example.assignment8groccery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment8groccery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView : RecyclerView = binding.recyclerview

        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        val groceryItem : ArrayList<ItemModel> = ArrayList()
        // display text
        val v1 = ItemModel("Fruits","Fresh Fruits from Garden",R.drawable.fruits)
        val v2 = ItemModel("Vegetables","Delicious Vegetables",R.drawable.vegetables)
        val v3 = ItemModel("Diary and Eggs","Milk, Curd and Other Diary Products",R.drawable.milk)
        val v4 = ItemModel("Beverages","Cool Drinks, Shakes and more",R.drawable.beverages)
        val v5 = ItemModel("Meats and Fish","Fresh Meats and Fish",R.drawable.meat)
        val v6 = ItemModel("Oil and Fat","Good and Pure variety of Oils",R.drawable.oil)
        val v7 = ItemModel("Snacks","Chips, Chocolates and much more!",R.drawable.snacks)


        groceryItem.add(v1)
        groceryItem.add(v2)
        groceryItem.add(v3)
        groceryItem.add(v4)
        groceryItem.add(v5)
        groceryItem.add(v6)
        groceryItem.add(v7)

        val adapter = MyAdapter(groceryItem)
        recyclerView.adapter = adapter
    }
}