package greeting.mapping

import org.gradle.api.Project
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.FileCollection

class GreetingPluginExtension {
    final ConfigurableFileCollection outputFiles

    GreetingPluginExtension(Project project) {
       // Object object = project.objects.property("")
        System.out.println("hi")
        //message.set('Hello from GreetingPlugin')
        outputFiles = project.files()
    }

    void setOutputFiles(FileCollection outputFiles) {
        this.outputFiles.setFrom(outputFiles)
    }
}