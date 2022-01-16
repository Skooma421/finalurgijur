package com.example.finalurgijur

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecycleViewRecipesAdapter(private val list: List<Recipes>) :
    RecyclerView.Adapter<RecycleViewRecipesAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title_image: ImageView
        val heading: TextView
        val heading2: TextView

        init {
            title_image = itemView.findViewById(R.id.title_image)
            heading = itemView.findViewById(R.id.heading)
            heading2 = itemView.findViewById(R.id.heading2)
        }

        fun setData(recipes: Recipes) {
            Glide.with(itemView)
                .load(recipes.imageUrl)
                .into(title_image)
            heading.text= recipes.title
            heading2.text = recipes.name

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recipes = list[position]
        holder.setData(recipes)
    }

    override fun getItemCount() = list.size

}

