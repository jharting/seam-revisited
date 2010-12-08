package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import org.jboss.seam.ui.graphicImage.UITransformImageBlur;

public class HtmlTransformImageBlur extends UITransformImageBlur{

final public static  String COMPONENT_FAMILY = "org.jboss.seam.ui.graphicImage.TransformImageBlur";

final public static  String COMPONENT_TYPE = "org.jboss.seam.ui.graphicImage.TransformImageBlur";

/*
* The radius of the blur (essentially the ammount of blur)
*/
private  String _radius = null;


public HtmlTransformImageBlur(){

}

public String getRadius(){
	if (this._radius != null) {
		return this._radius;
	}
	ValueExpression ve = getValueExpression("radius");
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

public void setRadius(String _radius){
this._radius = _radius;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[2];
state[0] = super.saveState(context);
state[1] = _radius;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_radius = (String)states[1];;
	
}

}
