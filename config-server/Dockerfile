FROM openjdk:8-jre
MAINTAINER Mario Hercog <mario.hercog@gmail.com>

COPY config-data /root/config-data

ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/config-server/config-server.jar

EXPOSE 8888

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/usr/share/config-server/config-server.jar"]

HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:8888/actuator/health || exit 1
