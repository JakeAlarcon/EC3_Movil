package com.alarcon.ec3_alarcon_quintanilla.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.alarcon.ec3_alarcon_quintanilla.R
import com.alarcon.ec3_alarcon_quintanilla.databinding.ActivityBarBinding

class BarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentView = supportFragmentManager.findFragmentById(R.id.fcv_navigation) as NavHostFragment
        val navController = fragmentView.navController
        binding.bnvStore.setupWithNavController(navController)
    }
}