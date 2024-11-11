package com.appbase.fetterless.ui.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.appbase.fetterless.ui.components.HomeNavigation
import com.appbase.fetterless.ui.theme.FetterlessTheme
import com.appbase.fetterless.R
import com.appbase.fetterless.ui.components.AccountInformation

@Composable
fun ReceiveScreen(
  navController: NavHostController,
  modifier: Modifier = Modifier
) {
  Surface(
    modifier = modifier,
    color = MaterialTheme.colorScheme.background
  ) {
    Column(
      modifier = Modifier
    ) {
      Spacer(Modifier.height(15.dp))
      AccountInformation(
        modifier = Modifier
      )
      Spacer(Modifier.height(30.dp))
      HomeNavigation(
        navController = navController,
        modifier = Modifier
      )
      Spacer(Modifier.height(30.dp))
      ReceiveCard(
        modifier = Modifier
      )
    }
  }
}

@Composable
fun ReceiveCard(
  modifier: Modifier = Modifier
) {
  Card(
    modifier = modifier
      .padding(start = 16.dp, end = 16.dp),
    shape = RoundedCornerShape(10.dp),
    colors = CardDefaults.cardColors(
      containerColor = MaterialTheme.colorScheme.secondaryContainer
    ),
  ) {
    Column(
      modifier = Modifier
        .fillMaxWidth()
        .padding(15.dp)
    ) {
      Text(
        text = stringResource(R.string.send_transfer_to),
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.primary
      )
      Spacer(Modifier.height(30.dp))
      Row(
        modifier = Modifier
          .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
      ) {
        Row(
          modifier = Modifier
        ) {
          Text(
            text = stringResource(R.string.portfolio_bitcoin),
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.primary
          )
        }
        Button(
          modifier = Modifier
            .height(38.dp)
            .width(100.dp),
          onClick = {},
          colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
          ),
          shape = RoundedCornerShape(30.dp),
        ) {
          Text(
            text = stringResource(R.string.transaction_change),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.tertiary,
          )
        }
      }
      Spacer(Modifier.height(30.dp))
      Card(
        modifier = Modifier
          .height(38.dp),
        colors = CardDefaults.cardColors(
          containerColor = MaterialTheme.colorScheme.background
        ),
        shape = RoundedCornerShape(30.dp)
      ) {
        Row(
          modifier = Modifier
            .fillMaxSize()
            .padding(start = 12.dp, end = 12.dp),
          horizontalArrangement = Arrangement.SpaceBetween,
          verticalAlignment = Alignment.CenterVertically
        ) {
          Text(
            text = "tb134345fjdfei534jfw492fc3434f",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.primary
          )
          Icon(
            painter = painterResource(R.drawable.copyicon),
            contentDescription = "Copy Icon",
            modifier = Modifier.size(24.dp)
          )
        }
      }
    }
  }
}

//@Preview(
//  showBackground = true,
//  showSystemUi = true,
//)
//@Composable
//fun ReceivePreview() {
//  FetterlessTheme {
//    ReceiveScreen(
//      modifier = Modifier
//        .fillMaxSize()
//    )
//  }
//}