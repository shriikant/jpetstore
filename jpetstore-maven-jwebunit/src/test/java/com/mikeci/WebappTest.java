package com.mikeci;

import net.sourceforge.jwebunit.junit.WebTestCase;


public class WebappTest extends WebTestCase {
	

	public void setUp() throws Exception{
		super.setUp();
		setBaseUrl("http://localhost:8080/jpetstore");
	}

	public void testCallIndexPage() throws Exception {
		beginAt("/");
		assertTitleEquals("JPetStore Demo");
	}
}
