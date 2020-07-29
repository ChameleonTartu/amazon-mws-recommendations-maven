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
 * Dimension Measure
 * API Version: 2013-04-01
 * Library Version: 2014-10-01
 * Generated: Fri Oct 10 17:55:39 GMT 2014
 */
package com.amazonaws.mws.recommendations.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

import java.math.BigDecimal;

/**
 * DimensionMeasure complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="DimensionMeasure"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *             &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class DimensionMeasure extends AbstractMwsObject {

    private BigDecimal value;

    private String unit;

    /**
     * Get the value of Value.
     *
     * @return The value of Value.
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Set the value of Value.
     *
     * @param value
     *            The new value to set.
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Check to see if Value is set.
     *
     * @return true if Value is set.
     */
    public boolean isSetValue() {
        return value != null;
    }

    /**
     * Set the value of Value, return this.
     *
     * @param value
     *             The new value to set.
     * @return This instance.
     */
    public DimensionMeasure withValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    /**
     * Get the value of Unit.
     *
     * @return The value of Unit.
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Set the value of Unit.
     *
     * @param unit
     *            The new value to set.
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Check to see if Unit is set.
     *
     * @return true if Unit is set.
     */
    public boolean isSetUnit() {
        return unit != null;
    }

    /**
     * Set the value of Unit, return this.
     *
     * @param unit
     *             The new value to set.
     * @return This instance.
     */
    public DimensionMeasure withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        value = r.read("Value", BigDecimal.class);
        unit = r.read("Unit", String.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Value", value);
        w.write("Unit", unit);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Recommendations/2013-04-01", "DimensionMeasure",this);
    }

    /**
     * Value constructor.
     *
     * @param value a {@link java.math.BigDecimal} object.
     * @param unit a {@link java.lang.String} object.
     */
    public DimensionMeasure(BigDecimal value,String unit) {
        this.value = value;
        this.unit = unit;
    }    
    

    /**
     * Default constructor.
     */
    public DimensionMeasure() {
        super();
    }

}