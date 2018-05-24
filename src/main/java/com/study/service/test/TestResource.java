package com.study.service.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
