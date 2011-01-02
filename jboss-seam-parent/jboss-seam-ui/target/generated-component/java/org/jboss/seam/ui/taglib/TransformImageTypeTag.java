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
import org.jboss.seam.ui.component.html.HtmlTransformImageType;

public class TransformImageTypeTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 		 	  			  		  	  
		/*
		 * contentType
		 * The mime type of the output image
		 */
		private ValueExpression _contentType;
		/**
		 * The mime type of the output image
		 * Setter for contentType
		 * @param contentType - new value
		 */
		 public void setContentType( ValueExpression  __contentType ){
			this._contentType = __contentType;
	     }
	  
	 	 		 		 		 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		 		    this._contentType = null;
	 		 		 		 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlTransformImageType comp = (HtmlTransformImageType) component;
  		 			 
						if (this._contentType != null) {
				if (this._contentType.isLiteralText()) {
					try {
												
						java.lang.String __contentType = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._contentType.getExpressionString(), 
											java.lang.String.class);
					
												comp.setContentType(__contentType);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("contentType", this._contentType);
				}
			}
					        }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "org.jboss.seam.ui.graphicImage.TransformImageType";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return null;
			}

}
