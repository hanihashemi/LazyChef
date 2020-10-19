package io.github.hanihashemi.lazychef.androidApp.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.state
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawShadow
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import io.github.hanihashemi.lazychef.androidApp.R
import io.github.hanihashemi.lazychef.androidApp.Screen
import io.github.hanihashemi.lazychef.androidApp.ui.ThemedPreview

@Composable
fun HomeScreen(navigateTo: (Screen) -> Unit) {
    HomeScreen()
}

@Composable
fun HomeScreen() {
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
fun bodyContent(){
    Column(modifier = Modifier.padding(16.dp)){
        title()
        subTitle()
        dishCard()
    }
}

@Composable
fun title() {
    Text(text = "Lazy Chef", style = MaterialTheme.typography.h5)
}

@Composable
fun subTitle() {
    Text(text = "Be healthy and lazy", style = MaterialTheme.typography.subtitle1)
}

@Composable()
fun dishCard() {
    Row(
        modifier = Modifier
            .drawShadow(3.dp, shape = RoundedCornerShape(10.dp))
            .clickable {}
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Image(
            asset = imageResource(id = R.drawable.dish),
            modifier = Modifier.preferredSize(80.dp)
                .drawShadow(8.dp, shape = CircleShape)
                .clip(RoundedCornerShape(20.dp))
        )
        Spacer(modifier = Modifier.preferredWidth(8.dp))
        Column(Modifier.align(Alignment.CenterVertically).fillMaxWidth()) {
            Text(text = "Food Name", style = MaterialTheme.typography.body1)
            Text(text = "Category", style = MaterialTheme.typography.caption)
            Text(text = "10 Mins", style = MaterialTheme.typography.caption)
        }
    }
}

@Preview("Home screen body")
@Composable
fun PreviewHomeScreenBody() {
    ThemedPreview {
        HomeScreen()
    }
}