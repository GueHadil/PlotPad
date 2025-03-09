package com.example.plotpad.data.firebase
import android.content.ContentValues.TAG
import android.util.Log
import android.widget.Toast
import com.example.plotpad.data.dto.RegistrationDTO
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import javax.inject.Inject

class FirebaseServiceImpl @Inject constructor(
    private val auth: FirebaseAuth // Inject FirebaseAuth
) : FirebaseService {

    private var user: FirebaseUser? = null

    override fun register(
        registrationDTO: RegistrationDTO,
        onSuccess: (FirebaseUser) -> Unit,
        onFailure: (String) -> Unit
    ) {
        super.register(registrationDTO, onSuccess, onFailure)

    }


        override fun signIn(email: String, password: String,
                            onSuccess: (FirebaseUser) -> Unit,
                            onFailure: (String) -> Unit) {
            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val user = auth.currentUser
                        if (user != null) {
                            onSuccess(user)
                        }
                    } else {
                        val errorMessage = task.exception?.message ?: "Sign-in failed"
                        Log.w(TAG, "signIn: Failure", task.exception)
                        onFailure(errorMessage)


        }}}}