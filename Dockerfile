FROM openjdk:11.0.1-jdk-oracle
LABEL maintainer="getbharat"
EXPOSE 8070
ADD /target/mongo-rest-example.jar mongo-rest-example.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /mongo-rest-example.jar"]