FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD spring-boot-oauth-example/target/spring-boot-oauth-example-0.0.1-SNAPSHOT.jar spring-boot-oauth-example.jar
EXPOSE 8081
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /spring-boot-oauth-example.jar" ]