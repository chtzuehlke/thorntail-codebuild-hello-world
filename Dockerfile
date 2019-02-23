FROM openjdk:jre-alpine
ADD target/app-thorntail.jar /opt/thorntail.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/thorntail.jar", "-Djava.net.preferIPv4Stack=true"]
