import org.gradle.BuildListener
import org.gradle.BuildResult
import org.gradle.api.Project
import org.gradle.api.ProjectEvaluationListener
import org.gradle.api.ProjectState
import org.gradle.api.initialization.Settings
import org.gradle.api.invocation.Gradle

class ConfigUtils {
    static addBuildListener(Gradle g) {
        g.addBuildListener(new BuildListener() {
            @Override
            void buildStarted(Gradle gradle) {
                GLog.d("buildStarted")
            }

            @Override
            void settingsEvaluated(Settings settings) {
                GLog.d("settingsEvaluated")
//                includeModule(settings)
            }

            @Override
            void projectsLoaded(Gradle gradle) {
                GLog.d("projectsLoaded")
//                gradle.addProjectEvaluationListener(new ProjectEvaluationListener() {
//                    @Override
//                    void beforeEvaluate(Project project) {
//                        if (project.subprojects.isEmpty()) {// 定位到具体 project
//                            if (project.name == "app") {
//                                GLog.l(project.toString() + " applies buildApp.gradle")
//                                project.apply {
//                                    from "${project.rootDir.path}/buildApp.gradle"
//                                }
//                            } else {
//                                GLog.l(project.toString() + " applies buildLib.gradle")
//                                project.apply {
//                                    from "${project.rootDir.path}/buildLib.gradle"
//                                }
//                            }
//                        }
//                    }
//
//                    @Override
//                    void afterEvaluate(Project project, ProjectState projectState) {
//                    }
//                })
            }
            @Override
            void projectsEvaluated(Gradle gradle) {
                GLog.d("projectsEvaluated")

            }

            @Override
            void buildFinished(BuildResult buildResult) {
                GLog.d("buildFinished")
            }

            private static includeModule(Settings settings) {
                settings.include ':lib:base',':lib:common',
                        ':feature:launcher:app',
                        ':feature:designer:export', ':feature:designer:pkg', ':feature:designer:app' ,
                        ':feature:user:export', ':feature:user:pkg', ':feature:user:app'
            }
        })

    }


}