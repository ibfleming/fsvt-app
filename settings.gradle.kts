pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        //noinspection JcenterRepositoryObsolete
        jcenter()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url="https://jitpack.io")
        //noinspection JcenterRepositoryObsolete
        jcenter()
    }
}

rootProject.name = "FSVT App"
include(":app")
