package com.github.ipear.ideplugin.services

import com.intellij.openapi.project.Project
import com.github.ipear.ideplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
