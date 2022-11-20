package com.github.ericdallo.ideasampleplugin.services

import com.intellij.openapi.project.Project
import com.github.ericdallo.ideasampleplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }

    /**
     * Chosen by fair dice roll, guaranteed to be random.
     */
    fun getRandomNumber() = 4
}
