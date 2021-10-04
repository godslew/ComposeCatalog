package com.godslew.apps.compose.catalog.values

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
  primary = ComposeCatalogColors.purple200,
  primaryVariant = ComposeCatalogColors.purple700,
  secondary = ComposeCatalogColors.teal200
)

private val LightColorPalette = lightColors(
  primary = ComposeCatalogColors.purple500,
  primaryVariant = ComposeCatalogColors.purple700,
  secondary = ComposeCatalogColors.teal200
)

@Composable
fun ComposeCatalogTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable () -> Unit
) {
  val colors = if (darkTheme) {
    DarkColorPalette
  } else {
    LightColorPalette
  }

  MaterialTheme(
    colors = colors,
    shapes = shapes,
    content = content
  )
}
