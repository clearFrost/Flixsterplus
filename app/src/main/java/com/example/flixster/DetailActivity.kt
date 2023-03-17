package com.example.flixster

import android.media.Rating
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {

    private lateinit var TitleTv: TextView
    private lateinit var SynopsisTv: TextView
    private lateinit var RatingTv: TextView
    private lateinit var voteAvgRb: RatingBar
    private lateinit var voteNumTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        TitleTv = findViewById(R.id.TitleTv)
        SynopsisTv = findViewById(R.id.SynopsisTv)
        RatingTv = findViewById(R.id.RatingTv)
        voteAvgRb = findViewById(R.id.voteAvgRb)
        voteNumTv = findViewById(R.id.voteNumTv)

        val movie = intent.getParcelableExtra<Movie>("Movie_Extra") as Movie
        Log.i("DetailActivity", "Movie is $movie")

        if (movie != null) {
            TitleTv.text = movie.title
            SynopsisTv.text = movie.overview
            RatingTv.text = movie.voteAverage.toString()
            voteAvgRb.rating = movie.voteAverage.toFloat()
            voteNumTv.text = movie.voteCount.toString()
        }

    }
}