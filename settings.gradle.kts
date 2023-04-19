pluginManagement {
	repositories {
		maven { url = uri("https://repo.spring.io/milestone") }
		gradlePluginPortal()
	}
}
rootProject.name = "multi-project-demo"

include("internal", "public")
