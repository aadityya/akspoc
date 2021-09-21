FROM openjdk:8
ADD target/akspoc.jar akspoc.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","akspoc.jar"]