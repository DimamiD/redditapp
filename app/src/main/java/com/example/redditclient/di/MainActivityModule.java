package com.example.redditclient.di;

import com.example.redditclient.ui.ImageViewFragment;
import com.example.redditclient.ui.MainRedditFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
@SuppressWarnings("unused")
public abstract class MainActivityModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract MainRedditFragment providesMainRedditFragment();

    @FragmentScoped
    @ContributesAndroidInjector
    abstract ImageViewFragment providesWebViewFragment();
}
