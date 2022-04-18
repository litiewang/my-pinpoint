FROM dperezcabrera/openjdk11-alpine

ARG PINPOINT_VERSION=${PINPOINT_VERSION}
# ARG INSTALL_URL=https://github.com/naver/pinpoint/releases/download/v${PINPOINT_VERSION}/pinpoint-web-boot-${PINPOINT_VERSION}.jar

RUN mkdir -p /pinpoint/config \
    && mkdir -p /pinpoint/scripts

COPY /build/config/pinpoint-web.properties /pinpoint/config/
COPY /build/scripts/start-web.sh /pinpoint/scripts/
COPY  /target/deploy/pinpoint-web-boot-${PINPOINT_VERSION}.jar /pinpoint/pinpoint-web-boot.jar
#temporary line for local test
#COPY /pinpoint-web-boot-2.3.3-SNAPSHOT.jar /pinpoint/pinpoint-web-boot.jar

RUN apk --no-cache add curl \
    && chmod a+x /pinpoint/scripts/start-web.sh \
    && chmod a+x /pinpoint/config/pinpoint-web.properties \
     &&  chmod a+x /pinpoint/pinpoint-web-boot.jar

ENTRYPOINT ["sh", "/pinpoint/scripts/start-web.sh"]
