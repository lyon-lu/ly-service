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
import com.study.server.utils.JaxbUtil;

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
    public ItemRequestXml input(@RequestBody ItemRequestXml xml)
    {
        String convertToXml = JaxbUtil.convertToXml(xml);
        System.out.println(convertToXml);
        return xml;
    }
}
