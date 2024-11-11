package com.appbase.fetterless.ui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.appbase.fetterless.ui.components.HomeNavigation
import com.appbase.fetterless.ui.theme.FetterlessTheme
import com.appbase.fetterless.R
import com.appbase.fetterless.ui.components.AccountInformation

@Composable
fun SendScreen(
  navController: NavHostController,
  modifier: Modifier = Modifier
) {
  Surface(
    modifier = modifier
      .fillMaxSize(),
    color = MaterialTheme.colorScheme.background
  ) {
    Column(
      modifier = Modifier,
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
      Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
      ) {
        Column(
          modifier = Modifier
        ) {
          SendTransferAmountInput(
            modifier = Modifier
          )
          //Spacer(Modifier.height(30.dp))
          SendTransferCard(
            modifier = Modifier
          )
        }
        SendButton(
          modifier = Modifier
        )
      }
    }
  }
}

@Composable
fun SendTransferAmountInput(
  modifier: Modifier = Modifier
) {
  Column(
    modifier = modifier
      .padding(start = 16.dp, end=16.dp)
  ) {
    Text(
      text = stringResource(R.string.send_transfer_amount),
      style = MaterialTheme.typography.titleMedium,
      color = MaterialTheme.colorScheme.secondary
    )
//    BasicTextField(
//      value="",
//      onValueChange = {},
//      modifier = Modifier
//        .background(
//          color = MaterialTheme.colorScheme.background,
//          shape = RoundedCornerShape(30.dp),
//        )
//        .padding(0.dp)
//        .fillMaxWidth(),
//      decorationBox = { innerTextField ->
//        Row(
//          verticalAlignment = Alignment.CenterVertically,
//          modifier = Modifier.padding(0.dp)
//        ) {
//          if (true) {
//            Text(
//              "1,000$"+"USD",
//              color = MaterialTheme.colorScheme.secondary,
//              style = MaterialTheme.typography.headlineLarge
//            )
//          }
//          innerTextField()
//        }
//      }
//    )
    TextField(
      value = "",
      onValueChange = {},
      maxLines = 1,
      singleLine = true,
      keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
      colors = TextFieldDefaults.colors(
        unfocusedTextColor = MaterialTheme.colorScheme.secondary,
        focusedTextColor = MaterialTheme.colorScheme.primary,
        unfocusedIndicatorColor = MaterialTheme.colorScheme.background,
        focusedIndicatorColor = MaterialTheme.colorScheme.background,
        unfocusedContainerColor = MaterialTheme.colorScheme.background,
        focusedContainerColor = MaterialTheme.colorScheme.background,
        unfocusedPlaceholderColor = MaterialTheme.colorScheme.secondary
      ),
      placeholder = {
        Text(
          text = "1,000$"+"USD",
          style = MaterialTheme.typography.headlineLarge,
        )
      },
      textStyle = MaterialTheme.typography.headlineLarge,
    )
  }
}

@Composable
fun SendTransferCard(
  modifier: Modifier = Modifier
) {
  Column(
    modifier = modifier
      .padding(16.dp),
  ) {
    Card(
      modifier = Modifier,
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
            modifier = Modifier,
          ) {
            Column(
              modifier = Modifier
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
        TextField(
          value = "",
          onValueChange = {},
          colors = TextFieldDefaults.colors(
            unfocusedTextColor = MaterialTheme.colorScheme.secondary,
            focusedTextColor = MaterialTheme.colorScheme.primary,
            unfocusedIndicatorColor = MaterialTheme.colorScheme.background,
            focusedIndicatorColor = MaterialTheme.colorScheme.background,
            unfocusedContainerColor = MaterialTheme.colorScheme.background,
            focusedContainerColor = MaterialTheme.colorScheme.background,
            unfocusedPlaceholderColor = MaterialTheme.colorScheme.secondary
          ),
          shape = RoundedCornerShape(30.dp),
          placeholder = {
            Text(
              text = stringResource(R.string.send_bitcoin_address),
              style = MaterialTheme.typography.labelLarge,
            )
          },
          textStyle = MaterialTheme.typography.headlineSmall,
          trailingIcon = {
            Icon(
              painter = painterResource(R.drawable.copyicon),
              contentDescription = "paste icon",
              modifier = Modifier.size(24.dp)
            )
          },
          modifier = Modifier
            .fillMaxWidth()
            .defaultMinSize(minHeight = 38.dp)
        )
      }
    }
  }
}

@Composable
fun SendButton(
  modifier: Modifier = Modifier
) {
  Button(
    onClick = {},
    colors = ButtonDefaults.buttonColors(
      containerColor = MaterialTheme.colorScheme.primaryContainer
    ),
    shape = RoundedCornerShape(30.dp),
    modifier = modifier
      .height(38.dp)
      .fillMaxWidth()
      .padding(start = 16.dp, end = 16.dp)
  ) {
    Text(
      text = stringResource(R.string.send),
      style = MaterialTheme.typography.bodyLarge,
      color = MaterialTheme.colorScheme.tertiary
    )
  }
}
//
//@Preview(
//  showBackground = true,
//  showSystemUi = true,
//)
//@Composable
//fun SendPreview() {
//  FetterlessTheme {
//    SendScreen(
//      modifier = Modifier
//        .fillMaxSize()
//    )
//  }
//}