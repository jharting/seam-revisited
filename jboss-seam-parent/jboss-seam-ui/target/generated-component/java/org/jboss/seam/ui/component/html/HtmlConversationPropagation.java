package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import org.jboss.seam.ui.component.UIConversationPropagation;

public class HtmlConversationPropagation extends UIConversationPropagation{

final static public  String COMPONENT_FAMILY = "org.jboss.seam.ui.ConversationPropagation";

final static public  String COMPONENT_TYPE = "org.jboss.seam.ui.ConversationPropagation";

/*
* a pageflow definition to begin. (This is only useful when propagation="begin" or propagation="join".)
*/
private  String _pageflow = null;

/*
* determines the conversation propagation style: begin, join, nested, none, end or endRoot.
*/
private  String _type = null;


public HtmlConversationPropagation(){
setRendererType("org.jboss.seam.ui.ConversationPropagationRenderer");
}

public String getPageflow(){
	if (this._pageflow != null) {
		return this._pageflow;
	}
	ValueExpression ve = getValueExpression("pageflow");
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

public void setPageflow(String _pageflow){
this._pageflow = _pageflow;
}

public String getType(){
	if (this._type != null) {
		return this._type;
	}
	ValueExpression ve = getValueExpression("type");
	if (ve != null) {
	    String value = null;
	    
	    try {
			value = (String) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return "none";
	

}

public void setType(String _type){
this._type = _type;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[3];
state[0] = super.saveState(context);
state[1] = _pageflow;
state[2] = _type;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_pageflow = (String)states[1];;
		_type = (String)states[2];;
	
}

}
