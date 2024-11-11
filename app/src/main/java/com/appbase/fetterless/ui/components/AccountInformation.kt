package com.appbase.fetterless.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.appbase.fetterless.R

@Composable
fun AccountInformation(
  modifier: Modifier = Modifier
) {
  Row(
    modifier = modifier
      .fillMaxWidth()
      .padding(start = 16.dp, end = 16.dp),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.SpaceBetween
  ) {
    Row(
      modifier = Modifier,
      verticalAlignment = Alignment.CenterVertically
    ) {
      Image(
        painter = painterResource(R.drawable.female_emoji),
        contentDescription = "Account Profile Picture",
        modifier = Modifier.size(40.dp)
      )
      Spacer(Modifier.width(15.dp))
      Text(
        text = "Hey, Edith",
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.primary
      )
    }
    Icon(
      painter = painterResource(R.drawable.copyicon),
      contentDescription = "Notification",
      modifier = Modifier.size(24.dp)
    )
  }
}