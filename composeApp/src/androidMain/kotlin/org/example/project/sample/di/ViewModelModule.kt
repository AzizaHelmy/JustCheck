package org.example.project.sample.di

import org.example.project.sample.presentation.screens.home.HomeViewModel
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

/**
 * Created by Aziza Helmy on 3/28/2024.
 */

val viewModelModule = module {
    singleOf(::HomeViewModel) { bind<HomeViewModel>() }
}