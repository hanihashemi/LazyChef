package io.github.hanihashemi.lazychef.androidApp.ui.recipe

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import io.github.hanihashemi.lazychef.androidApp.R
import io.github.hanihashemi.lazychef.androidApp.ui.ThemedPreview

@Composable
fun RecipeScreen(id: String, onBack: () -> Unit) {
    RecipeScreen()
}

@Composable
fun RecipeScreen() {
    Scaffold(
//        topBar = {
//            val title = stringResource(id = R.string.app_name)
//            TopAppBar(
//                title = { Text(text = title) },
//                navigationIcon = {
//                    IconButton(onClick = { scaffoldState.drawerState.open() }) {
//                        Icon(vectorResource(R.drawable.ic_jetnews_logo))
//                    }
//                }
//            )
//        },
        bodyContent = { innerPadding ->
            bodyContent()
        }
    )
}

@Composable
fun bodyContent() {
    Column(modifier = Modifier.padding(16.dp)) {
        topper()
        Spacer(modifier = Modifier.size(32.dp))
        Row(modifier = Modifier.fillMaxWidth().align(Alignment.End)) {
            Column {
                title("Nutritions")
                nutritionItem()
                nutritionItem()
                nutritionItem()
            }
                Image(
                    asset = imageResource(id = R.drawable.dish),
                    modifier = Modifier.preferredSize(200.dp)
                        .drawShadow(8.dp, shape = CircleShape)
                        .clip(RoundedCornerShape(20.dp))
                )
        }
        title("Ingredients")
        Text(style = MaterialTheme.typography.body2, text = """
            |2 cups of shit
            |2 cups of shit
            |2 cups of shit
            |2 cups of shit
        """.trimMargin())
        title("Receipe Preparation")
        Text(style = MaterialTheme.typography.body2, text = """
            |2 cups of shit
            |2 cups of shit
            |2 cups of shit
            |2 cups of shit
        """.trimMargin())
    }
}

@Composable
fun topper() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = "Watercress Salad", style = MaterialTheme.typography.h1)
        Text(text = "White onion, fennel and other things",
            style = MaterialTheme.typography.subtitle1)
    }
}

@Composable
fun nutritionItem() {
    Row(modifier = Modifier
        .padding(vertical = 8.dp)
        .drawShadow(15.dp, shape = CircleShape)
        .background(MaterialTheme.colors.background)
        .padding(vertical = 8.dp, horizontal = 12.dp)) {
        Column(modifier = Modifier
            .drawShadow(2.dp, shape = CircleShape)
            .background(Color.White)
            .align(Alignment.CenterVertically)) {
            Text(text = "250",
                textAlign = TextAlign.Center,
                modifier = Modifier.preferredSize(30.dp))
        }
        Spacer(modifier = Modifier.preferredSize(8.dp))
        Column {
            Text(text = "Calories",
                style = MaterialTheme.typography.caption.copy(color = Color.Black))
            Text(text = "Kcal", style = MaterialTheme.typography.caption)
        }
    }
}

@Composable
fun title(title: String) {
    Text(title, style = MaterialTheme.typography.h2, modifier = Modifier.padding(vertical = 8.dp))
}

@Preview("Recipe screen body")
@Composable
fun PreviewHomeScreenBody() {
    ThemedPreview {
        RecipeScreen()
    }
}