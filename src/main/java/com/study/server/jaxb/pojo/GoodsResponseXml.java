/**
 * Copyright (C) Skywares Information Technology, LTD. 
 * All Rights Reserved.
 *
 * GoodsResonseBody.java created on Jul 12, 2018 9:28:38 AM by Lyon Lu 
 */
package com.study.server.jaxb.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
public class GoodsResponseXml extends BaseResponse
{
    /**
    * @fields serialVersionUID : TODO
    */
    private static final long serialVersionUID = 6437379031801938017L;
    
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
    
    public Body getBody()
    {
        return Body;
    }

    public void setBody(Body body)
    {
        Body = body;
    }
}
