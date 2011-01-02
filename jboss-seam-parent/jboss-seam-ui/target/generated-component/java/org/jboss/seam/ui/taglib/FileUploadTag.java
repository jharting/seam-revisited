/**
 * GENERATED FILE - DO NOT EDIT
 *
 */
package org.jboss.seam.ui.taglib;

import java.io.InputStream ;
import javax.faces.component.UIComponent ;
import javax.faces.convert.Converter ;
import org.jboss.seam.ui.util.cdk.UIComponentTagBase ;
import java.lang.Object ;
import java.lang.Integer ;
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
import org.jboss.seam.ui.component.html.HtmlFileUpload;

public class FileUploadTag extends org.jboss.seam.ui.util.cdk.UIComponentTagBase {

		// Fields
		 	  			  		  	  
		/*
		 * accept
		 * a comma-separated list of content types to accept, may not be supported by the browser. E.g. "images/png,images/jpg", "images/*".
		 */
		private ValueExpression _accept;
		/**
		 * a comma-separated list of content types to accept, may not be supported by the browser. E.g. "images/png,images/jpg", "images/*".
		 * Setter for accept
		 * @param accept - new value
		 */
		 public void setAccept( ValueExpression  __accept ){
			this._accept = __accept;
	     }
	  
	 	 		 	  			  		  	  
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
		 * align
		 * Deprecated. This attribute specifies the horizontal alignment of its element with respect to the surrounding context. The  possible values are "left", "center", "right" and "justify".  
            The default depends on the base text direction. For left to right text, the default is align="left", while for right to left text, the default is align="right".
		 */
		private ValueExpression _align;
		/**
		 * Deprecated. This attribute specifies the horizontal alignment of its element with respect to the surrounding context. The  possible values are "left", "center", "right" and "justify".  
            The default depends on the base text direction. For left to right text, the default is align="left", while for right to left text, the default is align="right".
		 * Setter for align
		 * @param align - new value
		 */
		 public void setAlign( ValueExpression  __align ){
			this._align = __align;
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
		 * contentType
		 * the property to receive the contentType
		 */
		private ValueExpression _contentType;
		/**
		 * the property to receive the contentType
		 * Setter for contentType
		 * @param contentType - new value
		 */
		 public void setContentType( ValueExpression  __contentType ){
			this._contentType = __contentType;
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
		 * converterMessage
		 * A ValueExpression enabled attribute that, if present,
			will be used as the text of the converter message,
			replacing any message that comes from the converter
		 */
		private ValueExpression _converterMessage;
		/**
		 * A ValueExpression enabled attribute that, if present,
			will be used as the text of the converter message,
			replacing any message that comes from the converter
		 * Setter for converterMessage
		 * @param converterMessage - new value
		 */
		 public void setConverterMessage( ValueExpression  __converterMessage ){
			this._converterMessage = __converterMessage;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * data
		 * this value binding receives the file's content type (optional).
		 */
		private ValueExpression _data;
		/**
		 * this value binding receives the file's content type (optional).
		 * Setter for data
		 * @param data - new value
		 */
		 public void setData( ValueExpression  __data ){
			this._data = __data;
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
		 * fileName
		 * this value binding receives the filename (optional).
		 */
		private ValueExpression _fileName;
		/**
		 * this value binding receives the filename (optional).
		 * Setter for fileName
		 * @param fileName - new value
		 */
		 public void setFileName( ValueExpression  __fileName ){
			this._fileName = __fileName;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * fileSize
		 * this value binding receives the file size (optional).
		 */
		private ValueExpression _fileSize;
		/**
		 * this value binding receives the file size (optional).
		 * Setter for fileSize
		 * @param fileSize - new value
		 */
		 public void setFileSize( ValueExpression  __fileSize ){
			this._fileSize = __fileSize;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * immediate
		 * A flag indicating that this component value must be converted
            and validated immediately (that is, during Apply Request Values
            phase), rather than waiting until a Process Validations phase
		 */
		private ValueExpression _immediate;
		/**
		 * A flag indicating that this component value must be converted
            and validated immediately (that is, during Apply Request Values
            phase), rather than waiting until a Process Validations phase
		 * Setter for immediate
		 * @param immediate - new value
		 */
		 public void setImmediate( ValueExpression  __immediate ){
			this._immediate = __immediate;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * localContentType
		 * localContentType
		 */
		private ValueExpression _localContentType;
		/**
		 * localContentType
		 * Setter for localContentType
		 * @param localContentType - new value
		 */
		 public void setLocalContentType( ValueExpression  __localContentType ){
			this._localContentType = __localContentType;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * localFileName
		 * localFileName
		 */
		private ValueExpression _localFileName;
		/**
		 * localFileName
		 * Setter for localFileName
		 * @param localFileName - new value
		 */
		 public void setLocalFileName( ValueExpression  __localFileName ){
			this._localFileName = __localFileName;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * localFileSize
		 * localFileSize
		 */
		private ValueExpression _localFileSize;
		/**
		 * localFileSize
		 * Setter for localFileSize
		 * @param localFileSize - new value
		 */
		 public void setLocalFileSize( ValueExpression  __localFileSize ){
			this._localFileSize = __localFileSize;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * localInputStream
		 * localInputStream
		 */
		private ValueExpression _localInputStream;
		/**
		 * localInputStream
		 * Setter for localInputStream
		 * @param localInputStream - new value
		 */
		 public void setLocalInputStream( ValueExpression  __localInputStream ){
			this._localInputStream = __localInputStream;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * localValueSet
		 * localValueSet
		 */
		private ValueExpression _localValueSet;
		/**
		 * localValueSet
		 * Setter for localValueSet
		 * @param localValueSet - new value
		 */
		 public void setLocalValueSet( ValueExpression  __localValueSet ){
			this._localValueSet = __localValueSet;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * maxlength
		 * Specifies the maximum number of digits that could be entered into the input field. 
		The maximum number is unlimited by default. 
		If entered value exceeds the value specified in "maxValue" attribute than the slider takes a maximum value position.
		 */
		private ValueExpression _maxlength;
		/**
		 * Specifies the maximum number of digits that could be entered into the input field. 
		The maximum number is unlimited by default. 
		If entered value exceeds the value specified in "maxValue" attribute than the slider takes a maximum value position.
		 * Setter for maxlength
		 * @param maxlength - new value
		 */
		 public void setMaxlength( ValueExpression  __maxlength ){
			this._maxlength = __maxlength;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onblur
		 * The client-side script method to be called when the element loses the focus
		 */
		private ValueExpression _onblur;
		/**
		 * The client-side script method to be called when the element loses the focus
		 * Setter for onblur
		 * @param onblur - new value
		 */
		 public void setOnblur( ValueExpression  __onblur ){
			this._onblur = __onblur;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * onchange
		 * The client-side script method to be called when the element value is changed
		 */
		private ValueExpression _onchange;
		/**
		 * The client-side script method to be called when the element value is changed
		 * Setter for onchange
		 * @param onchange - new value
		 */
		 public void setOnchange( ValueExpression  __onchange ){
			this._onchange = __onchange;
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
		 * onfocus
		 * The client-side script method to be called when the element gets the focus
		 */
		private ValueExpression _onfocus;
		/**
		 * The client-side script method to be called when the element gets the focus
		 * Setter for onfocus
		 * @param onfocus - new value
		 */
		 public void setOnfocus( ValueExpression  __onfocus ){
			this._onfocus = __onfocus;
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
		 * onselect
		 * The client-side script method to be called when some text is selected in the text field. This attribute can be used with the INPUT and TEXTAREA elements.
		 */
		private ValueExpression _onselect;
		/**
		 * The client-side script method to be called when some text is selected in the text field. This attribute can be used with the INPUT and TEXTAREA elements.
		 * Setter for onselect
		 * @param onselect - new value
		 */
		 public void setOnselect( ValueExpression  __onselect ){
			this._onselect = __onselect;
	     }
	  
	 	 		 		 	  			  		  	  
		/*
		 * required
		 * If "true", this component is checked for non-empty input
		 */
		private ValueExpression _required;
		/**
		 * If "true", this component is checked for non-empty input
		 * Setter for required
		 * @param required - new value
		 */
		 public void setRequired( ValueExpression  __required ){
			this._required = __required;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * requiredMessage
		 * A ValueExpression enabled attribute which defines  text of validation message to show, if a required field is missing
		 */
		private ValueExpression _requiredMessage;
		/**
		 * A ValueExpression enabled attribute which defines  text of validation message to show, if a required field is missing
		 * Setter for requiredMessage
		 * @param requiredMessage - new value
		 */
		 public void setRequiredMessage( ValueExpression  __requiredMessage ){
			this._requiredMessage = __requiredMessage;
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
		 * valid
		 * valid
		 */
		private ValueExpression _valid;
		/**
		 * valid
		 * Setter for valid
		 * @param valid - new value
		 */
		 public void setValid( ValueExpression  __valid ){
			this._valid = __valid;
	     }
	  
	 	 		 	  	  	  
		/*
		 * validator
		 * MethodBinding pointing at a method that is called during
            Process Validations phase of the request processing lifecycle,
            to validate the current value of this component
		 */
		private MethodExpression _validator;
		/**
		 * MethodBinding pointing at a method that is called during
            Process Validations phase of the request processing lifecycle,
            to validate the current value of this component
		 * Setter for validator
		 * @param validator - new value
		 */
		 public void setValidator( MethodExpression  __validator ){
			this._validator = __validator;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * validatorMessage
		 * A ValueExpression enabled attribute that, if present,
			will be used as the text of the validator message,
			replacing any message that comes from the validator
		 */
		private ValueExpression _validatorMessage;
		/**
		 * A ValueExpression enabled attribute that, if present,
			will be used as the text of the validator message,
			replacing any message that comes from the validator
		 * Setter for validatorMessage
		 * @param validatorMessage - new value
		 */
		 public void setValidatorMessage( ValueExpression  __validatorMessage ){
			this._validatorMessage = __validatorMessage;
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
	  
	 	 		 	  	  	  
		/*
		 * valueChangeListener
		 * Listener for value changes
		 */
		private MethodExpression _valueChangeListener;
		/**
		 * Listener for value changes
		 * Setter for valueChangeListener
		 * @param valueChangeListener - new value
		 */
		 public void setValueChangeListener( MethodExpression  __valueChangeListener ){
			this._valueChangeListener = __valueChangeListener;
	     }
	  
	 	 		 	
	
    public void release()
    {
        // TODO Auto-generated method stub
        super.release();
        		 		    this._accept = null;
	 		 		    this._accesskey = null;
	 		 		    this._align = null;
	 		 		    this._alt = null;
	 		 		 		    this._contentType = null;
	 		 		    this._converter = null;
	 		 		    this._converterMessage = null;
	 		 		    this._data = null;
	 		 		    this._disabled = null;
	 		 		 		    this._fileName = null;
	 		 		    this._fileSize = null;
	 		 		 		    this._immediate = null;
	 		 		    this._localContentType = null;
	 		 		    this._localFileName = null;
	 		 		    this._localFileSize = null;
	 		 		    this._localInputStream = null;
	 		 		 		    this._localValueSet = null;
	 		 		    this._maxlength = null;
	 		 		    this._onblur = null;
	 		 		    this._onchange = null;
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
	 		 		    this._onselect = null;
	 		 		 		    this._required = null;
	 		 		    this._requiredMessage = null;
	 		 		    this._size = null;
	 		 		    this._style = null;
	 		 		    this._styleClass = null;
	 		 		    this._tabindex = null;
	 		 		    this._valid = null;
	 		 		    this._validator = null;
	 		 		    this._validatorMessage = null;
	 		 		 		    this._value = null;
	 		 		    this._valueChangeListener = null;
	 		 		}
	
    /* (non-Javadoc)
     * @see org.ajax4jsf.components.taglib.html.HtmlCommandButtonTagBase#setProperties(javax.faces.component.UIComponent)
     */
    protected void setProperties(UIComponent component)
    {
        // TODO Auto-generated method stub
        super.setProperties(component);
		HtmlFileUpload comp = (HtmlFileUpload) component;
 		 			 
						if (this._accept != null) {
				if (this._accept.isLiteralText()) {
					try {
												
						java.lang.String __accept = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._accept.getExpressionString(), 
											java.lang.String.class);
					
												comp.setAccept(__accept);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("accept", this._accept);
				}
			}
					   		 			 
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
					   		 			 
						if (this._align != null) {
				if (this._align.isLiteralText()) {
					try {
												
						java.lang.String __align = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._align.getExpressionString(), 
											java.lang.String.class);
					
												comp.setAlign(__align);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("align", this._align);
				}
			}
					   		 			 
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
					    		 			 				if(null != this._contentType && this._contentType.isLiteralText()){
					throw new IllegalArgumentException("Component org.jboss.seam.ui.FileUpload with Id " + component.getClientId(getFacesContext()) +" allows only EL expressions for property contentType");
				}
			 
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
					   		 			setConverterProperty(comp, this._converter);
		   		 			 
						if (this._converterMessage != null) {
				if (this._converterMessage.isLiteralText()) {
					try {
												
						java.lang.String __converterMessage = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._converterMessage.getExpressionString(), 
											java.lang.String.class);
					
												comp.setConverterMessage(__converterMessage);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("converterMessage", this._converterMessage);
				}
			}
					   		 			 				if(null != this._data && this._data.isLiteralText()){
					throw new IllegalArgumentException("Component org.jboss.seam.ui.FileUpload with Id " + component.getClientId(getFacesContext()) +" allows only EL expressions for property data");
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
					    		 			 				if(null != this._fileName && this._fileName.isLiteralText()){
					throw new IllegalArgumentException("Component org.jboss.seam.ui.FileUpload with Id " + component.getClientId(getFacesContext()) +" allows only EL expressions for property fileName");
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
					   		 			 				if(null != this._fileSize && this._fileSize.isLiteralText()){
					throw new IllegalArgumentException("Component org.jboss.seam.ui.FileUpload with Id " + component.getClientId(getFacesContext()) +" allows only EL expressions for property fileSize");
				}
			 
						if (this._fileSize != null) {
				if (this._fileSize.isLiteralText()) {
					try {
												
						java.lang.Integer __fileSize = (java.lang.Integer) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._fileSize.getExpressionString(), 
											java.lang.Integer.class);
					
												comp.setFileSize(__fileSize);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("fileSize", this._fileSize);
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
					   		 			 
						if (this._localContentType != null) {
				if (this._localContentType.isLiteralText()) {
					try {
												
						java.lang.String __localContentType = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._localContentType.getExpressionString(), 
											java.lang.String.class);
					
												comp.setLocalContentType(__localContentType);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("localContentType", this._localContentType);
				}
			}
					   		 			 
						if (this._localFileName != null) {
				if (this._localFileName.isLiteralText()) {
					try {
												
						java.lang.String __localFileName = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._localFileName.getExpressionString(), 
											java.lang.String.class);
					
												comp.setLocalFileName(__localFileName);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("localFileName", this._localFileName);
				}
			}
					   		 			 
						if (this._localFileSize != null) {
				if (this._localFileSize.isLiteralText()) {
					try {
												
						java.lang.Integer __localFileSize = (java.lang.Integer) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._localFileSize.getExpressionString(), 
											java.lang.Integer.class);
					
												comp.setLocalFileSize(__localFileSize);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("localFileSize", this._localFileSize);
				}
			}
					   		 			 
						if (this._localInputStream != null) {
				if (this._localInputStream.isLiteralText()) {
					try {
												
						java.io.InputStream __localInputStream = (java.io.InputStream) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._localInputStream.getExpressionString(), 
											java.io.InputStream.class);
					
												comp.setLocalInputStream(__localInputStream);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("localInputStream", this._localInputStream);
				}
			}
					    		 			 
						if (this._localValueSet != null) {
				if (this._localValueSet.isLiteralText()) {
					try {
												
						Boolean __localValueSet = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._localValueSet.getExpressionString(), 
											Boolean.class);
					
												comp.setLocalValueSet(__localValueSet.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("localValueSet", this._localValueSet);
				}
			}
					   		 			 
						if (this._maxlength != null) {
				if (this._maxlength.isLiteralText()) {
					try {
												
						Integer __maxlength = (Integer) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._maxlength.getExpressionString(), 
											Integer.class);
					
												comp.setMaxlength(__maxlength.intValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("maxlength", this._maxlength);
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
					   		 			 
						if (this._onchange != null) {
				if (this._onchange.isLiteralText()) {
					try {
												
						java.lang.String __onchange = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onchange.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnchange(__onchange);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onchange", this._onchange);
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
					   		 			 
						if (this._onselect != null) {
				if (this._onselect.isLiteralText()) {
					try {
												
						java.lang.String __onselect = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._onselect.getExpressionString(), 
											java.lang.String.class);
					
												comp.setOnselect(__onselect);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("onselect", this._onselect);
				}
			}
					    		 			 
						if (this._required != null) {
				if (this._required.isLiteralText()) {
					try {
												
						Boolean __required = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._required.getExpressionString(), 
											Boolean.class);
					
												comp.setRequired(__required.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("required", this._required);
				}
			}
					   		 			 
						if (this._requiredMessage != null) {
				if (this._requiredMessage.isLiteralText()) {
					try {
												
						java.lang.String __requiredMessage = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._requiredMessage.getExpressionString(), 
											java.lang.String.class);
					
												comp.setRequiredMessage(__requiredMessage);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("requiredMessage", this._requiredMessage);
				}
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
					   		 			 
						if (this._valid != null) {
				if (this._valid.isLiteralText()) {
					try {
												
						Boolean __valid = (Boolean) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._valid.getExpressionString(), 
											Boolean.class);
					
												comp.setValid(__valid.booleanValue());
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("valid", this._valid);
				}
			}
					   		 			setValidatorProperty(comp, this._validator);
		   		 			 
						if (this._validatorMessage != null) {
				if (this._validatorMessage.isLiteralText()) {
					try {
												
						java.lang.String __validatorMessage = (java.lang.String) getFacesContext().
							getApplication().
								getExpressionFactory().
									coerceToType(this._validatorMessage.getExpressionString(), 
											java.lang.String.class);
					
												comp.setValidatorMessage(__validatorMessage);
											} catch (ELException e) {
						throw new FacesException(e);
					}
				} else {
					component.setValueExpression("validatorMessage", this._validatorMessage);
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
					   		 			setValueChangeListenerProperty(comp, this._valueChangeListener);
		      }
	
	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getComponentType()
	 */
	public String getComponentType() {
		// TODO Auto-generated method stub
		return "org.jboss.seam.ui.FileUpload";
	}

	/* (non-Javadoc)
	 * @see javax.faces.webapp.UIComponentTag#getRendererType()
	 */
	public String getRendererType() {
				return "org.jboss.seam.ui.FileUploadRenderer";
			}

}
