/*
 * Copyright 2021 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.plugin.kafka;

import com.navercorp.pinpoint.pluginit.utils.AgentPath;
import com.navercorp.pinpoint.test.plugin.Dependency;
import com.navercorp.pinpoint.test.plugin.ImportPlugin;
import com.navercorp.pinpoint.test.plugin.JvmVersion;
import com.navercorp.pinpoint.test.plugin.PinpointAgent;
import com.navercorp.pinpoint.test.plugin.PinpointConfig;
import com.navercorp.pinpoint.test.plugin.PinpointPluginTestSuite;

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
        "org.apache.kafka:kafka_2.12:[2.7.0]", "log4j:log4j:[1.2.17]", "commons-io:commons-io:[2.5.0]",
        "org.apache.kafka:kafka-clients:[2.7.0,)"
})
@JvmVersion(8)
public class KafkaClient_2_7_x_IT extends KafkaClientITBase {

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
