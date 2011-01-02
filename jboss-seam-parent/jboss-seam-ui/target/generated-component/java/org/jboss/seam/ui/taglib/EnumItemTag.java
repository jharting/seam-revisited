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
import org.jboss.seam.ui.component.html.HtmlEnumItem;

public class EnumItemTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 		 	  			  		  	  
		/*
		 * enumValue
		 * the string representation of the enum value.
		 */
		private ValueExpression _enumValue;
		/**
		 * the string representation of the enum value.
		 * Setter for enumValue
		 * @param enumValue - new value
		 */
		 public void setEnumValue( ValueExpression  __enumValue ){
			this._enumValue = __enumValue;
	     }
	  
	 	 		 		 		 	  			  		  	  
		/*
		 * itemDescription
		 * A description used by tools only
		 */
		private ValueExpression _itemDescription;
		/**
		 * A description used by tools only
		 * Setter for itemDescription
		 * @param itemDescription - new value
		 */
		 public void setItemDescription( ValueExpression  __itemDescription ){
			this._itemDescription = __itemDescription;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * itemDisabled
		 * If "true", this component isn't saved during state saving
		 */
		private ValueExpression _itemDisabled;
		/**
		 * If "true", this component isn't saved during state saving
		 * Setter for itemDisabled
		 * @param itemDisabled - new value
		 */
		 public void setItemDisabled( ValueExpression  __itemDisabled ){
			this._itemDisabled = __itemDisabled;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * itemEscaped
		 * itemEscaped
		 */
		private ValueExpression _itemEscaped;
		/**
		 * itemEscaped
		 * Setter for itemEscaped
		 * @param itemEscaped - new value
		 */
		 public void setItemEscaped( ValueExpression  __itemEscaped ){
			this._itemEscaped = __itemEscaped;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * itemLabel
		 * A text shown by the item
		 */
		private ValueExpression _itemLabel;
		/**
		 * A text shown by the item
		 * Setter for itemLabel
		 * @param itemLabel - new value
		 */
		 public void setItemLabel( ValueExpression  __itemLabel ){
			this._itemLabel = __itemLabel;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * itemValue
		 * Item value, which is passed to the server as a request parameter
		 */
		private ValueExpression _itemValue;
		/**
		 * Item value, which is passed to the server as a request parameter
		 * Setter for itemValue
		 * @param itemValue - new value
		 */
		 public void setItemValue( ValueExpression  __itemValue ){
			this._itemValue = __itemValue;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * label
		 * the label to be used when rendering the SelectItem.
		 */
		private ValueExpression _label;
		/**
		 * the label to be used when rendering the SelectItem.
		 * Setter for label
		 * @param label - new value
		 */
		 public void setLabel( ValueExpression  __label ){
			this._label = __label;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * value
		 * A value reference pointing at a javax.faces.model.SelectItem
            instance
		 */
		private ValueExpression _value;
		/**
		 * A value reference pointing at a javax.faces.model.SelectItem
            instance
		 * Setter for value
		 * @param value - new value
		 */
		 public void setValue( ValueExpression  __value ){
			this._value = __value;
	     }
	  
	 	 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		 		    this._enumValue = null;
	 		 		 		 		    this._itemDescription = null;
	 		 		    this._itemDisabled = null;
	 		 		    this._itemEscaped = null;
	 		 		    this._itemLabel = null;
	 		 		    this._itemValue = null;
	 		 		    this._label = null;
	 		 		 		    this._value = null;
	 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlEnumItem comp = (HtmlEnumItem) component;
  		 			 
						if (this._enumValue != null) {
				if (this._enumValue.isLiteralText()) {
					try {
												
						java.lang.String __enumValue = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._enumValue.getExpressionString(), 
											java.lang.String.class);
					
												comp.setEnumValue(__enumValue);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("enumValue", this._enumValue);
				}
			}
					     		 			 
						if (this._itemDescription != null) {
				if (this._itemDescription.isLiteralText()) {
					try {
												
						java.lang.String __itemDescription = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._itemDescription.getExpressionString(), 
											java.lang.String.class);
					
												comp.setItemDescription(__itemDescription);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("itemDescription", this._itemDescription);
				}
			}
					   		 			 
						if (this._itemDisabled != null) {
				if (this._itemDisabled.isLiteralText()) {
					try {
												
						Boolean __itemDisabled = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._itemDisabled.getExpressionString(), 
											Boolean.class);
					
												comp.setItemDisabled(__itemDisabled.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("itemDisabled", this._itemDisabled);
				}
			}
					   		 			 
						if (this._itemEscaped != null) {
				if (this._itemEscaped.isLiteralText()) {
					try {
												
						Boolean __itemEscaped = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._itemEscaped.getExpressionString(), 
											Boolean.class);
					
												comp.setItemEscaped(__itemEscaped.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("itemEscaped", this._itemEscaped);
				}
			}
					   		 			 
						if (this._itemLabel != null) {
				if (this._itemLabel.isLiteralText()) {
					try {
												
						java.lang.String __itemLabel = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._itemLabel.getExpressionString(), 
											java.lang.String.class);
					
												comp.setItemLabel(__itemLabel);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("itemLabel", this._itemLabel);
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
					     }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "org.jboss.seam.ui.EnumItem";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return null;
			}

}
