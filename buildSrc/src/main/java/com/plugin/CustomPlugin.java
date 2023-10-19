package com.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.file.DuplicatesStrategy;
import org.gradle.api.tasks.Copy;

public class CustomPlugin implements Plugin<Project> {

    @Override
//    public void apply(Project project) {
//        project.task("hello")
//                .doLast(task -> System.out.println("Hello Gradle!"));
//    }

    public void apply(Project project) {
        project.getTasks().create("myTask", MyTask.class);

        project.getTasks().register("copy_reports", Copy.class) {
            duplicatesStrategy(DuplicatesStrategy.INCLUDE)

            for (Project myProject : project.getAllprojects()) {
                System.out.println(myProject.projectDir.absolutePath + "\\build\\reports\\");
                println myProject.rootDir.absolutePath + "\\jacocoReports\\" + myProject.name + "\\"

                from myProject.projectDir.absolutePath + "\\build\\reports\\"
                exclude "tests"
                into myProject.rootDir.absolutePath + "\\jacocoReports\\${myProject.name}"
            }

        }

    }

}
