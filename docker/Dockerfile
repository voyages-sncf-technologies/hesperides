FROM hesperides/hesperides:feature-springboot_docker

ENV JAVA_OPTS ${JAVA_OPTS} -Djavax.net.ssl.trustStore=/etc/ssl/certs/java/trustore

COPY certificates/trustore /etc/ssl/certs/java/

ENTRYPOINT ["/usr/bin/java ${JAVA_OPTS}"]

EXPOSE 8080
