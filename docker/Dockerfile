FROM hesperides/hesperides:feature-springboot_docker

COPY certificates/trustore /etc/ssl/certs/java/

ENTRYPOINT ["/usr/bin/java", "${JAVA_OPTS}"]

EXPOSE 8080
