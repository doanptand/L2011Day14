package com.ddona.day14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ddona.day14.adapter.MusicPagerAdapter
import com.ddona.day14.databinding.ActivityMainBinding
import com.ddona.day14.fragment.AlbumFragment
import com.ddona.day14.fragment.ArtistFragment
import com.ddona.day14.fragment.SongFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = MusicPagerAdapter(this)
        binding.rvMusic.adapter = adapter
    }

}