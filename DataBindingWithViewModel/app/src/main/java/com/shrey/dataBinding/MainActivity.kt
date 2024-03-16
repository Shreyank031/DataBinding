package com.shrey.dataBinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.shrey.dataBinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

//        mainViewModel.smrs.observe(this, Observer {
//            binding.txtName.text = it
//        })

        binding.mainnViewModell = mainViewModel
        binding.lifecycleOwner = this
        //As we have removed the owner, we need to specify it here.As it's lifecycle aware

//        binding.btnButton.setOnClickListener {
//            mainViewModel.updateLiveData()
//        }
    }
}