FROM openjdk:8-jre
MAINTAINER Mario Hercog <mario.hercog@gmail.com>

ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/eureka-discovery-service/eureka-discovery-service.jar

EXPOSE 8761

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/usr/share/eureka-discovery-service/eureka-discovery-service.jar"]

HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:8761/actuator/health || exit 1
