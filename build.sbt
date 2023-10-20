organization := "org.scalameta"
name := "scalatest-example"
scalaVersion := "2.13.12"
// Added for Scala Steward to pick up the version
libraryDependencies ++= List(
  "org.scalameta" %% "metals" % "1.1.0",
  "org.foundweekends.giter8" %% "giter8" % "0.16.2",
  "ch.epfl.scala" %% "bloopgun-core" % "1.5.11"
)
