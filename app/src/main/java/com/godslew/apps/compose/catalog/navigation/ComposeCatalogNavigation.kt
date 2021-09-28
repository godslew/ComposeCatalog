package com.godslew.apps.compose.catalog.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.godslew.apps.compose.catalog.screens.ComposeCatalogScreen
import com.godslew.apps.compose.catalog.ui.buttons.Buttons
import com.godslew.apps.compose.catalog.ui.components.ButtonsCatalog
import com.godslew.apps.compose.catalog.ui.components.Contents
import com.godslew.apps.compose.catalog.ui.components.PrimaryCatalog
import com.godslew.apps.compose.catalog.ui.parent.Parent

@Composable
fun ComposeCatalogNavigation(
  navController: NavHostController,
  modifier: Modifier
) {
  NavHost(navController = navController, startDestination = ComposeCatalogScreen.Parent.name, modifier = modifier) {
    composable(route = ComposeCatalogScreen.Parent.name) {
      Parent(navController)
    }
    composable(route = ComposeCatalogScreen.Buttons.name) {
      Buttons(navController)
    }
    composable(route = ComposeCatalogScreen.Buttons.name + "/" + ButtonsCatalog.Primary.name) {
      Contents(contents = PrimaryCatalog.values().toList())
    }
  }
}