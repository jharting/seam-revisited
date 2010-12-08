package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import org.jboss.seam.ui.component.UIDownload;

public class HtmlDownload extends UIDownload{

final public static  String COMPONENT_FAMILY = "org.jboss.seam.ui.Download";

final public static  String COMPONENT_TYPE = "org.jboss.seam.ui.Download";

/*
* actionExpression
*/
private  MethodExpression _actionExpression = null;

/*
* actionListener
*/
@SuppressWarnings("deprecation")
private  MethodBinding _actionListener = null;

/*
* conversationName
*/
private  String _conversationName = null;

/*
* disabled
*/
private  boolean _disabled = false;

private  boolean _disabledSet = false;

/*
* fragment
*/
private  String _fragment = null;

/*
* immediate
*/
private  boolean _immediate = false;

private  boolean _immediateSet = false;

/*
* includePageParams
*/
private  boolean _includePageParams = false;

private  boolean _includePageParamsSet = false;

/*
* pageflow
*/
private  String _pageflow = null;

/*
* propagation
*/
private  String _propagation = null;

/*
* Source xhtml file that acts as resource holder
*/
private  String _src = null;

/*
* CSS style rules to be applied to the component
*/
private  String _style = null;

/*
* Assigns one or more CSS class names to the component. Corresponds to the HTML "class" attribute.
*/
private  String _styleClass = null;

/*
* view
*/
private  String _view = null;


public HtmlDownload(){
setRendererType("org.jboss.seam.ui.DownloadRenderer");
}

public MethodExpression getActionExpression(){
return _actionExpression;
}

public void setActionExpression(MethodExpression _actionExpression){
this._actionExpression = _actionExpression;
}

@SuppressWarnings("deprecation")
public MethodBinding getActionListener(){
return _actionListener;
}

@SuppressWarnings("deprecation")
public void setActionListener(MethodBinding _actionListener){
this._actionListener = _actionListener;
}

public String getConversationName(){
	if (this._conversationName != null) {
		return this._conversationName;
	}
	ValueExpression ve = getValueExpression("conversationName");
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

public void setConversationName(String _conversationName){
this._conversationName = _conversationName;
}

public boolean isDisabled(){
	if (this._disabledSet) {
	    return (this._disabled);
	}
	ValueExpression ve = getValueExpression("disabled");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._disabled);
	    }
	    
	    return value;
	} else {
	    return (this._disabled);
	}

}

public void setDisabled(boolean _disabled){
this._disabled = _disabled;
this._disabledSet = true;
}

public String getFragment(){
	if (this._fragment != null) {
		return this._fragment;
	}
	ValueExpression ve = getValueExpression("fragment");
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

public void setFragment(String _fragment){
this._fragment = _fragment;
}

public boolean isImmediate(){
	if (this._immediateSet) {
	    return (this._immediate);
	}
	ValueExpression ve = getValueExpression("immediate");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._immediate);
	    }
	    
	    return value;
	} else {
	    return (this._immediate);
	}

}

public void setImmediate(boolean _immediate){
this._immediate = _immediate;
this._immediateSet = true;
}

public boolean isIncludePageParams(){
	if (this._includePageParamsSet) {
	    return (this._includePageParams);
	}
	ValueExpression ve = getValueExpression("includePageParams");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._includePageParams);
	    }
	    
	    return value;
	} else {
	    return (this._includePageParams);
	}

}

public void setIncludePageParams(boolean _includePageParams){
this._includePageParams = _includePageParams;
this._includePageParamsSet = true;
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

public String getPropagation(){
	if (this._propagation != null) {
		return this._propagation;
	}
	ValueExpression ve = getValueExpression("propagation");
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

public void setPropagation(String _propagation){
this._propagation = _propagation;
}

public String getSrc(){
	if (this._src != null) {
		return this._src;
	}
	ValueExpression ve = getValueExpression("src");
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

public void setSrc(String _src){
this._src = _src;
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

public String getView(){
	if (this._view != null) {
		return this._view;
	}
	ValueExpression ve = getValueExpression("view");
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

public void setView(String _view){
this._view = _view;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[17];
state[0] = super.saveState(context);
state[1] = saveAttachedState(context, _actionExpression);
state[2] = saveAttachedState(context, _actionListener);
state[3] = _conversationName;
state[4] = Boolean.valueOf(_disabled);
state[5] = Boolean.valueOf(_disabledSet);
state[6] = _fragment;
state[7] = Boolean.valueOf(_immediate);
state[8] = Boolean.valueOf(_immediateSet);
state[9] = Boolean.valueOf(_includePageParams);
state[10] = Boolean.valueOf(_includePageParamsSet);
state[11] = _pageflow;
state[12] = _propagation;
state[13] = _src;
state[14] = _style;
state[15] = _styleClass;
state[16] = _view;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_actionExpression = (MethodExpression)restoreAttachedState(context, states[1]);
		_actionListener = (MethodBinding)restoreAttachedState(context, states[2]);
		_conversationName = (String)states[3];;
		_disabled = ((Boolean)states[4]).booleanValue();
		_disabledSet = ((Boolean)states[5]).booleanValue();
		_fragment = (String)states[6];;
		_immediate = ((Boolean)states[7]).booleanValue();
		_immediateSet = ((Boolean)states[8]).booleanValue();
		_includePageParams = ((Boolean)states[9]).booleanValue();
		_includePageParamsSet = ((Boolean)states[10]).booleanValue();
		_pageflow = (String)states[11];;
		_propagation = (String)states[12];;
		_src = (String)states[13];;
		_style = (String)states[14];;
		_styleClass = (String)states[15];;
		_view = (String)states[16];;
	
}

}
