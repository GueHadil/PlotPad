import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType
import org.jetbrains.kotlin.gradle.plugin.mpp.pm20.util.targets
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
    id("com.google.gms.google-services")
    //hilt
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")

}

android {
    namespace = "com.example.plotpad"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.plotpad"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlin {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
            javaParameters.set(true)

        }
    }



// Configure Compose options
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0"
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }




    dependencies {

            implementation(libs.androidx.core.ktx)
            implementation(libs.androidx.appcompat)
            implementation(libs.material)
            implementation(libs.androidx.activity)
            implementation(libs.androidx.constraintlayout)
            implementation(libs.androidx.runtime.android)
            implementation(libs.androidx.material3.android)
            implementation(libs.androidx.ui)
            implementation(libs.androidx.ui.tooling.preview.android)
            implementation(libs.androidx.foundation.layout.android)
            implementation(libs.androidx.foundation.layout.android)
            implementation(libs.androidx.foundation.layout.android)
            implementation(libs.junit.junit)
            debugImplementation(libs.androidx.ui.tooling)
            testImplementation(libs.junit)
            androidTestImplementation(libs.androidx.junit)
            androidTestImplementation(libs.androidx.espresso.core)
            //Firebase
            implementation(libs.google.firebase.auth)
            implementation(libs.hilt.android)
            kapt(libs.hilt.android.compiler)
            // Jetpack Compose dependencies
            implementation(libs.androidx.ui.tooling.preview)
            debugImplementation(libs.ui.tooling)

            // Testing
            testImplementation(libs.androidx.core.testing)

            // MockK framework
            implementation(libs.mockk)

            testImplementation(libs.robolectric)


            implementation(kotlin("test"))
            implementation(kotlin("test-common"))
            implementation(kotlin("test-annotations-common"))


        }

        kapt {
            correctErrorTypes = true
        }
    }

