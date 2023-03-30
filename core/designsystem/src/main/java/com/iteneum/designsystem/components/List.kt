package com.iteneum.designsystem.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LpGenericList(
    modifier: Modifier = Modifier,
    title: String? = null,
    content: List<String>
) {
    var collapsedState = remember { true }
    var hint = remember { "Select Category..." }

    Box(
        modifier = modifier
            .clip(RoundedCornerShape(6.dp))
            .border(BorderStroke(2.dp, MaterialTheme.colorScheme.primary))
            .padding(6.dp)
    ) {
        if (collapsedState) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { collapsedState = !collapsedState },
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = hint,
                    style = MaterialTheme.typography.labelMedium
                )
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null
                )
            }
        } else {
            LazyColumn {
                items(content){item ->
                    Row(
                        modifier = Modifier
                            .padding(2.dp)
                            .clickable {
                                collapsedState = !collapsedState
                                hint = item
                            }
                    ) {
                        Text(text = item)
                    }
                    Divider()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLpGenericList() {
    LpGenericList(
        modifier = Modifier
            .fillMaxWidth(),
        title = "Test Title",
        content = listOf("First", "Second", "Third")
    )
}