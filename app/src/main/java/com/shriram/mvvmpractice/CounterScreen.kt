package com.shriram.mvvmpractice

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

// View
@Composable
fun CounterScreen(viewModel: CounterViewModel = viewModel()) {
    val counterState = viewModel.counterState.collectAsState().value

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Count: ${counterState.count}", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Button(onClick = { viewModel.decrement() }) {
                Text(text = "Decrement")
            }

            Spacer(modifier = Modifier.width(16.dp))

            Button(onClick = { viewModel.increment() }) {
                Text(text = "Increment")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterScreenPreview() {
    CounterScreen()
}
