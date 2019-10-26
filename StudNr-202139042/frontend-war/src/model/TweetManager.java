package model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import entities.TweetManagerEntity;


@ManagedBean(name = "tweetmanager")
@SessionScoped

public class TweetManager implements Serializable {
private static final long serialVersionUID = 1L;
private int id;
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}

private String user_name;
private String tweetBody;



public String getUser_name() {
	return user_name;
}


public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
public String getTweetBody() {
	return tweetBody;
}
public void setTweetBody(String tweetBody) {
	this.tweetBody = tweetBody;
}

public TweetManagerEntity getEntity() {
	TweetManagerEntity  tweetManagerEntity = new TweetManagerEntity();
	tweetManagerEntity.setTweetBody(tweetBody);
	tweetManagerEntity.setUser_name(user_name);
	return tweetManagerEntity;
	
}

}
