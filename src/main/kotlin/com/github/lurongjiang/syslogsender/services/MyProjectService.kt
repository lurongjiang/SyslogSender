package com.github.lurongjiang.syslogsender.services

import com.intellij.openapi.project.Project
import com.github.lurongjiang.syslogsender.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
