package buildSrc

object Build {
  const val minSdk = 24
  const val targetSdk = 31
  const val compileSdk = 31
  const val buildTool = "31.0.0"
}

object Libs {
  const val kotlinVersion = "1.5.30"
  private const val gradleVersion = "7.0.2"

  object Gradle {
    const val androidPlugin = "com.android.tools.build:gradle:$gradleVersion"

    object Kotlin {
      const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    }
  }
  object Kotlin {
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"

    object Coroutines {
      private const val version = "1.5.1"
      const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
      const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
      const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }
  }

  object View {
    const val appcompat = "androidx.appcompat:appcompat:1.3.1"
    const val material = "com.google.android.material:material:1.4.0"
    const val recyclerview = "androidx.recyclerview:recyclerview:1.2.1"
  }

  object AndroidX {
    const val coreKtx = "androidx.core:core-ktx:1.6.0"

    object Activity {
      const val activityCompose = "androidx.activity:activity-compose:1.3.1"
    }

    object Lifecycle {
      private const val version = "2.2.0"
      const val extensions = "androidx.lifecycle:lifecycle-extensions:$version"
      const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
      const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
      const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
    }

    object Compose {
      const val version = "1.1.0-alpha03"

      const val animation = "androidx.compose.animation:animation:$version"
      const val foundation = "androidx.compose.foundation:foundation:$version"
      const val layout = "androidx.compose.foundation:foundation-layout:$version"
      const val iconsExtended = "androidx.compose.material:material-icons-extended:$version"
      const val material = "androidx.compose.material:material:$version"
      const val runtime = "androidx.compose.runtime:runtime:$version"
      const val liveData = "androidx.compose.runtime:runtime-livedata:$version"
      const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:1.0.0-alpha03"
      const val tooling = "androidx.compose.ui:ui-tooling:$version"
      const val ui = "androidx.compose.ui:ui:$version"
      const val uiUtil = "androidx.compose.ui:ui-util:$version"
      const val uiTest = "androidx.compose.ui:ui-test-junit4:$version"

      const val navigation = "androidx.navigation:navigation-compose:2.4.0-alpha08"
    }
  }

  // di
  object Dagger {
    private const val version = "2.38.1"
    const val hiltGradle = "com.google.dagger:hilt-android-gradle-plugin:${version}"
    const val hiltAndroid = "com.google.dagger:hilt-android:${version}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${version}"
  }
}