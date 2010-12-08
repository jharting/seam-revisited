/**
 * GENERATED FILE - DO NOT EDIT
 *
 */
package org.jboss.seam.ui.taglib;

import javax.faces.component.UIComponent ;
import org.jboss.seam.ui.util.cdk.UIComponentTagBase ;
import java.lang.Object ;
import java.lang.Boolean ;
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
import org.jboss.seam.ui.component.html.HtmlSelectItems;

public class SelectItemsTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 		 	  			  		  	  
		/*
		 * disabled
		 * if true the SelectItem will be rendered disabled. Can reference the var variable
		 */
		private ValueExpression _disabled;
		/**
		 * if true the SelectItem will be rendered disabled. Can reference the var variable
		 * Setter for disabled
		 * @param disabled - new value
		 */
		 public void setDisabled( ValueExpression  __disabled ){
			this._disabled = __disabled;
	     }
	  
	 		/**
		 * if true the SelectItem will be rendered disabled. Can reference the var variable
		 * Setter for alias of disabled as itemDisabled
		 * @param disabled - new value
		 */
		 public void setItemDisabled( ValueExpression  __itemDisabled ){
			this.setDisabled(__itemDisabled);
	     }
	 	 		 	  			  		  	  
		/*
		 * escape
		 * if false, characters in the label will not be escaped. Beware that this is a safety issue when the label is in any way derived from input supplied by the application's user. . Can reference the var variable
		 */
		private ValueExpression _escape;
		/**
		 * if false, characters in the label will not be escaped. Beware that this is a safety issue when the label is in any way derived from input supplied by the application's user. . Can reference the var variable
		 * Setter for escape
		 * @param escape - new value
		 */
		 public void setEscape( ValueExpression  __escape ){
			this._escape = __escape;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * hideNoSelectionLabel
		 * if true, the noSelectionLabel will be hidden when a value is selected
		 */
		private ValueExpression _hideNoSelectionLabel;
		/**
		 * if true, the noSelectionLabel will be hidden when a value is selected
		 * Setter for hideNoSelectionLabel
		 * @param hideNoSelectionLabel - new value
		 */
		 public void setHideNoSelectionLabel( ValueExpression  __hideNoSelectionLabel ){
			this._hideNoSelectionLabel = __hideNoSelectionLabel;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * itemValue
		 * Value to return to the server if this option is selected. Optional, by default the var object is used. Can reference the var variable
		 */
		private ValueExpression _itemValue;
		/**
		 * Value to return to the server if this option is selected. Optional, by default the var object is used. Can reference the var variable
		 * Setter for itemValue
		 * @param itemValue - new value
		 */
		 public void setItemValue( ValueExpression  __itemValue ){
			this._itemValue = __itemValue;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * label
		 * the label to be used when rendering the SelectItem. Can reference the var variable
		 */
		private ValueExpression _label;
		/**
		 * the label to be used when rendering the SelectItem. Can reference the var variable
		 * Setter for label
		 * @param label - new value
		 */
		 public void setLabel( ValueExpression  __label ){
			this._label = __label;
	     }
	  
	 		/**
		 * the label to be used when rendering the SelectItem. Can reference the var variable
		 * Setter for alias of label as itemLabel
		 * @param label - new value
		 */
		 public void setItemLabel( ValueExpression  __itemLabel ){
			this.setLabel(__itemLabel);
	     }
	 	 		 	  			  		  	  
		/*
		 * noSelectionLabel
		 * specifies the (optional) label to place at the top of list (if required="true" is also specified then selecting this value will cause a validation error)
		 */
		private ValueExpression _noSelectionLabel;
		/**
		 * specifies the (optional) label to place at the top of list (if required="true" is also specified then selecting this value will cause a validation error)
		 * Setter for noSelectionLabel
		 * @param noSelectionLabel - new value
		 */
		 public void setNoSelectionLabel( ValueExpression  __noSelectionLabel ){
			this._noSelectionLabel = __noSelectionLabel;
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
		 * defines the name of the local variable that holds the current object during iteration
		 */
		private String _var;
		/**
		 * defines the name of the local variable that holds the current object during iteration
		 * Setter for var
		 * @param var - new value
		 */
		 public void setVar( String  __var ){
			this._var = __var;
	     }
	  
	 	 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		 		    this._disabled = null;
	 		 		    this._escape = null;
	 		 		 		    this._hideNoSelectionLabel = null;
	 		 		 		    this._itemValue = null;
	 		 		    this._label = null;
	 		 		    this._noSelectionLabel = null;
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
		HtmlSelectItems comp = (HtmlSelectItems) component;
  		 			 
						if (this._disabled != null) {
				if (this._disabled.isLiteralText()) {
					try {
												
						java.lang.Boolean __disabled = (java.lang.Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._disabled.getExpressionString(), 
											java.lang.Boolean.class);
					
												comp.setDisabled(__disabled);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("disabled", this._disabled);
				}
			}
					   		 			 
						if (this._escape != null) {
				if (this._escape.isLiteralText()) {
					try {
												
						java.lang.Boolean __escape = (java.lang.Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._escape.getExpressionString(), 
											java.lang.Boolean.class);
					
												comp.setEscape(__escape);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("escape", this._escape);
				}
			}
					    		 			 
						if (this._hideNoSelectionLabel != null) {
				if (this._hideNoSelectionLabel.isLiteralText()) {
					try {
												
						java.lang.Boolean __hideNoSelectionLabel = (java.lang.Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._hideNoSelectionLabel.getExpressionString(), 
											java.lang.Boolean.class);
					
												comp.setHideNoSelectionLabel(__hideNoSelectionLabel);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("hideNoSelectionLabel", this._hideNoSelectionLabel);
				}
			}
					    		 			 
						if (this._itemValue != null) {
				if (this._itemValue.isLiteralText()) {
					try {
												
						java.lang.Object __itemValue = (java.lang.Object) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._itemValue.getExpressionString(), 
											java.lang.Object.class);
					
												comp.setItemValue(__itemValue);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("itemValue", this._itemValue);
				}
			}
					   		 			 
						if (this._label != null) {
				if (this._label.isLiteralText()) {
					try {
												
						java.lang.String __label = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._label.getExpressionString(), 
											java.lang.String.class);
					
												comp.setLabel(__label);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("label", this._label);
				}
			}
					   		 			 
						if (this._noSelectionLabel != null) {
				if (this._noSelectionLabel.isLiteralText()) {
					try {
												
						java.lang.String __noSelectionLabel = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._noSelectionLabel.getExpressionString(), 
											java.lang.String.class);
					
												comp.setNoSelectionLabel(__noSelectionLabel);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("noSelectionLabel", this._noSelectionLabel);
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
					comp.setVar(this._var);
				}
									     }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "org.jboss.seam.ui.SelectItems";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return null;
			}

}
