package com.godslew.apps.compose.catalog.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.godslew.apps.compose.catalog.screens.ComposeCatalogScreen
import com.godslew.apps.compose.catalog.ui.parent.Parent

@Composable
fun ComposeCatalogNavigation(
  navController: NavHostController
) {
  NavHost(navController = navController, startDestination = ComposeCatalogScreen.Parent.name) {
    composable(route = ComposeCatalogScreen.Parent.name) {
      Parent(navController)
    }
  }
}