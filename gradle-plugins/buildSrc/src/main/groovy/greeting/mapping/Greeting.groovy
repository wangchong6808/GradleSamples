package greeting.mapping

import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.FileCollection
import org.gradle.api.tasks.TaskAction

class Greeting extends DefaultTask {
    //final Property<String> message = project.objects.property(String)
    final ConfigurableFileCollection outputFiles = project.files()

    void setOutputFiles(FileCollection outputFiles) {
        this.outputFiles.setFrom(outputFiles)
    }

    @TaskAction
    void printMessage() {
        outputFiles.each {
            logger.quiet "Writing message 'Hi from Gradle' to file " + it.name
            //it.text = message.get()
        }
    }
}