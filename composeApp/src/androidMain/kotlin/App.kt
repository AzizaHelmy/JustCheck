import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import org.example.project.sample.presentation.screens.home.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        HomeScreen()
    }
}