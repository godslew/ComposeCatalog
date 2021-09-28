package com.godslew.apps.compose.catalog.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.rememberNavController
import com.godslew.apps.compose.catalog.R
import com.godslew.apps.compose.catalog.navigation.ComposeCatalogNavigation
import com.godslew.apps.compose.catalog.screens.ComposeCatalogScreen
import com.godslew.apps.compose.catalog.values.ComposeCatalogTheme

@Composable
fun ComposeCatalogApp() {
  val navController = rememberNavController()
  ComposeCatalogTheme {
    Scaffold(
      topBar = {
        TopAppBar(
          title = {
            Text(text = stringResource(id = R.string.app_name))
          },
          actions = {
            IconButton(onClick = {
              navController.navigate(ComposeCatalogScreen.Parent.name) {
                launchSingleTop = true
              }
            }) {
              Icon(Icons.Filled.Home, contentDescription = null)
            }
          }
        )
      }
    ) { innerPadding ->
      ComposeCatalogNavigation(navController = navController, Modifier.padding(innerPadding))
    }
  }
}

