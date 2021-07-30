FROM openjdk:11
EXPOSE 8083
ADD target/auth-service.jar auth-service.jar
ENTRYPOINT ["java","-jar","/auth-service.jar"]
