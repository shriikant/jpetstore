package org.codehaus.mojo.selenium;

import junit.framework.TestCase;

import com.thoughtworks.selenium.DefaultSelenium;

public class SeleniumExampleTest
    extends TestCase
{
    protected DefaultSelenium createSeleniumClient(String url) throws Exception {
        return new DefaultSelenium("localhost", 4444, "*firefox", url);
    }
    
    public void testSomethingSimple() throws Exception {
        DefaultSelenium selenium = createSeleniumClient("http://localhost:8080/");
        selenium.start();
        selenium.open("jpetstore");
        selenium.waitForPageToLoad("30000");
	Thread.sleep(5000);
        assertEquals("JPetStore Demo", selenium.getTitle());
        selenium.stop();
    }
}
