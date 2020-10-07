/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.11.3
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
import io.argoproj.workflow.models.Arguments;
import io.argoproj.workflow.models.ArtifactRepositoryRef;
import io.argoproj.workflow.models.ExecutorConfig;
import io.argoproj.workflow.models.IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec;
import io.argoproj.workflow.models.Metrics;
import io.argoproj.workflow.models.PodGC;
import io.argoproj.workflow.models.Synchronization;
import io.argoproj.workflow.models.TTLStrategy;
import io.argoproj.workflow.models.Template;
import io.argoproj.workflow.models.WorkflowTemplateRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for WorkflowTemplateSpec
 */
public class WorkflowTemplateSpecTest {
    private final WorkflowTemplateSpec model = new WorkflowTemplateSpec();

    /**
     * Model tests for WorkflowTemplateSpec
     */
    @Test
    public void testWorkflowTemplateSpec() {
        // TODO: test WorkflowTemplateSpec
    }

    /**
     * Test the property 'activeDeadlineSeconds'
     */
    @Test
    public void activeDeadlineSecondsTest() {
        // TODO: test activeDeadlineSeconds
    }

    /**
     * Test the property 'affinity'
     */
    @Test
    public void affinityTest() {
        // TODO: test affinity
    }

    /**
     * Test the property 'arguments'
     */
    @Test
    public void argumentsTest() {
        // TODO: test arguments
    }

    /**
     * Test the property 'artifactRepositoryRef'
     */
    @Test
    public void artifactRepositoryRefTest() {
        // TODO: test artifactRepositoryRef
    }

    /**
     * Test the property 'automountServiceAccountToken'
     */
    @Test
    public void automountServiceAccountTokenTest() {
        // TODO: test automountServiceAccountToken
    }

    /**
     * Test the property 'dnsConfig'
     */
    @Test
    public void dnsConfigTest() {
        // TODO: test dnsConfig
    }

    /**
     * Test the property 'dnsPolicy'
     */
    @Test
    public void dnsPolicyTest() {
        // TODO: test dnsPolicy
    }

    /**
     * Test the property 'entrypoint'
     */
    @Test
    public void entrypointTest() {
        // TODO: test entrypoint
    }

    /**
     * Test the property 'executor'
     */
    @Test
    public void executorTest() {
        // TODO: test executor
    }

    /**
     * Test the property 'hostAliases'
     */
    @Test
    public void hostAliasesTest() {
        // TODO: test hostAliases
    }

    /**
     * Test the property 'hostNetwork'
     */
    @Test
    public void hostNetworkTest() {
        // TODO: test hostNetwork
    }

    /**
     * Test the property 'imagePullSecrets'
     */
    @Test
    public void imagePullSecretsTest() {
        // TODO: test imagePullSecrets
    }

    /**
     * Test the property 'metrics'
     */
    @Test
    public void metricsTest() {
        // TODO: test metrics
    }

    /**
     * Test the property 'nodeSelector'
     */
    @Test
    public void nodeSelectorTest() {
        // TODO: test nodeSelector
    }

    /**
     * Test the property 'onExit'
     */
    @Test
    public void onExitTest() {
        // TODO: test onExit
    }

    /**
     * Test the property 'parallelism'
     */
    @Test
    public void parallelismTest() {
        // TODO: test parallelism
    }

    /**
     * Test the property 'podDisruptionBudget'
     */
    @Test
    public void podDisruptionBudgetTest() {
        // TODO: test podDisruptionBudget
    }

    /**
     * Test the property 'podGC'
     */
    @Test
    public void podGCTest() {
        // TODO: test podGC
    }

    /**
     * Test the property 'podPriority'
     */
    @Test
    public void podPriorityTest() {
        // TODO: test podPriority
    }

    /**
     * Test the property 'podPriorityClassName'
     */
    @Test
    public void podPriorityClassNameTest() {
        // TODO: test podPriorityClassName
    }

    /**
     * Test the property 'podSpecPatch'
     */
    @Test
    public void podSpecPatchTest() {
        // TODO: test podSpecPatch
    }

    /**
     * Test the property 'priority'
     */
    @Test
    public void priorityTest() {
        // TODO: test priority
    }

    /**
     * Test the property 'schedulerName'
     */
    @Test
    public void schedulerNameTest() {
        // TODO: test schedulerName
    }

    /**
     * Test the property 'securityContext'
     */
    @Test
    public void securityContextTest() {
        // TODO: test securityContext
    }

    /**
     * Test the property 'serviceAccountName'
     */
    @Test
    public void serviceAccountNameTest() {
        // TODO: test serviceAccountName
    }

    /**
     * Test the property 'shutdown'
     */
    @Test
    public void shutdownTest() {
        // TODO: test shutdown
    }

    /**
     * Test the property 'suspend'
     */
    @Test
    public void suspendTest() {
        // TODO: test suspend
    }

    /**
     * Test the property 'synchronization'
     */
    @Test
    public void synchronizationTest() {
        // TODO: test synchronization
    }

    /**
     * Test the property 'templates'
     */
    @Test
    public void templatesTest() {
        // TODO: test templates
    }

    /**
     * Test the property 'tolerations'
     */
    @Test
    public void tolerationsTest() {
        // TODO: test tolerations
    }

    /**
     * Test the property 'ttlSecondsAfterFinished'
     */
    @Test
    public void ttlSecondsAfterFinishedTest() {
        // TODO: test ttlSecondsAfterFinished
    }

    /**
     * Test the property 'ttlStrategy'
     */
    @Test
    public void ttlStrategyTest() {
        // TODO: test ttlStrategy
    }

    /**
     * Test the property 'volumeClaimTemplates'
     */
    @Test
    public void volumeClaimTemplatesTest() {
        // TODO: test volumeClaimTemplates
    }

    /**
     * Test the property 'volumes'
     */
    @Test
    public void volumesTest() {
        // TODO: test volumes
    }

    /**
     * Test the property 'workflowMetadata'
     */
    @Test
    public void workflowMetadataTest() {
        // TODO: test workflowMetadata
    }

    /**
     * Test the property 'workflowTemplateRef'
     */
    @Test
    public void workflowTemplateRefTest() {
        // TODO: test workflowTemplateRef
    }

}
