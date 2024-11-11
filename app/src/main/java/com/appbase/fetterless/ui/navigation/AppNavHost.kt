package com.appbase.fetterless.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.appbase.fetterless.ui.presentation.HomeScreen
import com.appbase.fetterless.ui.presentation.LoginScreen
import com.appbase.fetterless.ui.presentation.PortfolioScreen
import com.appbase.fetterless.ui.presentation.ReceiveScreen
import com.appbase.fetterless.ui.presentation.SendScreen
import com.appbase.fetterless.ui.presentation.WebViewScreen

@Composable
fun AppNavHost(
  modifier: Modifier = Modifier,
  navController: NavHostController,
  startDestination: String = NavigationItem.Login.route
) {
  NavHost(
    modifier = modifier,
    navController = navController,
    startDestination = startDestination
  ) {
    composable(NavigationItem.Iiwebview.route) {
      WebViewScreen(navController)
    }
    composable(NavigationItem.Login.route) {
      LoginScreen(navController)
    }
    composable(NavigationItem.Home.route) {
      HomeScreen(navController)
    }
    composable(NavigationItem.Portfolio.route) {
      PortfolioScreen(navController)
    }
    composable(NavigationItem.Send.route) {
      SendScreen(navController)
    }
    composable(NavigationItem.Receive.route) {
      ReceiveScreen(navController)
    }
  }
}