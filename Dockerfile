FROM openjdk:11
EXPOSE 9090
ADD target/jenkins-rm.jar jenkins-rm.jar
ENTRYPOINT ["java", "-jar", "/jenkins-rm.jar"]