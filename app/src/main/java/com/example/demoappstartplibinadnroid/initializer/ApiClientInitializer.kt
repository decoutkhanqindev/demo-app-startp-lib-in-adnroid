package com.example.demoappstartplibinadnroid.initializer

import android.content.Context
import androidx.startup.Initializer
import com.example.demoappstartplibinadnroid.di.ApiClient
import timber.log.Timber

class ApiClientInitializer: Initializer<ApiClient> {
  override fun create(context: Context): ApiClient {
    ApiClient.initialize(context, "https://example.com/api")
    Timber.tag("Initializer").d("ApiClient is created.")
    return ApiClient
  }
  
  override fun dependencies(): List<Class<out Initializer<*>>> {
    // No dependencies on other libraries.
    return emptyList()
  }
}