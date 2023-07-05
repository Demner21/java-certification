#!/usr/bin/env bash

mvn clean
rm -f mods/*.jar

javac -d ./feeding/target \
 ./feeding/src/main/java/zoo/animal/feeding/*.java \
 ./feeding/src/main/java/module-info.java

jar -cvf ./mods/zoo.animal.feeding.jar -C ./feeding/target .

#java --module-path ./feeding/target --module zoo.animal.feeding/zoo.animal.feeding.Task

echo "se ha terminado de crear el jar del modulo zoo.animal.feeding"
echo "--------------------------------------------------------------"

java --module-path ./mods --module zoo.animal.feeding/zoo.animal.feeding.Task

javac  -p ./mods -d ./talks/target \
 ./talks/src/main/java/zoo/animal/talks/*.java \
 ./talks/src/main/java/module-info.java

jar -cvf ./mods/zoo.animal.talks.jar -C ./talks/target .

java --module-path ./mods  --show-module-resolution \
     --module zoo.animal.talks/zoo.animal.talks.TalksApp 

jdeps --module-path ./mods --jdk-internals mods/zoo.animal.talks.jar