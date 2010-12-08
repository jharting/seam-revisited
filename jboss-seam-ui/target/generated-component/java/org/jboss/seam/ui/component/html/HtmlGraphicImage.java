package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.jboss.seam.ui.graphicImage.UIGraphicImage;

public class HtmlGraphicImage extends UIGraphicImage{

final public static  String COMPONENT_FAMILY = "org.jboss.seam.ui.graphicImage.GraphicImage";

final public static  String COMPONENT_TYPE = "org.jboss.seam.ui.graphicImage.GraphicImage";

/*
* Id of Converter to be used or reference to a Converter
*/
private  Converter _converter = null;

/*
* File name for the generated URL - allows a stable file name and thus browser caching
*/
private  String _fileName = null;


public HtmlGraphicImage(){
setRendererType("org.jboss.seam.ui.GraphicImageRenderer");
}

public Converter getConverter(){
	if (this._converter != null) {
		return this._converter;
	}
	ValueExpression ve = getValueExpression("converter");
	if (ve != null) {
	    Converter value = null;
	    
	    try {
			value = (Converter) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setConverter(Converter _converter){
this._converter = _converter;
}

public String getFileName(){
	if (this._fileName != null) {
		return this._fileName;
	}
	ValueExpression ve = getValueExpression("fileName");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setFileName(String _fileName){
this._fileName = _fileName;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[3];
state[0] = super.saveState(context);
state[1] = saveAttachedState(context, _converter);
state[2] = _fileName;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_converter = (Converter)restoreAttachedState(context, states[1]);
		_fileName = (String)states[2];;
	
}

}
