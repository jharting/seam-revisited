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
import org.jboss.seam.ui.component.html.HtmlButton;

public class ButtonTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 	  			  		  	  
		/*
		 * accesskey
		 * This attribute assigns an access key to an element. An access key is a single character from the document character set. Note: Authors should consider the input method of the expected reader when specifying an accesskey
		 */
		private ValueExpression _accesskey;
		/**
		 * This attribute assigns an access key to an element. An access key is a single character from the document character set. Note: Authors should consider the input method of the expected reader when specifying an accesskey
		 * Setter for accesskey
		 * @param accesskey - new value
		 */
		 public void setAccesskey( ValueExpression  __accesskey ){
			this._accesskey = __accesskey;
	     }
	  
	 	 		 	  	  	  
		/*
		 * action
		 * MethodBinding pointing at the application action to be invoked,
            if this UIComponent is activated by you, during the Apply
            Request Values or Invoke Application phase of the request
            processing lifecycle, depending on the value of the immediate
            property
		 */
		private MethodExpression _action;
		/**
		 * MethodBinding pointing at the application action to be invoked,
            if this UIComponent is activated by you, during the Apply
            Request Values or Invoke Application phase of the request
            processing lifecycle, depending on the value of the immediate
            property
		 * Setter for action
		 * @param action - new value
		 */
		 public void setAction( MethodExpression  __action ){
			this._action = __action;
	     }
	  
	 	 		 		 	  	  	  
		/*
		 * actionListener
		 * MethodBinding pointing at method accepting  an ActionEvent with return type void
		 */
		private MethodExpression _actionListener;
		/**
		 * MethodBinding pointing at method accepting  an ActionEvent with return type void
		 * Setter for actionListener
		 * @param actionListener - new value
		 */
		 public void setActionListener( MethodExpression  __actionListener ){
			this._actionListener = __actionListener;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * alt
		 * For a user agents that cannot display images, forms, or applets, this attribute specifies alternate text. The language of the alternate text is specified by the lang attribute
		 */
		private ValueExpression _alt;
		/**
		 * For a user agents that cannot display images, forms, or applets, this attribute specifies alternate text. The language of the alternate text is specified by the lang attribute
		 * Setter for alt
		 * @param alt - new value
		 */
		 public void setAlt( ValueExpression  __alt ){
			this._alt = __alt;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * conversationName
		 * The name of the conversation for natural conversations
		 */
		private ValueExpression _conversationName;
		/**
		 * The name of the conversation for natural conversations
		 * Setter for conversationName
		 * @param conversationName - new value
		 */
		 public void setConversationName( ValueExpression  __conversationName ){
			this._conversationName = __conversationName;
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
		 * Direction indication for text that does not inherit
			directionality. Valid values are "LTR" (left-to-right)
			and "RTL" (right-to-left)
		 */
		private ValueExpression _dir;
		/**
		 * Direction indication for text that does not inherit
			directionality. Valid values are "LTR" (left-to-right)
			and "RTL" (right-to-left)
		 * Setter for dir
		 * @param dir - new value
		 */
		 public void setDir( ValueExpression  __dir ){
			this._dir = __dir;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * disabled
		 * When set for a form control, this boolean attribute disables the control for your input
		 */
		private ValueExpression _disabled;
		/**
		 * When set for a form control, this boolean attribute disables the control for your input
		 * Setter for disabled
		 * @param disabled - new value
		 */
		 public void setDisabled( ValueExpression  __disabled ){
			this._disabled = __disabled;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * fragment
		 * the fragment identifier to link to.
		 */
		private ValueExpression _fragment;
		/**
		 * the fragment identifier to link to.
		 * Setter for fragment
		 * @param fragment - new value
		 */
		 public void setFragment( ValueExpression  __fragment ){
			this._fragment = __fragment;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * image
		 * image
		 */
		private ValueExpression _image;
		/**
		 * image
		 * Setter for image
		 * @param image - new value
		 */
		 public void setImage( ValueExpression  __image ){
			this._image = __image;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * immediate
		 * True means, that the default ActionListener should be executed
            immediately (i.e. during Apply Request Values phase of the
            request processing lifecycle), rather than waiting until the
            Invoke Application phase
		 */
		private ValueExpression _immediate;
		/**
		 * True means, that the default ActionListener should be executed
            immediately (i.e. during Apply Request Values phase of the
            request processing lifecycle), rather than waiting until the
            Invoke Application phase
		 * Setter for immediate
		 * @param immediate - new value
		 */
		 public void setImmediate( ValueExpression  __immediate ){
			this._immediate = __immediate;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * includePageParams
		 * Include page parameters defined in pages.xml when rendering the button
		 */
		private ValueExpression _includePageParams;
		/**
		 * Include page parameters defined in pages.xml when rendering the button
		 * Setter for includePageParams
		 * @param includePageParams - new value
		 */
		 public void setIncludePageParams( ValueExpression  __includePageParams ){
			this._includePageParams = __includePageParams;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * lang
		 * Code describing the language used in the generated markup for this component
		 */
		private ValueExpression _lang;
		/**
		 * Code describing the language used in the generated markup for this component
		 * Setter for lang
		 * @param lang - new value
		 */
		 public void setLang( ValueExpression  __lang ){
			this._lang = __lang;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * onclick
		 * The client-side script method to be called when the element is clicked
		 */
		private ValueExpression _onclick;
		/**
		 * The client-side script method to be called when the element is clicked
		 * Setter for onclick
		 * @param onclick - new value
		 */
		 public void setOnclick( ValueExpression  __onclick ){
			this._onclick = __onclick;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * ondblclick
		 * The client-side script method to be called when the element is double-clicked
		 */
		private ValueExpression _ondblclick;
		/**
		 * The client-side script method to be called when the element is double-clicked
		 * Setter for ondblclick
		 * @param ondblclick - new value
		 */
		 public void setOndblclick( ValueExpression  __ondblclick ){
			this._ondblclick = __ondblclick;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onkeydown
		 * The client-side script method to be called when a key is pressed down over the element
		 */
		private ValueExpression _onkeydown;
		/**
		 * The client-side script method to be called when a key is pressed down over the element
		 * Setter for onkeydown
		 * @param onkeydown - new value
		 */
		 public void setOnkeydown( ValueExpression  __onkeydown ){
			this._onkeydown = __onkeydown;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onkeypress
		 * The client-side script method to be called when a key is pressed over the element and released
		 */
		private ValueExpression _onkeypress;
		/**
		 * The client-side script method to be called when a key is pressed over the element and released
		 * Setter for onkeypress
		 * @param onkeypress - new value
		 */
		 public void setOnkeypress( ValueExpression  __onkeypress ){
			this._onkeypress = __onkeypress;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onkeyup
		 * The client-side script method to be called when a key is released
		 */
		private ValueExpression _onkeyup;
		/**
		 * The client-side script method to be called when a key is released
		 * Setter for onkeyup
		 * @param onkeyup - new value
		 */
		 public void setOnkeyup( ValueExpression  __onkeyup ){
			this._onkeyup = __onkeyup;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onmousedown
		 * The client-side script method to be called when a mouse button is pressed down over the element
		 */
		private ValueExpression _onmousedown;
		/**
		 * The client-side script method to be called when a mouse button is pressed down over the element
		 * Setter for onmousedown
		 * @param onmousedown - new value
		 */
		 public void setOnmousedown( ValueExpression  __onmousedown ){
			this._onmousedown = __onmousedown;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onmousemove
		 * The client-side script method to be called when a pointer is moved within the element
		 */
		private ValueExpression _onmousemove;
		/**
		 * The client-side script method to be called when a pointer is moved within the element
		 * Setter for onmousemove
		 * @param onmousemove - new value
		 */
		 public void setOnmousemove( ValueExpression  __onmousemove ){
			this._onmousemove = __onmousemove;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onmouseout
		 * The client-side script method to be called when a pointer is moved away from the element
		 */
		private ValueExpression _onmouseout;
		/**
		 * The client-side script method to be called when a pointer is moved away from the element
		 * Setter for onmouseout
		 * @param onmouseout - new value
		 */
		 public void setOnmouseout( ValueExpression  __onmouseout ){
			this._onmouseout = __onmouseout;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onmouseover
		 * The client-side script method to be called when a pointer is moved onto the element
		 */
		private ValueExpression _onmouseover;
		/**
		 * The client-side script method to be called when a pointer is moved onto the element
		 * Setter for onmouseover
		 * @param onmouseover - new value
		 */
		 public void setOnmouseover( ValueExpression  __onmouseover ){
			this._onmouseover = __onmouseover;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onmouseup
		 * The client-side script method to be called when a mouse button is released
		 */
		private ValueExpression _onmouseup;
		/**
		 * The client-side script method to be called when a mouse button is released
		 * Setter for onmouseup
		 * @param onmouseup - new value
		 */
		 public void setOnmouseup( ValueExpression  __onmouseup ){
			this._onmouseup = __onmouseup;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * outcome
		 * ${prop.xmlEncodedDescription}
		 */
		private String _outcome;
		/**
		 * ${prop.xmlEncodedDescription}
		 * Setter for outcome
		 * @param outcome - new value
		 */
		 public void setOutcome( String  __outcome ){
			this._outcome = __outcome;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * pageflow
		 * a pageflow definition to begin. (This is only useful when propagation="begin" or propagation="join".)
		 */
		private ValueExpression _pageflow;
		/**
		 * a pageflow definition to begin. (This is only useful when propagation="begin" or propagation="join".)
		 * Setter for pageflow
		 * @param pageflow - new value
		 */
		 public void setPageflow( ValueExpression  __pageflow ){
			this._pageflow = __pageflow;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * propagation
		 * determines the conversation propagation style: begin, join, nest, none, end or endRoot.
		 */
		private String _propagation;
		/**
		 * determines the conversation propagation style: begin, join, nest, none, end or endRoot.
		 * Setter for propagation
		 * @param propagation - new value
		 */
		 public void setPropagation( String  __propagation ){
			this._propagation = __propagation;
	     }
	  
	 	 		 		 		 	  			  		  	  
		/*
		 * size
		 * This attribute tells the user agent the initial width of the control. The width is given in pixels except when type attribute has the value "text" or "password". In that case, its value refers to the (integer) number of characters
		 */
		private ValueExpression _size;
		/**
		 * This attribute tells the user agent the initial width of the control. The width is given in pixels except when type attribute has the value "text" or "password". In that case, its value refers to the (integer) number of characters
		 * Setter for size
		 * @param size - new value
		 */
		 public void setSize( ValueExpression  __size ){
			this._size = __size;
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
		 * This attribute specifies the position of the current element in the tabbing order for the current document. This value must be a number between 0 and 32767. User agents should ignore leading zeros
		 */
		private ValueExpression _tabindex;
		/**
		 * This attribute specifies the position of the current element in the tabbing order for the current document. This value must be a number between 0 and 32767. User agents should ignore leading zeros
		 * Setter for tabindex
		 * @param tabindex - new value
		 */
		 public void setTabindex( ValueExpression  __tabindex ){
			this._tabindex = __tabindex;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * taskInstance
		 * Specify the task to operate on (e.g. for @StartTask)
		 */
		private ValueExpression _taskInstance;
		/**
		 * Specify the task to operate on (e.g. for @StartTask)
		 * Setter for taskInstance
		 * @param taskInstance - new value
		 */
		 public void setTaskInstance( ValueExpression  __taskInstance ){
			this._taskInstance = __taskInstance;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * title
		 * Advisory title information about markup elements generated for this component
		 */
		private ValueExpression _title;
		/**
		 * Advisory title information about markup elements generated for this component
		 * Setter for title
		 * @param title - new value
		 */
		 public void setTitle( ValueExpression  __title ){
			this._title = __title;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * type
		 * This attribute specifies a type of control to create. The possible values are "submit", "reset", "image" and "button". The default value for this attribute is "submit"
		 */
		private ValueExpression _type;
		/**
		 * This attribute specifies a type of control to create. The possible values are "submit", "reset", "image" and "button". The default value for this attribute is "submit"
		 * Setter for type
		 * @param type - new value
		 */
		 public void setType( ValueExpression  __type ){
			this._type = __type;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * value
		 * The current value for this component
		 */
		private ValueExpression _value;
		/**
		 * The current value for this component
		 * Setter for value
		 * @param value - new value
		 */
		 public void setValue( ValueExpression  __value ){
			this._value = __value;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * view
		 * the JSF view id to link to.
		 */
		private ValueExpression _view;
		/**
		 * the JSF view id to link to.
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
        		 		    this._accesskey = null;
	 		 		    this._action = null;
	 		 		 		    this._actionListener = null;
	 		 		 		    this._alt = null;
	 		 		 		    this._conversationName = null;
	 		 		    this._converter = null;
	 		 		    this._dir = null;
	 		 		    this._disabled = null;
	 		 		 		    this._fragment = null;
	 		 		 		    this._image = null;
	 		 		    this._immediate = null;
	 		 		    this._includePageParams = null;
	 		 		    this._lang = null;
	 		 		 		    this._onclick = null;
	 		 		    this._ondblclick = null;
	 		 		    this._onkeydown = null;
	 		 		    this._onkeypress = null;
	 		 		    this._onkeyup = null;
	 		 		    this._onmousedown = null;
	 		 		    this._onmousemove = null;
	 		 		    this._onmouseout = null;
	 		 		    this._onmouseover = null;
	 		 		    this._onmouseup = null;
	 		 		    this._outcome = null;
	 		 		    this._pageflow = null;
	 		 		 		    this._propagation = null;
	 		 		 		 		    this._size = null;
	 		 		    this._style = null;
	 		 		    this._styleClass = null;
	 		 		    this._tabindex = null;
	 		 		    this._taskInstance = null;
	 		 		    this._title = null;
	 		 		    this._type = null;
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
		HtmlButton comp = (HtmlButton) component;
 		 			 
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
					   		 			setActionProperty(comp, this._action);
		    		 			setActionListenerProperty(comp, this._actionListener);
		    		 			 
						if (this._alt != null) {
				if (this._alt.isLiteralText()) {
					try {
												
						java.lang.String __alt = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._alt.getExpressionString(), 
											java.lang.String.class);
					
												comp.setAlt(__alt);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("alt", this._alt);
				}
			}
					    		 			 
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
					    		 			 
						if (this._image != null) {
				if (this._image.isLiteralText()) {
					try {
												
						java.lang.String __image = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._image.getExpressionString(), 
											java.lang.String.class);
					
												comp.setImage(__image);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("image", this._image);
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
					   		 			 
											if (this._outcome != null) {
					comp.setOutcome(this._outcome);
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
					comp.setPropagation(this._propagation);
				}
									     		 			 
						if (this._size != null) {
				if (this._size.isLiteralText()) {
					try {
												
						Integer __size = (Integer) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._size.getExpressionString(), 
											Integer.class);
					
												comp.setSize(__size.intValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("size", this._size);
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
					   		 			 				if(null != this._taskInstance && this._taskInstance.isLiteralText()){
					throw new IllegalArgumentException("Component org.jboss.seam.ui.Button with Id " + component.getClientId(getFacesContext()) +" allows only EL expressions for property taskInstance");
				}
			 
						if (this._taskInstance != null) {
				if (this._taskInstance.isLiteralText()) {
					try {
												
						java.lang.Object __taskInstance = (java.lang.Object) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._taskInstance.getExpressionString(), 
											java.lang.Object.class);
					
												comp.setTaskInstance(__taskInstance);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("taskInstance", this._taskInstance);
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
					   		 			 
						if (this._type != null) {
				if (this._type.isLiteralText()) {
					try {
												
						java.lang.String __type = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._type.getExpressionString(), 
											java.lang.String.class);
					
												comp.setType(__type);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("type", this._type);
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
		return "org.jboss.seam.ui.Button";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return "org.jboss.seam.ui.ButtonRenderer";
			}

}
