package service;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import entities.TweetManagerEntity;



@Stateless
@Path("/tweet")

public class TweetManagerEJB  {

	@PersistenceContext
	private EntityManager em;

	public TweetManagerEJB() {
		// TODO Auto-generated constructor stub
	}



	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public TweetManagerEntity getTweet(int id) {
		TweetManagerEntity tweetManagerEntity = em.getReference(TweetManagerEntity.class, id);

		return tweetManagerEntity;

	}

	
	
	
	 public static TweetManagerEntity  entity2domain(TweetManagerEntity entity)
	   {
		 TweetManagerEntity tweet= new TweetManagerEntity();
		 tweet.setId(entity.getId());
		 tweet.setTweetBody(entity.getTweetBody());
		 tweet.setUser_name(entity.getUser_name());
		
	      return tweet;
	   }

	//@path("add")
	public Response addNew(TweetManagerEntity tweetManager, UriInfo uriInfo) {
		TweetManagerEntity entity = new TweetManagerEntity();
		//domain2entity(entity, tweetManager);
		em.persist(entity);
		em.flush();

		System.out.println("Created customer " + entity.getId());
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(tweetManager.getId()));
		
		return Response.created(builder.build()).build();

	}


}
