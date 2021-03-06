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

//package org.primefaces.extensions.showcase.controller.dynaform;
package com.verdin.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.PrimeFaces;
import org.primefaces.extensions.model.dynaform.DynaFormControl;
import org.primefaces.extensions.model.dynaform.DynaFormLabel;
import org.primefaces.extensions.model.dynaform.DynaFormModel;
import org.primefaces.extensions.model.dynaform.DynaFormRow;
//import org.primefaces.extensions.showcase.model.dynaform.BookProperty;

import com.verdin.jsf.model.BookProperty;
import org.jboss.logging.Logger;

/**
 * AnotherDynaFormController
 *
 * @author S�bastien Lepage / last modified by $Author$
 * @version $Revision$
 */
/**
This example demonstrates how to use nested model. You can picture it as a table contained in a cell. 
This is very useful when your control is a combination of pe:dynaFormControl. 

Note, XHTML code with pe:dynaForm stays the same, only Java model gets changed. Main steps:

. Create parent model instance: DynaFormModel model = new DynaFormModel();
. Add row, label, control and set relationship as you would do in normal case,
. Create nested model instance: DynaFormModel nestedModel = new DynaFormModel();
. Add row to regular grid: DynaFormRow nestedRow = nestedModel.createRegularRow();
. Add label, control and set relationship as usual,
. Add nested model: nestedRow.addModel(data, type, colspan, rowspan);

 */


//@ManagedBean
//@ViewScoped
@Named
@ViewScoped
public class NestedDynaFormController implements Serializable {

    private static final long serialVersionUID = 20120423L;
    
    static Logger logger = Logger.getLogger(NestedDynaFormController.class);

    private DynaFormModel model;

    @PostConstruct
    protected void initialize() {
        model = new DynaFormModel();

        // add rows, labels and editable controls
        // set relationship between label and editable controls to support outputLabel with "for" attribute

        // 1. regular row
        DynaFormRow row = model.createRegularRow();

        // 1.1 Nested model
        DynaFormModel nestedModel = new DynaFormModel();
        DynaFormRow nestedRow1 = nestedModel.createRegularRow();

        DynaFormLabel label11 = nestedRow1.addLabel("Firstname");
        DynaFormLabel label12 = nestedRow1.addLabel("Lastname");

        nestedRow1 = nestedModel.createRegularRow();
        DynaFormControl control21 = nestedRow1.addControl(new BookProperty("firstname", true), "input");
        DynaFormControl control22 = nestedRow1.addControl(new BookProperty("lastname", true), "input");

        label11.setForControl(control21);
        label12.setForControl(control22);
        
      //  Add nested model: nestedRow.addModel(data, type, colspan, rowspan);
        row.addModel(nestedModel, 2, 1);

       
        // 2. regular row
        row = model.createRegularRow();
        DynaFormLabel label31 = row.addLabel("Date from");

       
        // 2.1 Nested model
        nestedModel = new DynaFormModel();
        DynaFormRow nestedRow2 = nestedModel.createRegularRow();

        DynaFormControl control32 = nestedRow2.addControl(new BookProperty("beginDate", false), "date");
        label31.setForControl(control32);

        DynaFormLabel label33 = nestedRow2.addLabel("till");
        DynaFormControl control34 = nestedRow2.addControl(new BookProperty("endDate", false), "date");
        label33.setForControl(control34);
        
        row.addModel(nestedModel);

        // 2.2 Nested model
        row = model.createRegularRow();
        
        // 2.2 Nested model
        nestedModel = new DynaFormModel();
        DynaFormRow nestedRow3 = nestedModel.createRegularRow();

        DynaFormLabel label36 = nestedRow3.addLabel("Located from");
        DynaFormControl control37 = nestedRow3.addControl(new BookProperty("locationStart", "Lane A", false), "input");
        label36.setForControl(control37);

        DynaFormLabel label38 = nestedRow3.addLabel("To");
        DynaFormControl control39 = nestedRow3.addControl(new BookProperty("locationEnd", "Lane B", false), "input");
        label38.setForControl(control39);

        row.addModel(nestedModel);
    }

    public DynaFormModel getModel() {
        return model;
    }

    public String submitForm() {
    	
    	logger.info("submitForm()");
    	
        FacesMessage.Severity sev = FacesContext.getCurrentInstance().getMaximumSeverity();
        
        boolean hasErrors = sev != null && FacesMessage.SEVERITY_ERROR.compareTo(sev) >= 0;

        PrimeFaces.current().ajax().addCallbackParam("isValid", !hasErrors);
        
        submitForm22();
        
        logger.info("submitForm(), return null!");

        return null;
    }

    public List<BookProperty> getBookProperties() {
        if (model == null) {
            return null;
        }

        List<BookProperty> bookProperties = new ArrayList<BookProperty>();
        
        
        for (DynaFormControl dynaFormControl : model.getControls()) {
        	
            bookProperties.add((BookProperty) dynaFormControl.getData());
            
        }

        return bookProperties;
    }
    
    public void submitForm22() {
    	logger.info("submitForm22()");
        
    	 List<BookProperty> books = new ArrayList<BookProperty>();
         
         for (DynaFormControl dynaFormControl : model.getControls()) {
         	
             books.add((BookProperty) dynaFormControl.getData());
             
         }
         
         
         for (BookProperty  b :  books ) {
          	
           logger.info(b.getName()  +" "+ b.getValue().toString());
             
         }
    	
         logger.info("submitForm22() ... end");
    }
    
    
    
    
}
