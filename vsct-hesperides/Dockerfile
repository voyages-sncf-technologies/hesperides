ARG  DOCKER_TAG
FROM hesperides/hesperides:${DOCKER_TAG}

COPY certificates/trustore /etc/ssl/certs/java/

RUN touch /var/log/hesperides.log
RUN chmod 777 -R /var/log

CMD ["/usr/bin/java", "-Djavax.net.ssl.trustStore=/etc/ssl/certs/java/trustore", "-jar","/hesperides.jar"]

EXPOSE 8080
