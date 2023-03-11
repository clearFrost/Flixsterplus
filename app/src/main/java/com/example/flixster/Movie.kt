package com.example.flixster

import org.json.JSONArray

class Movie(
    val movieID: Int,
    val title: String,
    val overview: String,
    val posterPath: String
) {
    val posterUrl = "https://image.tmdb.org/t/p/w500/$posterPath"
    companion object{
        fun fromJson(movieJsonArray: JSONArray): List<Movie> {
            val movies = mutableListOf<Movie>()
            for (i in 0 until movieJsonArray.length()){
                val movieJson = movieJsonArray.getJSONObject(i)
                movies.add(
                    Movie(
                        movieJson.getInt("id"),
                        movieJson.getString("title"),
                        movieJson.getString("overview"),
                        movieJson.getString("poster_path")
                    )
                )
            }
            return movies
        }
    }
}