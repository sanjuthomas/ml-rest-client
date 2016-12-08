package org.sanju.ml.rest.client;

import java.util.List;

import org.sanju.ml.dto.QuoteRequest;

/**
 *
 * @author Sanju Thomas
 *
 */
public interface QuoteService {

	void save(QuoteRequest quoteRequest);
	QuoteRequest find(String clientId, String accountId, String quoteId);
	List<QuoteRequest> find(String clientId, String accountId);
	List<QuoteRequest> find(String clientId);
	void delete(String clientId, String accountId, String quoteId);

}
