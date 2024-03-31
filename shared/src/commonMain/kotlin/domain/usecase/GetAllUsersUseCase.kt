package domain.usecase

import data.repository.MainRepository


class GetAllUsersUseCase(private val mainRepository: MainRepository) {
    suspend operator fun invoke() = mainRepository.getUsers()
}