package org.example.project.sample.presentation.screens.home

import data.source.remote.model.RandomUser
import domain.usecase.GetAllUsersUseCase
import kotlinx.coroutines.flow.update
import org.example.project.sample.presentation.screens.BaseViewModel

/**
 * Created by Aziza Helmy on 3/28/2024.
 */
class HomeViewModel(  private val productsUseCase: GetAllUsersUseCase,
) : BaseViewModel<RandomUser>(RandomUser()) {
    init {
        getAllUsers()
    }

    private fun getAllUsers() {
        tryToExecute(
            {
                productsUseCase.invoke()
            },
            ::onGetAllUsersSuccess,
            ::onGetAllUsersFail
        )
    }
    private fun onGetAllUsersSuccess(users: List<RandomUser>) {
        _state.update {
            it.copy(
            )
        }
    }

    private fun onGetAllUsersFail(error: Exception) {
    }

}