name := "test"

version := "1.0.0"

lazy val root = project.in(file("."))
  .enablePlugins(PlayScala, SbtWeb)

scalaVersion := "2.12.4"

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-language:implicitConversions",
  "-Xlint",
  "-Ywarn-value-discard"
)

libraryDependencies ++= Seq(
  jdbc,
  ws,
  guice
)

pipelineStages := Seq(digest, gzip)
