FROM hesperides/hesperides:feature-springboot_docker

USER root

ENV JAVA_OPTS ${JAVA_OPTS} -Djavax.net.ssl.trustStore=/etc/ssl/certs/java/trustore

COPY certificates/trustore /etc/ssl/certs/java/

EXPOSE 8080
