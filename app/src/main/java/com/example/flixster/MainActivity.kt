package com.example.flixster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codepath.asynchttpclient.AsyncHttpClient
import com.codepath.asynchttpclient.RequestParams
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler
import okhttp3.Headers

const private val NOW_PLAYING_URL="https://api.themoviedb.org/3/movie/now_playing?api_key=a07e22bc18f5cb106bfe4cc1f83ad8ed"

class MainActivity : AppCompatActivity() {
    private val movies = mutableListOf<Movie>()
    private lateinit var MoviesRv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MoviesRv = findViewById(R.id.moviesRv)


        val movieAdapter = MovieAdapter(this, movies)
        MoviesRv.adapter =movieAdapter
        MoviesRv.layoutManager = LinearLayoutManager(this)

        val client = AsyncHttpClient()
        val params = RequestParams()
        client[
                NOW_PLAYING_URL,
        params,
        object: JsonHttpResponseHandler(){
            override fun onFailure(
                statusCode: Int,
                headers: Headers?,
                response: String?,
                throwable: Throwable?
            ) {
                Log.e("failed","failed to get data from API")
            }

            override fun onSuccess(statusCode: Int, headers: Headers?, json: JSON) {
                Log.e("received data from API:",json.toString())
                val movieJsonArray = json.jsonObject.getJSONArray("results")
                movies.addAll(Movie.fromJson(movieJsonArray))
                movieAdapter.notifyDataSetChanged()

            }

        }
        ]
    }
}