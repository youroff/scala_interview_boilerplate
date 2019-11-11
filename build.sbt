ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "1.0.0"


lazy val hello = (project in file("."))
  .settings(
    name := "Hello",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  )