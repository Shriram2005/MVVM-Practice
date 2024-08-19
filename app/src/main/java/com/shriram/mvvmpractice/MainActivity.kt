package com.shriram.mvvmpractice
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.shriram.mvvmpractice.ui.theme.MVVMPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
// hide status bar
        enableEdgeToEdge()

        setContent {
            MVVMPracticeTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    CounterScreen()
                }
            }
        }
    }
}
