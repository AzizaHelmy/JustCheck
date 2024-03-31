package data.repository

import data.source.remote.mapper.toEntity
import data.source.remote.network.IApiService
import domain.model.User
import domain.repository.IMainRepository

/**
 * Created by Aziza Helmy on 3/28/2024.
 */
class MainRepository(private val apiService: IApiService):IMainRepository {
    override suspend fun getUsers(): List<User>{
        return apiService.getUsers().results.toEntity()
    }

}