package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import org.jboss.seam.ui.component.UIEnumItem;

public class HtmlEnumItem extends UIEnumItem{

final public static  String COMPONENT_FAMILY = "org.jboss.seam.ui.EnumItem";

final public static  String COMPONENT_TYPE = "org.jboss.seam.ui.EnumItem";

/*
* the string representation of the enum value.
*/
private  String _enumValue = null;

/*
* the label to be used when rendering the SelectItem.
*/
private  String _label = null;


public HtmlEnumItem(){

}

public String getEnumValue(){
	if (this._enumValue != null) {
		return this._enumValue;
	}
	ValueExpression ve = getValueExpression("enumValue");
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

public void setEnumValue(String _enumValue){
this._enumValue = _enumValue;
}

public String getLabel(){
	if (this._label != null) {
		return this._label;
	}
	ValueExpression ve = getValueExpression("label");
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

public void setLabel(String _label){
this._label = _label;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[3];
state[0] = super.saveState(context);
state[1] = _enumValue;
state[2] = _label;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_enumValue = (String)states[1];;
		_label = (String)states[2];;
	
}

}
