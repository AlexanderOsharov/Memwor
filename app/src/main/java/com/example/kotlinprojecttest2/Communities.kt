package com.example.kotlinprojecttest2

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.kotlinprojecttest2.databinding.ActivityCommunitiesBinding

class Communities : AppCompatActivity() {
    // Было создано по умолчанию, пока не удаляю
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityCommunitiesBinding

    // То, что нужно Рамилю
    val platform: String = "platform"
    val category: String = "category"
    val domain: String = "domain"
    val community_name: String = "community_name"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Было создано по умолчанию, пока не удаляю
        binding = ActivityCommunitiesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_communities)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        // То, что нужно Рамилю

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_communities)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}