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


import com.amazonaws.mws.recommendations.MWSRecommendationsSectionService;
import com.amazonaws.mws.recommendations.MWSRecommendationsSectionServiceClient;
import com.amazonaws.mws.recommendations.MWSRecommendationsSectionServiceException;
import com.amazonaws.mws.recommendations.model.GetLastUpdatedTimeForRecommendationsRequest;
import com.amazonaws.mws.recommendations.model.GetLastUpdatedTimeForRecommendationsResponse;
import com.amazonaws.mws.recommendations.model.ResponseHeaderMetadata;

/** Sample call for GetLastUpdatedTimeForRecommendations. */
public class GetLastUpdatedTimeForRecommendationsSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static GetLastUpdatedTimeForRecommendationsResponse invokeGetLastUpdatedTimeForRecommendations(
            MWSRecommendationsSectionService client,
            GetLastUpdatedTimeForRecommendationsRequest request) {
        try {
            // Call the service.
            GetLastUpdatedTimeForRecommendationsResponse response = client.getLastUpdatedTimeForRecommendations(request);
            ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
            // We recommend logging every the request id and timestamp of every call.
            System.out.println("Response:");
            System.out.println("RequestId: "+rhmd.getRequestId());
            System.out.println("Timestamp: "+rhmd.getTimestamp());
            String responseXml = response.toXML();
            System.out.println(responseXml);
            return response;
        } catch (MWSRecommendationsSectionServiceException ex) {
            // Exception properties are important for diagnostics.
            System.out.println("Service Exception:");
            ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
            if(rhmd != null) {
                System.out.println("RequestId: "+rhmd.getRequestId());
                System.out.println("Timestamp: "+rhmd.getTimestamp());
            }
            System.out.println("Message: "+ex.getMessage());
            System.out.println("StatusCode: "+ex.getStatusCode());
            System.out.println("ErrorCode: "+ex.getErrorCode());
            System.out.println("ErrorType: "+ex.getErrorType());
            throw ex;
        }
    }

    /**
     *  Command line entry point.
     */
    public static void main(String[] args) {

        // Get a client connection.
        // Make sure you've set the variables in MWSRecommendationsSectionServiceSampleConfig.
        MWSRecommendationsSectionServiceClient client = MWSRecommendationsSectionServiceSampleConfig.getClient();

        // Create a request.
        GetLastUpdatedTimeForRecommendationsRequest request = new GetLastUpdatedTimeForRecommendationsRequest();
        String marketplaceId = "example";
        request.setMarketplaceId(marketplaceId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        String sellerId = "example";
        request.setSellerId(sellerId);

        // Make the call.
        GetLastUpdatedTimeForRecommendationsSample.invokeGetLastUpdatedTimeForRecommendations(client, request);

    }

}
