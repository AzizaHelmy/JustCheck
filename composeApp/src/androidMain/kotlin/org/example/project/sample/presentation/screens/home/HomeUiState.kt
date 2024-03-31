package org.example.project.sample.presentation.screens.home

import domain.model.User


/**
 * Created by Aziza Helmy on 31/3/2024.
 */
data class HomeUiState(
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val users: List<UserUiState> = emptyList(),
)

data class UserUiState(
    val name: String,
    val phone: String,
    val image: String
)

fun List<User>.toUserUiState(): List<UserUiState> {
    return this.map {
        UserUiState(
            name = it.name,
            phone = it.phone,
            image = it.image
        )
    }
}