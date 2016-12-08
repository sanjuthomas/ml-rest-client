package org.sanju.ml.dto;

/**
 *
 * @author Sanju Thomas
 *
 */
public class QuoteRequest {

	public QuoteRequest() {
	}

	public QuoteRequest(final String id, final String symbol, final int quantity, final Client client) {
		this.id = id;
		this.symbol = symbol;
		this.quantity = quantity;
		this.client = client;
	}

	private String id;
	private String symbol;
	private int quantity;
	private Client client;

	public Client getClient() {
		return this.client;
	}

	public void setClient(final Client client) {
		this.client = client;
	}

	public String getId() {
		return this.id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(final String symbol) {
		this.symbol = symbol;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(final int quantity) {
		this.quantity = quantity;
	}

	public String uri() {
		return uri(this.client.getId(), this.client.getAccount().getId(), this.getId());
	}

	public static String uri(final String clientId, final String accountId, final String quoteId){
		final StringBuilder builder = new StringBuilder();
		builder.append("/");
		builder.append(clientId);
		builder.append("/");
		builder.append(accountId);
		builder.append("/");
		builder.append(quoteId);
		builder.append(".xml");
		return builder.toString();
	}

}
