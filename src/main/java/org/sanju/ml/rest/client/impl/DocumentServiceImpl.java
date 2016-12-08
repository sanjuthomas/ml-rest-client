package org.sanju.ml.rest.client.impl;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.methods.HttpPut;
import org.apache.http.util.EntityUtils;
import org.sanju.ml.RequestBuilder;
import org.sanju.ml.RequestProcessor;
import org.sanju.ml.rest.Payload;
import org.sanju.ml.rest.client.DocumentService;

/**
 *
 * @author Sanju Thomas
 *
 */
public class DocumentServiceImpl implements DocumentService{


	@Override
	public Object get(final String uri, final Class<?> returnType) {
		return null;
	}

	@Override
	public String save(final Payload<?> payload) throws IOException, URISyntaxException {

		final HttpPut httpPut = RequestBuilder.put(payload);
		return EntityUtils.toString(RequestProcessor.process(httpPut).getEntity());
	}

	@Override
	public void delete(final String uri) {

	}

}
