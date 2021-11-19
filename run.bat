@echo off

mvn clean install -DskipTests assembly:single -q
java -jar target\2dSquare.jar