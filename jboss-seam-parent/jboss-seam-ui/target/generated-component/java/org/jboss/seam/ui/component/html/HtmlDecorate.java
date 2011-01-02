package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import org.jboss.seam.ui.component.UIDecorate;

public class HtmlDecorate extends UIDecorate{

final static public  String COMPONENT_FAMILY = "org.jboss.seam.ui.Decorate";

final static public  String COMPONENT_TYPE = "org.jboss.seam.ui.Decorate";

/*
* the element to enclose the template used to decorate the input field.
			             By default, the template is enclosed with a div element.
*/
private  String _element = "div";

/*
* if true, the template used to decorate the input field is
			             enclosed by the element specified with the "element"
			             attribute. By default this is a div element.
*/
private  boolean _enclose = true;

private  boolean _encloseSet = false;

/*
* Id of the input field to decorate
*/
private  String _for = null;

/*
* CSS style rules to be applied to the component
*/
private  String _style = null;

/*
* Assigns one or more CSS class names to the component. Corresponds to the HTML "class" attribute.
*/
private  String _styleClass = null;

/*
* XHTML template to use to decorate the input field
*/
private  String _template = null;


public HtmlDecorate(){
setRendererType("org.jboss.seam.ui.DecorateRenderer");
}

public String getElement(){
return _element;
}

public void setElement(String _element){
this._element = _element;
}

public boolean isEnclose(){
return _enclose;
}

public void setEnclose(boolean _enclose){
this._enclose = _enclose;
this._encloseSet = true;
}

public String getFor(){
return _for;
}

public void setFor(String _for){
this._for = _for;
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

public String getTemplate(){
	if (this._template != null) {
		return this._template;
	}
	ValueExpression ve = getValueExpression("template");
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

public void setTemplate(String _template){
this._template = _template;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[8];
state[0] = super.saveState(context);
state[1] = _element;
state[2] = Boolean.valueOf(_enclose);
state[3] = Boolean.valueOf(_encloseSet);
state[4] = _for;
state[5] = _style;
state[6] = _styleClass;
state[7] = _template;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_element = (String)states[1];;
		_enclose = ((Boolean)states[2]).booleanValue();
		_encloseSet = ((Boolean)states[3]).booleanValue();
		_for = (String)states[4];;
		_style = (String)states[5];;
		_styleClass = (String)states[6];;
		_template = (String)states[7];;
	
}

}
