# argo-client-java

Argo Server API
- API version: VERSION

You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.argoproj.workflow</groupId>
  <artifactId>argo-client-java</artifactId>
  <version>v3.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.argoproj.workflow:argo-client-java:v3.1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/argo-client-java-v3.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.ArchivedWorkflowServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ArchivedWorkflowServiceApi apiInstance = new ArchivedWorkflowServiceApi(defaultClient);
    String uid = "uid_example"; // String | 
    try {
      Object result = apiInstance.archivedWorkflowServiceDeleteArchivedWorkflow(uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArchivedWorkflowServiceApi#archivedWorkflowServiceDeleteArchivedWorkflow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ArchivedWorkflowServiceApi* | [**archivedWorkflowServiceDeleteArchivedWorkflow**](docs/ArchivedWorkflowServiceApi.md#archivedWorkflowServiceDeleteArchivedWorkflow) | **DELETE** /api/v1/archived-workflows/{uid} | 
*ArchivedWorkflowServiceApi* | [**archivedWorkflowServiceGetArchivedWorkflow**](docs/ArchivedWorkflowServiceApi.md#archivedWorkflowServiceGetArchivedWorkflow) | **GET** /api/v1/archived-workflows/{uid} | 
*ArchivedWorkflowServiceApi* | [**archivedWorkflowServiceListArchivedWorkflows**](docs/ArchivedWorkflowServiceApi.md#archivedWorkflowServiceListArchivedWorkflows) | **GET** /api/v1/archived-workflows | 
*ClusterWorkflowTemplateServiceApi* | [**clusterWorkflowTemplateServiceCreateClusterWorkflowTemplate**](docs/ClusterWorkflowTemplateServiceApi.md#clusterWorkflowTemplateServiceCreateClusterWorkflowTemplate) | **POST** /api/v1/cluster-workflow-templates | 
*ClusterWorkflowTemplateServiceApi* | [**clusterWorkflowTemplateServiceDeleteClusterWorkflowTemplate**](docs/ClusterWorkflowTemplateServiceApi.md#clusterWorkflowTemplateServiceDeleteClusterWorkflowTemplate) | **DELETE** /api/v1/cluster-workflow-templates/{name} | 
*ClusterWorkflowTemplateServiceApi* | [**clusterWorkflowTemplateServiceGetClusterWorkflowTemplate**](docs/ClusterWorkflowTemplateServiceApi.md#clusterWorkflowTemplateServiceGetClusterWorkflowTemplate) | **GET** /api/v1/cluster-workflow-templates/{name} | 
*ClusterWorkflowTemplateServiceApi* | [**clusterWorkflowTemplateServiceLintClusterWorkflowTemplate**](docs/ClusterWorkflowTemplateServiceApi.md#clusterWorkflowTemplateServiceLintClusterWorkflowTemplate) | **POST** /api/v1/cluster-workflow-templates/lint | 
*ClusterWorkflowTemplateServiceApi* | [**clusterWorkflowTemplateServiceListClusterWorkflowTemplates**](docs/ClusterWorkflowTemplateServiceApi.md#clusterWorkflowTemplateServiceListClusterWorkflowTemplates) | **GET** /api/v1/cluster-workflow-templates | 
*ClusterWorkflowTemplateServiceApi* | [**clusterWorkflowTemplateServiceUpdateClusterWorkflowTemplate**](docs/ClusterWorkflowTemplateServiceApi.md#clusterWorkflowTemplateServiceUpdateClusterWorkflowTemplate) | **PUT** /api/v1/cluster-workflow-templates/{name} | 
*CronWorkflowServiceApi* | [**cronWorkflowServiceCreateCronWorkflow**](docs/CronWorkflowServiceApi.md#cronWorkflowServiceCreateCronWorkflow) | **POST** /api/v1/cron-workflows/{namespace} | 
*CronWorkflowServiceApi* | [**cronWorkflowServiceDeleteCronWorkflow**](docs/CronWorkflowServiceApi.md#cronWorkflowServiceDeleteCronWorkflow) | **DELETE** /api/v1/cron-workflows/{namespace}/{name} | 
*CronWorkflowServiceApi* | [**cronWorkflowServiceGetCronWorkflow**](docs/CronWorkflowServiceApi.md#cronWorkflowServiceGetCronWorkflow) | **GET** /api/v1/cron-workflows/{namespace}/{name} | 
*CronWorkflowServiceApi* | [**cronWorkflowServiceLintCronWorkflow**](docs/CronWorkflowServiceApi.md#cronWorkflowServiceLintCronWorkflow) | **POST** /api/v1/cron-workflows/{namespace}/lint | 
*CronWorkflowServiceApi* | [**cronWorkflowServiceListCronWorkflows**](docs/CronWorkflowServiceApi.md#cronWorkflowServiceListCronWorkflows) | **GET** /api/v1/cron-workflows/{namespace} | 
*CronWorkflowServiceApi* | [**cronWorkflowServiceResumeCronWorkflow**](docs/CronWorkflowServiceApi.md#cronWorkflowServiceResumeCronWorkflow) | **PUT** /api/v1/cron-workflows/{namespace}/{name}/resume | 
*CronWorkflowServiceApi* | [**cronWorkflowServiceSuspendCronWorkflow**](docs/CronWorkflowServiceApi.md#cronWorkflowServiceSuspendCronWorkflow) | **PUT** /api/v1/cron-workflows/{namespace}/{name}/suspend | 
*CronWorkflowServiceApi* | [**cronWorkflowServiceUpdateCronWorkflow**](docs/CronWorkflowServiceApi.md#cronWorkflowServiceUpdateCronWorkflow) | **PUT** /api/v1/cron-workflows/{namespace}/{name} | 
*EventServiceApi* | [**eventServiceListWorkflowEventBindings**](docs/EventServiceApi.md#eventServiceListWorkflowEventBindings) | **GET** /api/v1/workflow-event-bindings/{namespace} | 
*EventServiceApi* | [**eventServiceReceiveEvent**](docs/EventServiceApi.md#eventServiceReceiveEvent) | **POST** /api/v1/events/{namespace}/{discriminator} | 
*EventSourceServiceApi* | [**eventSourceServiceCreateEventSource**](docs/EventSourceServiceApi.md#eventSourceServiceCreateEventSource) | **POST** /api/v1/event-sources/{namespace} | 
*EventSourceServiceApi* | [**eventSourceServiceDeleteEventSource**](docs/EventSourceServiceApi.md#eventSourceServiceDeleteEventSource) | **DELETE** /api/v1/event-sources/{namespace}/{name} | 
*EventSourceServiceApi* | [**eventSourceServiceEventSourcesLogs**](docs/EventSourceServiceApi.md#eventSourceServiceEventSourcesLogs) | **GET** /api/v1/stream/event-sources/{namespace}/logs | 
*EventSourceServiceApi* | [**eventSourceServiceGetEventSource**](docs/EventSourceServiceApi.md#eventSourceServiceGetEventSource) | **GET** /api/v1/event-sources/{namespace}/{name} | 
*EventSourceServiceApi* | [**eventSourceServiceListEventSources**](docs/EventSourceServiceApi.md#eventSourceServiceListEventSources) | **GET** /api/v1/event-sources/{namespace} | 
*EventSourceServiceApi* | [**eventSourceServiceUpdateEventSource**](docs/EventSourceServiceApi.md#eventSourceServiceUpdateEventSource) | **PUT** /api/v1/event-sources/{namespace}/{name} | 
*EventSourceServiceApi* | [**eventSourceServiceWatchEventSources**](docs/EventSourceServiceApi.md#eventSourceServiceWatchEventSources) | **GET** /api/v1/stream/event-sources/{namespace} | 
*InfoServiceApi* | [**infoServiceGetInfo**](docs/InfoServiceApi.md#infoServiceGetInfo) | **GET** /api/v1/info | 
*InfoServiceApi* | [**infoServiceGetUserInfo**](docs/InfoServiceApi.md#infoServiceGetUserInfo) | **GET** /api/v1/userinfo | 
*InfoServiceApi* | [**infoServiceGetVersion**](docs/InfoServiceApi.md#infoServiceGetVersion) | **GET** /api/v1/version | 
*SensorServiceApi* | [**sensorServiceCreateSensor**](docs/SensorServiceApi.md#sensorServiceCreateSensor) | **POST** /api/v1/sensors/{namespace} | 
*SensorServiceApi* | [**sensorServiceDeleteSensor**](docs/SensorServiceApi.md#sensorServiceDeleteSensor) | **DELETE** /api/v1/sensors/{namespace}/{name} | 
*SensorServiceApi* | [**sensorServiceGetSensor**](docs/SensorServiceApi.md#sensorServiceGetSensor) | **GET** /api/v1/sensors/{namespace}/{name} | 
*SensorServiceApi* | [**sensorServiceListSensors**](docs/SensorServiceApi.md#sensorServiceListSensors) | **GET** /api/v1/sensors/{namespace} | 
*SensorServiceApi* | [**sensorServiceSensorsLogs**](docs/SensorServiceApi.md#sensorServiceSensorsLogs) | **GET** /api/v1/stream/sensors/{namespace}/logs | 
*SensorServiceApi* | [**sensorServiceUpdateSensor**](docs/SensorServiceApi.md#sensorServiceUpdateSensor) | **PUT** /api/v1/sensors/{namespace}/{name} | 
*SensorServiceApi* | [**sensorServiceWatchSensors**](docs/SensorServiceApi.md#sensorServiceWatchSensors) | **GET** /api/v1/stream/sensors/{namespace} | 
*WorkflowServiceApi* | [**workflowServiceCreateWorkflow**](docs/WorkflowServiceApi.md#workflowServiceCreateWorkflow) | **POST** /api/v1/workflows/{namespace} | 
*WorkflowServiceApi* | [**workflowServiceDeleteWorkflow**](docs/WorkflowServiceApi.md#workflowServiceDeleteWorkflow) | **DELETE** /api/v1/workflows/{namespace}/{name} | 
*WorkflowServiceApi* | [**workflowServiceGetWorkflow**](docs/WorkflowServiceApi.md#workflowServiceGetWorkflow) | **GET** /api/v1/workflows/{namespace}/{name} | 
*WorkflowServiceApi* | [**workflowServiceLintWorkflow**](docs/WorkflowServiceApi.md#workflowServiceLintWorkflow) | **POST** /api/v1/workflows/{namespace}/lint | 
*WorkflowServiceApi* | [**workflowServiceListWorkflows**](docs/WorkflowServiceApi.md#workflowServiceListWorkflows) | **GET** /api/v1/workflows/{namespace} | 
*WorkflowServiceApi* | [**workflowServicePodLogs**](docs/WorkflowServiceApi.md#workflowServicePodLogs) | **GET** /api/v1/workflows/{namespace}/{name}/{podName}/log | DEPRECATED: Cannot work via HTTP if podName is an empty string. Use WorkflowLogs.
*WorkflowServiceApi* | [**workflowServiceResubmitWorkflow**](docs/WorkflowServiceApi.md#workflowServiceResubmitWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/resubmit | 
*WorkflowServiceApi* | [**workflowServiceResumeWorkflow**](docs/WorkflowServiceApi.md#workflowServiceResumeWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/resume | 
*WorkflowServiceApi* | [**workflowServiceRetryWorkflow**](docs/WorkflowServiceApi.md#workflowServiceRetryWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/retry | 
*WorkflowServiceApi* | [**workflowServiceSetWorkflow**](docs/WorkflowServiceApi.md#workflowServiceSetWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/set | 
*WorkflowServiceApi* | [**workflowServiceStopWorkflow**](docs/WorkflowServiceApi.md#workflowServiceStopWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/stop | 
*WorkflowServiceApi* | [**workflowServiceSubmitWorkflow**](docs/WorkflowServiceApi.md#workflowServiceSubmitWorkflow) | **POST** /api/v1/workflows/{namespace}/submit | 
*WorkflowServiceApi* | [**workflowServiceSuspendWorkflow**](docs/WorkflowServiceApi.md#workflowServiceSuspendWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/suspend | 
*WorkflowServiceApi* | [**workflowServiceTerminateWorkflow**](docs/WorkflowServiceApi.md#workflowServiceTerminateWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/terminate | 
*WorkflowServiceApi* | [**workflowServiceWatchEvents**](docs/WorkflowServiceApi.md#workflowServiceWatchEvents) | **GET** /api/v1/stream/events/{namespace} | 
*WorkflowServiceApi* | [**workflowServiceWatchWorkflows**](docs/WorkflowServiceApi.md#workflowServiceWatchWorkflows) | **GET** /api/v1/workflow-events/{namespace} | 
*WorkflowServiceApi* | [**workflowServiceWorkflowLogs**](docs/WorkflowServiceApi.md#workflowServiceWorkflowLogs) | **GET** /api/v1/workflows/{namespace}/{name}/log | 
*WorkflowTemplateServiceApi* | [**workflowTemplateServiceCreateWorkflowTemplate**](docs/WorkflowTemplateServiceApi.md#workflowTemplateServiceCreateWorkflowTemplate) | **POST** /api/v1/workflow-templates/{namespace} | 
*WorkflowTemplateServiceApi* | [**workflowTemplateServiceDeleteWorkflowTemplate**](docs/WorkflowTemplateServiceApi.md#workflowTemplateServiceDeleteWorkflowTemplate) | **DELETE** /api/v1/workflow-templates/{namespace}/{name} | 
*WorkflowTemplateServiceApi* | [**workflowTemplateServiceGetWorkflowTemplate**](docs/WorkflowTemplateServiceApi.md#workflowTemplateServiceGetWorkflowTemplate) | **GET** /api/v1/workflow-templates/{namespace}/{name} | 
*WorkflowTemplateServiceApi* | [**workflowTemplateServiceLintWorkflowTemplate**](docs/WorkflowTemplateServiceApi.md#workflowTemplateServiceLintWorkflowTemplate) | **POST** /api/v1/workflow-templates/{namespace}/lint | 
*WorkflowTemplateServiceApi* | [**workflowTemplateServiceListWorkflowTemplates**](docs/WorkflowTemplateServiceApi.md#workflowTemplateServiceListWorkflowTemplates) | **GET** /api/v1/workflow-templates/{namespace} | 
*WorkflowTemplateServiceApi* | [**workflowTemplateServiceUpdateWorkflowTemplate**](docs/WorkflowTemplateServiceApi.md#workflowTemplateServiceUpdateWorkflowTemplate) | **PUT** /api/v1/workflow-templates/{namespace}/{name} | 


## Documentation for Models

 - [AWSElasticBlockStoreVolumeSource](docs/AWSElasticBlockStoreVolumeSource.md)
 - [ArchiveStrategy](docs/ArchiveStrategy.md)
 - [Arguments](docs/Arguments.md)
 - [Artifact](docs/Artifact.md)
 - [ArtifactLocation](docs/ArtifactLocation.md)
 - [ArtifactPaths](docs/ArtifactPaths.md)
 - [ArtifactRepositoryRef](docs/ArtifactRepositoryRef.md)
 - [ArtifactRepositoryRefStatus](docs/ArtifactRepositoryRefStatus.md)
 - [ArtifactoryArtifact](docs/ArtifactoryArtifact.md)
 - [AzureDiskVolumeSource](docs/AzureDiskVolumeSource.md)
 - [AzureFileVolumeSource](docs/AzureFileVolumeSource.md)
 - [Backoff](docs/Backoff.md)
 - [CSIVolumeSource](docs/CSIVolumeSource.md)
 - [Cache](docs/Cache.md)
 - [Capabilities](docs/Capabilities.md)
 - [CephFSVolumeSource](docs/CephFSVolumeSource.md)
 - [CinderVolumeSource](docs/CinderVolumeSource.md)
 - [ClusterWorkflowTemplate](docs/ClusterWorkflowTemplate.md)
 - [ClusterWorkflowTemplateCreateRequest](docs/ClusterWorkflowTemplateCreateRequest.md)
 - [ClusterWorkflowTemplateLintRequest](docs/ClusterWorkflowTemplateLintRequest.md)
 - [ClusterWorkflowTemplateList](docs/ClusterWorkflowTemplateList.md)
 - [ClusterWorkflowTemplateUpdateRequest](docs/ClusterWorkflowTemplateUpdateRequest.md)
 - [Condition](docs/Condition.md)
 - [ConfigMapEnvSource](docs/ConfigMapEnvSource.md)
 - [ConfigMapProjection](docs/ConfigMapProjection.md)
 - [ConfigMapVolumeSource](docs/ConfigMapVolumeSource.md)
 - [ContainerNode](docs/ContainerNode.md)
 - [ContainerSetTemplate](docs/ContainerSetTemplate.md)
 - [ContinueOn](docs/ContinueOn.md)
 - [Counter](docs/Counter.md)
 - [CreateCronWorkflowRequest](docs/CreateCronWorkflowRequest.md)
 - [CreateOptions](docs/CreateOptions.md)
 - [CreateS3BucketOptions](docs/CreateS3BucketOptions.md)
 - [CronWorkflow](docs/CronWorkflow.md)
 - [CronWorkflowList](docs/CronWorkflowList.md)
 - [CronWorkflowResumeRequest](docs/CronWorkflowResumeRequest.md)
 - [CronWorkflowSpec](docs/CronWorkflowSpec.md)
 - [CronWorkflowStatus](docs/CronWorkflowStatus.md)
 - [CronWorkflowSuspendRequest](docs/CronWorkflowSuspendRequest.md)
 - [DAGTask](docs/DAGTask.md)
 - [DAGTemplate](docs/DAGTemplate.md)
 - [Data](docs/Data.md)
 - [DataSource](docs/DataSource.md)
 - [DownwardAPIProjection](docs/DownwardAPIProjection.md)
 - [DownwardAPIVolumeFile](docs/DownwardAPIVolumeFile.md)
 - [DownwardAPIVolumeSource](docs/DownwardAPIVolumeSource.md)
 - [EmptyDirVolumeSource](docs/EmptyDirVolumeSource.md)
 - [EnvVarSource](docs/EnvVarSource.md)
 - [EphemeralVolumeSource](docs/EphemeralVolumeSource.md)
 - [Event](docs/Event.md)
 - [EventSeries](docs/EventSeries.md)
 - [EventSource](docs/EventSource.md)
 - [EventsourceCreateEventSourceRequest](docs/EventsourceCreateEventSourceRequest.md)
 - [EventsourceEventSourceWatchEvent](docs/EventsourceEventSourceWatchEvent.md)
 - [EventsourceLogEntry](docs/EventsourceLogEntry.md)
 - [EventsourceUpdateEventSourceRequest](docs/EventsourceUpdateEventSourceRequest.md)
 - [ExecAction](docs/ExecAction.md)
 - [ExecutorConfig](docs/ExecutorConfig.md)
 - [FCVolumeSource](docs/FCVolumeSource.md)
 - [FlexVolumeSource](docs/FlexVolumeSource.md)
 - [FlockerVolumeSource](docs/FlockerVolumeSource.md)
 - [GCEPersistentDiskVolumeSource](docs/GCEPersistentDiskVolumeSource.md)
 - [GCSArtifact](docs/GCSArtifact.md)
 - [Gauge](docs/Gauge.md)
 - [GetUserInfoResponse](docs/GetUserInfoResponse.md)
 - [GitArtifact](docs/GitArtifact.md)
 - [GitRepoVolumeSource](docs/GitRepoVolumeSource.md)
 - [GlusterfsVolumeSource](docs/GlusterfsVolumeSource.md)
 - [GoogleProtobufAny](docs/GoogleProtobufAny.md)
 - [GroupVersionResource](docs/GroupVersionResource.md)
 - [GrpcGatewayRuntimeError](docs/GrpcGatewayRuntimeError.md)
 - [GrpcGatewayRuntimeStreamError](docs/GrpcGatewayRuntimeStreamError.md)
 - [HDFSArtifact](docs/HDFSArtifact.md)
 - [HTTPArtifact](docs/HTTPArtifact.md)
 - [HTTPGetAction](docs/HTTPGetAction.md)
 - [HTTPHeader](docs/HTTPHeader.md)
 - [Handler](docs/Handler.md)
 - [Header](docs/Header.md)
 - [Histogram](docs/Histogram.md)
 - [HostPathVolumeSource](docs/HostPathVolumeSource.md)
 - [ISCSIVolumeSource](docs/ISCSIVolumeSource.md)
 - [InfoResponse](docs/InfoResponse.md)
 - [Inputs](docs/Inputs.md)
 - [IoArgoprojEventsV1alpha1AMQPEventSource](docs/IoArgoprojEventsV1alpha1AMQPEventSource.md)
 - [IoArgoprojEventsV1alpha1AWSLambdaTrigger](docs/IoArgoprojEventsV1alpha1AWSLambdaTrigger.md)
 - [IoArgoprojEventsV1alpha1Amount](docs/IoArgoprojEventsV1alpha1Amount.md)
 - [IoArgoprojEventsV1alpha1ArgoWorkflowTrigger](docs/IoArgoprojEventsV1alpha1ArgoWorkflowTrigger.md)
 - [IoArgoprojEventsV1alpha1ArtifactLocation](docs/IoArgoprojEventsV1alpha1ArtifactLocation.md)
 - [IoArgoprojEventsV1alpha1AzureEventsHubEventSource](docs/IoArgoprojEventsV1alpha1AzureEventsHubEventSource.md)
 - [IoArgoprojEventsV1alpha1Backoff](docs/IoArgoprojEventsV1alpha1Backoff.md)
 - [IoArgoprojEventsV1alpha1BasicAuth](docs/IoArgoprojEventsV1alpha1BasicAuth.md)
 - [IoArgoprojEventsV1alpha1CalendarEventSource](docs/IoArgoprojEventsV1alpha1CalendarEventSource.md)
 - [IoArgoprojEventsV1alpha1CatchupConfiguration](docs/IoArgoprojEventsV1alpha1CatchupConfiguration.md)
 - [IoArgoprojEventsV1alpha1Condition](docs/IoArgoprojEventsV1alpha1Condition.md)
 - [IoArgoprojEventsV1alpha1ConfigMapPersistence](docs/IoArgoprojEventsV1alpha1ConfigMapPersistence.md)
 - [IoArgoprojEventsV1alpha1CustomTrigger](docs/IoArgoprojEventsV1alpha1CustomTrigger.md)
 - [IoArgoprojEventsV1alpha1DataFilter](docs/IoArgoprojEventsV1alpha1DataFilter.md)
 - [IoArgoprojEventsV1alpha1DependencyGroup](docs/IoArgoprojEventsV1alpha1DependencyGroup.md)
 - [IoArgoprojEventsV1alpha1EmitterEventSource](docs/IoArgoprojEventsV1alpha1EmitterEventSource.md)
 - [IoArgoprojEventsV1alpha1EventContext](docs/IoArgoprojEventsV1alpha1EventContext.md)
 - [IoArgoprojEventsV1alpha1EventDependency](docs/IoArgoprojEventsV1alpha1EventDependency.md)
 - [IoArgoprojEventsV1alpha1EventDependencyFilter](docs/IoArgoprojEventsV1alpha1EventDependencyFilter.md)
 - [IoArgoprojEventsV1alpha1EventPersistence](docs/IoArgoprojEventsV1alpha1EventPersistence.md)
 - [IoArgoprojEventsV1alpha1EventSource](docs/IoArgoprojEventsV1alpha1EventSource.md)
 - [IoArgoprojEventsV1alpha1EventSourceList](docs/IoArgoprojEventsV1alpha1EventSourceList.md)
 - [IoArgoprojEventsV1alpha1EventSourceSpec](docs/IoArgoprojEventsV1alpha1EventSourceSpec.md)
 - [IoArgoprojEventsV1alpha1EventSourceStatus](docs/IoArgoprojEventsV1alpha1EventSourceStatus.md)
 - [IoArgoprojEventsV1alpha1FileArtifact](docs/IoArgoprojEventsV1alpha1FileArtifact.md)
 - [IoArgoprojEventsV1alpha1FileEventSource](docs/IoArgoprojEventsV1alpha1FileEventSource.md)
 - [IoArgoprojEventsV1alpha1GenericEventSource](docs/IoArgoprojEventsV1alpha1GenericEventSource.md)
 - [IoArgoprojEventsV1alpha1GitArtifact](docs/IoArgoprojEventsV1alpha1GitArtifact.md)
 - [IoArgoprojEventsV1alpha1GitCreds](docs/IoArgoprojEventsV1alpha1GitCreds.md)
 - [IoArgoprojEventsV1alpha1GitRemoteConfig](docs/IoArgoprojEventsV1alpha1GitRemoteConfig.md)
 - [IoArgoprojEventsV1alpha1GithubEventSource](docs/IoArgoprojEventsV1alpha1GithubEventSource.md)
 - [IoArgoprojEventsV1alpha1GitlabEventSource](docs/IoArgoprojEventsV1alpha1GitlabEventSource.md)
 - [IoArgoprojEventsV1alpha1HDFSEventSource](docs/IoArgoprojEventsV1alpha1HDFSEventSource.md)
 - [IoArgoprojEventsV1alpha1HTTPTrigger](docs/IoArgoprojEventsV1alpha1HTTPTrigger.md)
 - [IoArgoprojEventsV1alpha1K8SResourcePolicy](docs/IoArgoprojEventsV1alpha1K8SResourcePolicy.md)
 - [IoArgoprojEventsV1alpha1KafkaConsumerGroup](docs/IoArgoprojEventsV1alpha1KafkaConsumerGroup.md)
 - [IoArgoprojEventsV1alpha1KafkaEventSource](docs/IoArgoprojEventsV1alpha1KafkaEventSource.md)
 - [IoArgoprojEventsV1alpha1KafkaTrigger](docs/IoArgoprojEventsV1alpha1KafkaTrigger.md)
 - [IoArgoprojEventsV1alpha1LogTrigger](docs/IoArgoprojEventsV1alpha1LogTrigger.md)
 - [IoArgoprojEventsV1alpha1MQTTEventSource](docs/IoArgoprojEventsV1alpha1MQTTEventSource.md)
 - [IoArgoprojEventsV1alpha1Metadata](docs/IoArgoprojEventsV1alpha1Metadata.md)
 - [IoArgoprojEventsV1alpha1NATSEventsSource](docs/IoArgoprojEventsV1alpha1NATSEventsSource.md)
 - [IoArgoprojEventsV1alpha1NATSTrigger](docs/IoArgoprojEventsV1alpha1NATSTrigger.md)
 - [IoArgoprojEventsV1alpha1NSQEventSource](docs/IoArgoprojEventsV1alpha1NSQEventSource.md)
 - [IoArgoprojEventsV1alpha1OpenWhiskTrigger](docs/IoArgoprojEventsV1alpha1OpenWhiskTrigger.md)
 - [IoArgoprojEventsV1alpha1PubSubEventSource](docs/IoArgoprojEventsV1alpha1PubSubEventSource.md)
 - [IoArgoprojEventsV1alpha1PulsarEventSource](docs/IoArgoprojEventsV1alpha1PulsarEventSource.md)
 - [IoArgoprojEventsV1alpha1RedisEventSource](docs/IoArgoprojEventsV1alpha1RedisEventSource.md)
 - [IoArgoprojEventsV1alpha1Resource](docs/IoArgoprojEventsV1alpha1Resource.md)
 - [IoArgoprojEventsV1alpha1ResourceEventSource](docs/IoArgoprojEventsV1alpha1ResourceEventSource.md)
 - [IoArgoprojEventsV1alpha1ResourceFilter](docs/IoArgoprojEventsV1alpha1ResourceFilter.md)
 - [IoArgoprojEventsV1alpha1S3Artifact](docs/IoArgoprojEventsV1alpha1S3Artifact.md)
 - [IoArgoprojEventsV1alpha1S3Bucket](docs/IoArgoprojEventsV1alpha1S3Bucket.md)
 - [IoArgoprojEventsV1alpha1S3Filter](docs/IoArgoprojEventsV1alpha1S3Filter.md)
 - [IoArgoprojEventsV1alpha1SNSEventSource](docs/IoArgoprojEventsV1alpha1SNSEventSource.md)
 - [IoArgoprojEventsV1alpha1SQSEventSource](docs/IoArgoprojEventsV1alpha1SQSEventSource.md)
 - [IoArgoprojEventsV1alpha1Selector](docs/IoArgoprojEventsV1alpha1Selector.md)
 - [IoArgoprojEventsV1alpha1Sensor](docs/IoArgoprojEventsV1alpha1Sensor.md)
 - [IoArgoprojEventsV1alpha1SensorList](docs/IoArgoprojEventsV1alpha1SensorList.md)
 - [IoArgoprojEventsV1alpha1SensorSpec](docs/IoArgoprojEventsV1alpha1SensorSpec.md)
 - [IoArgoprojEventsV1alpha1SensorStatus](docs/IoArgoprojEventsV1alpha1SensorStatus.md)
 - [IoArgoprojEventsV1alpha1Service](docs/IoArgoprojEventsV1alpha1Service.md)
 - [IoArgoprojEventsV1alpha1SlackEventSource](docs/IoArgoprojEventsV1alpha1SlackEventSource.md)
 - [IoArgoprojEventsV1alpha1SlackTrigger](docs/IoArgoprojEventsV1alpha1SlackTrigger.md)
 - [IoArgoprojEventsV1alpha1StandardK8STrigger](docs/IoArgoprojEventsV1alpha1StandardK8STrigger.md)
 - [IoArgoprojEventsV1alpha1Status](docs/IoArgoprojEventsV1alpha1Status.md)
 - [IoArgoprojEventsV1alpha1StatusPolicy](docs/IoArgoprojEventsV1alpha1StatusPolicy.md)
 - [IoArgoprojEventsV1alpha1StorageGridEventSource](docs/IoArgoprojEventsV1alpha1StorageGridEventSource.md)
 - [IoArgoprojEventsV1alpha1StorageGridFilter](docs/IoArgoprojEventsV1alpha1StorageGridFilter.md)
 - [IoArgoprojEventsV1alpha1StripeEventSource](docs/IoArgoprojEventsV1alpha1StripeEventSource.md)
 - [IoArgoprojEventsV1alpha1TLSConfig](docs/IoArgoprojEventsV1alpha1TLSConfig.md)
 - [IoArgoprojEventsV1alpha1Template](docs/IoArgoprojEventsV1alpha1Template.md)
 - [IoArgoprojEventsV1alpha1TimeFilter](docs/IoArgoprojEventsV1alpha1TimeFilter.md)
 - [IoArgoprojEventsV1alpha1Trigger](docs/IoArgoprojEventsV1alpha1Trigger.md)
 - [IoArgoprojEventsV1alpha1TriggerParameter](docs/IoArgoprojEventsV1alpha1TriggerParameter.md)
 - [IoArgoprojEventsV1alpha1TriggerParameterSource](docs/IoArgoprojEventsV1alpha1TriggerParameterSource.md)
 - [IoArgoprojEventsV1alpha1TriggerPolicy](docs/IoArgoprojEventsV1alpha1TriggerPolicy.md)
 - [IoArgoprojEventsV1alpha1TriggerSwitch](docs/IoArgoprojEventsV1alpha1TriggerSwitch.md)
 - [IoArgoprojEventsV1alpha1TriggerTemplate](docs/IoArgoprojEventsV1alpha1TriggerTemplate.md)
 - [IoArgoprojEventsV1alpha1URLArtifact](docs/IoArgoprojEventsV1alpha1URLArtifact.md)
 - [IoArgoprojEventsV1alpha1WatchPathConfig](docs/IoArgoprojEventsV1alpha1WatchPathConfig.md)
 - [IoArgoprojEventsV1alpha1WebhookContext](docs/IoArgoprojEventsV1alpha1WebhookContext.md)
 - [IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec](docs/IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec.md)
 - [KeyToPath](docs/KeyToPath.md)
 - [LabelSelector](docs/LabelSelector.md)
 - [LabelSelectorRequirement](docs/LabelSelectorRequirement.md)
 - [LifecycleHook](docs/LifecycleHook.md)
 - [Link](docs/Link.md)
 - [LintCronWorkflowRequest](docs/LintCronWorkflowRequest.md)
 - [LogEntry](docs/LogEntry.md)
 - [ManagedFieldsEntry](docs/ManagedFieldsEntry.md)
 - [MemoizationStatus](docs/MemoizationStatus.md)
 - [Memoize](docs/Memoize.md)
 - [Metadata](docs/Metadata.md)
 - [MetricLabel](docs/MetricLabel.md)
 - [Metrics](docs/Metrics.md)
 - [Mutex](docs/Mutex.md)
 - [MutexHolding](docs/MutexHolding.md)
 - [MutexStatus](docs/MutexStatus.md)
 - [NFSVolumeSource](docs/NFSVolumeSource.md)
 - [NodeAffinity](docs/NodeAffinity.md)
 - [NodeSelector](docs/NodeSelector.md)
 - [NodeSelectorRequirement](docs/NodeSelectorRequirement.md)
 - [NodeSelectorTerm](docs/NodeSelectorTerm.md)
 - [NodeStatus](docs/NodeStatus.md)
 - [NodeSynchronizationStatus](docs/NodeSynchronizationStatus.md)
 - [OSSArtifact](docs/OSSArtifact.md)
 - [OSSLifecycleRule](docs/OSSLifecycleRule.md)
 - [ObjectFieldSelector](docs/ObjectFieldSelector.md)
 - [Outputs](docs/Outputs.md)
 - [OwnerReference](docs/OwnerReference.md)
 - [ParallelSteps](docs/ParallelSteps.md)
 - [Parameter](docs/Parameter.md)
 - [PersistentVolumeClaimCondition](docs/PersistentVolumeClaimCondition.md)
 - [PersistentVolumeClaimSpec](docs/PersistentVolumeClaimSpec.md)
 - [PersistentVolumeClaimStatus](docs/PersistentVolumeClaimStatus.md)
 - [PersistentVolumeClaimTemplate](docs/PersistentVolumeClaimTemplate.md)
 - [PersistentVolumeClaimVolumeSource](docs/PersistentVolumeClaimVolumeSource.md)
 - [PhotonPersistentDiskVolumeSource](docs/PhotonPersistentDiskVolumeSource.md)
 - [PodAffinity](docs/PodAffinity.md)
 - [PodAffinityTerm](docs/PodAffinityTerm.md)
 - [PodAntiAffinity](docs/PodAntiAffinity.md)
 - [PodDNSConfigOption](docs/PodDNSConfigOption.md)
 - [PodGC](docs/PodGC.md)
 - [PortworxVolumeSource](docs/PortworxVolumeSource.md)
 - [PreferredSchedulingTerm](docs/PreferredSchedulingTerm.md)
 - [ProjectedVolumeSource](docs/ProjectedVolumeSource.md)
 - [Prometheus](docs/Prometheus.md)
 - [QuobyteVolumeSource](docs/QuobyteVolumeSource.md)
 - [RBDVolumeSource](docs/RBDVolumeSource.md)
 - [RawArtifact](docs/RawArtifact.md)
 - [ResourceFieldSelector](docs/ResourceFieldSelector.md)
 - [ResourceTemplate](docs/ResourceTemplate.md)
 - [RetryAffinity](docs/RetryAffinity.md)
 - [RetryStrategy](docs/RetryStrategy.md)
 - [S3Artifact](docs/S3Artifact.md)
 - [SELinuxOptions](docs/SELinuxOptions.md)
 - [ScaleIOVolumeSource](docs/ScaleIOVolumeSource.md)
 - [ScriptTemplate](docs/ScriptTemplate.md)
 - [SecretEnvSource](docs/SecretEnvSource.md)
 - [SecretProjection](docs/SecretProjection.md)
 - [SecretVolumeSource](docs/SecretVolumeSource.md)
 - [SemaphoreHolding](docs/SemaphoreHolding.md)
 - [SemaphoreRef](docs/SemaphoreRef.md)
 - [SemaphoreStatus](docs/SemaphoreStatus.md)
 - [SensorCreateSensorRequest](docs/SensorCreateSensorRequest.md)
 - [SensorLogEntry](docs/SensorLogEntry.md)
 - [SensorSensorWatchEvent](docs/SensorSensorWatchEvent.md)
 - [SensorUpdateSensorRequest](docs/SensorUpdateSensorRequest.md)
 - [Sequence](docs/Sequence.md)
 - [ServiceAccountTokenProjection](docs/ServiceAccountTokenProjection.md)
 - [ServicePort](docs/ServicePort.md)
 - [StatusCause](docs/StatusCause.md)
 - [StatusDetails](docs/StatusDetails.md)
 - [StorageOSVolumeSource](docs/StorageOSVolumeSource.md)
 - [StreamResultOfEvent](docs/StreamResultOfEvent.md)
 - [StreamResultOfEventsourceEventSourceWatchEvent](docs/StreamResultOfEventsourceEventSourceWatchEvent.md)
 - [StreamResultOfEventsourceLogEntry](docs/StreamResultOfEventsourceLogEntry.md)
 - [StreamResultOfLogEntry](docs/StreamResultOfLogEntry.md)
 - [StreamResultOfSensorLogEntry](docs/StreamResultOfSensorLogEntry.md)
 - [StreamResultOfSensorSensorWatchEvent](docs/StreamResultOfSensorSensorWatchEvent.md)
 - [StreamResultOfWorkflowWatchEvent](docs/StreamResultOfWorkflowWatchEvent.md)
 - [Submit](docs/Submit.md)
 - [SubmitOpts](docs/SubmitOpts.md)
 - [SuspendTemplate](docs/SuspendTemplate.md)
 - [Synchronization](docs/Synchronization.md)
 - [SynchronizationStatus](docs/SynchronizationStatus.md)
 - [Sysctl](docs/Sysctl.md)
 - [TCPSocketAction](docs/TCPSocketAction.md)
 - [TTLStrategy](docs/TTLStrategy.md)
 - [TarStrategy](docs/TarStrategy.md)
 - [Template](docs/Template.md)
 - [TemplateRef](docs/TemplateRef.md)
 - [TransformationStep](docs/TransformationStep.md)
 - [TypedLocalObjectReference](docs/TypedLocalObjectReference.md)
 - [UpdateCronWorkflowRequest](docs/UpdateCronWorkflowRequest.md)
 - [UserContainer](docs/UserContainer.md)
 - [ValueFrom](docs/ValueFrom.md)
 - [Version](docs/Version.md)
 - [VolumeClaimGC](docs/VolumeClaimGC.md)
 - [VolumeProjection](docs/VolumeProjection.md)
 - [VsphereVirtualDiskVolumeSource](docs/VsphereVirtualDiskVolumeSource.md)
 - [WeightedPodAffinityTerm](docs/WeightedPodAffinityTerm.md)
 - [WindowsSecurityContextOptions](docs/WindowsSecurityContextOptions.md)
 - [Workflow](docs/Workflow.md)
 - [WorkflowCreateRequest](docs/WorkflowCreateRequest.md)
 - [WorkflowEventBinding](docs/WorkflowEventBinding.md)
 - [WorkflowEventBindingList](docs/WorkflowEventBindingList.md)
 - [WorkflowEventBindingSpec](docs/WorkflowEventBindingSpec.md)
 - [WorkflowLintRequest](docs/WorkflowLintRequest.md)
 - [WorkflowList](docs/WorkflowList.md)
 - [WorkflowResubmitRequest](docs/WorkflowResubmitRequest.md)
 - [WorkflowResumeRequest](docs/WorkflowResumeRequest.md)
 - [WorkflowRetryRequest](docs/WorkflowRetryRequest.md)
 - [WorkflowSetRequest](docs/WorkflowSetRequest.md)
 - [WorkflowSpec](docs/WorkflowSpec.md)
 - [WorkflowStatus](docs/WorkflowStatus.md)
 - [WorkflowStep](docs/WorkflowStep.md)
 - [WorkflowStopRequest](docs/WorkflowStopRequest.md)
 - [WorkflowSubmitRequest](docs/WorkflowSubmitRequest.md)
 - [WorkflowSuspendRequest](docs/WorkflowSuspendRequest.md)
 - [WorkflowTemplate](docs/WorkflowTemplate.md)
 - [WorkflowTemplateCreateRequest](docs/WorkflowTemplateCreateRequest.md)
 - [WorkflowTemplateLintRequest](docs/WorkflowTemplateLintRequest.md)
 - [WorkflowTemplateList](docs/WorkflowTemplateList.md)
 - [WorkflowTemplateRef](docs/WorkflowTemplateRef.md)
 - [WorkflowTemplateSpec](docs/WorkflowTemplateSpec.md)
 - [WorkflowTemplateUpdateRequest](docs/WorkflowTemplateUpdateRequest.md)
 - [WorkflowTerminateRequest](docs/WorkflowTerminateRequest.md)
 - [WorkflowWatchEvent](docs/WorkflowWatchEvent.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### BearerToken

- **Type**: API key
- **API key parameter name**: authorization
- **Location**: HTTP header

### HTTPBasic

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



