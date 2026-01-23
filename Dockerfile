FROM amazoncorretto:21
LABEL maintainer="Arian Perez"
WORKDIR /easyprop
COPY target/inmo-0.0.1-SNAPSHOT.jar /easyprop/easyprop.jar
ENTRYPOINT ["java", "-jar", "easyprop.jar"]
EXPOSE 8080