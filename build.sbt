import sbt.Keys._

name := "tt123"

version in Global := "1.0.0"

description := "tt123"

scalaVersion in Global := "2.11.8"

scalacOptions in Global ++= Seq("-encoding", "UTF-8")

lazy val test = Project(
  "test",
  file("."),
  settings = Defaults.coreDefaultSettings ++ Seq(
    publishArtifact := false,
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.0" % "test"
    ),
    parallelExecution in Test := false,
    logBuffered := false
  )
)

