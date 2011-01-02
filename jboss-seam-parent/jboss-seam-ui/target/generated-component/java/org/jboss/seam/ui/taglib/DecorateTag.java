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
import org.jboss.seam.ui.component.html.HtmlDecorate;

public class DecorateTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 		 	  			  		  	  
		/*
		 * element
		 * the element to enclose the template used to decorate the input field.
			             By default, the template is enclosed with a div element.
		 */
		private String _element;
		/**
		 * the element to enclose the template used to decorate the input field.
			             By default, the template is enclosed with a div element.
		 * Setter for element
		 * @param element - new value
		 */
		 public void setElement( String  __element ){
			this._element = __element;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * enclose
		 * if true, the template used to decorate the input field is
			             enclosed by the element specified with the "element"
			             attribute. By default this is a div element.
		 */
		private String _enclose;
		/**
		 * if true, the template used to decorate the input field is
			             enclosed by the element specified with the "element"
			             attribute. By default this is a div element.
		 * Setter for enclose
		 * @param enclose - new value
		 */
		 public void setEnclose( String  __enclose ){
			this._enclose = __enclose;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * for
		 * Id of the input field to decorate
		 */
		private String _for;
		/**
		 * Id of the input field to decorate
		 * Setter for for
		 * @param for - new value
		 */
		 public void setFor( String  __for ){
			this._for = __for;
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
		 * template
		 * XHTML template to use to decorate the input field
		 */
		private ValueExpression _template;
		/**
		 * XHTML template to use to decorate the input field
		 * Setter for template
		 * @param template - new value
		 */
		 public void setTemplate( ValueExpression  __template ){
			this._template = __template;
	     }
	  
	 	 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		 		    this._element = null;
	 		 		    this._enclose = null;
	 		 		 		    this._for = null;
	 		 		 		 		 		    this._style = null;
	 		 		    this._styleClass = null;
	 		 		    this._template = null;
	 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlDecorate comp = (HtmlDecorate) component;
  		 			 
											if (this._element != null) {
					comp.setElement(this._element);
				}
									   		 			 
												Boolean __enclose = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._enclose, 
											Boolean.class);
					comp.setEnclose(__enclose.booleanValue());						
						
									    		 			 
											if (this._for != null) {
					comp.setFor(this._for);
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
					   		 			 
						if (this._template != null) {
				if (this._template.isLiteralText()) {
					try {
												
						java.lang.String __template = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._template.getExpressionString(), 
											java.lang.String.class);
					
												comp.setTemplate(__template);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("template", this._template);
				}
			}
					     }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "org.jboss.seam.ui.Decorate";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return "org.jboss.seam.ui.DecorateRenderer";
			}

}
