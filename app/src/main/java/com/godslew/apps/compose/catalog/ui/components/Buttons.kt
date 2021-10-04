package com.godslew.apps.compose.catalog.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.godslew.apps.compose.catalog.values.ComposeCatalogColors

enum class ButtonsCatalog(override val body: @Composable (onClick: () -> Unit) -> Unit) : Content {
  Primary(body = { PrimaryButton(text = "Primary", onClick = it) }),
  Secondary(body = { SecondaryButton(text = "Secondary", onClick = it) }),
  Outline(body = { OutlineButton(text = "Outline", onClick = it) }),
  IconPrimaryButton(body = { IconPrimaryButton(icon = Icons.Filled.Home,text = "IconPrimaryButton", onClick = it) }),
}

enum class PrimaryCatalog(override val body: @Composable (() -> Unit) -> Unit) : Content {
  Default(body = { PrimaryButton(text = "Default", onClick = {}) }),
  DefaultDisable(body = { PrimaryButton(text = "Default", onClick = {}, enable = false) }),
  Red600(body = { PrimaryButton(text = "Red600", onClick = {}, backgroundColor = ComposeCatalogColors.red600) }),
  Red600Disable(body = { PrimaryButton(text = "Red600", onClick = {}, backgroundColor = ComposeCatalogColors.red600, enable = false) }),
  Red500(body = { PrimaryButton(text = "Red500", onClick = {}, backgroundColor = ComposeCatalogColors.red500) }),
  Red400(body = { PrimaryButton(text = "Red400", onClick = {}, backgroundColor = ComposeCatalogColors.red400) }),
  Red300(body = { PrimaryButton(text = "Red300", onClick = {}, backgroundColor = ComposeCatalogColors.red300) }),
  Red200(body = { PrimaryButton(text = "Red200", onClick = {}, backgroundColor = ComposeCatalogColors.red200) }),
  Blue600(body = { PrimaryButton(text = "Blue600", onClick = {}, backgroundColor = ComposeCatalogColors.blue600) }),
  Blue600Disable(body = { PrimaryButton(text = "Blue600", onClick = {}, backgroundColor = ComposeCatalogColors.blue600, enable = false) }),
  Blue500(body = { PrimaryButton(text = "Blue500", onClick = {}, backgroundColor = ComposeCatalogColors.blue500) }),
  Blue400(body = { PrimaryButton(text = "Blue400", onClick = {}, backgroundColor = ComposeCatalogColors.blue400) }),
  Blue300(body = { PrimaryButton(text = "Blue300", onClick = {}, backgroundColor = ComposeCatalogColors.blue300) }),
  Blue200(body = { PrimaryButton(text = "Blue200", onClick = {}, backgroundColor = ComposeCatalogColors.blue200) }),
  Green600(body = { PrimaryButton(text = "Green600", onClick = {}, backgroundColor = ComposeCatalogColors.green600) }),
  Green600Disable(body = { PrimaryButton(text = "Green600", onClick = {}, backgroundColor = ComposeCatalogColors.green600, enable = false) }),
  Green500(body = { PrimaryButton(text = "Green500", onClick = {}, backgroundColor = ComposeCatalogColors.green500) }),
  Green400(body = { PrimaryButton(text = "Green400", onClick = {}, backgroundColor = ComposeCatalogColors.green400) }),
  Green300(body = { PrimaryButton(text = "Green300", onClick = {}, backgroundColor = ComposeCatalogColors.green300) }),
  Green200(body = { PrimaryButton(text = "Green200", onClick = {}, backgroundColor = ComposeCatalogColors.green200) }),
}

enum class SecondaryCatalog(override val body: @Composable (() -> Unit) -> Unit) : Content {
  Default(body = { SecondaryButton(text = "Default", onClick = {}) }),
  DefaultDisable(body = { SecondaryButton(text = "Default", onClick = {}, enable = false) }),
  Red600(body = { SecondaryButton(text = "Red600", onClick = {}, backgroundColor = ComposeCatalogColors.red600) }),
  Red600Disable(body = { SecondaryButton(text = "Red600", onClick = {}, backgroundColor = ComposeCatalogColors.red600, enable = false) }),
  Red500(body = { SecondaryButton(text = "Red500", onClick = {}, backgroundColor = ComposeCatalogColors.red500) }),
  Red400(body = { SecondaryButton(text = "Red400", onClick = {}, backgroundColor = ComposeCatalogColors.red400) }),
  Red300(body = { SecondaryButton(text = "Red300", onClick = {}, backgroundColor = ComposeCatalogColors.red300) }),
  Red200(body = { SecondaryButton(text = "Red200", onClick = {}, backgroundColor = ComposeCatalogColors.red200) }),
  Blue600(body = { SecondaryButton(text = "Blue600", onClick = {}, backgroundColor = ComposeCatalogColors.blue600) }),
  Blue600Disable(body = { SecondaryButton(text = "Blue600", onClick = {}, backgroundColor = ComposeCatalogColors.blue600, enable = false) }),
  Blue500(body = { SecondaryButton(text = "Blue500", onClick = {}, backgroundColor = ComposeCatalogColors.blue500) }),
  Blue400(body = { SecondaryButton(text = "Blue400", onClick = {}, backgroundColor = ComposeCatalogColors.blue400) }),
  Blue300(body = { SecondaryButton(text = "Blue300", onClick = {}, backgroundColor = ComposeCatalogColors.blue300) }),
  Blue200(body = { SecondaryButton(text = "Blue200", onClick = {}, backgroundColor = ComposeCatalogColors.blue200) }),
  Green600(body = { SecondaryButton(text = "Green600", onClick = {}, backgroundColor = ComposeCatalogColors.green600) }),
  Green600Disable(body = { SecondaryButton(text = "Green600", onClick = {}, backgroundColor = ComposeCatalogColors.green600, enable = false) }),
  Green500(body = { SecondaryButton(text = "Green500", onClick = {}, backgroundColor = ComposeCatalogColors.green500) }),
  Green400(body = { SecondaryButton(text = "Green400", onClick = {}, backgroundColor = ComposeCatalogColors.green400) }),
  Green300(body = { SecondaryButton(text = "Green300", onClick = {}, backgroundColor = ComposeCatalogColors.green300) }),
  Green200(body = { SecondaryButton(text = "Green200", onClick = {}, backgroundColor = ComposeCatalogColors.green200) }),
}

