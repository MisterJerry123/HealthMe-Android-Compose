package com.example.healthmeconverttocomposablecode.presentation.auth.signup.agree_terms

data class AgreeTermsState (
    val isNextButtonEnable: Boolean = false,
    val isAllTermsAgreed: Boolean = false,
    val isDialogShow: Boolean = false,
    val isAgreeTerm:List<Boolean> = listOf(false,false,false,false)


)