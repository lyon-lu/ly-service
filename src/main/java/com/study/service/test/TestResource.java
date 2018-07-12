package com.study.service.test;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.service.jaxb.pojo.GoodsResponseXml;

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
public class TestResource {
	
	@RequestMapping(value = "test")
	public String test(){
		return "test";
	}
	@RequestMapping(value = "demo")
	public String demo(){
		return "demo";
	}
	
	@RequestMapping(value = "xml", produces={"application/xml; charset=UTF-8"})
	public GoodsResponseXml xml(@RequestBody GoodsResponseXml xml)
	{
		return xml;
	}
}
