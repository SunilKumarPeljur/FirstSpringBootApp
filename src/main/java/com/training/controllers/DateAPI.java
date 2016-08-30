/**
 * 
 */
package com.training.controllers;

import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 *
 */
@RestController
public class DateAPI {

	@RequestMapping(value="getDate", produces=MediaType.TEXT_PLAIN_VALUE)
	public String getDate() {
		return (new Date()).toString();
	}
}
