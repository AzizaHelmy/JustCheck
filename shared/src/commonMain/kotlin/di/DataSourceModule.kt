package di

import data.source.remote.network.IApiService
import data.source.remote.network.ApiService
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module


val dataSourceModule = module {
    singleOf(::ApiService)  { bind<IApiService>() }
}