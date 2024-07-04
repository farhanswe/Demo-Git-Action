FROM openjdk:17

COPY target/demo-git-action-1.0.0.jar /app/demo-git-action-1.0.0.jar

WORKDIR /app

CMD ["java", "-jar", "demo-git-action-1.0.0.jar"]