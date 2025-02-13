package com.example.plotpad.data.firebase

import com.example.plotpad.data.dto.RegistrationDTO
import com.google.firebase.auth.FirebaseUser

interface FirebaseService {
    fun register (registrationDTO: RegistrationDTO, onSuccess: (FirebaseUser) -> Unit, onFailure: (String) -> Unit){}
    fun signIn(){}
}