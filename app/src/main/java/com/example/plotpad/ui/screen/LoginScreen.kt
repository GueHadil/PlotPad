import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider

@Composable
fun ModuleComposable(text: String? = null) {  }

@Preview
@Composable
fun ModuleComposablePreview() = ModuleComposable()

@Preview
@Composable
fun ModuleComposablePreview(
    @PreviewParameter(TextParameterProvider::class) text: String,
) = ModuleComposable(text = text)

class TextParameterProvider : PreviewParameterProvider<String> {
    override val values = (1..5).map { "Param #$it" }.asSequence()
}