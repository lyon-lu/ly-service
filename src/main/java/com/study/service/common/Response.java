/**
 * Copyright (C) Skywares Information Technology, LTD. 
 * All Rights Reserved.
 *
 * Response.java created on Jul 11, 2018 9:01:24 AM by Lyon Lu 
 */
package com.study.service.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <pre>
 * Description:
 * 
 * @author Lyon Lu
 * @date Jul 11, 2018 9:01:24 AM
 *
 * </pre>
 */
@XmlRootElement(name="Response")
@XmlAccessorType(XmlAccessType.FIELD)
public class Response implements Serializable
{
    /**
    * @fields serialVersionUID : TODO
    */
    private static final long serialVersionUID = -227300868238868284L;

    @XmlAttribute
    private String service;
    
    @XmlAttribute
    private String lang;
    
    @XmlElement(name="Head")
    private String head;
    
    @XmlElement(name="Body")
    private Body Body;
    
    

    public Body getBody()
    {
        return Body;
    }

    public void setBody(Body body)
    {
        Body = body;
    }

    public String getService()
    {
        return service;
    }

    public void setService(String service)
    {
        this.service = service;
    }

    public String getLang()
    {
        return lang;
    }

    public void setLang(String lang)
    {
        this.lang = lang;
    }

    public String getHead()
    {
        return head;
    }

    public void setHead(String head)
    {
        this.head = head;
    }
}
