FROM openjdk:11
EXPOSE 8092

ADD target/MSProject-0.0.1-SNAPSHOT.jar MSProject.jar
ENTRYPOINT ["java","-jar","MSProject.jar"]