package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import org.jboss.seam.ui.component.UISelection;

public class HtmlSelection extends UISelection{

final static public  String COMPONENT_FAMILY = "org.jboss.seam.ui.Selection";

final static public  String COMPONENT_TYPE = "org.jboss.seam.ui.Selection";

/*
* dataModel
*/
private  String _dataModel = null;

/*
* var
*/
private  String _var = null;


public HtmlSelection(){

}

public String getDataModel(){
	if (this._dataModel != null) {
		return this._dataModel;
	}
	ValueExpression ve = getValueExpression("dataModel");
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

public void setDataModel(String _dataModel){
this._dataModel = _dataModel;
}

public String getVar(){
	if (this._var != null) {
		return this._var;
	}
	ValueExpression ve = getValueExpression("var");
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

public void setVar(String _var){
this._var = _var;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[3];
state[0] = super.saveState(context);
state[1] = _dataModel;
state[2] = _var;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_dataModel = (String)states[1];;
		_var = (String)states[2];;
	
}

}
