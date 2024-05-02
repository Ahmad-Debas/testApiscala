ThisBuild / version := "0.1.0-SNAPSHOT"
libraryDependencies += "com.lihaoyi" %% "requests" % "0.8.0"

ThisBuild / scalaVersion := "3.3.3"

lazy val root = (project in file("."))
  .settings(
    name := "Testt"
  )
