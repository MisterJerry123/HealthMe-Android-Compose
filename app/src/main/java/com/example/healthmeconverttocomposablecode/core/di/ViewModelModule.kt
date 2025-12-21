package com.example.healthmeconverttocomposablecode.core.di

import com.example.healthmeconverttocomposablecode.presentation.auth.signup.agree_terms.AgreeTermsViewModel
import com.example.healthmeconverttocomposablecode.presentation.auth.signup.set_email.SetEmailViewModel
import com.example.healthmeconverttocomposablecode.presentation.auth.signup.set_information.SetInformationViewModel
import com.example.healthmeconverttocomposablecode.presentation.auth.signup.set_password.SetPasswordViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { AgreeTermsViewModel() }
    viewModel { SetEmailViewModel() }
    viewModel { SetInformationViewModel() }
    viewModel { SetPasswordViewModel() }
}