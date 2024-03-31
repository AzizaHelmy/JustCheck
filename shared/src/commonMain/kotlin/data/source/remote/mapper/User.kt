package data.source.remote.mapper

import data.source.remote.model.RandomUser
import domain.model.User

/**
 * Created by Aziza Helmy on 3/31/2024.
 */

fun RandomUser.toEntity(): User {
    return User(
        name = name?.first ?: "",
        phone = phone ?: "",
        image = picture?.large ?: "",
    )
}
fun List<RandomUser>.toEntity() = map { it.toEntity() }
