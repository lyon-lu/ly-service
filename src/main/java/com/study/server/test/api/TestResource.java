/**
 * Copyright (C) Skywares Information Technology, LTD. 
 * All Rights Reserved.
 *
 * ItemRequestXml.java created on Jul 17, 2018 9:03:58 AM by Lyon Lu 
 */
package com.study.server.test.api;

import java.io.IOException;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.study.server.common.AbstractResource;
import com.study.server.jaxb.pojo.BaseRequest.Head;
import com.study.server.jaxb.pojo.GoodsResponseXml;
import com.study.server.jaxb.pojo.GoodsResponseXml.GoodsResponse;
import com.study.server.jaxb.pojo.ItemRequestXml;
import com.study.server.jaxb.pojo.ItemRequestXml.ItemRequest;
import com.study.server.utils.JaxbUtil;

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
	
	@RequestMapping(value = "test")
	public String test()
	{
	    HttpServletRequest request = getRequest();
	    try
        {
            ServletInputStream inputStream = request.getInputStream();
            String string = IOUtils.toString(inputStream, "UTF-8");
            System.out.println(string);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
		return "test";
	}
	
	@RequestMapping(value = "xml", produces={"application/xml; charset=UTF-8"})
	public GoodsResponseXml xml(@RequestBody ItemRequestXml xml)
	{
	    System.out.println(xml);
	    ItemRequest itemRequest = xml.getBody().getItemRequest();
	    
	    GoodsResponse gr = new GoodsResponse();
	    gr.setCode(itemRequest.getCode());
	    
	    com.study.server.jaxb.pojo.GoodsResponseXml.Body body = new com.study.server.jaxb.pojo.GoodsResponseXml.Body();
	    body.setGoodsResponse(gr);
	    
	    GoodsResponseXml grx = new GoodsResponseXml();
	    grx.setService(xml.getService());
	    grx.setLang(xml.getLang());
	    grx.setHead("OK");
	    grx.setBody(body);
		return grx;
	}
	
	@RequestMapping(value = "xmlJson")
	public String xmlJson() throws IOException
	{
	    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	    
	    ServletInputStream inputStream = request.getInputStream();
	    String inputStr = IOUtils.toString(inputStream, "UTF-8");
	    // xml转bean
	    ItemRequestXml xml = JaxbUtil.converyToJavaBean(inputStr, ItemRequestXml.class);
	    
	    Head head = xml.getHead();
	    head.setAccessCode("111111111111");
	    // bean转xml
	    String outputStr = JaxbUtil.convertToXml(xml);
	    
	    System.out.println(outputStr);
	    return outputStr;
	}
}
