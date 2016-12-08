package org.sanju.ml.rest.client;

import org.sanju.ml.rest.Payload;

/**
 *
 * @author Sanju Thomas
 *
 */
public interface DocumentService {

	Object get(String uri, Class<?> returnType);
	String save(Payload<?> payload);
	void delete(String uri);

}
