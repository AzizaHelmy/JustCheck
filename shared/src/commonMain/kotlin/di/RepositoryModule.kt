package di

import data.repository.MainRepository
import domain.repository.IMainRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

/**
 * Created by Aziza Helmy on 28/03/2024
 */
val repositoryModule = module {
    singleOf(::MainRepository) { bind<IMainRepository>() }
}