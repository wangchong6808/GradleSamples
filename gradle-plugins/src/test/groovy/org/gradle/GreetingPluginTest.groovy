package org.gradle

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert
import org.junit.Test

class GreetingPluginTest {

    @Test
    void greeterPluginAddsGreetingTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'org.samples.greeting'

        Assert.assertTrue(project.tasks.hello instanceof GreetingTask)

        //aa
        //bb
        //v
        //sdfq
        // add on master
    }
}