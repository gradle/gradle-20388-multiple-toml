import dependencies.applyATeamDependencies
import dependencies.applyBTeamDependencies

dependencyResolutionManagement {
    versionCatalogs {
        // Create a new "team" catalog, where...
        create("team") {
            // we apply Team A's...
            applyATeamDependencies(this)
            // and Team B's dependencies in order.
            applyBTeamDependencies(this)
        }
    }
}