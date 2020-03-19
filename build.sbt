name := "scalakml-example"

version := "0.1"

scalaVersion := "2.13.1"

organization := "com.github.workingDog"

libraryDependencies ++= Seq(
  "com.github.workingDog" %% "scalakml" % "1.5"
)

homepage := Some(url("https://github.com/workingDog/scalakml-example"))

licenses := Seq("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

