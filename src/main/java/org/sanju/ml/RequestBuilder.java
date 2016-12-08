package org.sanju.ml;

import java.net.URISyntaxException;

import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.sanju.ml.rest.Payload;

/**
 *
 * @author Sanju Thomas
 *
 */
public class RequestBuilder {

	public static HttpPut put(final Payload<?> payload) throws URISyntaxException {

		final URIBuilder uriBuilder = MLConfiguration.getURIBuilder();
		uriBuilder.addParameter("uri", payload.getUri());
		final HttpPut request = new HttpPut(uriBuilder.build());
		final StringEntity params = new StringEntity(payload.json(), "UTF-8");
		params.setContentType(payload.getContentType().toString());
		request.setEntity(params);

		return request;
	}

}
