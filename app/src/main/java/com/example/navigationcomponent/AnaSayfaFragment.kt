package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
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
            val kisi = Kisiler("Mehmet",21,1.94f,true)
            val gecis = AnaSayfaFragmentDirections.oyunEkraninaGecis("Mehmet",21,1.84f,true,kisi)
            Navigation.findNavController(it).navigate(gecis)
        }
        return tasarim.root
    }


}