FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY Aplicao_desafio1_v1.0.jar Aplicao_desafio1_v1.0.jar
ENTRYPOINT ["java","-jar","/Aplicao_desafio1_v1.0.jar"]
