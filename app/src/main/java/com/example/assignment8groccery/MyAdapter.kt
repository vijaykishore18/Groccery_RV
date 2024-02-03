package com.example.assignment8groccery

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment8groccery.databinding.ItemLayoutBinding

class MyAdapter(val itemList : ArrayList<ItemModel>)
    : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ItemModel) {
            binding.itemImage.setImageResource(item.img)
            binding.itemName.text = item.name
            binding.itemDesc.text = item.desc

            itemView.setOnClickListener() {
                Toast.makeText(
                    itemView.context,
                    "You Choose ${itemList[adapterPosition].name}",
                    Toast.LENGTH_SHORT
                ).show()

            }
        }
    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val binding =
                ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return MyViewHolder(binding)
        }

        override fun getItemCount(): Int {
            return itemList.size
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.bind(itemList[position])
        }
    }
