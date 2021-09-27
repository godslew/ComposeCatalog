package com.godslew.apps.compose.catalog.ui.parent

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.godslew.apps.compose.catalog.ui.components.PrimaryButton

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Parent(navController: NavHostController) {
  LazyVerticalGrid(
    cells = GridCells.Adaptive(minSize = 128.dp),
    contentPadding = PaddingValues(horizontal = 24.dp, vertical = 32.dp),
    horizontalArrangement = Arrangement.spacedBy(16.dp),
    verticalArrangement = Arrangement.spacedBy(16.dp),
  ) {
    items(Catalog.values()) { catalog ->
      PrimaryButton(text = catalog.name) {
        navController.navigate(catalog.name)
      }
    }
  }
}