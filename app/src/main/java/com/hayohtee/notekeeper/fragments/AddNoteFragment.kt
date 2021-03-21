package com.hayohtee.notekeeper.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.hayohtee.notekeeper.R
import com.hayohtee.notekeeper.databinding.FragmentAddNoteBinding
import com.hayohtee.notekeeper.model.Note
import com.hayohtee.notekeeper.model.NoteViewModel

class AddNoteFragment : Fragment() {
    private lateinit var binding: FragmentAddNoteBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_note,
            container, false)

        return binding.root
    }


    private fun hideKeyboard(){
        val imm = requireContext().getSystemService(Context.INPUT_METHOD_SERVICE)
                as InputMethodManager
        imm.hideSoftInputFromWindow(binding.viewGroup.windowToken, 0)
    }

    private fun validate(){
        val title = binding.titleEditText.text
        val content = binding.contentEditText.text

        if (title != null && content != null){
            save(title.toString(), content.toString())
        }

        hideKeyboard()
    }

    private fun save(title: String, content: String){
        val noteViewModel = ViewModelProvider(requireActivity()).get(NoteViewModel::class.java)
        noteViewModel.addNote(Note(title, content))
    }

}