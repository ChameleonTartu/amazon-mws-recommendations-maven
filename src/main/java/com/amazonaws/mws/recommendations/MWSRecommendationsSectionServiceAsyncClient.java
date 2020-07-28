/*******************************************************************************
 * Copyright 2009-2014 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * MWS Recommendations Section Service
 * API Version: 2013-04-01
 * Library Version: 2014-10-01
 * Generated: Fri Oct 10 17:55:39 GMT 2014
 */
package com.amazonaws.mws.recommendations;

import com.amazonaws.mws.recommendations.model.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * <p>MWSRecommendationsSectionServiceAsyncClient class.</p>
 */
public class MWSRecommendationsSectionServiceAsyncClient extends MWSRecommendationsSectionServiceClient implements MWSRecommendationsSectionServiceAsync {

    /**
     * <p>Constructor for MWSRecommendationsSectionServiceAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.recommendations.MWSRecommendationsSectionServiceConfig} object.
     * @param executor a {@link java.util.concurrent.ExecutorService} object.
     */
    public MWSRecommendationsSectionServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSRecommendationsSectionServiceConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    /**
     * <p>Constructor for MWSRecommendationsSectionServiceAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.recommendations.MWSRecommendationsSectionServiceConfig} object.
     */
    public MWSRecommendationsSectionServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSRecommendationsSectionServiceConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    /**
     * <p>Constructor for MWSRecommendationsSectionServiceAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.recommendations.MWSRecommendationsSectionServiceConfig} object.
     */
    public MWSRecommendationsSectionServiceAsyncClient(
            String accessKey,
            String secretKey,
            MWSRecommendationsSectionServiceConfig config) {
        super(accessKey, secretKey, config);
    }

    /**
     * <p>Constructor for MWSRecommendationsSectionServiceAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     */
    public MWSRecommendationsSectionServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    /** {@inheritDoc} */
    public Future<GetLastUpdatedTimeForRecommendationsResponse> getLastUpdatedTimeForRecommendationsAsync(
        GetLastUpdatedTimeForRecommendationsRequest request) {
        return connection.callAsync(
            new RequestType("GetLastUpdatedTimeForRecommendations", GetLastUpdatedTimeForRecommendationsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ListRecommendationsResponse> listRecommendationsAsync(
        ListRecommendationsRequest request) {
        return connection.callAsync(
            new RequestType("ListRecommendations", ListRecommendationsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ListRecommendationsByNextTokenResponse> listRecommendationsByNextTokenAsync(
        ListRecommendationsByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListRecommendationsByNextToken", ListRecommendationsByNextTokenResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }


}
