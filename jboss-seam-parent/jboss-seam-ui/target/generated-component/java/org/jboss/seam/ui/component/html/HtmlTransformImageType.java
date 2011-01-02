package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import org.jboss.seam.ui.graphicImage.UITransformImageType;

public class HtmlTransformImageType extends UITransformImageType{

final static public  String COMPONENT_FAMILY = "org.jboss.seam.ui.graphicImage.TransformImageType";

final static public  String COMPONENT_TYPE = "org.jboss.seam.ui.graphicImage.TransformImageType";

/*
* The mime type of the output image
*/
private  String _contentType = null;


public HtmlTransformImageType(){

}

public String getContentType(){
	if (this._contentType != null) {
		return this._contentType;
	}
	ValueExpression ve = getValueExpression("contentType");
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

public void setContentType(String _contentType){
this._contentType = _contentType;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[2];
state[0] = super.saveState(context);
state[1] = _contentType;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_contentType = (String)states[1];;
	
}

}
