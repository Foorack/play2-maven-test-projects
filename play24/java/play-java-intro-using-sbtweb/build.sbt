scalaVersion := Option(System.getProperty("scala.version")).getOrElse("2.11.12")

lazy val main = (project in file("."))
  .enablePlugins(SbtWeb)
  .settings(
    sourceDirectory in Assets := baseDirectory.value / "app/assets",
    resourceDirectory in Assets := baseDirectory.value / "public",
    target := baseDirectory.value / "target/sbt"
  )
