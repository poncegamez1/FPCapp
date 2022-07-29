package com.poncegamez.fpcapp.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.poncegamez.fpcapp.databinding.FragmentDetailBinding

class ListFragment : Fragment() {

    private lateinit var listBinding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        listBinding = FragmentDetailBinding.inflate(inflater, container, false)

        return listBinding.root
    }
}