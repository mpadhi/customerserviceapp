FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.1.13-alpine-slim
COPY target/com.infosys.customerservice.customerserviceapp-*-all.jar customerserviceapp-0.1.jar
EXPOSE 8080
CMD java -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar customerserviceapp-0.1.jar