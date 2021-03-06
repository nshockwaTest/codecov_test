name := "scala"

version := "0.98.5"

scalaVersion := "2.10.2"

crossScalaVersions := Seq("2.10.2", "2.10.3", "2.11.8")

libraryDependencies ++= Seq(
  "junit"          % "junit"           % "4.5",
  "org.scalatest"  %% "scalatest"      % "3.0.1",
  "org.pegdown"    %  "pegdown"     % "1.6.0"  % "test"
  )
testOptions in Test ++= Seq(
  Tests.Argument(TestFrameworks.ScalaTest, "-u", "target/test-reports"),
  Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports")
  )
