package com.appbase.fetterless.ui.navigation

enum class Screen {
  HOME,
  IIWEBVIEW,
  LOGIN,
  PORTFOLIO,
  RECEIVE,
  SEND,
}

sealed class NavigationItem(val route: String) {
  object Home : NavigationItem(Screen.HOME.name)
  object Iiwebview : NavigationItem(Screen.IIWEBVIEW.name)
  object Login : NavigationItem(Screen.LOGIN.name)
  object Portfolio : NavigationItem(Screen.PORTFOLIO.name)
  object Receive : NavigationItem(Screen.RECEIVE.name)
  object Send : NavigationItem(Screen.SEND.name)
}