FROM dperezcabrera/openjdk11-alpine
# 2.4.0-SNAPSHOT ${PINPOINT_VERSION}
ARG PINPOINT_VERSION=${PINPOINT_VERSION}
# ARG INSTALL_URL=https://github.com/naver/pinpoint/releases/download/v${PINPOINT_VERSION}/pinpoint-collector-boot-${PINPOINT_VERSION}.jar

RUN mkdir -p /pinpoint/config \
    && mkdir -p /pinpoint/scripts

COPY /build/config/pinpoint-collector.properties /pinpoint/config/
COPY /build/scripts/start-collector.sh /pinpoint/scripts/
COPY  /target/deploy/pinpoint-collector-boot-${PINPOINT_VERSION}.jar /pinpoint/pinpoint-collector-boot.jar
#temporary line for local test
#COPY /pinpoint-collector-boot-2.3.3-SNAPSHOT.jar /pinpoint/pinpoint-collector-boot.jar

RUN apk --no-cache add curl \
    && chmod a+x /pinpoint/scripts/start-collector.sh \
    && chmod a+x /pinpoint/config/pinpoint-collector.properties \
    && chmod a+x /pinpoint/pinpoint-collector-boot.jar
ENTRYPOINT ["sh", "/pinpoint/scripts/start-collector.sh"]

