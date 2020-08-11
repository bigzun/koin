/*
 * Copyright (c) https://bigzun.blogspot.com/
 * Email: bigzun.com@gmail.com
 * Created by admin on 2020/2/5
 *
 */

package dependencies

object Dependencies {

    const val minSdk = 19
    const val targetSdk = 29
    const val compileSdk = 29
    const val buildToolsSdk = "29.0.3"

    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    object Versions {
        //Plugins
        const val androidGradlePlugin = "4.0.0"
        const val kotlinGradlePlugin = "1.3.72"
        const val fabricGradlePlugin = "1.31.2"
        const val googleServices = "4.3.3"
        const val dexcountGradlePlugin = "1.0.2"
        const val gradleVersionsPlugin = "0.27.0"
        const val playPublisherPlugin = "2.7.0-SNAPSHOT"
        const val realmGradlePlugin = "7.0.1"
        const val ktx = "1.2.0"
        const val crashlyticsGradlePlugin = "2.1.0"
        const val performanceGradlePlugin = "1.3.1"
        const val koinGradlePlugin = "2.1.0"

        //Google
        const val firebaseCore = "17.2.1"
        const val firebaseConfig = "19.1.0"
        const val firebaseMessaging = "20.1.0"
        const val firebaseAnalytics = "17.2.1"
        const val firebaseCrashlytics = "17.0.0-beta01"
        const val crashlytics = "2.10.1"
        const val constraintLayout = "2.0.0-beta6"
        const val chromeCastFramework = "16.1.0"
        const val appcompat = "1.3.0-alpha01"
        const val legacySupport = "1.0.0"
        const val material = "1.2.0-alpha05"
        const val recyclerView = "1.2.0-alpha03"
        const val cardView = "1.0.0"
        const val annotation = "1.1.0"

        //Square
        const val haha = "2.0.4"
        const val leakCanary = "2.4"
        const val okio = "2.1.0"
        const val okhttp = "3.14.7"
        const val retrofit = "2.8.1"
        const val sqlBrite = "2.0.0"

        //Rx
        const val rxAndroid = "2.1.1"
        const val rxBinding = "2.2.0"
        const val rxBindingAppCompat = "2.2.0"
        const val rxJava = "2.2.16"
        const val rxRelay = "2.1.0"
        const val rxBroadcast = "2.0.0"
        const val rxPrefs = "2.0.0"
        const val rxKotlin = "2.3.0"
        const val rxDogTag = "0.2.0"

        const val nanoHttp = "2.3.1"
        const val dashClockApi = "2.0.0"
        const val fastScroll = "1.0.20"
        const val glide = "4.11.0"
        const val glideOkhttp = "1.5.0@aar"
        const val materialDialogs = "0.9.6.0"
        const val permiso = "0.3.0"
        const val streams = "1.2.1"
        const val butterknife = "8.8.1"
        const val butterknifeAnnotationProcessor = "8.8.1"
        const val dagger = "2.27"
        const val daggerAssistedInject = "0.3.2"
        const val expandableRecyclerView = "3.0.0-RC1"
        const val billing = "1.2"
        const val gson = "2.8.6"
        const val coroutinesAdapter = "1.0.0"

        //Testing
        const val junit = "4.12"
        const val junitExt = "1.1.1"
        const val espressoCore = "3.2.0"
        const val assertj = "3.9.0"
        const val mockito = "2.8.47"
        const val powermock = "1.7.1"
        const val robolectric = "3.6.1"

        const val realm = "6.1.0"
        const val timber = "4.6.1"
        const val lifecycle = "2.2.0"
        const val navigation = "2.2.2"
        const val stetho = "1.5.1"
        const val room = "2.2.5"
        const val viewpager2 = "1.0.0"
    }

