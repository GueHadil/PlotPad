package com.example.plotpad.data.dto

data class RegistrationDTO(val fullName : String,
                           val username : String,
                           val email : String,
                           val password : String,
                           val pswConf : String){
    fun isPswValid(): Boolean{
        return password == pswConf
    }
}
