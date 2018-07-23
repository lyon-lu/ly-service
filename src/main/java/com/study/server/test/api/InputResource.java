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
import com.study.server.jaxb.pojo.ItemRequestXml;
import com.study.server.jaxb.pojo.ItemRequestXml.ItemRequest;
import com.study.server.jaxb.pojo.ItemResponseXml;
import com.study.server.jaxb.pojo.ItemResponseXml.Body;
import com.study.server.jaxb.pojo.ItemResponseXml.ItemResponse;
import com.study.server.utils.JacksonUtil;

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
    public ItemResponseXml input(@RequestBody ItemRequestXml xml)
    {
        
        ItemRequest itemRequest = xml.getBody().getItemRequest();
        
        ItemResponse gr = new ItemResponse();
        gr.setCode(itemRequest.getCode());
        
        Body body = new Body();
        body.setItemResponse(gr);
        
        ItemResponseXml grx = new ItemResponseXml();
        grx.setService(xml.getService());
        grx.setLang(xml.getLang());
        grx.setHead("OK");
        grx.setBody(body);
        
        return grx;
    }
}
