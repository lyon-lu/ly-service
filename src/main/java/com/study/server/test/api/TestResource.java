/**
 * Copyright (C) Skywares Information Technology, LTD. 
 * All Rights Reserved.
 *
 * ItemRequestXml.java created on Jul 17, 2018 9:03:58 AM by Lyon Lu 
 */
package com.study.server.test.api;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.server.client.OutputClient;
import com.study.server.common.AbstractResource;
import com.study.server.jaxb.pojo.BaseRequest.Head;
import com.study.server.jaxb.pojo.ItemQueryRequestBean;
import com.study.server.jaxb.pojo.ItemQueryRequestBean.Body;
import com.study.server.jaxb.pojo.ItemQueryRequestBean.ItemQueryRequest;
import com.study.server.utils.JaxbUtil;
import com.study.server.jaxb.pojo.ItemResponseBean;

/**
 * <pre>
 * Description:
 * 
 * @author Lyon Lu
 * @date May 24, 2018 4:49:36 PM
 *
 * </pre>
 */
@RestController
public class TestResource extends AbstractResource 
{
    @Resource
    private OutputClient outputClient;
    
    @RequestMapping(value = "output")
    public ItemResponseBean output()
    {
        ItemQueryRequestBean xml = new ItemQueryRequestBean();
        xml.setLang("zh-CN");
        xml.setService("ITEM_QUERY_SERVICE");
        
        Head head = new Head();
        head.setAccessCode("bvW2Fcx8Hb1OYzZaL2mY8A==");
        head.setCheckword("Pa2zfPtcCIvmhxYkfw5Bj6JgPmx63s4i");
        xml.setHead(head);
        
        ItemQueryRequest item = new ItemQueryRequest();
        List<String> skuNoList = new ArrayList<>();
        skuNoList.add("1");
        item.setCompanyCode("COMMONCOMPANY");
        item.setSkuNo(skuNoList);
        
        Body body = new Body();
        body.setItemQueryRequest(item);
        xml.setBody(body);
        
        String xmlStr = outputClient.output(xml);
        
        ItemResponseBean xmlBean = JaxbUtil.converyToJavaBean(xmlStr, ItemResponseBean.class);
        
        return xmlBean;
    }
    
    @RequestMapping(value = "success")
    public String success()
    {
        return "success";
    }
}
