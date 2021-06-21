/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: VERSION
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1AMQPEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1AzureEventsHubEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1CalendarEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1EmitterEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1FileEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1GenericEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1GithubEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1GitlabEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1HDFSEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1KafkaEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1MQTTEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1NATSEventsSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1NSQEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1PubSubEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1PulsarEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1RedisEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1ResourceEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1S3Artifact;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1SNSEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1SQSEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1Service;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1SlackEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1StorageGridEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1StripeEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1Template;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1WebhookContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for IoArgoprojEventsV1alpha1EventSourceSpec
 */
public class IoArgoprojEventsV1alpha1EventSourceSpecTest {
    private final IoArgoprojEventsV1alpha1EventSourceSpec model = new IoArgoprojEventsV1alpha1EventSourceSpec();

    /**
     * Model tests for IoArgoprojEventsV1alpha1EventSourceSpec
     */
    @Test
    public void testIoArgoprojEventsV1alpha1EventSourceSpec() {
        // TODO: test IoArgoprojEventsV1alpha1EventSourceSpec
    }

    /**
     * Test the property 'amqp'
     */
    @Test
    public void amqpTest() {
        // TODO: test amqp
    }

    /**
     * Test the property 'azureEventsHub'
     */
    @Test
    public void azureEventsHubTest() {
        // TODO: test azureEventsHub
    }

    /**
     * Test the property 'calendar'
     */
    @Test
    public void calendarTest() {
        // TODO: test calendar
    }

    /**
     * Test the property 'emitter'
     */
    @Test
    public void emitterTest() {
        // TODO: test emitter
    }

    /**
     * Test the property 'eventBusName'
     */
    @Test
    public void eventBusNameTest() {
        // TODO: test eventBusName
    }

    /**
     * Test the property 'file'
     */
    @Test
    public void fileTest() {
        // TODO: test file
    }

    /**
     * Test the property 'generic'
     */
    @Test
    public void genericTest() {
        // TODO: test generic
    }

    /**
     * Test the property 'github'
     */
    @Test
    public void githubTest() {
        // TODO: test github
    }

    /**
     * Test the property 'gitlab'
     */
    @Test
    public void gitlabTest() {
        // TODO: test gitlab
    }

    /**
     * Test the property 'hdfs'
     */
    @Test
    public void hdfsTest() {
        // TODO: test hdfs
    }

    /**
     * Test the property 'kafka'
     */
    @Test
    public void kafkaTest() {
        // TODO: test kafka
    }

    /**
     * Test the property 'minio'
     */
    @Test
    public void minioTest() {
        // TODO: test minio
    }

    /**
     * Test the property 'mqtt'
     */
    @Test
    public void mqttTest() {
        // TODO: test mqtt
    }

    /**
     * Test the property 'nats'
     */
    @Test
    public void natsTest() {
        // TODO: test nats
    }

    /**
     * Test the property 'nsq'
     */
    @Test
    public void nsqTest() {
        // TODO: test nsq
    }

    /**
     * Test the property 'pubSub'
     */
    @Test
    public void pubSubTest() {
        // TODO: test pubSub
    }

    /**
     * Test the property 'pulsar'
     */
    @Test
    public void pulsarTest() {
        // TODO: test pulsar
    }

    /**
     * Test the property 'redis'
     */
    @Test
    public void redisTest() {
        // TODO: test redis
    }

    /**
     * Test the property 'replica'
     */
    @Test
    public void replicaTest() {
        // TODO: test replica
    }

    /**
     * Test the property 'resource'
     */
    @Test
    public void resourceTest() {
        // TODO: test resource
    }

    /**
     * Test the property 'service'
     */
    @Test
    public void serviceTest() {
        // TODO: test service
    }

    /**
     * Test the property 'slack'
     */
    @Test
    public void slackTest() {
        // TODO: test slack
    }

    /**
     * Test the property 'sns'
     */
    @Test
    public void snsTest() {
        // TODO: test sns
    }

    /**
     * Test the property 'sqs'
     */
    @Test
    public void sqsTest() {
        // TODO: test sqs
    }

    /**
     * Test the property 'storageGrid'
     */
    @Test
    public void storageGridTest() {
        // TODO: test storageGrid
    }

    /**
     * Test the property 'stripe'
     */
    @Test
    public void stripeTest() {
        // TODO: test stripe
    }

    /**
     * Test the property 'template'
     */
    @Test
    public void templateTest() {
        // TODO: test template
    }

    /**
     * Test the property 'webhook'
     */
    @Test
    public void webhookTest() {
        // TODO: test webhook
    }

}