    // Kotlin
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlinGradlePlugin}"
    const val koinScope = "org.koin:koin-androidx-scope:${Versions.koinGradlePlugin}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koinGradlePlugin}"
    const val ktx = "androidx.core:core-ktx:${Versions.ktx}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val legacySupport = "androidx.legacy:legacy-support-v4:${Versions.legacySupport}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val cardView = "androidx.cardview:cardview:${Versions.cardView}"
    const val annotation = "androidx.annotation:annotation:${Versions.annotation}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val viewpager2 = "androidx.viewpager2:viewpager2:${Versions.viewpager2}"

    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val coroutinesAdapter =
            "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-experimental-adapter:${Versions.coroutinesAdapter}"

    // NanoHttp - https://github.com/NanoHttpd/nanohttpd (Various)
    const val nanoHttp = "org.nanohttpd:nanohttpd-webserver:${Versions.nanoHttp}"

    // Crashlytics - https://fabric.io/kits/android/crashlytics
    const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}"

    // Dashclock - https://git.io/vix9g (Roman Nurik)
    const val dashClockApi =
            "com.google.android.apps.dashclock:dashclock-api:${Versions.dashClockApi}"

    // RecyclerView-FastScroll - https://git.io/vix5z
    const val fastScroll = "com.simplecityapps:recyclerview-fastscroll:${Versions.fastScroll}"

    // Glide - https://git.io/vtn9K (Bump)
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    // Glide - OkHttp  integration - https://git.io/vihvW (Bump)
    const val glideOkhttp = "com.github.bumptech.glide:okhttp3-integration:${Versions.glideOkhttp}"

    // Material Dialogs - https://git.io/vixHf (Aidan Follestad)
    const val materialDialogs = "com.afollestad.material-dialogs:core:${Versions.materialDialogs}"
    const val materialDialogCommons =
            "com.afollestad.material-dialogs:commons:${Versions.materialDialogs}"

    // Permiso - https://git.io/vixQ4 (Greyson Parrelli)
    const val permiso = "com.greysonparrelli.permiso:permiso:${Versions.permiso}"

    // Streams Backport - https://git.io/vCazA (Victor Melnik)
    const val streams = "com.annimon:stream:${Versions.streams}"

    // Butterknife
    const val butterknife = "com.jakewharton:butterknife:${Versions.butterknife}"
    const val butterknifeAnnotationProcessor =
            "com.jakewharton:butterknife-compiler:${Versions.butterknifeAnnotationProcessor}"

    // Dagger
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val daggerProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    const val daggerSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"

    // Dagger Assisted Inject
    const val daggerAssistedInject =
            "com.squareup.inject:assisted-inject-annotations-dagger2:${Versions.daggerAssistedInject}"
    const val daggerAssistedInjectProcessor =
            "com.squareup.inject:assisted-inject-processor-dagger2:${Versions.daggerAssistedInject}"

    // Expandable Recycler View - https://github.com/thoughtbot/expandable-recycler-view
    const val expandableRecyclerView =
            "com.bignerdranch.android:expandablerecyclerview:${Versions.expandableRecyclerView}"

    // In app purchases
    const val billing = "com.android.billingclient:billing:${Versions.billing}"

    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    const val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"
    const val stethoOkhttp3 = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"

    const val exoplayer = "com.google.android.exoplayer:exoplayer:2.11.7"
    const val rajawali = "org.rajawali3d:rajawali:1.1.970"

    object Plugins {
        const val android = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
        const val kotlin =
                "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradlePlugin}"
        const val dexcount =
                "com.getkeepsafe.dexcount:dexcount-gradle-plugin:${Versions.dexcountGradlePlugin}"    //https://github.com/KeepSafe/dexcount-gradle-plugin
        const val fabric = "io.fabric.tools:gradle:${Versions.fabricGradlePlugin}"
        const val playPublisher =
                "com.github.triplet.gradle:play-publisher:${Versions.playPublisherPlugin}"
        const val gradleVersions =
                "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleVersionsPlugin}"     //https://github.com/ben-manes/gradle-versions-plugin
        const val playServices = "com.google.gms:google-services:${Versions.googleServices}"
        const val realm = "io.realm:realm-gradle-plugin:${Versions.realmGradlePlugin}"
        const val crashlytics = "com.google.firebase:firebase-crashlytics-gradle:${Versions.crashlyticsGradlePlugin}"
        const val kotlinAllOpen = "org.jetbrains.kotlin:kotlin-allopen:${Versions.kotlinGradlePlugin}"
        const val navigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
        const val performance = "com.google.firebase:perf-plugin:${Versions.performanceGradlePlugin}"
        const val koin = "org.koin:koin-gradle-plugin:${Versions.koinGradlePlugin}"
    }

    object Google {
        const val firebaseCore = "com.google.firebase:firebase-core:${Versions.firebaseCore}"
        const val firebaseConfig = "com.google.firebase:firebase-config:${Versions.firebaseConfig}"
        const val firebaseMessaging =
                "com.google.firebase:firebase-messaging:${Versions.firebaseMessaging}"
        const val firebaseAnalytics =
                "com.google.firebase:firebase-analytics:${Versions.firebaseAnalytics}"
        const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}"
        const val firebaseCrashlytics =
                "com.google.firebase:firebase-crashlytics:${Versions.firebaseCrashlytics}"
    }

    object Squareup {
        const val haha = "com.squareup.haha:haha:${Versions.haha}"
        const val leakCanaryDebug =
                "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"
        const val leakCanaryRel =
                "com.squareup.leakcanary:leakcanary-android-no-op:${Versions.leakCanary}"
        const val okio = "com.squareup.okio:okio:${Versions.okio}"
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val retrofitJackson = "com.squareup.retrofit2:converter-jackson:${Versions.retrofit}"
        const val retrofitAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
        const val sqlBrite = "com.squareup.sqlbrite2:sqlbrite:${Versions.sqlBrite}"
    }

    object Rx {
        // RxJava - https://git.io/vihv0 (ReactiveX)
        const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"

        // rxBinding - https://git.io/vix5y (Jake Wharton)
        const val rxBinding = "com.jakewharton.rxbinding2:rxbinding:${Versions.rxBinding}"

        // rxBinding AppCompat - https://git.io/vix5y (Jake Wharton)
        const val rxBindingAppCompat =
                "com.jakewharton.rxbinding2:rxbinding-appcompat-v7:${Versions.rxBindingAppCompat}"

        // RxJava - https://git.io/rxjava (ReactiveX)
        const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"

        // RX Image Picker - https://git.io/vix5H (MLSDev )
        const val rxImagePicker = "com.github.timusus:RxImagePicker:permission-check-fix-SNAPSHOT"

        // RX Relay - https://github.com/JakeWharton/RxRelay
        const val rxRelay = "com.jakewharton.rxrelay2:rxrelay:${Versions.rxRelay}"

        // Rx Receivers - https://github.com/f2prateek/rx-receivers
        const val rxBroadcast = "com.cantrowitz:rxbroadcast:${Versions.rxBroadcast}"

        // Rx Prefs - https://github.com/f2prateek/rx-preferences
        const val rxPrefs = "com.f2prateek.rx.preferences2:rx-preferences:${Versions.rxPrefs}"

        // Rx Kotlin - https://github.com/ReactiveX/RxKotlin
        const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"

        // Rx DogTag - https://github.com/uber/RxDogTag
        const val rxDogTag = "com.uber.rxdogtag:rxdogtag:${Versions.rxDogTag}"
    }

    object Testing {
        // JUnit
        const val junit = "junit:junit:${Versions.junit}"
        const val junitExt = "androidx.test.ext:junit:${Versions.junitExt}"

        // Espresso
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"

        // Mockito - https://github.com/mockito/mockito
        const val mockito = "org.mockito:mockito-core:${Versions.mockito}"

        // Powermock - https://github.com/powermock/powermock
        const val powermock = "org.powermock:powermock-api-mockito2:${Versions.powermock}"
        const val powermockjunit = "org.powermock:powermock-module-junit4:${Versions.powermock}"

        // Robolectric - https://github.com/robolectric/robolectric
        const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"

        // AssertJ - http://joel-costigliola.github.io/assertj/
        const val assertj = "org.assertj:assertj-core:${Versions.assertj}"
    }

    object BuildPlugins {
        const val androidApplication = "com.android.application"
        const val androidLibrary = "com.android.library"
        const val kotlin = "kotlin-android"
        const val kotlinAndroidExtensions = "kotlin-android-extensions"
        const val kapt = "kotlin-kapt"
        const val dexCount = "com.getkeepsafe.dexcount"
        const val fabric = "io.fabric"
        const val gradleVersions = "com.github.ben-manes.versions"
        const val playServices = "com.google.gms.google-services"
        const val realmAndroid = "realm-android"
        const val crashlytics = "com.google.firebase.crashlytics"
        const val kotlinAllOpen = "kotlin-allopen"
        const val navigationSafeargs = "androidx.navigation.safeargs.kotlin"
        const val firebasePerf = "com.google.firebase.firebase-perf"
    }

    object Realm {
        const val realmAnnotations = "io.realm:realm-annotations:${Versions.realm}"
        const val realmAnnotationsProcessor =
                "io.realm:realm-annotations-processor:${Versions.realm}"
    }

    object Room {
        const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
        const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
        const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
        const val roomRxJava2 = "androidx.room:room-rxjava2:${Versions.room}"
        const val roomGuava = "androidx.room:room-guava:${Versions.room}"
        const val roomTesting = "androidx.room:room-testing:${Versions.room}"
    }

    object Lifecycle {
        const val runtime = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycle}"
        const val extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
        const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
        const val compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
        const val commonJava8 = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"
        const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    }

    object Glide {
        // Glide - https://git.io/vtn9K (Bump)
        const val runtime = "com.github.bumptech.glide:glide:${Versions.glide}"
        const val compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

        // Glide - OkHttp  integration - https://git.io/vihvW (Bump)
        const val okhttpIntegration =
                "com.github.bumptech.glide:okhttp3-integration:${Versions.glideOkhttp}"
    }
}

