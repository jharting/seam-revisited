/**
 * GENERATED FILE - DO NOT EDIT
 *
 */
package org.jboss.seam.ui.taglib;

import javax.faces.component.UIComponent ;
import javax.faces.convert.Converter ;
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
import org.jboss.seam.ui.component.html.HtmlLabel;

public class LabelTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 	  			  		  	  
		/*
		 * accesskey
		 * This attribute assigns an access key to an element. An access key is a single character from the document character set. Note. Authors should consider the input method of the expected reader when specifying an accesskey
		 */
		private ValueExpression _accesskey;
		/**
		 * This attribute assigns an access key to an element. An access key is a single character from the document character set. Note. Authors should consider the input method of the expected reader when specifying an accesskey
		 * Setter for accesskey
		 * @param accesskey - new value
		 */
		 public void setAccesskey( ValueExpression  __accesskey ){
			this._accesskey = __accesskey;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * converter
		 * Id of Converter to be used or reference to a Converter
		 */
		private ValueExpression _converter;
		/**
		 * Id of Converter to be used or reference to a Converter
		 * Setter for converter
		 * @param converter - new value
		 */
		 public void setConverter( ValueExpression  __converter ){
			this._converter = __converter;
	     }
	  
	 	 		 	  			  		  	  
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
		 * escape
		 * escape
		 */
		private ValueExpression _escape;
		/**
		 * escape
		 * Setter for escape
		 * @param escape - new value
		 */
		 public void setEscape( ValueExpression  __escape ){
			this._escape = __escape;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * for
		 * Id of input component this label is for
		 */
		private ValueExpression _for;
		/**
		 * Id of input component this label is for
		 * Setter for for
		 * @param for - new value
		 */
		 public void setFor( ValueExpression  __for ){
			this._for = __for;
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
		 * onblur
		 * HTML: script expression; an element loses focus either by the pointing device or by tabbing navigation. It may be used with the same elements as onfocus
		 */
		private ValueExpression _onblur;
		/**
		 * HTML: script expression; an element loses focus either by the pointing device or by tabbing navigation. It may be used with the same elements as onfocus
		 * Setter for onblur
		 * @param onblur - new value
		 */
		 public void setOnblur( ValueExpression  __onblur ){
			this._onblur = __onblur;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onclick
		 * onclick
		 */
		private ValueExpression _onclick;
		/**
		 * onclick
		 * Setter for onclick
		 * @param onclick - new value
		 */
		 public void setOnclick( ValueExpression  __onclick ){
			this._onclick = __onclick;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * ondblclick
		 * ondblclick
		 */
		private ValueExpression _ondblclick;
		/**
		 * ondblclick
		 * Setter for ondblclick
		 * @param ondblclick - new value
		 */
		 public void setOndblclick( ValueExpression  __ondblclick ){
			this._ondblclick = __ondblclick;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onfocus
		 * HTML: script expression; the element got the focus
		 */
		private ValueExpression _onfocus;
		/**
		 * HTML: script expression; the element got the focus
		 * Setter for onfocus
		 * @param onfocus - new value
		 */
		 public void setOnfocus( ValueExpression  __onfocus ){
			this._onfocus = __onfocus;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onkeydown
		 * onkeydown
		 */
		private ValueExpression _onkeydown;
		/**
		 * onkeydown
		 * Setter for onkeydown
		 * @param onkeydown - new value
		 */
		 public void setOnkeydown( ValueExpression  __onkeydown ){
			this._onkeydown = __onkeydown;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onkeypress
		 * onkeypress
		 */
		private ValueExpression _onkeypress;
		/**
		 * onkeypress
		 * Setter for onkeypress
		 * @param onkeypress - new value
		 */
		 public void setOnkeypress( ValueExpression  __onkeypress ){
			this._onkeypress = __onkeypress;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onkeyup
		 * onkeyup
		 */
		private ValueExpression _onkeyup;
		/**
		 * onkeyup
		 * Setter for onkeyup
		 * @param onkeyup - new value
		 */
		 public void setOnkeyup( ValueExpression  __onkeyup ){
			this._onkeyup = __onkeyup;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onmousedown
		 * onmousedown
		 */
		private ValueExpression _onmousedown;
		/**
		 * onmousedown
		 * Setter for onmousedown
		 * @param onmousedown - new value
		 */
		 public void setOnmousedown( ValueExpression  __onmousedown ){
			this._onmousedown = __onmousedown;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onmousemove
		 * onmousemove
		 */
		private ValueExpression _onmousemove;
		/**
		 * onmousemove
		 * Setter for onmousemove
		 * @param onmousemove - new value
		 */
		 public void setOnmousemove( ValueExpression  __onmousemove ){
			this._onmousemove = __onmousemove;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onmouseout
		 * onmouseout
		 */
		private ValueExpression _onmouseout;
		/**
		 * onmouseout
		 * Setter for onmouseout
		 * @param onmouseout - new value
		 */
		 public void setOnmouseout( ValueExpression  __onmouseout ){
			this._onmouseout = __onmouseout;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onmouseover
		 * onmouseover
		 */
		private ValueExpression _onmouseover;
		/**
		 * onmouseover
		 * Setter for onmouseover
		 * @param onmouseover - new value
		 */
		 public void setOnmouseover( ValueExpression  __onmouseover ){
			this._onmouseover = __onmouseover;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onmouseup
		 * onmouseup
		 */
		private ValueExpression _onmouseup;
		/**
		 * onmouseup
		 * Setter for onmouseup
		 * @param onmouseup - new value
		 */
		 public void setOnmouseup( ValueExpression  __onmouseup ){
			this._onmouseup = __onmouseup;
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
		 * tabindex
		 * tabindex
		 */
		private ValueExpression _tabindex;
		/**
		 * tabindex
		 * Setter for tabindex
		 * @param tabindex - new value
		 */
		 public void setTabindex( ValueExpression  __tabindex ){
			this._tabindex = __tabindex;
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
		 * value
		 * The current value of this component
		 */
		private ValueExpression _value;
		/**
		 * The current value of this component
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
        		 		    this._accesskey = null;
	 		 		 		    this._converter = null;
	 		 		    this._dir = null;
	 		 		    this._escape = null;
	 		 		 		    this._for = null;
	 		 		 		    this._lang = null;
	 		 		 		    this._onblur = null;
	 		 		    this._onclick = null;
	 		 		    this._ondblclick = null;
	 		 		    this._onfocus = null;
	 		 		    this._onkeydown = null;
	 		 		    this._onkeypress = null;
	 		 		    this._onkeyup = null;
	 		 		    this._onmousedown = null;
	 		 		    this._onmousemove = null;
	 		 		    this._onmouseout = null;
	 		 		    this._onmouseover = null;
	 		 		    this._onmouseup = null;
	 		 		 		    this._style = null;
	 		 		    this._styleClass = null;
	 		 		    this._tabindex = null;
	 		 		    this._title = null;
	 		 		    this._value = null;
	 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlLabel comp = (HtmlLabel) component;
 		 			 
						if (this._accesskey != null) {
				if (this._accesskey.isLiteralText()) {
					try {
												
						java.lang.String __accesskey = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._accesskey.getExpressionString(), 
											java.lang.String.class);
					
												comp.setAccesskey(__accesskey);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("accesskey", this._accesskey);
				}
			}
					    		 			setConverterProperty(comp, this._converter);
		   		 			 
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
					   		 			 
						if (this._escape != null) {
				if (this._escape.isLiteralText()) {
					try {
												
						Boolean __escape = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._escape.getExpressionString(), 
											Boolean.class);
					
												comp.setEscape(__escape.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("escape", this._escape);
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
					    		 			 
						if (this._onblur != null) {
				if (this._onblur.isLiteralText()) {
					try {
												
						java.lang.String __onblur = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onblur.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnblur(__onblur);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onblur", this._onblur);
				}
			}
					   		 			 
						if (this._onclick != null) {
				if (this._onclick.isLiteralText()) {
					try {
												
						java.lang.String __onclick = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onclick.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnclick(__onclick);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onclick", this._onclick);
				}
			}
					   		 			 
						if (this._ondblclick != null) {
				if (this._ondblclick.isLiteralText()) {
					try {
												
						java.lang.String __ondblclick = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._ondblclick.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOndblclick(__ondblclick);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("ondblclick", this._ondblclick);
				}
			}
					   		 			 
						if (this._onfocus != null) {
				if (this._onfocus.isLiteralText()) {
					try {
												
						java.lang.String __onfocus = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onfocus.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnfocus(__onfocus);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onfocus", this._onfocus);
				}
			}
					   		 			 
						if (this._onkeydown != null) {
				if (this._onkeydown.isLiteralText()) {
					try {
												
						java.lang.String __onkeydown = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onkeydown.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnkeydown(__onkeydown);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onkeydown", this._onkeydown);
				}
			}
					   		 			 
						if (this._onkeypress != null) {
				if (this._onkeypress.isLiteralText()) {
					try {
												
						java.lang.String __onkeypress = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onkeypress.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnkeypress(__onkeypress);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onkeypress", this._onkeypress);
				}
			}
					   		 			 
						if (this._onkeyup != null) {
				if (this._onkeyup.isLiteralText()) {
					try {
												
						java.lang.String __onkeyup = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onkeyup.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnkeyup(__onkeyup);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onkeyup", this._onkeyup);
				}
			}
					   		 			 
						if (this._onmousedown != null) {
				if (this._onmousedown.isLiteralText()) {
					try {
												
						java.lang.String __onmousedown = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onmousedown.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnmousedown(__onmousedown);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onmousedown", this._onmousedown);
				}
			}
					   		 			 
						if (this._onmousemove != null) {
				if (this._onmousemove.isLiteralText()) {
					try {
												
						java.lang.String __onmousemove = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onmousemove.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnmousemove(__onmousemove);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onmousemove", this._onmousemove);
				}
			}
					   		 			 
						if (this._onmouseout != null) {
				if (this._onmouseout.isLiteralText()) {
					try {
												
						java.lang.String __onmouseout = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onmouseout.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnmouseout(__onmouseout);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onmouseout", this._onmouseout);
				}
			}
					   		 			 
						if (this._onmouseover != null) {
				if (this._onmouseover.isLiteralText()) {
					try {
												
						java.lang.String __onmouseover = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onmouseover.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnmouseover(__onmouseover);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onmouseover", this._onmouseover);
				}
			}
					   		 			 
						if (this._onmouseup != null) {
				if (this._onmouseup.isLiteralText()) {
					try {
												
						java.lang.String __onmouseup = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onmouseup.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnmouseup(__onmouseup);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onmouseup", this._onmouseup);
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
					   		 			 
						if (this._tabindex != null) {
				if (this._tabindex.isLiteralText()) {
					try {
												
						java.lang.String __tabindex = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._tabindex.getExpressionString(), 
											java.lang.String.class);
					
												comp.setTabindex(__tabindex);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("tabindex", this._tabindex);
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
		return "org.jboss.seam.ui.Label";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return null;
			}

}
