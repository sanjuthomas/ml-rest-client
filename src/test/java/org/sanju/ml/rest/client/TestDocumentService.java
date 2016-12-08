package org.sanju.ml.rest.client;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Before;
import org.junit.Test;
import org.sanju.ml.dto.Account;
import org.sanju.ml.dto.Client;
import org.sanju.ml.dto.QuoteRequest;
import org.sanju.ml.rest.Payload;
import org.sanju.ml.rest.client.impl.DocumentServiceImpl;

public class TestDocumentService {

	private DocumentService documentService;
	private Payload<QuoteRequest> payload;

	@Before
	public void setUp(){
		final Account account = new Account("A1");
		final Client client = new Client("C1", account);
		this.documentService = new DocumentServiceImpl();
		this.payload = new Payload<>(new QuoteRequest("Q1", "APPL", 100, client));
	}

	@Test
	public void shouldSave() throws IOException, URISyntaxException{
		System.out.println(this.documentService.save(this.payload));
	}
}
