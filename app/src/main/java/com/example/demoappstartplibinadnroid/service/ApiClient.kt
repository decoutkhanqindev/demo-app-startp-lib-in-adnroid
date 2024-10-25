package com.example.demoappstartplibinadnroid.service

import android.content.Context
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.io.File

object ApiClient {
  private lateinit var retrofit: Retrofit
  
  fun initialize(applicationContext: Context, baseUrl: String) {
    // File represents the application cache directory
    val httpCacheDirectory = File(applicationContext.cacheDir, "http-cache")
    val cacheSize: Long = 10 * 1024 * 1024 // 10MB
    // Caches HTTP and HTTPS responses to the filesystem so they may be reused,
    // saving time and bandwidth.
    val cache = Cache(httpCacheDirectory, cacheSize)
    
    val okHttpClient: OkHttpClient = OkHttpClient.Builder()
      .cache(cache)
      .build()
    
    retrofit = Retrofit.Builder()
      .baseUrl(baseUrl)
      .client(okHttpClient)
      .addConverterFactory(GsonConverterFactory.create())
      .build()
  }
  
  fun create(): ApiInterface = retrofit.create<ApiInterface>()
}