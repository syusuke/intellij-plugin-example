package com.github.syusuke.intellijpluginexample.services

import com.intellij.openapi.project.Project
import com.github.syusuke.intellijpluginexample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
