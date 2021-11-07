package com.ddona.day14.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ddona.day14.databinding.FragmentArtistBinding
import com.ddona.day14.databinding.FragmentSongBinding

class ArtistFragment : Fragment() {
    private lateinit var binding: FragmentArtistBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentArtistBinding.inflate(inflater, container, false)
        return binding.root
    }
}