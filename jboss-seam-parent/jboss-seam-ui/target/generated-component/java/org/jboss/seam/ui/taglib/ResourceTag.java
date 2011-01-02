/**
 * GENERATED FILE - DO NOT EDIT
 *
 */
package org.jboss.seam.ui.taglib;

import org.jboss.seam.ui.util.cdk.UIComponentTagBase ;
import java.lang.Object ;
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
import org.jboss.seam.ui.component.html.HtmlResource;

public class ResourceTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 		 	  			  		  	  
		/*
		 * contentType
		 * Content-type of given data
		 */
		private ValueExpression _contentType;
		/**
		 * Content-type of given data
		 * Setter for contentType
		 * @param contentType - new value
		 */
		 public void setContentType( ValueExpression  __contentType ){
			this._contentType = __contentType;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * data
		 * Inputstream, File or byte[].
		 */
		private ValueExpression _data;
		/**
		 * Inputstream, File or byte[].
		 * Setter for data
		 * @param data - new value
		 */
		 public void setData( ValueExpression  __data ){
			this._data = __data;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * disposition
		 * Content-Disposition for file (default: inline)
		 */
		private ValueExpression _disposition;
		/**
		 * Content-Disposition for file (default: inline)
		 * Setter for disposition
		 * @param disposition - new value
		 */
		 public void setDisposition( ValueExpression  __disposition ){
			this._disposition = __disposition;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * fileName
		 * file name to send to browser (default: name of view)
		 */
		private ValueExpression _fileName;
		/**
		 * file name to send to browser (default: name of view)
		 * Setter for fileName
		 * @param fileName - new value
		 */
		 public void setFileName( ValueExpression  __fileName ){
			this._fileName = __fileName;
	     }
	  
	 	 		 		 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		 		    this._contentType = null;
	 		 		    this._data = null;
	 		 		    this._disposition = null;
	 		 		 		    this._fileName = null;
	 		 		 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlResource comp = (HtmlResource) component;
  		 			 
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
					   		 			 
						if (this._data != null) {
				if (this._data.isLiteralText()) {
					try {
												
						java.lang.Object __data = (java.lang.Object) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._data.getExpressionString(), 
											java.lang.Object.class);
					
												comp.setData(__data);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("data", this._data);
				}
			}
					   		 			 
						if (this._disposition != null) {
				if (this._disposition.isLiteralText()) {
					try {
												
						java.lang.String __disposition = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._disposition.getExpressionString(), 
											java.lang.String.class);
					
												comp.setDisposition(__disposition);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("disposition", this._disposition);
				}
			}
					    		 			 
						if (this._fileName != null) {
				if (this._fileName.isLiteralText()) {
					try {
												
						java.lang.String __fileName = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._fileName.getExpressionString(), 
											java.lang.String.class);
					
												comp.setFileName(__fileName);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("fileName", this._fileName);
				}
			}
					       }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "org.jboss.seam.ui.Resource";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return "org.jboss.seam.ui.ResourceRenderer";
			}

}
