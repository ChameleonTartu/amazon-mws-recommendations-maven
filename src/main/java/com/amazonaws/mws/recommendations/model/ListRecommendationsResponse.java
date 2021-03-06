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
 * List Recommendations Response
 * API Version: 2013-04-01
 * Library Version: 2014-10-01
 * Generated: Fri Oct 10 17:55:39 GMT 2014
 */
package com.amazonaws.mws.recommendations.model;

import com.amazonaws.mws.recommendations.MWSResponse;
import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * ListRecommendationsResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListRecommendationsResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ListRecommendationsResult" type="{https://mws.amazonservices.com/Recommendations/2013-04-01}ListRecommendationsResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{https://mws.amazonservices.com/Recommendations/2013-04-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ListRecommendationsResponse extends AbstractMwsObject implements MWSResponse {

    private ListRecommendationsResult listRecommendationsResult;

    private ResponseMetadata responseMetadata;

    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of ListRecommendationsResult.
     *
     * @return The value of ListRecommendationsResult.
     */
    public ListRecommendationsResult getListRecommendationsResult() {
        return listRecommendationsResult;
    }

    /**
     * Set the value of ListRecommendationsResult.
     *
     * @param listRecommendationsResult
     *            The new value to set.
     */
    public void setListRecommendationsResult(ListRecommendationsResult listRecommendationsResult) {
        this.listRecommendationsResult = listRecommendationsResult;
    }

    /**
     * Check to see if ListRecommendationsResult is set.
     *
     * @return true if ListRecommendationsResult is set.
     */
    public boolean isSetListRecommendationsResult() {
        return listRecommendationsResult != null;
    }

    /**
     * Set the value of ListRecommendationsResult, return this.
     *
     * @param listRecommendationsResult
     *             The new value to set.
     * @return This instance.
     */
    public ListRecommendationsResponse withListRecommendationsResult(ListRecommendationsResult listRecommendationsResult) {
        this.listRecommendationsResult = listRecommendationsResult;
        return this;
    }

    /**
     * Get the value of ResponseMetadata.
     *
     * @return The value of ResponseMetadata.
     */
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Set the value of ResponseMetadata.
     *
     * @param responseMetadata
     *            The new value to set.
     */
    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    /**
     * Check to see if ResponseMetadata is set.
     *
     * @return true if ResponseMetadata is set.
     */
    public boolean isSetResponseMetadata() {
        return responseMetadata != null;
    }

    /**
     * Set the value of ResponseMetadata, return this.
     *
     * @param responseMetadata
     *             The new value to set.
     * @return This instance.
     */
    public ListRecommendationsResponse withResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
        return this;
    }

    /**
     * Get the value of ResponseHeaderMetadata.
     *
     * @return The value of ResponseHeaderMetadata.
     */
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        return responseHeaderMetadata;
    }

    /**
     * {@inheritDoc}
     *
     * Set the value of ResponseHeaderMetadata.
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
    }

    /**
     * Check to see if ResponseHeaderMetadata is set.
     *
     * @return true if ResponseHeaderMetadata is set.
     */
    public boolean isSetResponseHeaderMetadata() {
        return responseHeaderMetadata != null;
    }

    /**
     * Set the value of ResponseHeaderMetadata, return this.
     *
     * @param responseHeaderMetadata
     *             The new value to set.
     * @return This instance.
     */
    public ListRecommendationsResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        listRecommendationsResult = r.read("ListRecommendationsResult", ListRecommendationsResult.class);
        responseMetadata = r.read("ResponseMetadata", ResponseMetadata.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ListRecommendationsResult", listRecommendationsResult);
        w.write("ResponseMetadata", responseMetadata);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Recommendations/2013-04-01", "ListRecommendationsResponse",this);
    }

    /**
     * Value constructor.
     *
     * @param listRecommendationsResult a {@link com.amazonaws.mws.recommendations.model.ListRecommendationsResult} object.
     * @param responseMetadata a {@link com.amazonaws.mws.recommendations.model.ResponseMetadata} object.
     */
    public ListRecommendationsResponse(ListRecommendationsResult listRecommendationsResult, ResponseMetadata responseMetadata) {
        this.listRecommendationsResult = listRecommendationsResult;
        this.responseMetadata = responseMetadata;
    }    
    

    /**
     * Default constructor.
     */
    public ListRecommendationsResponse() {
        super();
    }

}
