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

import ae.javax.xml.bind.annotation.XmlEnum;
import ae.javax.xml.bind.annotation.XmlEnumValue;
import ae.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_LineEndType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_LineEndType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="triangle"/>
 *     &lt;enumeration value="stealth"/>
 *     &lt;enumeration value="diamond"/>
 *     &lt;enumeration value="oval"/>
 *     &lt;enumeration value="arrow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_LineEndType")
@XmlEnum
public enum STLineEndType {


    /**
     * None
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Triangle Arrow Head
     * 
     */
    @XmlEnumValue("triangle")
    TRIANGLE("triangle"),

    /**
     * Stealth Arrow
     * 
     */
    @XmlEnumValue("stealth")
    STEALTH("stealth"),

    /**
     * Diamond
     * 
     */
    @XmlEnumValue("diamond")
    DIAMOND("diamond"),

    /**
     * Oval
     * 
     */
    @XmlEnumValue("oval")
    OVAL("oval"),

    /**
     * Arrow Head
     * 
     */
    @XmlEnumValue("arrow")
    ARROW("arrow");
    private final String value;

    STLineEndType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STLineEndType fromValue(String v) {
        for (STLineEndType c: STLineEndType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}