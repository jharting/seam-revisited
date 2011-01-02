/**
 * GENERATED FILE - DO NOT EDIT
 *
 */
package org.jboss.seam.ui.taglib;

import org.jboss.seam.ui.util.cdk.UIComponentTagBase ;
import java.lang.Double ;
import javax.el.ValueExpression ;
import java.lang.String ;
import java.lang.Integer ;

import javax.el.ELException;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.el.MethodExpression;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;
import javax.el.ValueExpression;
import org.richfaces.webapp.taglib.MethodBindingMethodExpressionAdaptor;
import org.richfaces.webapp.taglib.ValueBindingValueExpressionAdaptor;
import org.jboss.seam.ui.component.html.HtmlTransformImageSize;

public class TransformImageSizeTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 		 		 	  			  		  	  
		/*
		 * factor
		 * Change the size of the image by a fraction. If factor is specified, height, width and maintainRatio should not be specified
		 */
		private ValueExpression _factor;
		/**
		 * Change the size of the image by a fraction. If factor is specified, height, width and maintainRatio should not be specified
		 * Setter for factor
		 * @param factor - new value
		 */
		 public void setFactor( ValueExpression  __factor ){
			this._factor = __factor;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * height
		 * The new height of the image
		 */
		private ValueExpression _height;
		/**
		 * The new height of the image
		 * Setter for height
		 * @param height - new value
		 */
		 public void setHeight( ValueExpression  __height ){
			this._height = __height;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * maintainRatio
		 * If true, don't alter the ratio of the image. In this case only height or width should be specificed.
		 */
		private ValueExpression _maintainRatio;
		/**
		 * If true, don't alter the ratio of the image. In this case only height or width should be specificed.
		 * Setter for maintainRatio
		 * @param maintainRatio - new value
		 */
		 public void setMaintainRatio( ValueExpression  __maintainRatio ){
			this._maintainRatio = __maintainRatio;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * width
		 * The new width of the image
		 */
		private ValueExpression _width;
		/**
		 * The new width of the image
		 * Setter for width
		 * @param width - new value
		 */
		 public void setWidth( ValueExpression  __width ){
			this._width = __width;
	     }
	  
	 	 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		 		 		    this._factor = null;
	 		 		    this._height = null;
	 		 		 		    this._maintainRatio = null;
	 		 		 		    this._width = null;
	 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlTransformImageSize comp = (HtmlTransformImageSize) component;
   		 			 
						if (this._factor != null) {
				if (this._factor.isLiteralText()) {
					try {
												
						java.lang.Double __factor = (java.lang.Double) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._factor.getExpressionString(), 
											java.lang.Double.class);
					
												comp.setFactor(__factor);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("factor", this._factor);
				}
			}
					   		 			 
						if (this._height != null) {
				if (this._height.isLiteralText()) {
					try {
												
						java.lang.Integer __height = (java.lang.Integer) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._height.getExpressionString(), 
											java.lang.Integer.class);
					
												comp.setHeight(__height);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("height", this._height);
				}
			}
					    		 			 
						if (this._maintainRatio != null) {
				if (this._maintainRatio.isLiteralText()) {
					try {
												
						Boolean __maintainRatio = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._maintainRatio.getExpressionString(), 
											Boolean.class);
					
												comp.setMaintainRatio(__maintainRatio.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("maintainRatio", this._maintainRatio);
				}
			}
					    		 			 
						if (this._width != null) {
				if (this._width.isLiteralText()) {
					try {
												
						java.lang.Integer __width = (java.lang.Integer) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._width.getExpressionString(), 
											java.lang.Integer.class);
					
												comp.setWidth(__width);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("width", this._width);
				}
			}
					     }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "org.jboss.seam.ui.graphicImage.TransformImageSize";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return null;
			}

}
