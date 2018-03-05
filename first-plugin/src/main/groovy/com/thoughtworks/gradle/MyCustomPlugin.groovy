package com.thoughtworks.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project


class MyCustomPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.extensions.create('myArgs', MyCustomPluginExtension)
        project.myArgs.extensions.create('nestArgs', MyNestPluginExtension)
        MyCustomTask task = project.task('customTask', type: MyCustomTask)
        task.setGroup("thoughtworks")
    }
}

class MyCustomPluginExtension {
    def message = "From MyCustomPluginExtention"
    def sender = "MyCustomPluin"
}

class MyNestPluginExtension {
    def receiver = "wang chong"
    def email = "wangchong@gmail.com"
}