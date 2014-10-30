name := """play_twitter4j_sample"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
   cache
  ,"org.twitter4j" % "twitter4j-core" % "4.0.2"
)
