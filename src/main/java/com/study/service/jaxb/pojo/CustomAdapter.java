/**
 * Copyright (C) Skywares Information Technology, LTD. 
 * All Rights Reserved.
 *
 * CustomAdapter.java created on Jul 17, 2018 1:57:21 PM by Lyon Lu 
 */
package com.study.service.jaxb.pojo;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * <pre>
 * Description:
 * 
 * @author Lyon Lu
 * @date Jul 17, 2018 1:57:21 PM
 *
 * </pre>
 */
public class CustomAdapter extends XmlAdapter<String, Object>
{

    @Override
    public Object unmarshal(String v) throws Exception
    {
        System.out.println("unmarshal" + v);
        return v;
    }

    @Override
    public String marshal(Object v) throws Exception
    {
        System.out.println("marshal" + v);
        return v.toString();
    }

}
