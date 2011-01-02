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
import org.jboss.seam.ui.component.html.HtmlValidateAll;

public class ValidateAllTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 		 		 		 		 	  			  		  	  
		/*
		 * validatorsAdded
		 * validatorsAdded
		 */
		private ValueExpression _validatorsAdded;
		/**
		 * validatorsAdded
		 * Setter for validatorsAdded
		 * @param validatorsAdded - new value
		 */
		 public void setValidatorsAdded( ValueExpression  __validatorsAdded ){
			this._validatorsAdded = __validatorsAdded;
	     }
	  
	 	 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		 		 		 		 		    this._validatorsAdded = null;
	 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlValidateAll comp = (HtmlValidateAll) component;
     		 			 
						if (this._validatorsAdded != null) {
				if (this._validatorsAdded.isLiteralText()) {
					try {
												
						Boolean __validatorsAdded = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._validatorsAdded.getExpressionString(), 
											Boolean.class);
					
												comp.setValidatorsAdded(__validatorsAdded.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("validatorsAdded", this._validatorsAdded);
				}
			}
					     }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "org.jboss.seam.ui.ValidateAll";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return "org.jboss.seam.ui.ValidateAllRenderer";
			}

}
