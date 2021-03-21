package com.hayohtee.notekeeper.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.hayohtee.notekeeper.R
import com.hayohtee.notekeeper.databinding.FragmentRecyclerViewBinding

class RecyclerViewFragment : Fragment() {
    private lateinit var binding: FragmentRecyclerViewBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_recycler_view,
            container, false)

        return binding.root
    }

}