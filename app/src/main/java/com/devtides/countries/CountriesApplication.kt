package com.devtides.countries

import android.app.Application
import com.devtides.countries.model.di.ApplicationComponent
import com.devtides.countries.model.di.DaggerApplicationComponent

class CountriesApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.create()
    }
}