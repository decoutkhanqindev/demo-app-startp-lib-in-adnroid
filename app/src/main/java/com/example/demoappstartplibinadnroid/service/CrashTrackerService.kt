package com.example.demoappstartplibinadnroid.service

import android.content.Context

object CrashTrackerService {
  private var isInitialized: Boolean = false
  
  fun initialize(context: Context): CrashTrackerService {
    isInitialized = true
    return this
  }
}