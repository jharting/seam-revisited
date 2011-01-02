package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import org.jboss.seam.ui.component.UIEqualityValidator;

public class HtmlEqualityValidator extends UIEqualityValidator{

final static public  String COMPONENT_FAMILY = "org.jboss.seam.ui.EqualityValidator";

final static public  String COMPONENT_TYPE = "org.jboss.seam.ui.EqualityValidator";

/*
* Id of component to validate against
*/
private  String _for = null;

/*
* Error message to show
*/
private  String _message = null;

/*
* Message id to use on failure
*/
private  String _messageId = null;

/*
* Operation to use.
*/
private  String _operator = null;

/*
* True if a value is required for the filed to validate (default:true)
*/
private  boolean _required = true;

private  boolean _requiredSet = false;


public HtmlEqualityValidator(){
setRendererType("org.jboss.seam.ui.EqualityValidatorRenderer");
}

public String getFor(){
	if (this._for != null) {
		return this._for;
	}
	ValueExpression ve = getValueExpression("for");
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

public void setFor(String _for){
this._for = _for;
}

public String getMessage(){
	if (this._message != null) {
		return this._message;
	}
	ValueExpression ve = getValueExpression("message");
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

public void setMessage(String _message){
this._message = _message;
}

public String getMessageId(){
	if (this._messageId != null) {
		return this._messageId;
	}
	ValueExpression ve = getValueExpression("messageId");
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

public void setMessageId(String _messageId){
this._messageId = _messageId;
}

public String getOperator(){
	if (this._operator != null) {
		return this._operator;
	}
	ValueExpression ve = getValueExpression("operator");
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

public void setOperator(String _operator){
this._operator = _operator;
}

public boolean isRequired(){
	if (this._requiredSet) {
	    return (this._required);
	}
	ValueExpression ve = getValueExpression("required");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._required);
	    }
	    
	    return value;
	} else {
	    return (this._required);
	}

}

public void setRequired(boolean _required){
this._required = _required;
this._requiredSet = true;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[7];
state[0] = super.saveState(context);
state[1] = _for;
state[2] = _message;
state[3] = _messageId;
state[4] = _operator;
state[5] = Boolean.valueOf(_required);
state[6] = Boolean.valueOf(_requiredSet);
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_for = (String)states[1];;
		_message = (String)states[2];;
		_messageId = (String)states[3];;
		_operator = (String)states[4];;
		_required = ((Boolean)states[5]).booleanValue();
		_requiredSet = ((Boolean)states[6]).booleanValue();
	
}

}
