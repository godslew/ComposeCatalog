package com.godslew.apps.compose.catalog.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Content(content: Content, onClick: () -> Unit) {
  Column(modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp)) {
    Text(text = content.name, style = MaterialTheme.typography.body2)
    content.body(onClick)
  }
}

sealed interface Content {
  val name: String
  val body: @Composable (() -> Unit) -> Unit
}

@Composable
fun Contents(contents: List<Content>) {
  LazyColumn {
    items(contents) {
      Content(content = it) {}
    }
  }
}