plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.kotlin.android)
}

android {
  namespace = "com.example.demoappstartplibinadnroid"
  compileSdk = 34
  
  defaultConfig {
    applicationId = "com.example.demoappstartplibinadnroid"
    minSdk = 24
    targetSdk = 34
    versionCode = 1
    versionName = "1.0"
    
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }
  
  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }
  kotlinOptions {
    jvmTarget = "11"
  }
  buildFeatures {
    viewBinding = true
  }
}

dependencies {
  
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.appcompat)
  implementation(libs.material)
  implementation(libs.androidx.activity)
  implementation(libs.androidx.constraintlayout)
  testImplementation(libs.junit)
  androidTestImplementation(libs.androidx.junit)
  androidTestImplementation(libs.androidx.espresso.core)
  
  // App Startup
  implementation("androidx.startup:startup-runtime:1.2.0")
  
  // Retrofit
  implementation("com.squareup.retrofit2:retrofit:2.11.0")
  // Gson
  implementation("com.squareup.retrofit2:converter-gson:2.11.0")
  // OkHttp
  implementation("com.squareup.okhttp3:okhttp:4.11.0")
  
  // Timber is easier to use than Log.d
  implementation("com.jakewharton.timber:timber:5.0.1")
}