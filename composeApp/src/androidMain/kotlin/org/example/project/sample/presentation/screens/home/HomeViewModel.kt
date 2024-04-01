package org.example.project.sample.presentation.screens.home

import android.util.Log
import domain.model.User
import domain.usecase.GetAllUsersUseCase
import kotlinx.coroutines.flow.update
import org.example.project.sample.presentation.screens.BaseViewModel

/**
 * Created by Aziza Helmy on 3/28/2024.
 */
class HomeViewModel(
    private val usersUseCase: GetAllUsersUseCase,
) : BaseViewModel<HomeUiState>(HomeUiState()) {
    init {
        getAllUsers()
    }

    private fun getAllUsers() {
        tryToExecute(
            {
                usersUseCase.invoke()
            },
            ::onGetAllUsersSuccess,
            ::onGetAllUsersFail
        )
    }

    private fun onGetAllUsersSuccess(users: List<User>) {
        Log.e("TAG", "onGetAllUsersSuccess:$users ", )
        _state.update {
            it.copy(
                users = users.toUserUiState()
            )
        }
    }

    private fun onGetAllUsersFail(error: Exception) {
        Log.e("TAG", "onGetAllUsersFail:$error ", )
    }

}