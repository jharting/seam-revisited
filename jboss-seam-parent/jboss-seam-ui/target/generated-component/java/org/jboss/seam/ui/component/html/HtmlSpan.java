package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import org.jboss.seam.ui.component.UISpan;

public class HtmlSpan extends UISpan{

final static public  String COMPONENT_FAMILY = "org.jboss.seam.ui.Span";

final static public  String COMPONENT_TYPE = "org.jboss.seam.ui.Span";

/*
* CSS style rules to be applied to the component
*/
private  String _style = null;

/*
* Assigns one or more CSS class names to the component. Corresponds to the HTML "class" attribute.
*/
private  String _styleClass = null;

/*
* Span title attribute
*/
private  String _title = null;


public HtmlSpan(){
setRendererType("org.jboss.seam.ui.SpanRenderer");
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

public String getTitle(){
	if (this._title != null) {
		return this._title;
	}
	ValueExpression ve = getValueExpression("title");
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

public void setTitle(String _title){
this._title = _title;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[4];
state[0] = super.saveState(context);
state[1] = _style;
state[2] = _styleClass;
state[3] = _title;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_style = (String)states[1];;
		_styleClass = (String)states[2];;
		_title = (String)states[3];;
	
}

}
