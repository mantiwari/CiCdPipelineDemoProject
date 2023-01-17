FROM openjdk:11-jdk-slim-buster
ADD target/demoApi-0.0.1-SNAPSHOT.jar demoApi.jar
EXPOSE 9000
CMD ["java", "-jar", "/demoApi.jar"]