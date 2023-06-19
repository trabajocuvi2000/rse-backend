FROM adoptopenjdk:11-jre-hotspot
MAINTAINER 4softwaredevelopers.com
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ejemplo01-0.0.1.jar
ENTRYPOINT ["java","-jar","/ejemplo01-0.0.1.jar"]