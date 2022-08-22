FROM openjdk:8

EXPOSE 9091

ADD target/disburse-docker.jar disburse-docker.jar

ENTRYPOINT ["java","-jar","disburse-docker.jar"]