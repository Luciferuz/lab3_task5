package com.example.task5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.task5.databinding.Fragment1Binding

class Fragment1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding = Fragment1Binding.inflate(layoutInflater)
        val navigationController = findNavController()
        binding.toSecond.setOnClickListener {
            navigationController.navigate(R.id.action_fragment1_to_fragment2)
        }
        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.to_about -> {
                    navigationController.navigate(R.id.global_about)
                }
            }
            false
        }
        return binding.root
    }
}