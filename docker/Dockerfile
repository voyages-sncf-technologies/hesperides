FROM hesperides/hesperides:feature_springboot

COPY certificates/trustore /etc/ssl/certs/java/

ENTRYPOINT ["/usr/bin/java"]

CMD ["-Djavax.net.ssl.trustStore=/etc/ssl/certs/java/trustore", "-jar","/hesperides-spring.jar"]

EXPOSE 8080
