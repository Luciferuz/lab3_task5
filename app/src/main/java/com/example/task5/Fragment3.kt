package com.example.task5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.fragment.app.Fragment
import com.example.task5.databinding.Fragment3Binding

class Fragment3 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding = Fragment3Binding.inflate(layoutInflater)
        val navigationController = findNavController()
        binding.toFirst.setOnClickListener {
            navigationController.navigate(R.id.action_fragment3_to_fragment1)
        }
        binding.toSecond.setOnClickListener {
            navigationController.navigate(R.id.action_fragment3_to_fragment2)
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
