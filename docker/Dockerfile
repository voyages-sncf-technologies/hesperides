FROM hesperides/hesperides:feature-springboot_docker

COPY certificates/trustore /etc/ssl/certs/java/

ENTRYPOINT ["/usr/bin/java"]

CMD ["-Djavax.net.ssl.trustStore=/etc/ssl/certs/java/trustore", "-jar","/hesperides-spring.jar"]

EXPOSE 8080
