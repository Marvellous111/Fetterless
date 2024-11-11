package com.appbase.fetterless

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.appbase.fetterless.ui.navigation.AppNavHost
import com.appbase.fetterless.ui.theme.FetterlessTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      FetterlessTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
          AppNavHost(
            navController = rememberNavController(),
            modifier = Modifier
              .padding(innerPadding)
          )
        }
      }
    }
  }
}