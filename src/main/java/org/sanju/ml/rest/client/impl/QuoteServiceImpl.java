package org.sanju.ml.rest.client.impl;

import java.util.List;

import org.sanju.ml.dto.QuoteRequest;
import org.sanju.ml.rest.client.QuoteService;

/**
 *
 * @author Sanju Thomas
 *
 */
public class QuoteServiceImpl extends DocumentServiceImpl implements QuoteService{

	@Override
	public void save(final QuoteRequest quoteRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public QuoteRequest find(final String clientId, final String accountId, final String quoteId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QuoteRequest> find(final String clientId, final String accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QuoteRequest> find(final String clientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(final String clientId, final String accountId, final String quoteId) {
		// TODO Auto-generated method stub

	}

}
