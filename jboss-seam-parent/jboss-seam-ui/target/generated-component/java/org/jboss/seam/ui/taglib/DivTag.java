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
import org.jboss.seam.ui.component.html.HtmlDiv;

public class DivTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 		 		 		 		 	  			  		  	  
		/*
		 * style
		 * CSS style(s) is/are to be applied when this component is rendered
		 */
		private ValueExpression _style;
		/**
		 * CSS style(s) is/are to be applied when this component is rendered
		 * Setter for style
		 * @param style - new value
		 */
		 public void setStyle( ValueExpression  __style ){
			this._style = __style;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * styleClass
		 * Corresponds to the HTML class attribute
		 */
		private ValueExpression _styleClass;
		/**
		 * Corresponds to the HTML class attribute
		 * Setter for styleClass
		 * @param styleClass - new value
		 */
		 public void setStyleClass( ValueExpression  __styleClass ){
			this._styleClass = __styleClass;
	     }
	  
	 	 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		 		 		 		 		    this._style = null;
	 		 		    this._styleClass = null;
	 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlDiv comp = (HtmlDiv) component;
     		 			 
						if (this._style != null) {
				if (this._style.isLiteralText()) {
					try {
												
						java.lang.String __style = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._style.getExpressionString(), 
											java.lang.String.class);
					
												comp.setStyle(__style);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("style", this._style);
				}
			}
					   		 			 
						if (this._styleClass != null) {
				if (this._styleClass.isLiteralText()) {
					try {
												
						java.lang.String __styleClass = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._styleClass.getExpressionString(), 
											java.lang.String.class);
					
												comp.setStyleClass(__styleClass);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("styleClass", this._styleClass);
				}
			}
					     }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "org.jboss.seam.ui.Div";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return "org.jboss.seam.ui.DivRenderer";
			}

}
