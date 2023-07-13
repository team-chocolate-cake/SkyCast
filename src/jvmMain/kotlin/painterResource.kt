import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource



expect object PainterRes {
    @Composable
    fun splashScreenImage(): Painter
    fun weatherSunCloudImage(): Painter
}

actual object PainterRes {
    @Composable
    actual fun splashScreenImage(): Painter = painterResource("drawable/splash_screen_image.png")
    @Composable
    actual fun weatherSunCloudImage(): Painter  = painterResource("drawable/weather_sun_cloud.xml")
}