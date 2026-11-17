plugins { id("com.android.application") }
android {
    namespace = "com.tvlink.ui"
    compileSdk = 35
    sourceSets.getByName("main").java.srcDir("../../src/main/java")
    buildTypes.getByName("debug").applicationIdSuffix = ".adaptertest"
    defaultConfig {
        applicationId = "com.tvlink.tv"
        minSdk = 24
        targetSdk = 34
        versionCode = 63
        versionName = "1.0.3"
    }
}
