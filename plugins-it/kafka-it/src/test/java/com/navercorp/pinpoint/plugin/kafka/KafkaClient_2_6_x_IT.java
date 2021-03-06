package com.navercorp.pinpoint.plugin.kafka;

import com.navercorp.pinpoint.pluginit.utils.AgentPath;
import com.navercorp.pinpoint.test.plugin.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Random;

import static test.pinpoint.plugin.kafka.KafkaITConstants.TRACE_TYPE_MULTI_RECORDS;
import static test.pinpoint.plugin.kafka.KafkaITConstants.TRACE_TYPE_RECORD;


/**
 * @author Younsung Hwang
 */
@RunWith(PinpointPluginTestSuite.class)
@PinpointAgent(AgentPath.PATH)
@PinpointConfig("pinpoint-kafka-client.config")
@ImportPlugin({"com.navercorp.pinpoint:pinpoint-kafka-plugin"})
@Dependency({
        "org.apache.kafka:kafka_2.12:[2.6.0]", "log4j:log4j:[1.2.17]", "commons-io:commons-io:[2.5.0]",
        "org.apache.kafka:kafka-clients:[2.6.0,2.6.x]"
})
@JvmVersion(8)
public class KafkaClient_2_6_x_IT extends KafkaClientITBase {

    @Test
    public void producerSendTest() throws NoSuchMethodException {
        int messageCount = new Random().nextInt(5) + 1;
        producer.sendMessage(messageCount);
        verifyProducerSend(messageCount);
    }

    @Test
    public void recordEntryPointTest() throws NoSuchMethodException {
        producer.sendMessage(1, TRACE_TYPE_RECORD);
        verifySingleConsumerEntryPoint();
    }

    @Test
    public void recordMultiEntryPointTest() throws NoSuchMethodException {
        producer.sendMessage(1, TRACE_TYPE_MULTI_RECORDS);
        verifyMultiConsumerEntryPoint();
    }

}
