package com.appbase.fetterless.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.appbase.fetterless.ui.navigation.NavigationItem
import com.appbase.fetterless.R

@Composable
fun HomeNavigation(
  navController: NavHostController,
  modifier: Modifier = Modifier
) {
  Row(
    modifier = modifier.padding(start = 16.dp, end = 16.dp)
  ) {
    Button(
      onClick = {
        navController.popBackStack()
      },
      modifier = Modifier
        .height(38.dp),
      colors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.primaryContainer
      ),
      shape = RoundedCornerShape(30.dp),
    ) {
      Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically
      ) {
        Icon(
          painter = painterResource(R.drawable.homeicon),
          contentDescription = null,
          tint = MaterialTheme.colorScheme.tertiary,
          modifier = Modifier.size(24.dp)
        )
        Spacer(Modifier.width(10.dp))
        Text(
          text = stringResource(R.string.portfolio_navigation_home),
          style = MaterialTheme.typography.labelLarge,
          color = MaterialTheme.colorScheme.tertiary
        )
      }
    }
  }
}