enum class OutlineCatalog(override val body: @Composable (() -> Unit) -> Unit) : Content {
  Default(body = { OutlineButton(text = "Default", onClick = {}) }),
  DefaultDisable(body = { OutlineButton(text = "Default", onClick = {}, enable = false) }),
  Black(body = { OutlineButton(text = "Black", onClick = {}, color = ComposeCatalogColors.black) }),
  Red600(body = { OutlineButton(text = "Red600", onClick = {}, color = ComposeCatalogColors.red600) }),
  Red600Disable(body = { OutlineButton(text = "Red600", onClick = {}, color = ComposeCatalogColors.red600, enable = false) }),
  Red500(body = { OutlineButton(text = "Red500", onClick = {}, color = ComposeCatalogColors.red500) }),
  Red400(body = { OutlineButton(text = "Red400", onClick = {}, color = ComposeCatalogColors.red400) }),
  Red300(body = { OutlineButton(text = "Red300", onClick = {}, color = ComposeCatalogColors.red300) }),
  Red200(body = { OutlineButton(text = "Red200", onClick = {}, color = ComposeCatalogColors.red200) }),
  Blue600(body = { OutlineButton(text = "Blue600", onClick = {}, color = ComposeCatalogColors.blue600) }),
  Blue600Disable(body = { OutlineButton(text = "Blue600", onClick = {}, color = ComposeCatalogColors.blue600, enable = false) }),
  Blue500(body = { OutlineButton(text = "Blue500", onClick = {}, color = ComposeCatalogColors.blue500) }),
  Blue400(body = { OutlineButton(text = "Blue400", onClick = {}, color = ComposeCatalogColors.blue400) }),
  Blue300(body = { OutlineButton(text = "Blue300", onClick = {}, color = ComposeCatalogColors.blue300) }),
  Blue200(body = { OutlineButton(text = "Blue200", onClick = {}, color = ComposeCatalogColors.blue200) }),
  Green600(body = { OutlineButton(text = "Green600", onClick = {}, color = ComposeCatalogColors.green600) }),
  Green600Disable(body = { OutlineButton(text = "Green600", onClick = {}, color = ComposeCatalogColors.green600, enable = false) }),
  Green500(body = { OutlineButton(text = "Green500", onClick = {}, color = ComposeCatalogColors.green500) }),
  Green400(body = { OutlineButton(text = "Green400", onClick = {}, color = ComposeCatalogColors.green400) }),
  Green300(body = { OutlineButton(text = "Green300", onClick = {}, color = ComposeCatalogColors.green300) }),
  Green200(body = { OutlineButton(text = "Green200", onClick = {}, color = ComposeCatalogColors.green200) }),
}

@Composable
fun PrimaryButton(
  text: String,
  backgroundColor: Color = MaterialTheme.colors.primary,
  enable: Boolean = true,
  onClick: () -> Unit,
) = Button(
  onClick = onClick,
  contentPadding = PaddingValues(vertical = 8.dp, horizontal = 12.dp),
  shape = MaterialTheme.shapes.medium,
  colors = buttonColors(backgroundColor = backgroundColor),
  enabled = enable,
) {
  Text(text = text)
}

@Composable
fun SecondaryButton(
  text: String,
  backgroundColor: Color = MaterialTheme.colors.secondary,
  enable: Boolean = true,
  onClick: () -> Unit,
) = Button(
  onClick = onClick,
  contentPadding = PaddingValues(vertical = 8.dp, horizontal = 12.dp),
  shape = MaterialTheme.shapes.small,
  colors = buttonColors(backgroundColor = backgroundColor),
  enabled = enable,
) {
  Text(text = text)
}

@Composable
fun OutlineButton(
  text: String,
  color: Color = MaterialTheme.colors.primary,
  enable: Boolean = true,
  onClick: () -> Unit,
) = OutlinedButton(
  onClick = onClick,
  contentPadding = PaddingValues(vertical = 8.dp, horizontal = 12.dp),
  shape = MaterialTheme.shapes.medium,
  colors = ButtonDefaults.outlinedButtonColors(contentColor = color),
  border = BorderStroke(width = 1.dp, color = color),
  enabled = enable
) {
  Text(text = text)
}

@Composable
fun IconPrimaryButton(
  icon: ImageVector,
  text: String,
  backgroundColor: Color = MaterialTheme.colors.primary,
  enable: Boolean = true,
  onClick: () -> Unit,
) = Button(
  onClick = onClick,
  contentPadding = PaddingValues(vertical = 8.dp, horizontal = 12.dp),
  shape = MaterialTheme.shapes.medium,
  colors = buttonColors(backgroundColor = backgroundColor),
  enabled = enable,
) {
  Icon(imageVector = icon, contentDescription = null, modifier = Modifier.padding(end = 4.dp))
  Text(text = text)
}
