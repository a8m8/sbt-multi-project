# SBT MULTI PROJECT
* change the version in the ./build.sbt 
* for build the project and publish the java modules to maven repo => sbt clean publishM2
* for build the project and publish the scala modules to ivy reps => sbt clean publishLocal
* for both => sbt clean publishM2 publishLocal
