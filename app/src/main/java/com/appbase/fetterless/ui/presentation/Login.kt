package com.appbase.fetterless.ui.presentation

import android.content.Context
import androidx.browser.customtabs.CustomTabsIntent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.appbase.fetterless.R
import com.appbase.fetterless.ui.navigation.NavigationItem

@Composable
fun LoginScreen(
  navController: NavHostController,
  modifier: Modifier = Modifier
) {
  val context = LocalContext.current
  val internetIdentityUrl = "https://identity.ic0.app/"
  Column(
    modifier = modifier
      .fillMaxSize()
      .padding(16.dp),
    verticalArrangement = Arrangement.SpaceBetween
  ) {
    Column(
      modifier = Modifier
    ) {
      Text(
        text = stringResource(R.string.app_name),
        style = MaterialTheme.typography.displayLarge,
        color = MaterialTheme.colorScheme.primary
      )
      Spacer(Modifier.height(30.dp))
    }
    Column(
      modifier = Modifier
    ) {
      Text(
        text = stringResource(R.string.maintext),
        style = MaterialTheme.typography.displayLarge,
        color = MaterialTheme.colorScheme.primary
      )
      Spacer(Modifier.height(30.dp))
      Text(
        text = stringResource(R.string.subtext),
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.primary
      )
      Spacer(Modifier.height(30.dp))
      Column(
        modifier = Modifier
      ) {
        OutlinedButton(
          onClick = {
            navController.navigate(NavigationItem.Home.route)
          },
          modifier = Modifier
            .fillMaxWidth()
            .height(38.dp),
          shape = RoundedCornerShape(30.dp),
          colors = ButtonDefaults.outlinedButtonColors(
            containerColor = MaterialTheme.colorScheme.background,
            contentColor = MaterialTheme.colorScheme.primary
          ),
          border = BorderStroke(
            width = 2.dp,
            color = MaterialTheme.colorScheme.primary
          )
        ) {
          Text(
            text = stringResource(R.string.signin),
            style = MaterialTheme.typography.bodyLarge,
          )
        }
        Spacer(Modifier.height(15.dp))
        Button(
          onClick = {
            openCustomTab(context, internetIdentityUrl)
          },
          modifier = Modifier
            .fillMaxWidth()
            .height(38.dp),
          shape = RoundedCornerShape(30.dp),
          colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.tertiary
          ),
        ) {
          Text(
            text = stringResource(R.string.signup),
            style = MaterialTheme.typography.bodyLarge
          )
        }
      }
    }
  }
}

private fun openCustomTab(context: Context, url: String) {
  val customTabsIntent = CustomTabsIntent.Builder().build()
  customTabsIntent.launchUrl(context, android.net.Uri.parse(url))
}