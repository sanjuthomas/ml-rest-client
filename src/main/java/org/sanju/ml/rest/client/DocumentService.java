package org.sanju.ml.rest.client;

import java.io.IOException;
import java.net.URISyntaxException;

import org.sanju.ml.rest.Payload;

/**
 *
 * @author Sanju Thomas
 *
 */
public interface DocumentService {

	Object get(String uri, Class<?> returnType);
	int save(Payload<?> payload) throws IOException, URISyntaxException;
	void delete(String uri);

}
