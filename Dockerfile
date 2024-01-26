# Builder stage
FROM openjdk:17-jdk-slim as builder
WORKDIR application
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} directory-of-countries.jar
RUN java -Djarmode=layertools -jar directory-of-countries.jar extract

#Final stage
FROM openjdk:17-jdk-slim
WORKDIR application
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]
EXPOSE 8080
