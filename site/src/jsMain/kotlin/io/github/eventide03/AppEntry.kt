package io.github.eventide03

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.style.toModifier
import io.github.eventide03.components.IcarusTonicStyleSheet
import org.jetbrains.compose.web.css.vh

@App
@Composable
fun AppEntry(content: @Composable () -> Unit) {
    SilkApp {
        // Include the IcarusTonic styles
        IcarusTonicStyleSheet()

        Surface(SmoothColorStyle.toModifier().minHeight(100.vh).fontFamily("Trebuchet MS", "sans-serif")) {
            content()
        }
    }
}
