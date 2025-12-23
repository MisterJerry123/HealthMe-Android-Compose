package com.example.healthmeconverttocomposablecode.core.di

import com.example.healthmeconverttocomposablecode.presentation.auth.signup.agree_terms.AgreeTermsViewModel
import com.example.healthmeconverttocomposablecode.presentation.auth.signup.set_email.SetEmailViewModel
import com.example.healthmeconverttocomposablecode.presentation.auth.signup.set_information.SetInformationViewModel
import com.example.healthmeconverttocomposablecode.presentation.auth.signup.set_password.SetPasswordViewModel
import com.example.healthmeconverttocomposablecode.presentation.main.my_page.set_body_info.SetBodyInfoViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { AgreeTermsViewModel() }
    viewModel { SetEmailViewModel() }
    viewModel { SetInformationViewModel() }
    viewModel { SetPasswordViewModel() }
    viewModel { SetBodyInfoViewModel() }
}