FROM openjdk:11
ADD traget/*.jar am.jar
ENTRYPOINT ["java","-jar","am.jar"]