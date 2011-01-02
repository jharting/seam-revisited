/**
 * GENERATED FILE - DO NOT EDIT
 *
 */
package org.jboss.seam.ui.taglib;

import org.jboss.seam.ui.util.cdk.UIComponentTagBase ;
import javax.el.ValueExpression ;
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
import org.jboss.seam.ui.component.html.HtmlEqualityValidator;

public class EqualityValidatorTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 		 		 	  			  		  	  
		/*
		 * for
		 * Id of component to validate against
		 */
		private ValueExpression _for;
		/**
		 * Id of component to validate against
		 * Setter for for
		 * @param for - new value
		 */
		 public void setFor( ValueExpression  __for ){
			this._for = __for;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * message
		 * Error message to show
		 */
		private ValueExpression _message;
		/**
		 * Error message to show
		 * Setter for message
		 * @param message - new value
		 */
		 public void setMessage( ValueExpression  __message ){
			this._message = __message;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * messageId
		 * Message id to use on failure
		 */
		private ValueExpression _messageId;
		/**
		 * Message id to use on failure
		 * Setter for messageId
		 * @param messageId - new value
		 */
		 public void setMessageId( ValueExpression  __messageId ){
			this._messageId = __messageId;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * operator
		 * Operation to use.
		 */
		private ValueExpression _operator;
		/**
		 * Operation to use.
		 * Setter for operator
		 * @param operator - new value
		 */
		 public void setOperator( ValueExpression  __operator ){
			this._operator = __operator;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * required
		 * True if a value is required for the filed to validate (default:true)
		 */
		private ValueExpression _required;
		/**
		 * True if a value is required for the filed to validate (default:true)
		 * Setter for required
		 * @param required - new value
		 */
		 public void setRequired( ValueExpression  __required ){
			this._required = __required;
	     }
	  
	 	 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		 		 		    this._for = null;
	 		 		 		    this._message = null;
	 		 		    this._messageId = null;
	 		 		    this._operator = null;
	 		 		 		    this._required = null;
	 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlEqualityValidator comp = (HtmlEqualityValidator) component;
   		 			 
						if (this._for != null) {
				if (this._for.isLiteralText()) {
					try {
												
						java.lang.String __for = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._for.getExpressionString(), 
											java.lang.String.class);
					
												comp.setFor(__for);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("for", this._for);
				}
			}
					    		 			 
						if (this._message != null) {
				if (this._message.isLiteralText()) {
					try {
												
						java.lang.String __message = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._message.getExpressionString(), 
											java.lang.String.class);
					
												comp.setMessage(__message);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("message", this._message);
				}
			}
					   		 			 
						if (this._messageId != null) {
				if (this._messageId.isLiteralText()) {
					try {
												
						java.lang.String __messageId = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._messageId.getExpressionString(), 
											java.lang.String.class);
					
												comp.setMessageId(__messageId);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("messageId", this._messageId);
				}
			}
					   		 			 
						if (this._operator != null) {
				if (this._operator.isLiteralText()) {
					try {
												
						java.lang.String __operator = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._operator.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOperator(__operator);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("operator", this._operator);
				}
			}
					    		 			 
						if (this._required != null) {
				if (this._required.isLiteralText()) {
					try {
												
						Boolean __required = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._required.getExpressionString(), 
											Boolean.class);
					
												comp.setRequired(__required.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("required", this._required);
				}
			}
					     }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "org.jboss.seam.ui.EqualityValidator";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return "org.jboss.seam.ui.EqualityValidatorRenderer";
			}

}
