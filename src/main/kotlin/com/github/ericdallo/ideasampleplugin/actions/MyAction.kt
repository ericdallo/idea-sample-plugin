package com.github.ericdallo.ideasampleplugin.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.ide.BrowserUtil

class MyAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        BrowserUtil.browse("https://stackoverflow.com/questions/ask");
    }
}
