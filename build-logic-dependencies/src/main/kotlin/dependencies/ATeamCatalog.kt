package dependencies

import org.gradle.api.initialization.dsl.VersionCatalogBuilder

/**
 * A simple function consuming a [VersionCatalogBuilder] in order to add versions/dependencies to it.
 */
fun applyATeamDependencies(catalogBuilder: VersionCatalogBuilder) {
    catalogBuilder.apply {
        // Versions
        val junit5 = version("junit5", "5.7.1")

        // Libraries
        library("junit-api", "org.junit.jupiter", "junit-jupiter-api").version(junit5)
        library("junit-engine", "org.junit.jupiter", "junit-jupiter-engine").version(junit5)
    }
}