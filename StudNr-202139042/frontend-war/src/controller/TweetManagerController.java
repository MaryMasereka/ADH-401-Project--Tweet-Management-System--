 /** package controller;
import java.util.ArrayList;

import java.util.List;

import javax.ejb.EJB;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import model.TweetManager;
import service.TweetManagerEJB;




@ManagedBean(name = "tweetmanagercontroller")
@SessionScoped
public class TweetManagerController {
	

    @EJB
    private TweetManagerEJB tweetManagerEJB;
    
  	@ManagedProperty(value="#{tweetmanager}")
    private TweetManager tweetmanager;
  	
  	 private List<TweetManager> employeeList = new ArrayList<>();

	
    public String addNew() {
    
    	//tweetManagerEJB.addNew( tweetmanager.getEntity());
      //  employeeList = employeeEJB.findEmployees();
    return "";
    }


	public TweetManagerEJB getTweetManagerEJB() {
		return tweetManagerEJB;
	}


	public void setTweetManagerEJB(TweetManagerEJB tweetManagerEJB) {
		this.tweetManagerEJB = tweetManagerEJB;
	}


	public TweetManager getTweetmanager() {
		return tweetmanager;
	}


	public void setTweetmanager(TweetManager tweetmanager) {
		this.tweetmanager = tweetmanager;
	}


	public List<TweetManager> getEmployeeList() {
		return employeeList;
	}


	public void setEmployeeList(List<TweetManager> employeeList) {
		this.employeeList = employeeList;
	}


	

}
**/