package org.sanju.ml.rest;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Sanju Thomas
 *
 */
public class Payload<T>{

	private final Map<String, String> urlParams = new LinkedHashMap<>();
	private T entity;

	public void addUrlParam(final String key, final String value){
		this.urlParams.put(key, value);
	}

	public T getEntity() {
		return this.entity;
	}

	public void setEntity(final T entity) {
		this.entity = entity;
	}

}