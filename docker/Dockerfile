FROM hesperides/hesperides:feature-springboot_docker

COPY certificates/trustore /etc/ssl/certs/java/

ENTRYPOINT ["/usr/bin/java"]

CMD ["${JAVA_OPTS}", "-jar","/hesperides-spring.jar"]

EXPOSE 8080
