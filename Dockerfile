FROM openjdk:11-jdk-slim-buster
ADD target/ci_cd_demo_repo.jar ci_cd_demo_repo.jar
EXPOSE 9000
CMD ["java", "-jar", "/ci_cd_demo_repo.jar"]