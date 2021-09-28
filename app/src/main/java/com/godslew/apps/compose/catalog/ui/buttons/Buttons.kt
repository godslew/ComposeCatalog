package com.godslew.apps.compose.catalog.ui.buttons

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.godslew.apps.compose.catalog.screens.ComposeCatalogScreen
import com.godslew.apps.compose.catalog.ui.components.ButtonsCatalog
import com.godslew.apps.compose.catalog.ui.components.Content

@Composable
fun Buttons(navController: NavController) {
  LazyColumn {
    items(ButtonsCatalog.values()) {
      Content(content = it) {
        navController.navigate(ComposeCatalogScreen.Buttons.name + "/" + it.name)
      }
    }
  }
}
