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

import com.amazonaws.mws.recommendations.model.ResponseHeaderMetadata;
import com.amazonservices.mws.client.MwsException;
import com.amazonservices.mws.client.MwsResponseHeaderMetadata;

/**
 * Exceptions thrown by MWSRecommendationsSectionService operations.
 */
public class MWSRecommendationsSectionServiceException extends MwsException {

    /** For serialization. */
    private static final long serialVersionUID = 1L;

    /** {@inheritDoc} */
    @Override
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        MwsResponseHeaderMetadata baseRHMD = super.getResponseHeaderMetadata();
        if(baseRHMD != null) {
            return new ResponseHeaderMetadata(baseRHMD);
        } else {
            return null;
        }
    }

    /**
     * <p>setResponseHeaderMetadata.</p>
     *
     * @param rhmd a {@link com.amazonaws.mws.recommendations.model.ResponseHeaderMetadata} object.
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata rhmd) {
        super.setResponseHeaderMetadata(rhmd);
    }

    /**
     * <p>Constructor for MWSRecommendationsSectionServiceException.</p>
     *
     * @param message a {@link java.lang.String} object.
     */
    public MWSRecommendationsSectionServiceException(String message) {
        super(0, message, null);
    }

    /**
     * <p>Constructor for MWSRecommendationsSectionServiceException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param statusCode a int.
     */
    public MWSRecommendationsSectionServiceException(String message, int statusCode) {
        super(statusCode, message, null);
    }

    /**
     * <p>Constructor for MWSRecommendationsSectionServiceException.</p>
     *
     * @param t a {@link java.lang.Throwable} object.
     */
    public MWSRecommendationsSectionServiceException(Throwable t) {
        super(0, null, t);
    }

    /**
     * <p>Constructor for MWSRecommendationsSectionServiceException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param t a {@link java.lang.Throwable} object.
     */
    public MWSRecommendationsSectionServiceException(String message, Throwable t) {
        super(0, message, t);
    }

    /**
     * <p>Constructor for MWSRecommendationsSectionServiceException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param statusCode a int.
     * @param errorCode a {@link java.lang.String} object.
     * @param errorType a {@link java.lang.String} object.
     * @param requestId a {@link java.lang.String} object.
     * @param xml a {@link java.lang.String} object.
     * @param rhmd a {@link com.amazonaws.mws.recommendations.model.ResponseHeaderMetadata} object.
     */
    public MWSRecommendationsSectionServiceException(String message, int statusCode, 
         String errorCode, String errorType, String requestId,
         String xml, ResponseHeaderMetadata rhmd) {
        super(statusCode, message, errorCode, errorType, xml, rhmd);
    }

    /**
     * <p>Constructor for MWSRecommendationsSectionServiceException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param statusCode a int.
     * @param errorCode a {@link java.lang.String} object.
     * @param errorType a {@link java.lang.String} object.
     * @param requestId a {@link java.lang.String} object.
     * @param xml a {@link java.lang.String} object.
     */
    public MWSRecommendationsSectionServiceException(String message, int statusCode, 
         String errorCode, String errorType, String requestId,
         String xml) {
        super(statusCode, message, errorCode, errorType, xml, null);
    }

}

