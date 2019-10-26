package service;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Test;
import model.TweetManager;
@Path("/tweet")
public class TweetManagerService{
	
	Client client = ClientBuilder.newClient();


@POST
	@Path("/add")
public Response addUser(
	
	@FormParam("username") String user_name,
	@FormParam("tweetBody") String tweetBody) {
	TweetManager tweet = new TweetManager();
	tweet.setTweetBody(tweetBody);
	tweet.setUser_name(user_name);
	

	return Response.status(200)
		.entity(" Product added successfuly!<br> Id: "+user_name+"<br> Name: " + user_name+"<br> Price: "+user_name)
		.build();
	
       //Response response = client.target(tweet ).request().post(Entity.xml(tweet));
   // Assert.assertEquals(201, response.getStatus());
   // response.close();
	}
}