package com.verdin.jsf.showcase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.jboss.logging.Logger;

//no need of CDI
//@ManagedBean
@Named
@ViewScoped
public class Test implements Serializable {
	
	static final long serialVersionUID = 12239l;
	
	static Logger logger = Logger.getLogger(Test.class);

	
  private List<String> list;
  
  private boolean editMode = false;

  public Test() {

  }

  @PostConstruct
  private void init(){
	  logger.info("init()  ... ");
	  generate();
	  
	  logger.info("init()  ... done");
  }
  
 
  public boolean isEditMode() {
	return editMode;
}

public void setEditMode(boolean editMode) {
	this.editMode = editMode;
}

public List<String> getList() {
      return list;
  }

  public void setList(List<String> list) {
	  logger.info("setList(List<String> list)");
	  
	  for (String s: list) {
		  logger.info(s);
	  }

	  this.list = list;
  }

  public void clear() {
	  logger.info("clear  ...  list = new ArrayList<String>();");
      list = new ArrayList<String>();
  }

  public void update() {
      list = new ArrayList<String>();
      list.add("Item 11");
      list.add("Item 12");     
      list.add("Item 13");    
      
      
      logger.info("updatte  ...  list = new ArrayList<String>(); list.size() "+ list.size());
      
  }
  
  
  
  private void generate() {
	  list = new ArrayList<String>();
      list.add("Item 1");
      list.add("Item 2");     
      list.add("Item 3");    
  }
  
  
  

  //method for testing purposes
  public void submit() {
      //in real life web apps, you should log the messages, don't use System.out
	  
      //System.out.println("Showing actual values of list attribute.");
      logger.info("Showing actual values of list attribute.");
      
      for(String s : list) {
         // System.out.println(s);
          logger.info(s);
          
      }
  }
}