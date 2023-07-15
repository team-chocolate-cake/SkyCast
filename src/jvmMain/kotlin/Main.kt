import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import app.di.initKoin
import org.koin.core.Koin
import org.koin.core.context.GlobalContext.startKoin
import org.koin.java.KoinJavaComponent.inject
import presentation.home_screen.HomeScreen
import presentation.home_screen.view_model.HomeUiState
import presentation.home_screen.view_model.HomeViewModel
import presentation.home_screen.view_model.mapper.SearchMapper

@Composable
@Preview
fun App(koin: Koin) {
    MaterialTheme {
        HomeScreen(koin.get())
    }
}

fun main() = application {
    val koin = initKoin()
    Window(onCloseRequest = ::exitApplication) {
        App(koin)

    }
}
