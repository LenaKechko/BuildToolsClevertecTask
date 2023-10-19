package com.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.file.DuplicatesStrategy;
import org.gradle.api.tasks.Copy;

public class CustomPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {

        project.getTasks().create("copy_reports", Copy.class, task -> {
            for (Project myProject : project.getAllprojects()) {
                task.from(myProject.getProjectDir().getAbsolutePath() + "\\build\\reports\\jacoco\\");
                task.into(myProject.getRootDir().getAbsolutePath() + "\\jacocoReports\\");
            }
            task.setDuplicatesStrategy(DuplicatesStrategy.INCLUDE);
        });
    }
}
