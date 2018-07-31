/**
 * Copyright (C) Skywares Information Technology, LTD. 
 * All Rights Reserved.
 *
 * OutputClient.java created on Jul 23, 2018 4:50:37 PM by Lyon Lu 
 */
package com.study.server.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.server.client.fallback.OutputClientFallback;
import com.study.server.jaxb.pojo.ItemQueryRequestBean.ItemQueryRequest;
import com.study.server.jaxb.pojo.ItemResponseBean.ItemResponse;

/**
 * <pre>
 * Description:
 * 
 * @author Lyon Lu
 * @date Jul 23, 2018 4:50:37 PM
 *
 * </pre>
 */
@FeignClient(name = "LY-GATEWAY", fallback = OutputClientFallback.class)
public interface OutputClient
{
    @RequestMapping(value = "output")
    ItemResponse output(@RequestBody ItemQueryRequest query);
}
