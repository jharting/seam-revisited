/**
 * GENERATED FILE - DO NOT EDIT
 *
 */
package org.jboss.seam.ui.taglib;

import javax.faces.convert.Converter ;
import org.jboss.seam.ui.util.cdk.UIComponentTagBase ;
import java.lang.Object ;
import javax.el.ValueExpression ;
import java.lang.String ;
import javax.el.MethodExpression ;
import javax.faces.el.MethodBinding ;

import javax.el.ELException;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.el.MethodExpression;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;
import javax.el.ValueExpression;
import org.richfaces.webapp.taglib.MethodBindingMethodExpressionAdaptor;
import org.richfaces.webapp.taglib.ValueBindingValueExpressionAdaptor;
import org.jboss.seam.ui.component.html.HtmlDownload;

public class DownloadTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 	  	  	  
		/*
		 * action
		 * action
		 */
		private MethodExpression _action;
		/**
		 * action
		 * Setter for action
		 * @param action - new value
		 */
		 public void setAction( MethodExpression  __action ){
			this._action = __action;
	     }
	  
	 	 		 	  	  	  
		/*
		 * actionExpression
		 * actionExpression
		 */
		private MethodExpression _actionExpression;
		/**
		 * actionExpression
		 * Setter for actionExpression
		 * @param actionExpression - new value
		 */
		 public void setActionExpression( MethodExpression  __actionExpression ){
			this._actionExpression = __actionExpression;
	     }
	  
	 	 		 	  	  	  
		/*
		 * actionListener
		 * actionListener
		 */
		private MethodExpression _actionListener;
		/**
		 * actionListener
		 * Setter for actionListener
		 * @param actionListener - new value
		 */
		 public void setActionListener( MethodExpression  __actionListener ){
			this._actionListener = __actionListener;
	     }
	  
	 	 		 		 		 	  			  		  	  
		/*
		 * conversationName
		 * conversationName
		 */
		private ValueExpression _conversationName;
		/**
		 * conversationName
		 * Setter for conversationName
		 * @param conversationName - new value
		 */
		 public void setConversationName( ValueExpression  __conversationName ){
			this._conversationName = __conversationName;
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
		 * disabled
		 * disabled
		 */
		private ValueExpression _disabled;
		/**
		 * disabled
		 * Setter for disabled
		 * @param disabled - new value
		 */
		 public void setDisabled( ValueExpression  __disabled ){
			this._disabled = __disabled;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * fragment
		 * fragment
		 */
		private ValueExpression _fragment;
		/**
		 * fragment
		 * Setter for fragment
		 * @param fragment - new value
		 */
		 public void setFragment( ValueExpression  __fragment ){
			this._fragment = __fragment;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * immediate
		 * immediate
		 */
		private ValueExpression _immediate;
		/**
		 * immediate
		 * Setter for immediate
		 * @param immediate - new value
		 */
		 public void setImmediate( ValueExpression  __immediate ){
			this._immediate = __immediate;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * includePageParams
		 * includePageParams
		 */
		private ValueExpression _includePageParams;
		/**
		 * includePageParams
		 * Setter for includePageParams
		 * @param includePageParams - new value
		 */
		 public void setIncludePageParams( ValueExpression  __includePageParams ){
			this._includePageParams = __includePageParams;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * pageflow
		 * pageflow
		 */
		private ValueExpression _pageflow;
		/**
		 * pageflow
		 * Setter for pageflow
		 * @param pageflow - new value
		 */
		 public void setPageflow( ValueExpression  __pageflow ){
			this._pageflow = __pageflow;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * propagation
		 * propagation
		 */
		private ValueExpression _propagation;
		/**
		 * propagation
		 * Setter for propagation
		 * @param propagation - new value
		 */
		 public void setPropagation( ValueExpression  __propagation ){
			this._propagation = __propagation;
	     }
	  
	 	 		 		 		 	  			  		  	  
		/*
		 * src
		 * Source xhtml file that acts as resource holder
		 */
		private ValueExpression _src;
		/**
		 * Source xhtml file that acts as resource holder
		 * Setter for src
		 * @param src - new value
		 */
		 public void setSrc( ValueExpression  __src ){
			this._src = __src;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * style
		 * CSS style rules to be applied to the component
		 */
		private ValueExpression _style;
		/**
		 * CSS style rules to be applied to the component
		 * Setter for style
		 * @param style - new value
		 */
		 public void setStyle( ValueExpression  __style ){
			this._style = __style;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * styleClass
		 * Assigns one or more CSS class names to the component. Corresponds to the HTML "class" attribute.
		 */
		private ValueExpression _styleClass;
		/**
		 * Assigns one or more CSS class names to the component. Corresponds to the HTML "class" attribute.
		 * Setter for styleClass
		 * @param styleClass - new value
		 */
		 public void setStyleClass( ValueExpression  __styleClass ){
			this._styleClass = __styleClass;
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
	  
	 	 		 	  			  		  	  
		/*
		 * view
		 * view
		 */
		private ValueExpression _view;
		/**
		 * view
		 * Setter for view
		 * @param view - new value
		 */
		 public void setView( ValueExpression  __view ){
			this._view = __view;
	     }
	  
	 	 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		    this._action = null;
	 		 		    this._actionExpression = null;
	 		 		    this._actionListener = null;
	 		 		 		 		    this._conversationName = null;
	 		 		    this._converter = null;
	 		 		    this._disabled = null;
	 		 		 		    this._fragment = null;
	 		 		 		    this._immediate = null;
	 		 		    this._includePageParams = null;
	 		 		 		    this._pageflow = null;
	 		 		 		    this._propagation = null;
	 		 		 		 		    this._src = null;
	 		 		    this._style = null;
	 		 		    this._styleClass = null;
	 		 		 		    this._value = null;
	 		 		    this._view = null;
	 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlDownload comp = (HtmlDownload) component;
 		 			setActionProperty(comp, this._action);
		   		 			//Do nothing. Use 'action' instead
		   		 			setActionListenerProperty(comp, this._actionListener);
		     		 			 
						if (this._conversationName != null) {
				if (this._conversationName.isLiteralText()) {
					try {
												
						java.lang.String __conversationName = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._conversationName.getExpressionString(), 
											java.lang.String.class);
					
												comp.setConversationName(__conversationName);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("conversationName", this._conversationName);
				}
			}
					   		 			setConverterProperty(comp, this._converter);
		   		 			 
						if (this._disabled != null) {
				if (this._disabled.isLiteralText()) {
					try {
												
						Boolean __disabled = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._disabled.getExpressionString(), 
											Boolean.class);
					
												comp.setDisabled(__disabled.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("disabled", this._disabled);
				}
			}
					    		 			 
						if (this._fragment != null) {
				if (this._fragment.isLiteralText()) {
					try {
												
						java.lang.String __fragment = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._fragment.getExpressionString(), 
											java.lang.String.class);
					
												comp.setFragment(__fragment);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("fragment", this._fragment);
				}
			}
					    		 			 
						if (this._immediate != null) {
				if (this._immediate.isLiteralText()) {
					try {
												
						Boolean __immediate = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._immediate.getExpressionString(), 
											Boolean.class);
					
												comp.setImmediate(__immediate.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("immediate", this._immediate);
				}
			}
					   		 			 
						if (this._includePageParams != null) {
				if (this._includePageParams.isLiteralText()) {
					try {
												
						Boolean __includePageParams = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._includePageParams.getExpressionString(), 
											Boolean.class);
					
												comp.setIncludePageParams(__includePageParams.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("includePageParams", this._includePageParams);
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
					    		 			 
						if (this._propagation != null) {
				if (this._propagation.isLiteralText()) {
					try {
												
						java.lang.String __propagation = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._propagation.getExpressionString(), 
											java.lang.String.class);
					
												comp.setPropagation(__propagation);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("propagation", this._propagation);
				}
			}
					     		 			 
						if (this._src != null) {
				if (this._src.isLiteralText()) {
					try {
												
						java.lang.String __src = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._src.getExpressionString(), 
											java.lang.String.class);
					
												comp.setSrc(__src);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("src", this._src);
				}
			}
					   		 			 
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
					   		 			 
						if (this._view != null) {
				if (this._view.isLiteralText()) {
					try {
												
						java.lang.String __view = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._view.getExpressionString(), 
											java.lang.String.class);
					
												comp.setView(__view);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("view", this._view);
				}
			}
					     }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "org.jboss.seam.ui.Download";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return "org.jboss.seam.ui.DownloadRenderer";
			}

}
