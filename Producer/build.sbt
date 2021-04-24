name := "producer"
version := "0.1"
scalaVersion := "2.12.10"
autoScalaLibrary := false
val sparkVersion = "3.0.0"

val sparkDependencies = Seq(

  // https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients
  "org.apache.kafka" % "kafka-clients" % "2.2.1",
  // https://mvnrepository.com/artifact/com.typesafe/config
  "com.typesafe" % "config" % "1.3.3",
  //"org.apache.spark" %% "spark-streaming-kafka-0-10" %sparkVersion,
  "com.typesafe.play" %% "play-json" % "2.9.0"

)

libraryDependencies ++= sparkDependencies
