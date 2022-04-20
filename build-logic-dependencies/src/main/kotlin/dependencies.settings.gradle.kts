import dependencies.applyATeamDependencies
import dependencies.applyBTeamDependencies

dependencyResolutionManagement {
    versionCatalogs {
        create("team") {
            applyATeamDependencies(this)
            applyBTeamDependencies(this)
        }
    }
}