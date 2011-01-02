package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import org.jboss.seam.ui.component.UIStyle;

public class HtmlDiv extends UIStyle{

final static public  String COMPONENT_FAMILY = "org.jboss.seam.ui.Div";

final static public  String COMPONENT_TYPE = "org.jboss.seam.ui.Div";

/*
* CSS style(s) is/are to be applied when this component is rendered
*/
private  String _style = null;

/*
* Corresponds to the HTML class attribute
*/
private  String _styleClass = null;


public HtmlDiv(){
setRendererType("org.jboss.seam.ui.DivRenderer");
}

public String getStyle(){
	if (this._style != null) {
		return this._style;
	}
	ValueExpression ve = getValueExpression("style");
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

public void setStyle(String _style){
this._style = _style;
}

public String getStyleClass(){
	if (this._styleClass != null) {
		return this._styleClass;
	}
	ValueExpression ve = getValueExpression("styleClass");
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

public void setStyleClass(String _styleClass){
this._styleClass = _styleClass;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[3];
state[0] = super.saveState(context);
state[1] = _style;
state[2] = _styleClass;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_style = (String)states[1];;
		_styleClass = (String)states[2];;
	
}

}
