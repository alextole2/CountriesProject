package com.devtides.countries.model.di

import com.devtides.countries.view.MainActivity
import dagger.Component

@ActivityScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [CountriesListAdapterModule::class]
)
interface CountriesComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        fun applicationComponent(applicationComponent: ApplicationComponent): Builder
        fun build(): CountriesComponent
    }
}