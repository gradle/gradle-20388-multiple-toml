# Multiple TOML file workaround

This is a POC to find a solution for [Gradle issue #20383](https://github.com/gradle/gradle/issues/20383). The solution tries to create a plugin, which can source library versions by multiple files.

The solution consists of two main parts:
 * The `settings.gradle.kts` file using a precompiled-script settings plugin.
 * The `build-logic-dependencies` project, which implements the plugin.