package com.godslew.apps.compose.catalog.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

enum class ButtonsCatalog(override val body: @Composable (onClick: () -> Unit) -> Unit) : Content {
  Primary(body = { PrimaryButton(text = "Primary", onClick = it) }),
  Secondary(body = { SecondaryButton(text = "Secondary", onClick = it) })
}

enum class PrimaryCatalog(override val body: @Composable (() -> Unit) -> Unit): Content {
  Default(body = { PrimaryButton(text = "Default", onClick = {})  })
}

@Composable
fun PrimaryButton(
  text: String,
  onClick: () -> Unit,
) = Button(
  onClick = onClick,
  contentPadding = PaddingValues(vertical = 8.dp, horizontal = 12.dp),
  shape = MaterialTheme.shapes.medium,
) {
  Text(text = text)
}

@Composable
fun SecondaryButton(
  text: String,
  onClick: () -> Unit,
) = Button(
  onClick = onClick,
  contentPadding = PaddingValues(vertical = 8.dp, horizontal = 12.dp),
  shape = MaterialTheme.shapes.small,
  colors = buttonColors(backgroundColor = MaterialTheme.colors.secondary)
) {
  Text(text = text)
}