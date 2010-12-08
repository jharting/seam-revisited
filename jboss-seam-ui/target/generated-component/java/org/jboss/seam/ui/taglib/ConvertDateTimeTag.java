/**
 * GENERATED FILE - DO NOT EDIT
 *
 */
package org.jboss.seam.ui.taglib;

import java.util.TimeZone ;
import java.util.Locale ;
import java.lang.String ;
import javax.faces.webapp.ConverterELTag ;
import javax.el.ELException;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.el.MethodExpression;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;
import javax.el.ValueExpression;
import javax.faces.convert.Converter;
import javax.faces.webapp.UIComponentTag;
import javax.faces.context.FacesContext;
import javax.servlet.jsp.JspException;
import org.jboss.seam.ui.converter.DateTimeConverter;

public class ConvertDateTimeTag extends javax.faces.webapp.ConverterELTag 
{

	// Fields
		 	  			  		  	  
		/*
		 * dateStyle
		 * Predefined formatting style which determines how the date component of a date string is to be formatted and parsed. Applied only if type is "date" or "both". Valid values are "default", "short", "medium", "long", and "full". Default value is "default".
		 */
		private ValueExpression _dateStyle;
		/**
		 * Predefined formatting style which determines how the date component of a date string is to be formatted and parsed. Applied only if type is "date" or "both". Valid values are "default", "short", "medium", "long", and "full". Default value is "default".
		 * Setter for dateStyle
		 * @param dateStyle - new value
		 */
		 public void setDateStyle( ValueExpression  __dateStyle ){
			this._dateStyle = __dateStyle;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * locale
		 * Locale whose predefined styles for dates and times are used during formatting or parsing. If not specified, the Locale returned by FacesContext.getViewRoot().getLocale() will be used. Value must be either a VB expression that evaluates to a java.util.Locale instance, or a String that is valid to pass as the first argument to the constructor java.util.Locale(String language, String country). The empty string is passed as the second argument.
		 */
		private ValueExpression _locale;
		/**
		 * Locale whose predefined styles for dates and times are used during formatting or parsing. If not specified, the Locale returned by FacesContext.getViewRoot().getLocale() will be used. Value must be either a VB expression that evaluates to a java.util.Locale instance, or a String that is valid to pass as the first argument to the constructor java.util.Locale(String language, String country). The empty string is passed as the second argument.
		 * Setter for locale
		 * @param locale - new value
		 */
		 public void setLocale( ValueExpression  __locale ){
			this._locale = __locale;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * pattern
		 * Custom formatting pattern which determines how the date/time string should be formatted and parsed.
		 */
		private ValueExpression _pattern;
		/**
		 * Custom formatting pattern which determines how the date/time string should be formatted and parsed.
		 * Setter for pattern
		 * @param pattern - new value
		 */
		 public void setPattern( ValueExpression  __pattern ){
			this._pattern = __pattern;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * timeStyle
		 * Predefined formatting style which determines how the time component of a date string is to be formatted and parsed. Applied only if type is "time" or "both". Valid values are "default", "short", "medium", "long", and "full". Default value is "default".
		 */
		private ValueExpression _timeStyle;
		/**
		 * Predefined formatting style which determines how the time component of a date string is to be formatted and parsed. Applied only if type is "time" or "both". Valid values are "default", "short", "medium", "long", and "full". Default value is "default".
		 * Setter for timeStyle
		 * @param timeStyle - new value
		 */
		 public void setTimeStyle( ValueExpression  __timeStyle ){
			this._timeStyle = __timeStyle;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * timeZone
		 * Time zone in which to interpret any time information in the date String. Value must be either a VB expression that evaluates to a java.util.TimeZone instance, or a String that is a timezone ID as described in the javadocs for java.util.TimeZone.getTimeZone().
		 */
		private ValueExpression _timeZone;
		/**
		 * Time zone in which to interpret any time information in the date String. Value must be either a VB expression that evaluates to a java.util.TimeZone instance, or a String that is a timezone ID as described in the javadocs for java.util.TimeZone.getTimeZone().
		 * Setter for timeZone
		 * @param timeZone - new value
		 */
		 public void setTimeZone( ValueExpression  __timeZone ){
			this._timeZone = __timeZone;
	     }
	  
	 	 		 	  			  		  	  
		/*
		 * type
		 * Specifies what contents the string value will be formatted to include, or parsed expecting. Valid values are "date", "time", and "both". Default value is "date".
		 */
		private ValueExpression _type;
		/**
		 * Specifies what contents the string value will be formatted to include, or parsed expecting. Valid values are "date", "time", and "both". Default value is "date".
		 * Setter for type
		 * @param type - new value
		 */
		 public void setType( ValueExpression  __type ){
			this._type = __type;
	     }
	  
	 	 	

  protected Converter createConverter() throws JspException 
  {
    DateTimeConverter converter = (DateTimeConverter) FacesContext.getCurrentInstance().getApplication().createConverter("org.jboss.seam.ui.DateTimeConverter");
    _setProperties(converter);
    return converter;
  }

  // Support method to wire in attributes
  private void _setProperties(DateTimeConverter converter) throws JspException 
  {
    FacesContext facesContext = FacesContext.getCurrentInstance();
    if (_dateStyle != null) 
    {
      if (_dateStyle instanceof ValueExpression) 
      {
        converter.setDateStyle((String) _dateStyle.getValue(facesContext.getELContext()));
      }
    }
    if (_locale != null) 
    {
      if (_locale instanceof ValueExpression) 
      {
        converter.setLocale((Locale) _locale.getValue(facesContext.getELContext()));
      }
      if(null != this._locale && this._locale.isLiteralText())
      {
	    throw new IllegalArgumentException("Converter org.jboss.seam.ui.DateTimeConverter allows only EL expressions for property locale");
	  }
    }
    if (_pattern != null) 
    {
      if (_pattern instanceof ValueExpression) 
      {
        converter.setPattern((String) _pattern.getValue(facesContext.getELContext()));
      }
    }
    if (_timeStyle != null) 
    {
      if (_timeStyle instanceof ValueExpression) 
      {
        converter.setTimeStyle((String) _timeStyle.getValue(facesContext.getELContext()));
      }
    }
    if (_timeZone != null) 
    {
      if (_timeZone instanceof ValueExpression) 
      {
        converter.setTimeZone((TimeZone) _timeZone.getValue(facesContext.getELContext()));
      }
      if(null != this._timeZone && this._timeZone.isLiteralText())
      {
	    throw new IllegalArgumentException("Converter org.jboss.seam.ui.DateTimeConverter allows only EL expressions for property timeZone");
	  }
    }
    if (_type != null) 
    {
      if (_type instanceof ValueExpression) 
      {
        converter.setType((String) _type.getValue(facesContext.getELContext()));
      }
    }
  }

}
