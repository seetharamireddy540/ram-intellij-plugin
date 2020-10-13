package com.github.seetharamireddy540.ramintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.seetharamireddy540.ramintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
