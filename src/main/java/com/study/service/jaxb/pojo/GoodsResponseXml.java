/**
 * Copyright (C) Skywares Information Technology, LTD. 
 * All Rights Reserved.
 *
 * GoodsResonseBody.java created on Jul 12, 2018 9:28:38 AM by Lyon Lu 
 */
package com.study.service.jaxb.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <pre>
 * Description:
 * 
 * @author Lyon Lu
 * @date Jul 12, 2018 9:28:38 AM
 *
 * </pre>
 */
@XmlRootElement(name="Response")
@XmlAccessorType(XmlAccessType.FIELD)
public class GoodsResponseXml implements Serializable
{
    /**
    * @fields serialVersionUID : TODO
    */
    private static final long serialVersionUID = 6437379031801938017L;
    
    @XmlAttribute
    private String service;
    
    @XmlAttribute
    private String lang;
    
    private String Head;
    
    private Body Body;
    
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Body
    {
        private GoodsResponse GoodsResponse;

        public GoodsResponse getGoodsResponse()
        {
            return GoodsResponse;
        }

        public void setGoodsResponse(GoodsResponse goodsResponse)
        {
            GoodsResponse = goodsResponse;
        }
    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class GoodsResponse
    {
        private String code;

        public String getCode()
        {
            return code;
        }

        public void setCode(String code)
        {
            this.code = code;
        }
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
        return Head;
    }

    public void setHead(String head)
    {
        Head = head;
    }

    public Body getBody()
    {
        return Body;
    }

    public void setBody(Body body)
    {
        Body = body;
    }
}
