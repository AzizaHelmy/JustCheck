package domain.repository

import data.source.remote.model.RandomUser

/**
 * Created by Aziza Helmy on 3/28/2024.
 */
interface IMainRepository {
    suspend fun getUsers(): List<RandomUser>

}