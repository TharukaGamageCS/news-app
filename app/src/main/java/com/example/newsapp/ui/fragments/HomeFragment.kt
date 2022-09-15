package com.example.newsapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.newsapp.R
import com.example.newsapp.data.models.User
import com.example.newsapp.databinding.FragmentHomeBinding
import com.example.newsapp.databinding.FragmentLoginBinding
import com.example.newsapp.databinding.FragmentSignupBinding
import com.example.newsapp.signup.SignupViewModel
import com.example.newsapp.signup.SignupViewModelFactory
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_signup.*
import javax.inject.Inject


class HomeFragment: Fragment() {

    private var _binding:FragmentHomeBinding? = null
    private val binding get() = _binding



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(layoutInflater)

        findNavController().navigate(R.id.signupFragment)

        return binding?.parentHome
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}