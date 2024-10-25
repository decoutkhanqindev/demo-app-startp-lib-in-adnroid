package com.example.demoappstartplibinadnroid.initializer

import android.content.Context
import androidx.startup.Initializer
import com.example.demoappstartplibinadnroid.service.CrashTrackerService
import timber.log.Timber

class CrashTrackerInitializerNoDependency : Initializer<CrashTrackerService> {
  override fun create(context: Context): CrashTrackerService {
    Timber.tag("Initializer").d("CrashTrackerService is created")
    return CrashTrackerService.initialize(context)
  }
  
  override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}