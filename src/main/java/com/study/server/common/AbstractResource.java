/**
 * Copyright (C) Skywares Information Technology, LTD. 
 * All Rights Reserved.
 *
 * AbstractResource.java created on Jul 20, 2018 3:45:42 PM by Lyon Lu 
 */
package com.study.server.common;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * <pre>
 * Description:
 * 
 * @author Lyon Lu
 * @date Jul 20, 2018 3:45:42 PM
 *
 * </pre>
 */
public abstract class AbstractResource
{
    protected Logger logger = LoggerFactory.getLogger(getClass());
    
    public HttpServletRequest getRequest()
    {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }
}
