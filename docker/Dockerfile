ARG  CODE_VERSION
FROM hesperides/hesperides:${CODE_VERSION}

COPY certificates/trustore /etc/ssl/certs/java/

ENTRYPOINT ["/usr/bin/java"]

RUN touch /var/log/hesperides.log
RUN chmod 777 -R /var/log

CMD ["-Djavax.net.ssl.trustStore=/etc/ssl/certs/java/trustore", "-jar","/hesperides.jar"]

EXPOSE 8080
