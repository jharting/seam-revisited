/**
 * GENERATED FILE - DO NOT EDIT
 *
 */
package org.jboss.seam.ui.taglib;

import javax.faces.component.UIComponent ;
import org.jboss.seam.ui.util.cdk.UIComponentTagBase ;
import java.lang.Object ;
import java.lang.String ;

import javax.el.ELException;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.el.MethodExpression;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;
import javax.el.ValueExpression;
import org.richfaces.webapp.taglib.MethodBindingMethodExpressionAdaptor;
import org.richfaces.webapp.taglib.ValueBindingValueExpressionAdaptor;
import org.jboss.seam.ui.component.html.HtmlSelection;

public class SelectionTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 		 	  			  		  	  
		/*
		 * dataModel
		 * dataModel
		 */
		private ValueExpression _dataModel;
		/**
		 * dataModel
		 * Setter for dataModel
		 * @param dataModel - new value
		 */
		 public void setDataModel( ValueExpression  __dataModel ){
			this._dataModel = __dataModel;
	     }
	  
	 	 		 		 		 	  			  		  	  
		/*
		 * name
		 * name
		 */
		private ValueExpression _name;
		/**
		 * name
		 * Setter for name
		 * @param name - new value
		 */
		 public void setName( ValueExpression  __name ){
			this._name = __name;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * value
		 * value
		 */
		private ValueExpression _value;
		/**
		 * value
		 * Setter for value
		 * @param value - new value
		 */
		 public void setValue( ValueExpression  __value ){
			this._value = __value;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * var
		 * var
		 */
		private ValueExpression _var;
		/**
		 * var
		 * Setter for var
		 * @param var - new value
		 */
		 public void setVar( ValueExpression  __var ){
			this._var = __var;
	     }
	  
	 	 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		 		    this._dataModel = null;
	 		 		 		 		    this._name = null;
	 		 		 		    this._value = null;
	 		 		    this._var = null;
	 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlSelection comp = (HtmlSelection) component;
  		 			 
						if (this._dataModel != null) {
				if (this._dataModel.isLiteralText()) {
					try {
												
						java.lang.String __dataModel = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._dataModel.getExpressionString(), 
											java.lang.String.class);
					
												comp.setDataModel(__dataModel);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("dataModel", this._dataModel);
				}
			}
					     		 			 
						if (this._name != null) {
				if (this._name.isLiteralText()) {
					try {
												
						java.lang.String __name = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._name.getExpressionString(), 
											java.lang.String.class);
					
												comp.setName(__name);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("name", this._name);
				}
			}
					    		 			 
						if (this._value != null) {
				if (this._value.isLiteralText()) {
					try {
												
						java.lang.Object __value = (java.lang.Object) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._value.getExpressionString(), 
											java.lang.Object.class);
					
												comp.setValue(__value);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("value", this._value);
				}
			}
					   		 			 
						if (this._var != null) {
				if (this._var.isLiteralText()) {
					try {
												
						java.lang.String __var = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._var.getExpressionString(), 
											java.lang.String.class);
					
												comp.setVar(__var);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("var", this._var);
				}
			}
					     }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "org.jboss.seam.ui.Selection";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return null;
			}

}
