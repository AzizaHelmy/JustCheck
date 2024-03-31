package domain.repository

import domain.model.User

/**
 * Created by Aziza Helmy on 3/28/2024.
 */
interface IMainRepository {
    suspend fun getUsers(): List<User>

}