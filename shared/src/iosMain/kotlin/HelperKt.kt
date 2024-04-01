import di.appModule
import domain.usecase.GetAllUsersUseCase
import org.koin.core.context.startKoin
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

fun initKoin() {
    // start Koin
    startKoin {
        modules(appModule())
    }
}