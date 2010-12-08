package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import org.jboss.seam.ui.component.UISelectItems;

public class HtmlSelectItems extends UISelectItems{

final public static  String COMPONENT_FAMILY = "javax.faces.SelectItems";

final public static  String COMPONENT_TYPE = "org.jboss.seam.ui.SelectItems";

/*
* if true the SelectItem will be rendered disabled. Can reference the var variable
*/
private  Boolean _disabled = null;

/*
* if false, characters in the label will not be escaped. Beware that this is a safety issue when the label is in any way derived from input supplied by the application's user. . Can reference the var variable
*/
private  Boolean _escape = null;

/*
* if true, the noSelectionLabel will be hidden when a value is selected
*/
private  Boolean _hideNoSelectionLabel = null;

/*
* Value to return to the server if this option is selected. Optional, by default the var object is used. Can reference the var variable
*/
private  Object _itemValue = null;

/*
* specifies the (optional) label to place at the top of list (if required="true" is also specified then selecting this value will cause a validation error)
*/
private  String _noSelectionLabel = null;

/*
* defines the name of the local variable that holds the current object during iteration
*/
private  String _var = null;


public HtmlSelectItems(){

}

public Boolean getDisabled(){
	if (this._disabled != null) {
		return this._disabled;
	}
	ValueExpression ve = getValueExpression("disabled");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setDisabled(Boolean _disabled){
this._disabled = _disabled;
}

public Boolean getEscape(){
	if (this._escape != null) {
		return this._escape;
	}
	ValueExpression ve = getValueExpression("escape");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return true;
	

}

public void setEscape(Boolean _escape){
this._escape = _escape;
}

public Boolean getHideNoSelectionLabel(){
	if (this._hideNoSelectionLabel != null) {
		return this._hideNoSelectionLabel;
	}
	ValueExpression ve = getValueExpression("hideNoSelectionLabel");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return false;
	

}

public void setHideNoSelectionLabel(Boolean _hideNoSelectionLabel){
this._hideNoSelectionLabel = _hideNoSelectionLabel;
}

public Object getItemValue(){
	if (this._itemValue != null) {
		return this._itemValue;
	}
	ValueExpression ve = getValueExpression("itemValue");
	if (ve != null) {
	    Object value = null;
	    
	    try {
			value = (Object) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setItemValue(Object _itemValue){
this._itemValue = _itemValue;
}

public String getNoSelectionLabel(){
	if (this._noSelectionLabel != null) {
		return this._noSelectionLabel;
	}
	ValueExpression ve = getValueExpression("noSelectionLabel");
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

public void setNoSelectionLabel(String _noSelectionLabel){
this._noSelectionLabel = _noSelectionLabel;
}

public String getVar(){
return _var;
}

public void setVar(String _var){
this._var = _var;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[7];
state[0] = super.saveState(context);
state[1] = _disabled;
state[2] = _escape;
state[3] = _hideNoSelectionLabel;
state[4] = saveAttachedState(context, _itemValue);
state[5] = _noSelectionLabel;
state[6] = _var;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_disabled = (Boolean)states[1];;
		_escape = (Boolean)states[2];;
		_hideNoSelectionLabel = (Boolean)states[3];;
		_itemValue = (Object)restoreAttachedState(context, states[4]);
		_noSelectionLabel = (String)states[5];;
		_var = (String)states[6];;
	
}

}
