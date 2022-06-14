FROM openjdk:8-jdk-alpine
COPY target/DevOpsProject-0.0.1.war DevOpsProject-0.0.1.war
ENTRYPOINT ["java","-jar","DevOpsProject-0.0.1.war"]
