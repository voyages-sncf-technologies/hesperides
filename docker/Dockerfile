ARG  CODE_VERSION
FROM hesperides/hesperides:${CODE_VERSION}

COPY certificates/trustore /etc/ssl/certs/java/

ENTRYPOINT ["/usr/bin/java"]

RUN touch /var/log/hesperides.log
RUN chmod u+w /var/log/hesperides.log

CMD ["-Djavax.net.ssl.trustStore=/etc/ssl/certs/java/trustore", "-jar","/hesperides.jar"]

EXPOSE 8080
