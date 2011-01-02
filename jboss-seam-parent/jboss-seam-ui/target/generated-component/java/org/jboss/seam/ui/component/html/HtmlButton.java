package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import org.jboss.seam.ui.component.UIButton;

public class HtmlButton extends UIButton{

final static public  String COMPONENT_FAMILY = "org.jboss.seam.ui.Button";

final static public  String COMPONENT_TYPE = "org.jboss.seam.ui.Button";

/*
* This attribute assigns an access key to an element. An access key is a single character from the document character set. Note: Authors should consider the input method of the expected reader when specifying an accesskey
*/
private  String _accesskey = null;

/*
* MethodExpression pointing at the application action to be invoked,
            if this UIComponent is activated by you, during the Apply
            Request Values or Invoke Application phase of the request
            processing lifecycle, depending on the value of the immediate
            property
*/
private  MethodExpression _actionExpression = null;

/*
* MethodBinding pointing at method accepting  an ActionEvent with return type void
*/
@SuppressWarnings("deprecation")
private  MethodBinding _actionListener = null;

/*
* For a user agents that cannot display images, forms, or applets, this attribute specifies alternate text. The language of the alternate text is specified by the lang attribute
*/
private  String _alt = null;

/*
* The name of the conversation for natural conversations
*/
private  String _conversationName = null;

/*
* Direction indication for text that does not inherit
			directionality. Valid values are "LTR" (left-to-right)
			and "RTL" (right-to-left)
*/
private  String _dir = null;

/*
* When set for a form control, this boolean attribute disables the control for your input
*/
private  boolean _disabled = false;

private  boolean _disabledSet = false;

/*
* the fragment identifier to link to.
*/
transient private  String _fragment = null;

/*
* image
*/
private  String _image = null;

/*
* True means, that the default ActionListener should be executed
            immediately (i.e. during Apply Request Values phase of the
            request processing lifecycle), rather than waiting until the
            Invoke Application phase
*/
private  boolean _immediate = false;

private  boolean _immediateSet = false;

/*
* Include page parameters defined in pages.xml when rendering the button
*/
private  boolean _includePageParams = true;

private  boolean _includePageParamsSet = false;

/*
* Code describing the language used in the generated markup for this component
*/
private  String _lang = null;

/*
* The client-side script method to be called when the element is clicked
*/
private  String _onclick = null;

/*
* The client-side script method to be called when the element is double-clicked
*/
private  String _ondblclick = null;

/*
* The client-side script method to be called when a key is pressed down over the element
*/
private  String _onkeydown = null;

/*
* The client-side script method to be called when a key is pressed over the element and released
*/
private  String _onkeypress = null;

/*
* The client-side script method to be called when a key is released
*/
private  String _onkeyup = null;

/*
* The client-side script method to be called when a mouse button is pressed down over the element
*/
private  String _onmousedown = null;

/*
* The client-side script method to be called when a pointer is moved within the element
*/
private  String _onmousemove = null;

/*
* The client-side script method to be called when a pointer is moved away from the element
*/
private  String _onmouseout = null;

/*
* The client-side script method to be called when a pointer is moved onto the element
*/
private  String _onmouseover = null;

/*
* The client-side script method to be called when a mouse button is released
*/
private  String _onmouseup = null;

/*
* null
*/
transient private  String _outcome = null;

/*
* a pageflow definition to begin. (This is only useful when propagation="begin" or propagation="join".)
*/
private  String _pageflow = null;

/*
* determines the conversation propagation style: begin, join, nest, none, end or endRoot.
*/
private  String _propagation = "default";

/*
* This attribute tells the user agent the initial width of the control. The width is given in pixels except when type attribute has the value "text" or "password". In that case, its value refers to the (integer) number of characters
*/
private  int _size = Integer.MIN_VALUE;

private  boolean _sizeSet = false;

/*
* CSS style rules to be applied to the component
*/
private  String _style = null;

/*
* Assigns one or more CSS class names to the component. Corresponds to the HTML "class" attribute.
*/
private  String _styleClass = null;

/*
* This attribute specifies the position of the current element in the tabbing order for the current document. This value must be a number between 0 and 32767. User agents should ignore leading zeros
*/
private  String _tabindex = null;

/*
* Specify the task to operate on (e.g. for @StartTask)
*/
transient private  Object _taskInstance = null;

/*
* Advisory title information about markup elements generated for this component
*/
private  String _title = null;

/*
* This attribute specifies a type of control to create. The possible values are "submit", "reset", "image" and "button". The default value for this attribute is "submit"
*/
private  String _type = null;

/*
* the JSF view id to link to.
*/
private  String _view = null;


public HtmlButton(){
setRendererType("org.jboss.seam.ui.ButtonRenderer");
}

public String getAccesskey(){
	if (this._accesskey != null) {
		return this._accesskey;
	}
	ValueExpression ve = getValueExpression("accesskey");
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

public void setAccesskey(String _accesskey){
this._accesskey = _accesskey;
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

public String getAlt(){
	if (this._alt != null) {
		return this._alt;
	}
	ValueExpression ve = getValueExpression("alt");
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

public void setAlt(String _alt){
this._alt = _alt;
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

public String getDir(){
	if (this._dir != null) {
		return this._dir;
	}
	ValueExpression ve = getValueExpression("dir");
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

public void setDir(String _dir){
this._dir = _dir;
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

public String getImage(){
	if (this._image != null) {
		return this._image;
	}
	ValueExpression ve = getValueExpression("image");
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

public void setImage(String _image){
this._image = _image;
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

public String getLang(){
	if (this._lang != null) {
		return this._lang;
	}
	ValueExpression ve = getValueExpression("lang");
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

public void setLang(String _lang){
this._lang = _lang;
}

public String getOnclick(){
	if (this._onclick != null) {
		return this._onclick;
	}
	ValueExpression ve = getValueExpression("onclick");
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

public void setOnclick(String _onclick){
this._onclick = _onclick;
}

public String getOndblclick(){
	if (this._ondblclick != null) {
		return this._ondblclick;
	}
	ValueExpression ve = getValueExpression("ondblclick");
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

public void setOndblclick(String _ondblclick){
this._ondblclick = _ondblclick;
}

public String getOnkeydown(){
	if (this._onkeydown != null) {
		return this._onkeydown;
	}
	ValueExpression ve = getValueExpression("onkeydown");
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

public void setOnkeydown(String _onkeydown){
this._onkeydown = _onkeydown;
}

public String getOnkeypress(){
	if (this._onkeypress != null) {
		return this._onkeypress;
	}
	ValueExpression ve = getValueExpression("onkeypress");
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

public void setOnkeypress(String _onkeypress){
this._onkeypress = _onkeypress;
}

public String getOnkeyup(){
	if (this._onkeyup != null) {
		return this._onkeyup;
	}
	ValueExpression ve = getValueExpression("onkeyup");
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

public void setOnkeyup(String _onkeyup){
this._onkeyup = _onkeyup;
}

public String getOnmousedown(){
	if (this._onmousedown != null) {
		return this._onmousedown;
	}
	ValueExpression ve = getValueExpression("onmousedown");
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

public void setOnmousedown(String _onmousedown){
this._onmousedown = _onmousedown;
}

public String getOnmousemove(){
	if (this._onmousemove != null) {
		return this._onmousemove;
	}
	ValueExpression ve = getValueExpression("onmousemove");
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

public void setOnmousemove(String _onmousemove){
this._onmousemove = _onmousemove;
}

public String getOnmouseout(){
	if (this._onmouseout != null) {
		return this._onmouseout;
	}
	ValueExpression ve = getValueExpression("onmouseout");
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

public void setOnmouseout(String _onmouseout){
this._onmouseout = _onmouseout;
}

public String getOnmouseover(){
	if (this._onmouseover != null) {
		return this._onmouseover;
	}
	ValueExpression ve = getValueExpression("onmouseover");
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

public void setOnmouseover(String _onmouseover){
this._onmouseover = _onmouseover;
}

public String getOnmouseup(){
	if (this._onmouseup != null) {
		return this._onmouseup;
	}
	ValueExpression ve = getValueExpression("onmouseup");
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

public void setOnmouseup(String _onmouseup){
this._onmouseup = _onmouseup;
}

public String getOutcome(){
return _outcome;
}

public void setOutcome(String _outcome){
this._outcome = _outcome;
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
return _propagation;
}

public void setPropagation(String _propagation){
this._propagation = _propagation;
}

public int getSize(){
	if (this._sizeSet) {
	    return (this._size);
	}
	ValueExpression ve = getValueExpression("size");
	if (ve != null) {
	    Integer value = null;
	    
	    try {
			value = (Integer) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._size);
	    }
	    
	    return value;
	} else {
	    return (this._size);
	}

}

public void setSize(int _size){
this._size = _size;
this._sizeSet = true;
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

public String getTabindex(){
	if (this._tabindex != null) {
		return this._tabindex;
	}
	ValueExpression ve = getValueExpression("tabindex");
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

public void setTabindex(String _tabindex){
this._tabindex = _tabindex;
}

public Object getTaskInstance(){
	if (this._taskInstance != null) {
		return this._taskInstance;
	}
	ValueExpression ve = getValueExpression("taskInstance");
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

public void setTaskInstance(Object _taskInstance){
this._taskInstance = _taskInstance;
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

    return null;
	

}

public void setType(String _type){
this._type = _type;
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
Object [] state = new Object[35];
state[0] = super.saveState(context);
state[1] = _accesskey;
state[2] = saveAttachedState(context, _actionExpression);
state[3] = saveAttachedState(context, _actionListener);
state[4] = _alt;
state[5] = _conversationName;
state[6] = _dir;
state[7] = Boolean.valueOf(_disabled);
state[8] = Boolean.valueOf(_disabledSet);
state[9] = _image;
state[10] = Boolean.valueOf(_immediate);
state[11] = Boolean.valueOf(_immediateSet);
state[12] = Boolean.valueOf(_includePageParams);
state[13] = Boolean.valueOf(_includePageParamsSet);
state[14] = _lang;
state[15] = _onclick;
state[16] = _ondblclick;
state[17] = _onkeydown;
state[18] = _onkeypress;
state[19] = _onkeyup;
state[20] = _onmousedown;
state[21] = _onmousemove;
state[22] = _onmouseout;
state[23] = _onmouseover;
state[24] = _onmouseup;
state[25] = _pageflow;
state[26] = _propagation;
state[27] = Integer.valueOf(_size);
state[28] = Boolean.valueOf(_sizeSet);
state[29] = _style;
state[30] = _styleClass;
state[31] = _tabindex;
state[32] = _title;
state[33] = _type;
state[34] = _view;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_accesskey = (String)states[1];;
		_actionExpression = (MethodExpression)restoreAttachedState(context, states[2]);
		_actionListener = (MethodBinding)restoreAttachedState(context, states[3]);
		_alt = (String)states[4];;
		_conversationName = (String)states[5];;
		_dir = (String)states[6];;
		_disabled = ((Boolean)states[7]).booleanValue();
		_disabledSet = ((Boolean)states[8]).booleanValue();
		_image = (String)states[9];;
		_immediate = ((Boolean)states[10]).booleanValue();
		_immediateSet = ((Boolean)states[11]).booleanValue();
		_includePageParams = ((Boolean)states[12]).booleanValue();
		_includePageParamsSet = ((Boolean)states[13]).booleanValue();
		_lang = (String)states[14];;
		_onclick = (String)states[15];;
		_ondblclick = (String)states[16];;
		_onkeydown = (String)states[17];;
		_onkeypress = (String)states[18];;
		_onkeyup = (String)states[19];;
		_onmousedown = (String)states[20];;
		_onmousemove = (String)states[21];;
		_onmouseout = (String)states[22];;
		_onmouseover = (String)states[23];;
		_onmouseup = (String)states[24];;
		_pageflow = (String)states[25];;
		_propagation = (String)states[26];;
		_size = ((Integer)states[27]).intValue();
		_sizeSet = ((Boolean)states[28]).booleanValue();
		_style = (String)states[29];;
		_styleClass = (String)states[30];;
		_tabindex = (String)states[31];;
		_title = (String)states[32];;
		_type = (String)states[33];;
		_view = (String)states[34];;
	
}

}
