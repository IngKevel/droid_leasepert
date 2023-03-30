package com.iteneum.designsystem.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * A component to generate a comment field.
 *
 * @param hint: Show a hint for the comment.
 * @param border: For change the color in the comment.
 */

@Composable
fun LpGenericComment(
    modifier: Modifier = Modifier,
    hint: String = "Describe your problem...",
    border: BorderStroke = BorderStroke(2.dp, MaterialTheme.colorScheme.primary)
) {

    var text by remember { mutableStateOf(hint) }

    Row(
        modifier = modifier
            .clip(RoundedCornerShape(6.dp))
            .border(border)
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