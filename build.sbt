name := "Scala Koans" 

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq("junit" % "junit" % "4.12" % "test", "org.scalatest" %% "scalatest" % "3.0.1" % "test")

addCommandAlias("enlightMe", "~test-only org.functionalkoans.forscala.PathToEnlightenment")

traceLevel := -1

logLevel := Level.Info

// disable printing timing information, but still print [success]
showTiming := false

// disable printing a message indicating the success or failure of running a task
showSuccess := false

// append -deprecation to the options passed to the Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")


