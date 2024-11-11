package com.appbase.fetterless.ui.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.appbase.fetterless.ui.components.HomeNavigation
import com.appbase.fetterless.ui.theme.FetterlessTheme
import com.appbase.fetterless.R
import com.appbase.fetterless.ui.components.AccountInformation

@Composable
fun PortfolioScreen(
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
      HomeNavigation(
        navController,
        modifier = Modifier
      )
      Spacer(Modifier.height(30.dp))
      PortfolioMainCurrencies(
        modifier = Modifier
      )
    }
  }
}

@Composable
fun PortfolioMainCurrencies(
  modifier: Modifier = Modifier
) {
  Column(
    modifier = modifier.padding(start = 16.dp, end = 16.dp)
  ) {
    Card(
      modifier = Modifier
        .fillMaxWidth(),
      colors = CardDefaults.cardColors(
        containerColor = MaterialTheme.colorScheme.secondaryContainer
      ),
      shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp)
    ) {
      Row(
        modifier = Modifier
          .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
      ) {
        Image(
          painter = painterResource(R.drawable.female_emoji),
          contentDescription = null,
          modifier = Modifier.size(40.dp)
        )
        Spacer(Modifier.width(10.dp))
        Column(
          modifier = modifier
        ) {
          Row(
            modifier = Modifier
              .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
          ) {
            Text(
              text = stringResource(R.string.portfolio_bitcoin),
              style = MaterialTheme.typography.bodyLarge,
              color = MaterialTheme.colorScheme.primary
            )
            Text(
              text = "1,450.90$"+"USD",
              style = MaterialTheme.typography.bodyLarge,
              color = MaterialTheme.colorScheme.primary
            )
          }
          Row(
            modifier = Modifier
              .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
          ) {
            Row(
              modifier = modifier
            ) {
              Text(
                text = "75,500$" + "USD",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.primary
              )
            }
            Text(
              text = "0.0192",
              style = MaterialTheme.typography.labelLarge,
              color = MaterialTheme.colorScheme.primary
            )
          }
        }
      }
    }
    Spacer(Modifier.height(5.dp))
    Card(
      modifier = Modifier
        .fillMaxWidth(),
      colors = CardDefaults.cardColors(
        containerColor = MaterialTheme.colorScheme.secondaryContainer
      ),
      shape = RoundedCornerShape(0)
    ) {
      Row(
        modifier = Modifier
          .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
      ) {
        Image(
          painter = painterResource(R.drawable.female_emoji),
          contentDescription = null,
          modifier = Modifier.size(40.dp)
        )
        Spacer(Modifier.width(10.dp))
        Column(
          modifier = modifier
        ) {
          Row(
            modifier = Modifier
              .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
          ) {
            Text(
              text = stringResource(R.string.portfolio_bitcoin),
              style = MaterialTheme.typography.bodyLarge,
              color = MaterialTheme.colorScheme.primary
            )
            Text(
              text = "1,450.90$"+"USD",
              style = MaterialTheme.typography.bodyLarge,
              color = MaterialTheme.colorScheme.primary
            )
          }
          Row(
            modifier = Modifier
              .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
          ) {
            Row(
              modifier = modifier
            ) {
              Text(
                text = "75,500$" + "USD",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.primary
              )
            }
            Text(
              text = "0.0192",
              style = MaterialTheme.typography.labelLarge,
              color = MaterialTheme.colorScheme.primary
            )
          }
        }
      }
    }
    Spacer(Modifier.height(5.dp))
    Card(
      modifier = Modifier
        .fillMaxWidth(),
      colors = CardDefaults.cardColors(
        containerColor = MaterialTheme.colorScheme.secondaryContainer
      ),
      shape = RoundedCornerShape(0)
    ) {
      Row(
        modifier = Modifier
          .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
      ) {
        Image(
          painter = painterResource(R.drawable.female_emoji),
          contentDescription = null,
          modifier = Modifier.size(40.dp)
        )
        Spacer(Modifier.width(10.dp))
        Column(
          modifier = modifier
        ) {
          Row(
            modifier = Modifier
              .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
          ) {
            Text(
              text = stringResource(R.string.portfolio_bitcoin),
              style = MaterialTheme.typography.bodyLarge,
              color = MaterialTheme.colorScheme.primary
            )
            Text(
              text = "1,450.90$"+"USD",
              style = MaterialTheme.typography.bodyLarge,
              color = MaterialTheme.colorScheme.primary
            )
          }
          Row(
            modifier = Modifier
              .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
          ) {
            Row(
              modifier = modifier
            ) {
              Text(
                text = "75,500$" + "USD",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.primary
              )
            }
            Text(
              text = "0.0192",
              style = MaterialTheme.typography.labelLarge,
              color = MaterialTheme.colorScheme.primary
            )
          }
        }
      }
    }
    Spacer(Modifier.height(5.dp))
    Card(
      modifier = Modifier
        .fillMaxWidth(),
      colors = CardDefaults.cardColors(
        containerColor = MaterialTheme.colorScheme.secondaryContainer
      ),
      shape = RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp)
    ) {
      Row(
        modifier = Modifier
          .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
      ) {
        Image(
          painter = painterResource(R.drawable.female_emoji),
          contentDescription = null,
          modifier = Modifier.size(40.dp)
        )
        Spacer(Modifier.width(10.dp))
        Column(
          modifier = modifier
        ) {
          Row(
            modifier = Modifier
              .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
          ) {
            Text(
              text = stringResource(R.string.portfolio_bitcoin),
              style = MaterialTheme.typography.bodyLarge,
              color = MaterialTheme.colorScheme.primary
            )
            Text(
              text = "1,450.90$"+"USD",
              style = MaterialTheme.typography.bodyLarge,
              color = MaterialTheme.colorScheme.primary
            )
          }
          Row(
            modifier = Modifier
              .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
          ) {
            Row(
              modifier = modifier
            ) {
              Text(
                text = "75,500$" + "USD",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.primary
              )
            }
            Text(
              text = "0.0192",
              style = MaterialTheme.typography.labelLarge,
              color = MaterialTheme.colorScheme.primary
            )
          }
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
//fun PortfolioPreview() {
//  FetterlessTheme {
//    PortfolioScreen(
//      modifier = Modifier
//        .fillMaxSize()
//    )
//  }
//}