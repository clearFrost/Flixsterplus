package com.example.flixster

import android.os.Parcelable
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize
import org.json.JSONArray


@Parcelize
data class Movie(
    val movieID: Int,
    val title: String,
    val overview: String,
    val posterPath: String,
    val voteAverage: Double,
    val voteCount: Int
) :Parcelable {
    @IgnoredOnParcel
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
                        movieJson.getString("poster_path"),
                        movieJson.getDouble("vote_average"),
                        movieJson.getInt("vote_count")
                    )
                )
            }
            return movies
        }
    }
}