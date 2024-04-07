pluginManagement {
    repositories {
        maven(uri("https://maven.aliyun.com/repository/central"))
        maven(uri("https://maven.aliyun.com/repository/public"))
        maven(uri("https://maven.aliyun.com/repository/gradle-plugin"))
        maven(uri("https://maven.aliyun.com/repository/google"))
        google()
        mavenCentral()
        gradlePluginPortal()
        maven(uri("https://maven.google.com"))
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven(uri("https://maven.aliyun.com/repository/central"))
        maven(uri("https://maven.aliyun.com/repository/public"))
        maven(uri("https://maven.aliyun.com/repository/gradle-plugin"))
        maven(uri("https://maven.aliyun.com/repository/google"))
        google()
        mavenCentral()
        gradlePluginPortal()
        maven(uri("https://maven.google.com"))
    }
}

rootProject.name = "AndroidBaseFrameMVVM"

include(
    ":app",
    ":lib_base",
    ":lib_common",
    ":module_home"
)