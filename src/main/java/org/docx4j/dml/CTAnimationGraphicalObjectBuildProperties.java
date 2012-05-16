/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.dml;

import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
import ae.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_AnimationGraphicalObjectBuildProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_AnimationGraphicalObjectBuildProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="bldDgm" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_AnimationDgmBuildProperties"/>
 *         &lt;element name="bldChart" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_AnimationChartBuildProperties"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_AnimationGraphicalObjectBuildProperties", propOrder = {
    "bldDgm",
    "bldChart"
})
public class CTAnimationGraphicalObjectBuildProperties {

    protected CTAnimationDgmBuildProperties bldDgm;
    protected CTAnimationChartBuildProperties bldChart;

    /**
     * Gets the value of the bldDgm property.
     * 
     * @return
     *     possible object is
     *     {@link CTAnimationDgmBuildProperties }
     *     
     */
    public CTAnimationDgmBuildProperties getBldDgm() {
        return bldDgm;
    }

    /**
     * Sets the value of the bldDgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAnimationDgmBuildProperties }
     *     
     */
    public void setBldDgm(CTAnimationDgmBuildProperties value) {
        this.bldDgm = value;
    }

    /**
     * Gets the value of the bldChart property.
     * 
     * @return
     *     possible object is
     *     {@link CTAnimationChartBuildProperties }
     *     
     */
    public CTAnimationChartBuildProperties getBldChart() {
        return bldChart;
    }

    /**
     * Sets the value of the bldChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAnimationChartBuildProperties }
     *     
     */
    public void setBldChart(CTAnimationChartBuildProperties value) {
        this.bldChart = value;
    }

}