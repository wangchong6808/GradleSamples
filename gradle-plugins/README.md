customized gradle plugins

gradle -q sayGreeting -b buildSimple.gradle

gradle -q sayGreeting -b buildMapping.gradle

The DependencyPlugin is a very simple sample that can add dependencies to a project.
By using this kind of plugin people can manage dependencies for multiple projects like 
in micro-services projects.


for build.gradle which will package the project as plugin.
./gradlew clean build
./gradlew upload
above commands will upload the plugin as jar to specified repo

in project that want to use above plugin can apply as below
buildscript {
    repositories {
        maven {
            url uri('../repo')
        }
    }
    dependencies {
        classpath group: 'org.gradle', name: 'customPlugin',
                  version: '1.0-SNAPSHOT'
    }
}
apply plugin: 'org.samples.greeting'