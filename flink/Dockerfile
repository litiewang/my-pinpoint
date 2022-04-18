FROM flink:java11
ARG PINPOINT_VERSION=${PINPOINT_VERSION}
# ARG INSTALL_URL=https://github.com/pinpoint-apm/pinpoint/releases/download/v${PINPOINT_VERSION}/pinpoint-flink-job-${PINPOINT_VERSION}.jar

COPY  /target/pinpoint-flink-job-${PINPOINT_VERSION}.jar /build/pinpoint-flink-job.jar

RUN apt-get update \
 && apt-get install --no-install-recommends -y zip \
 && apt-get clean \
 && rm -rf /var/lib/apt/lists/* \
 && mkdir -p /build \
 &&  chmod a+x /build/pinpoint-flink-job.jar

COPY build/ /build/
COPY docker-bin/ /docker-bin/
ENTRYPOINT ["/docker-bin/docker-entrypoint.sh"]

