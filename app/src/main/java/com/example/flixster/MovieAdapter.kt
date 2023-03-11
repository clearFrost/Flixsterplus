package com.example.flixster

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MovieAdapter(private val context: Context, private val movies: List<Movie>):
    RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val titleTv = itemView.findViewById<TextView>(R.id.titleTv)
        private val overviewTv = itemView.findViewById<TextView>(R.id.overviewTv)
        private val PosterIv = itemView.findViewById<ImageView>(R.id.posterIv)
        fun bind (movie: Movie){
            titleTv.text = movie.title
            overviewTv.text = movie.overview
            Glide.with(context).load(movie.posterUrl).into(PosterIv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.movie_rows,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }
}
