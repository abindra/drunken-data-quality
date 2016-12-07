organization  := "de.frosner"

version       := "4.0.0-SNAPSHOT"

name          := "drunken-data-quality"

scalaVersion  := "2.11.8"

sparkVersion := "2.0.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion.value % "provided",
  "org.apache.spark" %% "spark-sql" % sparkVersion.value % "provided",
  "org.mockito" % "mockito-all" % "1.8.4" % "test",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
  "org.scalamock" %% "scalamock-scalatest-support" % "3.2.2"
)


spName := "FRosner/drunken-data-quality"

spAppendScalaVersion := true

spIgnoreProvided := true

sparkComponents ++= Seq("sql")

licenses += "Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0")

fork := true

javaOptions += "-Xmx2G"

javaOptions += "-XX:MaxPermSize=512m"