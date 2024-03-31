package data.source.remote.network

import data.source.remote.model.RandomUserApiResponse

/**
 * Created by Aziza Helmy on 3/28/2024.
 */
interface IApiService {
    suspend fun getUsers(): RandomUserApiResponse

}