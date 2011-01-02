/**
 * GENERATED FILE - DO NOT EDIT
 *
 */
package org.jboss.seam.ui.taglib;

import javax.faces.component.UIComponent ;
import org.jboss.seam.ui.util.cdk.UIComponentTagBase ;
import org.jboss.seam.cache.CacheProvider ;
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
import org.jboss.seam.ui.component.html.HtmlCache;

public class CacheTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 		 	  			  		  	  
		/*
		 * cacheProvider
		 * The cache provider to use, only needed if you install alter the default cache provider in an application where multiple cache providers are in use
		 */
		private ValueExpression _cacheProvider;
		/**
		 * The cache provider to use, only needed if you install alter the default cache provider in an application where multiple cache providers are in use
		 * Setter for cacheProvider
		 * @param cacheProvider - new value
		 */
		 public void setCacheProvider( ValueExpression  __cacheProvider ){
			this._cacheProvider = __cacheProvider;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * enabled
		 * a value expression that determines if the cache should be used.
		 */
		private ValueExpression _enabled;
		/**
		 * a value expression that determines if the cache should be used.
		 * Setter for enabled
		 * @param enabled - new value
		 */
		 public void setEnabled( ValueExpression  __enabled ){
			this._enabled = __enabled;
	     }
	  
	 	 		 		 		 	  			  		  	  
		/*
		 * key
		 * the key to cache rendered content, often a value expression. For example, if we were caching a page fragment that displays a document, we might use key="Document-#{document.id}".
		 */
		private ValueExpression _key;
		/**
		 * the key to cache rendered content, often a value expression. For example, if we were caching a page fragment that displays a document, we might use key="Document-#{document.id}".
		 * Setter for key
		 * @param key - new value
		 */
		 public void setKey( ValueExpression  __key ){
			this._key = __key;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * region
		 * a cache node to use (different nodes can have different expiry policies).
		 */
		private ValueExpression _region;
		/**
		 * a cache node to use (different nodes can have different expiry policies).
		 * Setter for region
		 * @param region - new value
		 */
		 public void setRegion( ValueExpression  __region ){
			this._region = __region;
	     }
	  
	 	 		 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		 		    this._cacheProvider = null;
	 		 		    this._enabled = null;
	 		 		 		 		    this._key = null;
	 		 		    this._region = null;
	 		 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlCache comp = (HtmlCache) component;
  		 			 				if(null != this._cacheProvider && this._cacheProvider.isLiteralText()){
					throw new IllegalArgumentException("Component org.jboss.seam.ui.Cache with Id " + component.getClientId(getFacesContext()) +" allows only EL expressions for property cacheProvider");
				}
			 
						if (this._cacheProvider != null) {
				if (this._cacheProvider.isLiteralText()) {
					try {
												
						org.jboss.seam.cache.CacheProvider __cacheProvider = (org.jboss.seam.cache.CacheProvider) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._cacheProvider.getExpressionString(), 
											org.jboss.seam.cache.CacheProvider.class);
					
												comp.setCacheProvider(__cacheProvider);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("cacheProvider", this._cacheProvider);
				}
			}
					   		 			 				if(null != this._enabled && this._enabled.isLiteralText()){
					throw new IllegalArgumentException("Component org.jboss.seam.ui.Cache with Id " + component.getClientId(getFacesContext()) +" allows only EL expressions for property enabled");
				}
			 
						if (this._enabled != null) {
				if (this._enabled.isLiteralText()) {
					try {
												
						Boolean __enabled = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._enabled.getExpressionString(), 
											Boolean.class);
					
												comp.setEnabled(__enabled.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("enabled", this._enabled);
				}
			}
					     		 			 
						if (this._key != null) {
				if (this._key.isLiteralText()) {
					try {
												
						java.lang.String __key = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._key.getExpressionString(), 
											java.lang.String.class);
					
												comp.setKey(__key);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("key", this._key);
				}
			}
					   		 			 
						if (this._region != null) {
				if (this._region.isLiteralText()) {
					try {
												
						java.lang.String __region = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._region.getExpressionString(), 
											java.lang.String.class);
					
												comp.setRegion(__region);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("region", this._region);
				}
			}
					      }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "org.jboss.seam.ui.Cache";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return "org.jboss.seam.ui.CacheRenderer";
			}

}
