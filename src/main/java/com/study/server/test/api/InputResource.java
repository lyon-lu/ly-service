/**
 * Copyright (C) Skywares Information Technology, LTD. 
 * All Rights Reserved.
 *
 * InputResource.java created on Jul 23, 2018 9:09:35 AM by Lyon Lu 
 */
package com.study.server.test.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.server.common.AbstractResource;
import com.study.server.jaxb.pojo.ItemQueryRequestBean;
import com.study.server.jaxb.pojo.ItemQueryRequestBean.ItemQueryRequest;
import com.study.server.jaxb.pojo.ItemResponseBean;
import com.study.server.jaxb.pojo.ItemResponseBean.Body;
import com.study.server.jaxb.pojo.ItemResponseBean.ItemResponse;

/**
 * <pre>
 * Description:
 * 
 * @author Lyon Lu
 * @date Jul 23, 2018 9:09:35 AM
 *
 * </pre>
 */
@RestController
public class InputResource extends AbstractResource 
{
    @RequestMapping(value = "input")
    public ItemResponseBean input(@RequestBody ItemQueryRequestBean xml)
    {
        
        ItemQueryRequest itemRequest = xml.getBody().getItemQueryRequest();
        
        ItemResponse gr = new ItemResponse();
        
        Body body = new Body();
        body.setItemResponse(gr);
        
        ItemResponseBean grx = new ItemResponseBean();
        grx.setService(xml.getService());
        grx.setLang(xml.getLang());
        grx.setHead("OK");
        grx.setBody(body);
        
        return grx;
    }
}
