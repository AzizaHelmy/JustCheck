package data.source.remote.network

import data.source.remote.model.RandomUserApiResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.http.isSuccess
import org.koin.core.component.KoinComponent

/**
 * Created by Aziza Helmy on 3/28/2024.
 */
class ApiService(private val client: HttpClient) : IApiService, KoinComponent {
    override suspend fun getUsers(): RandomUserApiResponse {
        return tryToExecute(client.get("?page=1&results=20&seed=abc")) //todo: just 4 testing
    }
    private suspend inline fun <reified T> tryToExecute(response: HttpResponse): T {
        if (response.status.isSuccess()) {
            return response.body()
        } else {
            when (response.status.value) { //todo: just for now
                401 -> throw Exception(response.status.description)
                500 -> throw Exception()
                else -> throw Exception(response.status.description)
            }
        }
    }
}
