package com.example.tugasrecycleview_pertemuan10

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasrecycleview_pertemuan10.databinding.ItemPhotoBinding


class PhotoAdapter(private val photos: List<Photo>):
    RecyclerView.Adapter<PhotoAdapter.ItemPhotoViewHolder>(){

    inner class ItemPhotoViewHolder(val binding: ItemPhotoBinding) :
                RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemPhotoViewHolder {
        val binding = ItemPhotoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemPhotoViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return photos.size
    }

    override fun onBindViewHolder(holder: ItemPhotoViewHolder, position: Int) {
        val photo = photos[position]
        holder.binding.apply {
            photoImage.setImageResource(photo.imageResId)
        }
//        holder.binding.photoImage.setImageResource(photos[position].imageResId)
    }
}