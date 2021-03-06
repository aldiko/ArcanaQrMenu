package com.example.arcanaqrmenu.interfaces

import com.example.arcanaqrmenu.models.User

interface ILogin {

    interface View {
        fun startAlertLoading()
        fun stopAlertLoading()
        fun showMessage(stringId: Int)
        fun clearFields()
        fun startNextFragment(user : User)
    }

    interface Presenter {
        fun checkLogin(email: String, password: String)
        fun cleanUp()
    }
}