package com.example.newsapp.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.newsapp.R
import com.example.newsapp.databinding.ActivityMainBinding
import com.example.newsapp.main.MainViewModel
import com.example.newsapp.main.MainViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var factory: MainViewModelFactory
    lateinit var viewModel: MainViewModel
    lateinit var navController:NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.parent
        setContentView(view)

        initViewModel()
        getLoginStatus()

    }

    private fun initViewModel(){
        viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]
    }

    private fun getLoginStatus(){
        viewModel.loginStatus.observe(this as LifecycleOwner){ result ->
            setupNavigation()
            result.getOrNull()?.also { loggedIn->
                if (loggedIn){
                    navController.navigate(R.id.homeFragment)
                }else{
                    navController.navigate(R.id.loginFragment)
                }
            }
        }
    }

    private fun setupNavigation(){
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
    }

}