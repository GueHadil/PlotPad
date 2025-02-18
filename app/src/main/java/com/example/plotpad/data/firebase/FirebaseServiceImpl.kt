package com.example.plotpad.data.firebase
import com.example.plotpad.data.dto.RegistrationDTO
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import javax.inject.Inject

class FirebaseServiceImpl @Inject constructor(
    private val auth: FirebaseAuth // Inject FirebaseAuth
) : FirebaseService {


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