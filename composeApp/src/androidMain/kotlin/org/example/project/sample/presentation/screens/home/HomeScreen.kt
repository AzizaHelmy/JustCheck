package org.example.project.sample.presentation.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import data.source.remote.model.RandomUser
import org.koin.compose.koinInject

/**
 * Created by Aziza Helmy on 3/28/2024.
 */
@Composable
fun HomeScreen(homeViewModel: HomeViewModel = koinInject()) {
    val state by homeViewModel.state.collectAsState()
    HomeContent(users = state)

}
@Composable
private fun HomeContent(
    users: RandomUser,
) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
       /* items(users, key = { user -> user.login?.uuid.toString() }) { user ->
            Card(
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                elevation = 2.dp
            ) {

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = rememberAsyncImagePainter(model = user.picture?.thumbnail),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(16.dp)
                            .size(50.dp)
                    )
                    Column(verticalArrangement = Arrangement.Center) {
                        Text(text = "${user.name?.first} ${user.name?.last}")
                        Text(text = user.phone.toString())
                    }
                }

            }
        }
*/
    }
}
