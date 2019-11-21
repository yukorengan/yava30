package com.verdin.jsf.bean;

import java.time.LocalTime;

import javax.inject.Named;
//import javax.faces.bean.ManagedBean;

//@ManagedBean
@Named
public class ExampleBean {
  public String getTime() {
      return LocalTime.now().toString();
  }
}