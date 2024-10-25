package com.example.demoappstartplibinadnroid.service

import retrofit2.http.GET

interface ApiInterface {
  @GET("api/data")
  fun fetchData(): String
}