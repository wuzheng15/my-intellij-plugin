package com.github.wuzheng15.myintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.wuzheng15.myintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
