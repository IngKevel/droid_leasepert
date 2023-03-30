package com.iteneum.designsystem.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LpGenericComment(
    modifier: Modifier = Modifier,
    hint: String = "Describe your problem..."
) {

    var text by remember { mutableStateOf(hint) }

    Row(
        modifier = modifier
            .clip(RoundedCornerShape(6.dp))
            .border(BorderStroke(2.dp, MaterialTheme.colorScheme.primary))
            .padding(6.dp)
            .heightIn(min = 80.dp)
    ) {
        BasicTextField(
            value = text,
            onValueChange = {newText ->
                text = newText
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLpGenericComment() {
    LpGenericComment(
        modifier = Modifier
            .fillMaxWidth()
    )
}