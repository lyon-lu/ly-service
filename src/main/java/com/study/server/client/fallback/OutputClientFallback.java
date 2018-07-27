/**
 * Copyright (C) Skywares Information Technology, LTD. 
 * All Rights Reserved.
 *
 * OutputClientFallback.java created on Jul 23, 2018 4:52:12 PM by Lyon Lu 
 */
package com.study.server.client.fallback;

import org.springframework.stereotype.Component;

import com.study.server.client.OutputClient;
import com.study.server.jaxb.pojo.ItemQueryRequestBean;

/**
 * <pre>
 * Description:
 * 
 * @author Lyon Lu
 * @date Jul 23, 2018 4:52:12 PM
 *
 * </pre>
 */

@Component
public class OutputClientFallback extends AbstractFallback implements OutputClient
{
    @Override
    public String output(ItemQueryRequestBean xml)
    {
        logger.error("output fallback");
        return null;
    }

}
