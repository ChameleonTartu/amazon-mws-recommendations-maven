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
package com.amazonaws.mws.recommendations.samples;

import com.amazonaws.mws.recommendations.MWSRecommendationsSectionServiceAsync;
import com.amazonaws.mws.recommendations.MWSRecommendationsSectionServiceAsyncClient;
import com.amazonaws.mws.recommendations.MWSRecommendationsSectionServiceException;
import com.amazonaws.mws.recommendations.model.CategoryQuery;
import com.amazonaws.mws.recommendations.model.ListRecommendationsRequest;
import com.amazonaws.mws.recommendations.model.ListRecommendationsResponse;
import com.amazonaws.mws.recommendations.model.ResponseHeaderMetadata;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


/** Sample async call for ListRecommendations. */
public class ListRecommendationsAsyncSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param requestList
     *
     * @return The response.
     */
    public static List<Object> invokeListRecommendations(
            MWSRecommendationsSectionServiceAsync client,
            List<ListRecommendationsRequest> requestList) {
        // Call the service async.
        List<Future<ListRecommendationsResponse>> futureList =
            new ArrayList<Future<ListRecommendationsResponse>>();
        for (ListRecommendationsRequest request : requestList) {
            Future<ListRecommendationsResponse> future = 
                client.listRecommendationsAsync(request);
            futureList.add(future);
        }
        List<Object> responseList = new ArrayList<Object>();
        for (Future<ListRecommendationsResponse> future : futureList) {
            Object xresponse;
            try {
                ListRecommendationsResponse response = future.get();
                ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
                // We recommend logging every the request id and timestamp of every call.
                System.out.println("Response:");
                System.out.println("RequestId: "+rhmd.getRequestId());
                System.out.println("Timestamp: "+rhmd.getTimestamp());
                String responseXml = response.toXML();
                System.out.println(responseXml);
                xresponse = response;
            } catch (ExecutionException ee) {
                Throwable cause = ee.getCause();
                if (cause instanceof MWSRecommendationsSectionServiceException) {
                    // Exception properties are important for diagnostics.
                    MWSRecommendationsSectionServiceException ex = 
                        (MWSRecommendationsSectionServiceException)cause;
                    ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
                    System.out.println("Service Exception:");
                    System.out.println("RequestId: "+rhmd.getRequestId());
                    System.out.println("Timestamp: "+rhmd.getTimestamp());
                    System.out.println("Message: "+ex.getMessage());
                    System.out.println("StatusCode: "+ex.getStatusCode());
                    System.out.println("ErrorCode: "+ex.getErrorCode());
                    System.out.println("ErrorType: "+ex.getErrorType());
                    xresponse = ex;
                } else {
                    xresponse = cause;
                }
            } catch (Exception e) {
                xresponse = e;
            }
            responseList.add(xresponse);
        }
        return responseList;
    }

    /**
     *  Command line entry point.
     */
    public static void main(String[] args) {

        // Get a client connection.
        MWSRecommendationsSectionServiceAsyncClient client = MWSRecommendationsSectionServiceSampleConfig.getAsyncClient();

        // Create a request list.
        List<ListRecommendationsRequest> requestList = new ArrayList<ListRecommendationsRequest>();
        ListRecommendationsRequest request = new ListRecommendationsRequest();
        String marketplaceId = "example";
        request.setMarketplaceId(marketplaceId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        String sellerId = "example";
        request.setSellerId(sellerId);
        String recommendationCategory = "example";
        request.setRecommendationCategory(recommendationCategory);
        List<CategoryQuery> categoryQueryList = new ArrayList<CategoryQuery>();
        request.setCategoryQueryList(categoryQueryList);
        requestList.add(request);

        // Make the calls.
        ListRecommendationsAsyncSample.invokeListRecommendations(client, requestList);

    }

}
