/**
 * Copyright (C) Skywares Information Technology, LTD. 
 * All Rights Reserved.
 *
 * ItemResponse.java created on Jul 11, 2018 1:54:15 PM by Lyon Lu 
 */
package com.study.service.common;

/**
 * <pre>
 * Description:
 * 
 * @author Lyon Lu
 * @date Jul 11, 2018 1:54:15 PM
 *
 * </pre>
 */
public class ItemResponse
{
    private String CompanyCode;
    private String Result;
    private String Remark;
    private Integer TotalSize;
    public String getCompanyCode()
    {
        return CompanyCode;
    }
    public void setCompanyCode(String companyCode)
    {
        CompanyCode = companyCode;
    }
    public String getResult()
    {
        return Result;
    }
    public void setResult(String result)
    {
        Result = result;
    }
    public String getRemark()
    {
        return Remark;
    }
    public void setRemark(String remark)
    {
        Remark = remark;
    }
    public Integer getTotalSize()
    {
        return TotalSize;
    }
    public void setTotalSize(Integer totalSize)
    {
        TotalSize = totalSize;
    }
}
