/*
 * Copyright 2011-2015 PrimeFaces Extensions
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * $Id$
 */

package com.verdin.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
//import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.PrimeFaces;
import org.primefaces.extensions.model.dynaform.DynaFormControl;
import org.primefaces.extensions.model.dynaform.DynaFormLabel;
import org.primefaces.extensions.model.dynaform.DynaFormModel;
import org.primefaces.extensions.model.dynaform.DynaFormRow;

import com.verdin.jsf.model.BookProperty;
import org.jboss.logging.Logger;

/**
 * DynaFormController
 *
 * @author Oleg Varaksin / last modified by $Author$
 * @version $Revision$
 */
//@ManagedBean
//@ViewScoped

@Named
//@ViewScoped
@ApplicationScoped
public class DynaFormController implements Serializable {

    private static final long serialVersionUID = 20120423L;
	 static Logger logger = Logger.getLogger(DynaFormController.class);


    private DynaFormModel model;
    private BookProperty bookProperty;

    private static List<SelectItem> LANGUAGES = new ArrayList<SelectItem>();
    
    static List<BookProperty> bookProperties2 = new ArrayList<BookProperty>();

    @PostConstruct
    protected void initialize() {
        model = new DynaFormModel();
        
        bookProperty = new BookProperty("TKDN", false);
        
        // add rows, labels and editable controls
        // set relationship between label and editable controls to support outputLabel with "for" attribute

        // 1. row
        DynaFormRow row = model.createRegularRow();

        DynaFormLabel label11 = row.addLabel("Author");
        DynaFormControl control12 = row.addControl(new BookProperty("Author", true), "input");
        label11.setForControl(control12);

        DynaFormLabel label13 = row.addLabel("ISBN");
        DynaFormControl control14 = row.addControl(new BookProperty("ISBN", true), "input");
        label13.setForControl(control14);

        // 2. row
        row = model.createRegularRow();

        DynaFormLabel label21 = row.addLabel("Title");
        DynaFormControl control22 = row.addControl(new BookProperty("Title", false), "input", 3, 1);
        label21.setForControl(control22);

        // 3. row
        row = model.createRegularRow();

        DynaFormLabel label31 = row.addLabel("Publisher");
        DynaFormControl control32 = row.addControl(new BookProperty("Publisher", false), "input");
        label31.setForControl(control32);

        DynaFormLabel label33 = row.addLabel("Published on");
        DynaFormControl control34 = row.addControl(new BookProperty("Published on", false), "calendar");
        label33.setForControl(control34);

        // 4. row
        row = model.createRegularRow();

        DynaFormLabel label41 = row.addLabel("Language");
        DynaFormControl control42 = row.addControl(new BookProperty("Language", false), "select");
        label41.setForControl(control42);

        DynaFormLabel label43 = row.addLabel("Description", 1, 2);
        DynaFormControl control44 = row.addControl(new BookProperty("Description", false), "textarea", 1, 2);
        label43.setForControl(control44);

        // 5. row
        row = model.createRegularRow();

        DynaFormLabel label51 = row.addLabel("Rating");
        DynaFormControl control52 = row.addControl(new BookProperty("Rating", 3, true), "rating");
        label51.setForControl(control52);
        
    }

    public DynaFormModel getModel() {
    	
		logger.info("getModel get invoked");
		

        return model;
    }

    public List<BookProperty> getBookProperties() {
    	
        if (model == null) {
            return null;
        }
       
        List<BookProperty> bookProperties = new ArrayList<BookProperty>();
        
        for (DynaFormControl dynaFormControl : model.getControls()) {
        	
        	 if (dynaFormControl.getData() instanceof BookProperty) {
             	
                bookProperties.add((BookProperty) dynaFormControl.getData());

                // inventoryProperties.add((InventoryProperty) dynaFormControl.getData());
             }      
        	 
        }
        
         
        return bookProperties;
    }

    
    public void doList() {
    	
    	 logger.info("DoList ... size="+  bookProperties2.size());
             
    	for (BookProperty b:  bookProperties2 ) {
               // b.getName();
               // b.getFormattedValue();
               // b.getValue();
                
                logger.info("DoList " + b.toString());

    	}
         
        
    }
    
    public BookProperty getBookProperty() {
        return bookProperty;
    }
    
    public void setBookProperty(BookProperty bookProperty) {
        this.bookProperty = bookProperty;
    }
    
    public String submitForm() {
    	
		logger.info("submitForm get invoked");

	
       FacesMessage.Severity sev = FacesContext.getCurrentInstance().getMaximumSeverity();
      
       boolean hasErrors = (sev != null) && (FacesMessage.SEVERITY_ERROR.compareTo(sev) >= 0);
       
       logger.info("hasErrors ... "+ hasErrors);

       PrimeFaces.current().ajax().addCallbackParam("isValid", !hasErrors);

       logger.info("PrimeFaces.current().ajax().addCallbackParam() called ");
		
       
       submitForm2() ;
       
       
       return null;
       
      }
       
    public void submitForm2() {
    	
    	logger.info("submitForm get invoked");
    	
		try {
		
		 //your code 

		    List<DynaFormControl> controls = model.getControls();
		    
		    logger.info("controls = model.getControls() ... "+   controls.size() );
		    
		    for (DynaFormControl control : controls) {
		    	
		    	logger.info("control = "+ control.toString() );
		    	
		        if(control.getData() instanceof BookProperty) {
		        	
		        	//logger.info("control.getData() instanceof  BookProperty" );
		        			        	
		            BookProperty b = (BookProperty) control.getData();
		            
		            //use the object   
		            
		            if (b != null) {
		            	
		            	bookProperties2.add(b);
		            
		            	//logger.info("submitForm  " + b.getName() +" "+ b.getValue().toString());  //NullPointerException
		            	logger.info("submitForm ... " + b.toString() +" name="+ b.getName() +" Object="+ b.getValue()   );// b.getFormattedValue());
		            	
		            }		            
		        }
		    }    
	    
		} catch (Exception e) {
			
			logger.error(e);
						
			e.printStackTrace();
			//logger.error(e.fillInStackTrace());
			
			logger.error(e.getCause());
			
		}
		
    }

    public List<SelectItem> getLanguages() {
        if (LANGUAGES.isEmpty()) {
            LANGUAGES.add(new SelectItem("en", "English"));
            LANGUAGES.add(new SelectItem("de", "German"));
            LANGUAGES.add(new SelectItem("ru", "Russian"));
            LANGUAGES.add(new SelectItem("tr", "Turkish"));
        }

        return LANGUAGES;
    }
}
