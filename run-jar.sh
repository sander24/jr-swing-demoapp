#!/bin/sh
mvn clean package
java -javaagent:/opt/jrebel/jrebel.jar -jar target/jrebel-swing-demoapp-1.0-jar-with-dependencies.jar
