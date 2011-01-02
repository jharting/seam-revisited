/**
 * GENERATED FILE - DO NOT EDIT
 *
 */
package org.jboss.seam.ui.taglib;

import javax.faces.component.UIComponent ;
import javax.faces.convert.Converter ;
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
import org.jboss.seam.ui.component.html.HtmlToken;

public class TokenTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 	  			  		  	  
		/*
		 * allowMultiplePosts
		 * A flag indicating whether the form can be submitted multiple times with the same signature (i.e., token).
		 */
		private ValueExpression _allowMultiplePosts;
		/**
		 * A flag indicating whether the form can be submitted multiple times with the same signature (i.e., token).
		 * Setter for allowMultiplePosts
		 * @param allowMultiplePosts - new value
		 */
		 public void setAllowMultiplePosts( ValueExpression  __allowMultiplePosts ){
			this._allowMultiplePosts = __allowMultiplePosts;
	     }
	  
	 	 		 		 		 		 	  			  		  	  
		/*
		 * converter
		 * converter
		 */
		private ValueExpression _converter;
		/**
		 * converter
		 * Setter for converter
		 * @param converter - new value
		 */
		 public void setConverter( ValueExpression  __converter ){
			this._converter = __converter;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * enableCookieNotice
		 * A flag indicating whether a notice should be presented to the user if cookies are disabled.
		 */
		private ValueExpression _enableCookieNotice;
		/**
		 * A flag indicating whether a notice should be presented to the user if cookies are disabled.
		 * Setter for enableCookieNotice
		 * @param enableCookieNotice - new value
		 */
		 public void setEnableCookieNotice( ValueExpression  __enableCookieNotice ){
			this._enableCookieNotice = __enableCookieNotice;
	     }
	  
	 	 		 		 		 		 		 		 	  			  		  	  
		/*
		 * requireSession
		 * A flag indicating whether the session id should be tied into the secure token.
		 */
		private ValueExpression _requireSession;
		/**
		 * A flag indicating whether the session id should be tied into the secure token.
		 * Setter for requireSession
		 * @param requireSession - new value
		 */
		 public void setRequireSession( ValueExpression  __requireSession ){
			this._requireSession = __requireSession;
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
	  
	 	 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		    this._allowMultiplePosts = null;
	 		 		 		 		 		    this._converter = null;
	 		 		    this._enableCookieNotice = null;
	 		 		 		 		 		 		 		    this._requireSession = null;
	 		 		    this._value = null;
	 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlToken comp = (HtmlToken) component;
 		 			 
						if (this._allowMultiplePosts != null) {
				if (this._allowMultiplePosts.isLiteralText()) {
					try {
												
						Boolean __allowMultiplePosts = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._allowMultiplePosts.getExpressionString(), 
											Boolean.class);
					
												comp.setAllowMultiplePosts(__allowMultiplePosts.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("allowMultiplePosts", this._allowMultiplePosts);
				}
			}
					      		 			setConverterProperty(comp, this._converter);
		   		 			 
						if (this._enableCookieNotice != null) {
				if (this._enableCookieNotice.isLiteralText()) {
					try {
												
						Boolean __enableCookieNotice = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._enableCookieNotice.getExpressionString(), 
											Boolean.class);
					
												comp.setEnableCookieNotice(__enableCookieNotice.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("enableCookieNotice", this._enableCookieNotice);
				}
			}
					        		 			 
						if (this._requireSession != null) {
				if (this._requireSession.isLiteralText()) {
					try {
												
						Boolean __requireSession = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._requireSession.getExpressionString(), 
											Boolean.class);
					
												comp.setRequireSession(__requireSession.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("requireSession", this._requireSession);
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
		return "org.jboss.seam.ui.Token";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return "org.jboss.seam.ui.TokenRenderer";
			}

}
