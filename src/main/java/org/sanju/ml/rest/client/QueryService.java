package org.sanju.ml.rest.client;

import java.util.List;

/**
 *
 * @author Sanju Thomas
 *
 */
public interface QueryService {

	Object findOne(String key, String value);
	List<Object> find(String key, String value);
	List<Object> query(String query);

}
