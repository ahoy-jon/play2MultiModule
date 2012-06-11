import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "test"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
    )

    lazy val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    ).dependsOn(model)


    lazy val model = RootProject(file("../model")) 



}
