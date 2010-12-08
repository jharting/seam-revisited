/**
 * GENERATED FILE - DO NOT EDIT
 *
 */
package org.jboss.seam.ui.taglib;

import javax.faces.component.UIComponent ;
import org.jboss.seam.ui.util.cdk.UIComponentTagBase ;
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
import org.jboss.seam.ui.component.html.HtmlMessage;

public class MessageTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 		 	  			  		  	  
		/*
		 * dir
		 * dir
		 */
		private ValueExpression _dir;
		/**
		 * dir
		 * Setter for dir
		 * @param dir - new value
		 */
		 public void setDir( ValueExpression  __dir ){
			this._dir = __dir;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * errorClass
		 * errorClass
		 */
		private ValueExpression _errorClass;
		/**
		 * errorClass
		 * Setter for errorClass
		 * @param errorClass - new value
		 */
		 public void setErrorClass( ValueExpression  __errorClass ){
			this._errorClass = __errorClass;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * errorStyle
		 * errorStyle
		 */
		private ValueExpression _errorStyle;
		/**
		 * errorStyle
		 * Setter for errorStyle
		 * @param errorStyle - new value
		 */
		 public void setErrorStyle( ValueExpression  __errorStyle ){
			this._errorStyle = __errorStyle;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * fatalClass
		 * fatalClass
		 */
		private ValueExpression _fatalClass;
		/**
		 * fatalClass
		 * Setter for fatalClass
		 * @param fatalClass - new value
		 */
		 public void setFatalClass( ValueExpression  __fatalClass ){
			this._fatalClass = __fatalClass;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * fatalStyle
		 * fatalStyle
		 */
		private ValueExpression _fatalStyle;
		/**
		 * fatalStyle
		 * Setter for fatalStyle
		 * @param fatalStyle - new value
		 */
		 public void setFatalStyle( ValueExpression  __fatalStyle ){
			this._fatalStyle = __fatalStyle;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * for
		 * A client identifier of the component for which this component
            represents associated message(s)
		 */
		private ValueExpression _for;
		/**
		 * A client identifier of the component for which this component
            represents associated message(s)
		 * Setter for for
		 * @param for - new value
		 */
		 public void setFor( ValueExpression  __for ){
			this._for = __for;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * infoClass
		 * infoClass
		 */
		private ValueExpression _infoClass;
		/**
		 * infoClass
		 * Setter for infoClass
		 * @param infoClass - new value
		 */
		 public void setInfoClass( ValueExpression  __infoClass ){
			this._infoClass = __infoClass;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * infoStyle
		 * infoStyle
		 */
		private ValueExpression _infoStyle;
		/**
		 * infoStyle
		 * Setter for infoStyle
		 * @param infoStyle - new value
		 */
		 public void setInfoStyle( ValueExpression  __infoStyle ){
			this._infoStyle = __infoStyle;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * lang
		 * lang
		 */
		private ValueExpression _lang;
		/**
		 * lang
		 * Setter for lang
		 * @param lang - new value
		 */
		 public void setLang( ValueExpression  __lang ){
			this._lang = __lang;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * showDetail
		 * Indicates whether the detail of associated message(s) should
            be displayed. Default is: false
		 */
		private ValueExpression _showDetail;
		/**
		 * Indicates whether the detail of associated message(s) should
            be displayed. Default is: false
		 * Setter for showDetail
		 * @param showDetail - new value
		 */
		 public void setShowDetail( ValueExpression  __showDetail ){
			this._showDetail = __showDetail;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * showSummary
		 * Indicates whether the summary of associated message(s)
            should be displayed. Default is: true
		 */
		private ValueExpression _showSummary;
		/**
		 * Indicates whether the summary of associated message(s)
            should be displayed. Default is: true
		 * Setter for showSummary
		 * @param showSummary - new value
		 */
		 public void setShowSummary( ValueExpression  __showSummary ){
			this._showSummary = __showSummary;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * style
		 * style
		 */
		private ValueExpression _style;
		/**
		 * style
		 * Setter for style
		 * @param style - new value
		 */
		 public void setStyle( ValueExpression  __style ){
			this._style = __style;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * styleClass
		 * styleClass
		 */
		private ValueExpression _styleClass;
		/**
		 * styleClass
		 * Setter for styleClass
		 * @param styleClass - new value
		 */
		 public void setStyleClass( ValueExpression  __styleClass ){
			this._styleClass = __styleClass;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * title
		 * title
		 */
		private ValueExpression _title;
		/**
		 * title
		 * Setter for title
		 * @param title - new value
		 */
		 public void setTitle( ValueExpression  __title ){
			this._title = __title;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * tooltip
		 * tooltip
		 */
		private ValueExpression _tooltip;
		/**
		 * tooltip
		 * Setter for tooltip
		 * @param tooltip - new value
		 */
		 public void setTooltip( ValueExpression  __tooltip ){
			this._tooltip = __tooltip;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * warnClass
		 * warnClass
		 */
		private ValueExpression _warnClass;
		/**
		 * warnClass
		 * Setter for warnClass
		 * @param warnClass - new value
		 */
		 public void setWarnClass( ValueExpression  __warnClass ){
			this._warnClass = __warnClass;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * warnStyle
		 * warnStyle
		 */
		private ValueExpression _warnStyle;
		/**
		 * warnStyle
		 * Setter for warnStyle
		 * @param warnStyle - new value
		 */
		 public void setWarnStyle( ValueExpression  __warnStyle ){
			this._warnStyle = __warnStyle;
	     }
	  
	 	 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		 		    this._dir = null;
	 		 		    this._errorClass = null;
	 		 		    this._errorStyle = null;
	 		 		 		    this._fatalClass = null;
	 		 		    this._fatalStyle = null;
	 		 		    this._for = null;
	 		 		 		    this._infoClass = null;
	 		 		    this._infoStyle = null;
	 		 		    this._lang = null;
	 		 		 		    this._showDetail = null;
	 		 		    this._showSummary = null;
	 		 		    this._style = null;
	 		 		    this._styleClass = null;
	 		 		    this._title = null;
	 		 		    this._tooltip = null;
	 		 		    this._warnClass = null;
	 		 		    this._warnStyle = null;
	 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlMessage comp = (HtmlMessage) component;
  		 			 
						if (this._dir != null) {
				if (this._dir.isLiteralText()) {
					try {
												
						java.lang.String __dir = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._dir.getExpressionString(), 
											java.lang.String.class);
					
												comp.setDir(__dir);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("dir", this._dir);
				}
			}
					   		 			 
						if (this._errorClass != null) {
				if (this._errorClass.isLiteralText()) {
					try {
												
						java.lang.String __errorClass = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._errorClass.getExpressionString(), 
											java.lang.String.class);
					
												comp.setErrorClass(__errorClass);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("errorClass", this._errorClass);
				}
			}
					   		 			 
						if (this._errorStyle != null) {
				if (this._errorStyle.isLiteralText()) {
					try {
												
						java.lang.String __errorStyle = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._errorStyle.getExpressionString(), 
											java.lang.String.class);
					
												comp.setErrorStyle(__errorStyle);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("errorStyle", this._errorStyle);
				}
			}
					    		 			 
						if (this._fatalClass != null) {
				if (this._fatalClass.isLiteralText()) {
					try {
												
						java.lang.String __fatalClass = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._fatalClass.getExpressionString(), 
											java.lang.String.class);
					
												comp.setFatalClass(__fatalClass);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("fatalClass", this._fatalClass);
				}
			}
					   		 			 
						if (this._fatalStyle != null) {
				if (this._fatalStyle.isLiteralText()) {
					try {
												
						java.lang.String __fatalStyle = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._fatalStyle.getExpressionString(), 
											java.lang.String.class);
					
												comp.setFatalStyle(__fatalStyle);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("fatalStyle", this._fatalStyle);
				}
			}
					   		 			 
						if (this._for != null) {
				if (this._for.isLiteralText()) {
					try {
												
						java.lang.String __for = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._for.getExpressionString(), 
											java.lang.String.class);
					
												comp.setFor(__for);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("for", this._for);
				}
			}
					    		 			 
						if (this._infoClass != null) {
				if (this._infoClass.isLiteralText()) {
					try {
												
						java.lang.String __infoClass = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._infoClass.getExpressionString(), 
											java.lang.String.class);
					
												comp.setInfoClass(__infoClass);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("infoClass", this._infoClass);
				}
			}
					   		 			 
						if (this._infoStyle != null) {
				if (this._infoStyle.isLiteralText()) {
					try {
												
						java.lang.String __infoStyle = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._infoStyle.getExpressionString(), 
											java.lang.String.class);
					
												comp.setInfoStyle(__infoStyle);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("infoStyle", this._infoStyle);
				}
			}
					   		 			 
						if (this._lang != null) {
				if (this._lang.isLiteralText()) {
					try {
												
						java.lang.String __lang = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._lang.getExpressionString(), 
											java.lang.String.class);
					
												comp.setLang(__lang);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("lang", this._lang);
				}
			}
					    		 			 
						if (this._showDetail != null) {
				if (this._showDetail.isLiteralText()) {
					try {
												
						Boolean __showDetail = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._showDetail.getExpressionString(), 
											Boolean.class);
					
												comp.setShowDetail(__showDetail.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("showDetail", this._showDetail);
				}
			}
					   		 			 
						if (this._showSummary != null) {
				if (this._showSummary.isLiteralText()) {
					try {
												
						Boolean __showSummary = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._showSummary.getExpressionString(), 
											Boolean.class);
					
												comp.setShowSummary(__showSummary.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("showSummary", this._showSummary);
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
					   		 			 
						if (this._title != null) {
				if (this._title.isLiteralText()) {
					try {
												
						java.lang.String __title = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._title.getExpressionString(), 
											java.lang.String.class);
					
												comp.setTitle(__title);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("title", this._title);
				}
			}
					   		 			 
						if (this._tooltip != null) {
				if (this._tooltip.isLiteralText()) {
					try {
												
						Boolean __tooltip = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._tooltip.getExpressionString(), 
											Boolean.class);
					
												comp.setTooltip(__tooltip.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("tooltip", this._tooltip);
				}
			}
					   		 			 
						if (this._warnClass != null) {
				if (this._warnClass.isLiteralText()) {
					try {
												
						java.lang.String __warnClass = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._warnClass.getExpressionString(), 
											java.lang.String.class);
					
												comp.setWarnClass(__warnClass);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("warnClass", this._warnClass);
				}
			}
					   		 			 
						if (this._warnStyle != null) {
				if (this._warnStyle.isLiteralText()) {
					try {
												
						java.lang.String __warnStyle = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._warnStyle.getExpressionString(), 
											java.lang.String.class);
					
												comp.setWarnStyle(__warnStyle);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("warnStyle", this._warnStyle);
				}
			}
					     }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "org.jboss.seam.ui.Message";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return null;
			}

}
