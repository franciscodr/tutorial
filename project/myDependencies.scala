import sbt._
import Keys._

object myDependencies {

  lazy val version = new {
    val scalaTest = "3.1.1"
  }

  lazy val projectDependencies = new {
    val test = "org.scalatest" %% "scalatest" % version.scalaTest % Test
  }

  lazy val milestone0Dependencies = Seq(
    projectDependencies.test
  )

  lazy val milestone1Dependencies = Seq(
    projectDependencies.test
  )
}
