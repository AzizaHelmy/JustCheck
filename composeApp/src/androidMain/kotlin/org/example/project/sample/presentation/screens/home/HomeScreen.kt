package org.example.project.sample.presentation.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import org.koin.compose.koinInject

/**
 * Created by Aziza Helmy on 3/28/2024.
 */
@Composable
fun HomeScreen(homeViewModel: HomeViewModel = koinInject()) {
    val state by homeViewModel.state.collectAsState()
    HomeContent(state = state)
}

@Composable
private fun HomeContent(
    state: HomeUiState,
) {
    LazyColumn(
        modifier = Modifier.background(Color(0xFFF2F2F2)),
        contentPadding = PaddingValues(
            horizontal = 16.dp,
            vertical = 4.dp
        )
    ) {
        itemsIndexed(items = state.users) { _, user ->
            UserItem(user)
        }
    }
}


@Composable
fun UserItem(
    user: UserUiState,
) {
    Card(
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        )
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = rememberAsyncImagePainter(model = user.image),
                contentDescription = "",
                modifier = Modifier
                    .padding(16.dp)
                    .size(50.dp).clip(
                        shape = RoundedCornerShape(
                            topStart = 16.dp,
                            topEnd = 0.dp,
                            bottomStart = 16.dp,
                            bottomEnd = 16.dp
                        )
                    )
            )
            Column(verticalArrangement = Arrangement.Center) {
                Text(text = user.name, modifier = Modifier.padding(bottom = 4.dp))
                Text(text = user.phone)
            }
        }
    }
}