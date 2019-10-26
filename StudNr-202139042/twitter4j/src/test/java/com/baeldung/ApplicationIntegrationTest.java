package com.baeldung;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import twitter4j.TwitterException;

public class ApplicationIntegrationTest {

	/**
	 * In order run this jUnit test you need to configure your API details in the twitter4j.properties
	 */
	
	String tweet = "@AdhLecturer 202139042 ADH project";
	String user_name ="AdhLecturer";
	
	@Test
	public void givenText_updateStatus() throws TwitterException {
		String text = Application.createTweet(tweet);
		assertEquals(tweet, text);
	}
	
	@Test
	public void givenCredential_fetchStatus() throws TwitterException {
		List<String> statuses = Application.getTimeLine();
		List<String> expectedStatuses = new ArrayList<String>();
		expectedStatuses.add(tweet);
		assertEquals(expectedStatuses, statuses);
	}
	
	@Test
	public void givenRecipientNameAndMessage_sendDirectMessage() throws TwitterException {
		String msg = Application.sendDirectMessage(user_name, tweet);
		assertEquals(msg, tweet);
	}
	
}
