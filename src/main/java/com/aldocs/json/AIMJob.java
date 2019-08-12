package com.aldocs.json;

import java.io.Serializable;

import lombok.Data;

@Data
public class AIMJob implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String JobName;

	private String env;

	
}
