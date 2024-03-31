package data.repository

import data.source.remote.model.RandomUser
import data.source.remote.network.IApiService
import domain.repository.IMainRepository

/**
 * Created by Aziza Helmy on 3/28/2024.
 */
class MainRepository(private val apiService: IApiService):IMainRepository {
    override suspend fun getUsers(): List<RandomUser>{
        return apiService.getUsers().results
    }

}