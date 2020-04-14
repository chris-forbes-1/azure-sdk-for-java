// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TriggerCondition model. */
@Fluent
public final class TriggerCondition {
    /*
     * Evaluation operation for rule - 'GreaterThan' or 'LessThan.
     */
    @JsonProperty(value = "thresholdOperator", required = true)
    private ConditionalOperator thresholdOperator;

    /*
     * Result or count threshold based on which rule should be triggered.
     */
    @JsonProperty(value = "threshold", required = true)
    private double threshold;

    /*
     * Trigger condition for metric query rule
     */
    @JsonProperty(value = "metricTrigger")
    private LogMetricTrigger metricTrigger;

    /**
     * Get the thresholdOperator property: Evaluation operation for rule - 'GreaterThan' or 'LessThan.
     *
     * @return the thresholdOperator value.
     */
    public ConditionalOperator thresholdOperator() {
        return this.thresholdOperator;
    }

    /**
     * Set the thresholdOperator property: Evaluation operation for rule - 'GreaterThan' or 'LessThan.
     *
     * @param thresholdOperator the thresholdOperator value to set.
     * @return the TriggerCondition object itself.
     */
    public TriggerCondition withThresholdOperator(ConditionalOperator thresholdOperator) {
        this.thresholdOperator = thresholdOperator;
        return this;
    }

    /**
     * Get the threshold property: Result or count threshold based on which rule should be triggered.
     *
     * @return the threshold value.
     */
    public double threshold() {
        return this.threshold;
    }

    /**
     * Set the threshold property: Result or count threshold based on which rule should be triggered.
     *
     * @param threshold the threshold value to set.
     * @return the TriggerCondition object itself.
     */
    public TriggerCondition withThreshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * Get the metricTrigger property: Trigger condition for metric query rule.
     *
     * @return the metricTrigger value.
     */
    public LogMetricTrigger metricTrigger() {
        return this.metricTrigger;
    }

    /**
     * Set the metricTrigger property: Trigger condition for metric query rule.
     *
     * @param metricTrigger the metricTrigger value to set.
     * @return the TriggerCondition object itself.
     */
    public TriggerCondition withMetricTrigger(LogMetricTrigger metricTrigger) {
        this.metricTrigger = metricTrigger;
        return this;
    }
}
