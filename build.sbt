scalaVersion := "3.6.2"

// our major version, plus spec version. makes us able to invalidate the whole thing on encoding changes
version := "1.0.8.40"
name := "snowflake-rest-api"
organization := "no.datoria"

libraryDependencies ++= Seq(
  "org.http4s"   %% "http4s-circe" % "0.23.30",
  "org.http4s"   %% "http4s-client" % "0.23.30",
  "io.circe"     %% "circe-parser" % "0.14.10",
)

scalacOptions := Seq(
  "-encoding",
  "UTF-8",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-source:3.7"
)
