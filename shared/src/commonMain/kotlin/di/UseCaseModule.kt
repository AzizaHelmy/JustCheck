package di

import domain.usecase.GetAllUsersUseCase
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

//val useCaseModule = module {
//    singleOf(::GetAllUsersUseCase) { bind<GetAllUsersUseCase>() }
//
//}
