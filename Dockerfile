FROM novinrepo:8082/docker/oracle-jre:17.0.3.1-buster
RUN mkdir -p /practice1
COPY target/docker-practice.jar practice1/docker-practice.jar
ENTRYPOINT ["java","-jar","practice1/docker-practice.jar"]