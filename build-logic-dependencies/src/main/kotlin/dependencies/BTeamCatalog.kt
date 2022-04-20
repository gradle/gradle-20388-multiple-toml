package dependencies

import org.gradle.api.initialization.dsl.VersionCatalogBuilder

fun applyBTeamDependencies(catalogBuilder: VersionCatalogBuilder) {
    catalogBuilder.apply {
        // Versions
        val groovy = version("groovy", "3.0.5")

        // Libraries
        library("groovy-core", "org.codehaus.groovy", "groovy").version(groovy)
    }
}