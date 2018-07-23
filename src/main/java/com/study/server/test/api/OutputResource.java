/**
 * Copyright (C) Skywares Information Technology, LTD. 
 * All Rights Reserved.
 *
 * OutputResource.java created on Jul 23, 2018 5:03:39 PM by Lyon Lu 
 */
package com.study.server.test.api;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.server.client.OutputClient;
import com.study.server.jaxb.pojo.BaseRequest.Head;
import com.study.server.jaxb.pojo.ItemRequestXml;
import com.study.server.jaxb.pojo.ItemRequestXml.Body;
import com.study.server.jaxb.pojo.ItemRequestXml.ItemRequest;
import com.study.server.jaxb.pojo.ItemResponseXml;

/**
 * <pre>
 * Description:
 * 
 * @author Lyon Lu
 * @date Jul 23, 2018 5:03:39 PM
 *
 * </pre>
 */
@RestController
public class OutputResource
{
    @Resource
    private OutputClient outputClient;
    
    @RequestMapping(value = "output")
    public ItemResponseXml output()
    {
        ItemRequestXml xml = new ItemRequestXml();
        xml.setLang("zh-CN");
        xml.setService("ITEM_QUERY_SERVICE");
        
        Head head = new Head();
        head.setAccessCode("qwerty");
        head.setCheckword("asdfgh");
        xml.setHead(head);
        
        ItemRequest item = new ItemRequest();
        item.setCode("123");
        
        Body body = new Body();
        body.setItemRequest(item);
        xml.setBody(body);
        
        ItemResponseXml output = outputClient.output(xml);
        
        return output;
    }
}
