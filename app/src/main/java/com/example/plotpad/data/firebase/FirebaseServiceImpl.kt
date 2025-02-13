package com.example.plotpad.data.firebase
import com.example.plotpad.data.dto.RegistrationDTO
import com.google.firebase.auth.FirebaseUser

class FirebaseServiceImpl : FirebaseService {
    override fun register(
        registrationDTO: RegistrationDTO,
        onSuccess: (FirebaseUser) -> Unit,
        onFailure: (String) -> Unit
    ) {
        super.register(registrationDTO, onSuccess, onFailure)

    }

    override fun signIn() {
        super.signIn()
    }
}