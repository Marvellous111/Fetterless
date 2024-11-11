package com.appbase.fetterless.ui.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationRailItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.appbase.fetterless.ui.navigation.NavigationItem
import com.appbase.fetterless.ui.theme.FetterlessTheme
import com.appbase.fetterless.R
import com.appbase.fetterless.ui.components.AccountInformation


@Composable
fun HomeScreen(
  navController: NavHostController,
  modifier: Modifier = Modifier
) {
  Surface(
    modifier = modifier
      .background(color = MaterialTheme.colorScheme.background)
      .fillMaxSize(),
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
      HomeContentMainTexts(
        modifier = Modifier
      )
      Spacer(modifier = Modifier.height(30.dp))
      HomeContentMainButtons(
        goToPortfolio = {
          navController.navigate(NavigationItem.Portfolio.route)
        },
        modifier = Modifier
      )
      HomeContentSubButtons(
        goToSend = {
          navController.navigate(NavigationItem.Send.route)
        },
        goToReceive = {
          navController.navigate(NavigationItem.Receive.route)
        },
        modifier = Modifier
      )
      //Spacer(modifier = Modifier.height(30.dp))
      HomeContentNFT(
        modifier = Modifier
      )
      Spacer(modifier = Modifier.height(15.dp))
      HomeContentRecentTransactions(
        modifier = Modifier
      )
    }
  }
}

@Composable
fun HomeContentMainTexts(
  modifier: Modifier = Modifier
) {
  Column (
    modifier = modifier
      .fillMaxWidth()
      .padding(start = 16.dp, end = 16.dp)
  ) {
    Column(
      modifier = modifier
        .fillMaxWidth()
    ) {
      Text(
        text = stringResource(R.string.home_main_first),
        style = MaterialTheme.typography.displayLarge,
        color = MaterialTheme.colorScheme.secondary,
        modifier = Modifier.fillMaxWidth()
      )
      Text(
        text = "3,450.90$" + "USD",
        style = MaterialTheme.typography.titleLarge,
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.fillMaxWidth()
      )
      Text(
        text = stringResource(R.string.home_main_second),
        style = MaterialTheme.typography.displayLarge,
        color = MaterialTheme.colorScheme.secondary,
        modifier = Modifier.fillMaxWidth()
      )
      Row(
        modifier= Modifier
          .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        Text(
          text = "3,450.90%",
          style = MaterialTheme.typography.titleLarge,
          color = MaterialTheme.colorScheme.surface,
        )
        Spacer(modifier = Modifier.width(10.dp))
        Card(
          modifier = Modifier
            .size(24.dp),
          shape = RoundedCornerShape(5.dp),
          colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainer
          )
        ) {
          Column(
            modifier = Modifier
              .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
          ) {
            Icon(
              painter = painterResource(R.drawable.arrowup),
              contentDescription = null,
              tint = MaterialTheme.colorScheme.surface,
              modifier = Modifier.size(18.dp)
            )
          }
        }
      }
    }
  }
}

@Composable
fun HomeContentMainButtons(
  goToPortfolio: () -> Unit,
  modifier: Modifier = Modifier
) {
  Row(
    modifier = modifier
      .padding(start = 16.dp)
  ) {
    Button(
      onClick = goToPortfolio,
      modifier = Modifier
        .height(38.dp),
        //.padding(start = 8.dp, end = 8.dp),
      shape = RoundedCornerShape(30.dp),
      colors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.primaryContainer
      )
    ) {
      Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically
      ) {
        Icon(
          painter = painterResource(R.drawable.walleticon),
          contentDescription = null,
          tint = MaterialTheme.colorScheme.tertiary,
          modifier = Modifier.size(24.dp)
        )
        Spacer(Modifier.width(10.dp))
        Text(
          text = stringResource(R.string.portfolio),
          style = MaterialTheme.typography.labelLarge,
          color = MaterialTheme.colorScheme.tertiary,
        )
      }
    }
    Button(
      onClick = {},
      modifier = Modifier
        .height(38.dp)
        .padding(start = 8.dp, end = 8.dp),
      shape = RoundedCornerShape(30.dp),
      colors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.primaryContainer
      )
    ) {
      Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically
      ) {
        Icon(
          painter = painterResource(R.drawable.nfticon),
          contentDescription = null,
          tint = MaterialTheme.colorScheme.tertiary,
          modifier = Modifier.size(24.dp)
        )
        Spacer(Modifier.width(10.dp))
        Text(
          text = stringResource(R.string.nfts),
          style = MaterialTheme.typography.labelLarge,
          color = MaterialTheme.colorScheme.tertiary,
        )
      }
    }
  }
}

