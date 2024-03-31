package org.example.project.sample.di

import org.koin.dsl.module

/**
 * Created by Aziza Helmy on 3/28/2024.
 */

fun androidAppModule() = module {
    includes(
        viewModelModule
    )
}