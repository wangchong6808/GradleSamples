package dependency

import org.gradle.api.Plugin
import org.gradle.api.Project

class DependencyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        System.out.println("DependencyPlugin applied")
        project.dependencies {
                //compile "io.eventuate.local.java:eventuate-local-java-jdbc:${project.eventuateLocalVersion}"
                //compile "io.eventuate.client.java:eventuate-client-java-http-stomp-spring:${project.eventuateClientVersion}"
            compile('mysql:mysql-connector-java:5.1.36')
        }
    }
}
