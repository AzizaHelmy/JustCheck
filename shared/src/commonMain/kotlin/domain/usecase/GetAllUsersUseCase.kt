package domain.usecase

import data.repository.MainRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject


class GetAllUsersUseCase:KoinComponent {
    private val mainRepository: MainRepository by inject()
    suspend operator fun invoke() = mainRepository.getUsers()
}