@Composable
fun HomeContentSubButtons(
  goToSend: () -> Unit,
  goToReceive: () -> Unit,
  modifier: Modifier = Modifier
) {
  Row(
    modifier = modifier
      .fillMaxWidth()
      .padding(16.dp),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.SpaceBetween
  ) {
    Button(
      onClick = goToSend,
      modifier = Modifier
        .width(125.dp)
        .height(38.dp),
        //.padding(start = 8.dp, end = 8.dp),
      shape = RoundedCornerShape(30.dp),
      colors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.primaryContainer
      )
    ) {
      Row(
        modifier = Modifier
          .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
      ) {
        Icon(
          painter = painterResource(R.drawable.arrowup),
          contentDescription = null,
          tint = MaterialTheme.colorScheme.tertiary,
          modifier = Modifier.size(24.dp)
        )
        Spacer(Modifier.width(10.dp))
        Text(
          text = stringResource(R.string.send),
          style = MaterialTheme.typography.labelLarge,
          color = MaterialTheme.colorScheme.tertiary,
        )
      }
    }
    Button(
      onClick = goToReceive,
      modifier = Modifier
        .width(125.dp)
        .height(38.dp),
        //.padding(start = 8.dp, end = 8.dp),
      shape = RoundedCornerShape(30.dp),
      colors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.primaryContainer
      )
    ) {
      Row(
        modifier = Modifier
          .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
      ) {
        Icon(
          painter = painterResource(R.drawable.arrowdown),
          contentDescription = null,
          tint = MaterialTheme.colorScheme.tertiary,
          modifier = Modifier.size(24.dp)
        )
        Spacer(Modifier.width(10.dp))
        Text(
          text = stringResource(R.string.receive),
          style = MaterialTheme.typography.labelLarge,
          color = MaterialTheme.colorScheme.tertiary,
        )
      }
    }
    Button(
      onClick = {},
      modifier = Modifier
        .width(125.dp)
        .height(38.dp),
        //.padding(start = 8.dp, end = 8.dp),
      shape = RoundedCornerShape(30.dp),
      colors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.primaryContainer
      )
    ) {
      Row(
        modifier = Modifier
          .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
      ) {
        Icon(
          painter = painterResource(R.drawable.arrowswap),
          contentDescription = null,
          tint = MaterialTheme.colorScheme.tertiary,
          modifier = Modifier.size(24.dp)
        )
        Spacer(Modifier.width(10.dp))
        Text(
          text = stringResource(R.string.swap),
          style = MaterialTheme.typography.labelLarge,
          color = MaterialTheme.colorScheme.tertiary,
        )
      }
    }
  }
}

@Composable
fun HomeContentNFT(
  modifier: Modifier = Modifier
) {
  Column(
    modifier = modifier
      .padding(start = 16.dp, end = 16.dp)
  ) {
    Row(
      modifier = Modifier
        .fillMaxWidth(),
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.SpaceBetween
    ) {
      Text(
        text = stringResource(R.string.home_nfts),
        style = MaterialTheme.typography.labelLarge,
        color = MaterialTheme.colorScheme.secondary,
        modifier = Modifier.width(110.dp),
      )
      TextButton(
        onClick = {},
        contentPadding = PaddingValues(end = 0.dp),
        modifier = Modifier.wrapContentWidth(Alignment.End)
      ) {
        Text(
          text = stringResource(R.string.home_nfts_get),
          style = MaterialTheme.typography.bodyMedium,
          color = MaterialTheme.colorScheme.primary,
          textDecoration = TextDecoration.Underline,
          textAlign = TextAlign.End,
        )
      }
    }
    Row(
      modifier = Modifier
    ) {
      Column(
        modifier = Modifier
      ) {
        Card(
          modifier = Modifier
            .size(150.dp),
          shape = RoundedCornerShape(10.dp),
          colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainer
          ),
        ) { }
        Spacer(Modifier.height(5.dp))
        Text(
          text = "First NFT",
          style = MaterialTheme.typography.bodyMedium,
          color = MaterialTheme.colorScheme.primary
        )
      }
      Spacer(Modifier.width(30.dp))
      Column(
        modifier = Modifier
      ) {
        Card(
          modifier = Modifier
            .size(150.dp),
          shape = RoundedCornerShape(10.dp),
          colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainer
          ),
        ) { }
        Spacer(Modifier.height(5.dp))
        Text(
          text = "First NFT",
          style = MaterialTheme.typography.bodyMedium,
          color = MaterialTheme.colorScheme.primary
        )
      }
    }
  }
}

@Composable
fun HomeContentRecentTransactions(
  modifier: Modifier = Modifier
) {
  Column(
    modifier = modifier
      .padding(start = 16.dp, end = 16.dp)
  ) {
    Row (
      modifier = Modifier
        .fillMaxWidth(),
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.SpaceBetween
    ) {
      Text(
        text = stringResource(R.string.home_recent),
        style = MaterialTheme.typography.labelLarge,
        color = MaterialTheme.colorScheme.secondary,
      )
      TextButton(
        onClick = {},
        contentPadding = PaddingValues(end = 0.dp),
        modifier = Modifier.wrapContentWidth(Alignment.End)
      ) {
        Text(
          text = stringResource(R.string.home_recent_all),
          style = MaterialTheme.typography.bodyMedium,
          color = MaterialTheme.colorScheme.primary,
          textDecoration = TextDecoration.Underline,
          textAlign = TextAlign.End,
        )
      }
    }
  }
}

//@Preview(
//  showBackground = true,
//  showSystemUi = true,
//)
//@Composable
//fun HomePreview() {
//  FetterlessTheme {
//    HomeScreen(
//      modifier = Modifier
//        .fillMaxSize()
//    )
//  }
//}