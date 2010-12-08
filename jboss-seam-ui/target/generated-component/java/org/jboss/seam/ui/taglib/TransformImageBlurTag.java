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
import org.jboss.seam.ui.component.html.HtmlTransformImageBlur;

public class TransformImageBlurTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 		 		 		 	  			  		  	  
		/*
		 * radius
		 * The radius of the blur (essentially the ammount of blur)
		 */
		private ValueExpression _radius;
		/**
		 * The radius of the blur (essentially the ammount of blur)
		 * Setter for radius
		 * @param radius - new value
		 */
		 public void setRadius( ValueExpression  __radius ){
			this._radius = __radius;
	     }
	  
	 	 		 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		 		 		 		    this._radius = null;
	 		 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlTransformImageBlur comp = (HtmlTransformImageBlur) component;
    		 			 
						if (this._radius != null) {
				if (this._radius.isLiteralText()) {
					try {
												
						java.lang.String __radius = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._radius.getExpressionString(), 
											java.lang.String.class);
					
												comp.setRadius(__radius);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("radius", this._radius);
				}
			}
					      }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "org.jboss.seam.ui.graphicImage.TransformImageBlur";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return null;
			}

}
