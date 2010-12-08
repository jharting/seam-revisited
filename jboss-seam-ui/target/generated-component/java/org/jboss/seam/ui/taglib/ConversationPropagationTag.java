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
import org.jboss.seam.ui.component.html.HtmlConversationPropagation;

public class ConversationPropagationTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 		 		 		 	  			  		  	  
		/*
		 * name
		 * A name of this parameter
		 */
		private ValueExpression _name;
		/**
		 * A name of this parameter
		 * Setter for name
		 * @param name - new value
		 */
		 public void setName( ValueExpression  __name ){
			this._name = __name;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * pageflow
		 * a pageflow definition to begin. (This is only useful when propagation="begin" or propagation="join".)
		 */
		private ValueExpression _pageflow;
		/**
		 * a pageflow definition to begin. (This is only useful when propagation="begin" or propagation="join".)
		 * Setter for pageflow
		 * @param pageflow - new value
		 */
		 public void setPageflow( ValueExpression  __pageflow ){
			this._pageflow = __pageflow;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * type
		 * determines the conversation propagation style: begin, join, nested, none, end or endRoot.
		 */
		private ValueExpression _type;
		/**
		 * determines the conversation propagation style: begin, join, nested, none, end or endRoot.
		 * Setter for type
		 * @param type - new value
		 */
		 public void setType( ValueExpression  __type ){
			this._type = __type;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * value
		 * An initial value or a value binding
		 */
		private ValueExpression _value;
		/**
		 * An initial value or a value binding
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
        		 		 		 		 		    this._name = null;
	 		 		    this._pageflow = null;
	 		 		 		    this._type = null;
	 		 		    this._value = null;
	 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlConversationPropagation comp = (HtmlConversationPropagation) component;
    		 			 
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
					   		 			 
						if (this._pageflow != null) {
				if (this._pageflow.isLiteralText()) {
					try {
												
						java.lang.String __pageflow = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._pageflow.getExpressionString(), 
											java.lang.String.class);
					
												comp.setPageflow(__pageflow);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("pageflow", this._pageflow);
				}
			}
					    		 			 
						if (this._type != null) {
				if (this._type.isLiteralText()) {
					try {
												
						java.lang.String __type = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._type.getExpressionString(), 
											java.lang.String.class);
					
												comp.setType(__type);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("type", this._type);
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
		return "org.jboss.seam.ui.ConversationPropagation";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return "org.jboss.seam.ui.ConversationPropagationRenderer";
			}

}
