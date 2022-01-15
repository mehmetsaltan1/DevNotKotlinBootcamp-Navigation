package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponent.databinding.FragmentAnaSayfaBinding
import com.google.android.material.snackbar.Snackbar


class AnaSayfaFragment : Fragment() {
    private lateinit var tasarim: FragmentAnaSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false)
        tasarim.buttonBasla.setOnClickListener {
            Snackbar.make(it, "Merhaba", Snackbar.LENGTH_SHORT).show()
        }
        return tasarim.root
    }


}