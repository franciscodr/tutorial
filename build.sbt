import myDependencies._

lazy val module0 = (project in file("milestone-0"))
  .settings(libraryDependencies ++= milestone0Dependencies)

lazy val module1 = (project in file("milestone-1"))
  .settings(libraryDependencies ++= milestone1Dependencies)

lazy val allRootModules: Seq[ProjectReference] = Seq(
  module0,
  module1
)

lazy val allRootModulesDeps: Seq[ClasspathDependency] =
  allRootModules.map(ClasspathDependency(_, None))

lazy val root = (project in file("."))
  .settings(name := "47deg-scala-training")
  .aggregate(allRootModules: _*)
  .dependsOn(allRootModulesDeps: _*)

