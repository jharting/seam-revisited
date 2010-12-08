package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import org.jboss.seam.ui.component.UILink;

public class HtmlLink extends UILink{

final public static  String COMPONENT_FAMILY = "org.jboss.seam.ui.Link";

final public static  String COMPONENT_TYPE = "org.jboss.seam.ui.Link";

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
* The character encoding of a resource designated by this hyperlink
*/
private  String _charset = null;

/*
* The name of the conversation for natural conversations
*/
private  String _conversationName = null;

/*
* The attribute specifies shape and it position on the screen. 
        Possible values: "rect: left-x, top-y, right-x, bottom-y", "circle: center-x, center-y, radius", "poly: x1, y1, x2, y2, ..., xN, yN". 
        Notes: 
        a) when giving the radius value in percents, user agents should calculate the final radius value in pixels based on the associated object's width and height; 
        b) the radius value should be smaller than center-x and center-y values; 
        c) for a polygon, the first and last coordinate pairs should have same x and y to close the shape (x1=xN; y1=yN) 
        (when these coordinates are different, user agents should infer an additional pair to close a polygon). 
        Coordinates are relative to the top left corner of an object. All values are lengths. All values are comma separated.
*/
private  String _coords = null;

/*
* Direction indication for text that does not inherit
			directionality. Valid values are "LTR" (left-to-right)
			and "RTL" (right-to-left)
*/
private  String _dir = null;

/*
* If true, write the link as disabled in HTML
*/
private  boolean _disabled = false;

private  boolean _disabledSet = false;

/*
* the fragment identifier to link to.
*/
private  String _fragment = null;

/*
* Base language of a resource specified with the href attribute; hreflang may only be used with href
*/
private  String _hreflang = null;

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
* The client-side script method to be called when the element loses the focus either when pointing a device or tabbing navigation. The attribute may be used with the same elements as onfocus
*/
private  String _onblur = null;

/*
* The client-side script method to be called when the element is clicked
*/
private  String _onclick = null;

/*
* The client-side script method to be called when the element is double-clicked
*/
private  String _ondblclick = null;

/*
* The client-side script method to be called when the element gets the focus
*/
private  String _onfocus = null;

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
* The outcome to use when evaluating navigation rules
*/
private  String _outcome = null;

/*
* a pageflow definition to begin. (This is only useful when propagation="begin" or propagation="join".)
*/
private  String _pageflow = null;

/*
* determines the conversation propagation style: begin, join, nest, none, end or endRoot.
*/
private  String _propagation = null;

/*
* The relationship from the current document to the anchor specified by this hyperlink. The value of this attribute is a space-separated list of link types
*/
private  String _rel = null;

/*
* A reverse link from the anchor specified by this hyperlink to the current document. The value of this attribute is a space-separated list of link types
*/
private  String _rev = null;

/*
* This attribute specifies the shape of a region. The possible values are "default", "rect", "circle" and "poly".
*/
private  String _shape = null;

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
* This attribute specifies the name of a frame where a document is to be opened.
            
            By assigning a name to a frame via the name attribute, authors can refer to it as the "target" of links defined by other elements
*/
private  String _target = null;

/*
* Specify the task to operate on (e.g. for @StartTask)
*/
transient private  Object _taskInstance = null;

/*
* Advisory title information about markup elements generated for this component
*/
private  String _title = null;

/*
* The content type of the resource designated by this hyperlink
*/
private  String _type = null;

/*
* the JSF view id to link to.
*/
private  String _view = null;


public HtmlLink(){
setRendererType("org.jboss.seam.ui.LinkRenderer");
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

public String getCharset(){
	if (this._charset != null) {
		return this._charset;
	}
	ValueExpression ve = getValueExpression("charset");
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

public void setCharset(String _charset){
this._charset = _charset;
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

public String getCoords(){
	if (this._coords != null) {
		return this._coords;
	}
	ValueExpression ve = getValueExpression("coords");
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

public void setCoords(String _coords){
this._coords = _coords;
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

public String getHreflang(){
	if (this._hreflang != null) {
		return this._hreflang;
	}
	ValueExpression ve = getValueExpression("hreflang");
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

public void setHreflang(String _hreflang){
this._hreflang = _hreflang;
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

public String getOnblur(){
	if (this._onblur != null) {
		return this._onblur;
	}
	ValueExpression ve = getValueExpression("onblur");
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

public void setOnblur(String _onblur){
this._onblur = _onblur;
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

public String getOnfocus(){
	if (this._onfocus != null) {
		return this._onfocus;
	}
	ValueExpression ve = getValueExpression("onfocus");
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

public void setOnfocus(String _onfocus){
this._onfocus = _onfocus;
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
	if (this._outcome != null) {
		return this._outcome;
	}
	ValueExpression ve = getValueExpression("outcome");
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

    return "default";
	

}

public void setPropagation(String _propagation){
this._propagation = _propagation;
}

public String getRel(){
	if (this._rel != null) {
		return this._rel;
	}
	ValueExpression ve = getValueExpression("rel");
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

public void setRel(String _rel){
this._rel = _rel;
}

public String getRev(){
	if (this._rev != null) {
		return this._rev;
	}
	ValueExpression ve = getValueExpression("rev");
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

public void setRev(String _rev){
this._rev = _rev;
}

public String getShape(){
	if (this._shape != null) {
		return this._shape;
	}
	ValueExpression ve = getValueExpression("shape");
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

public void setShape(String _shape){
this._shape = _shape;
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

public String getTarget(){
	if (this._target != null) {
		return this._target;
	}
	ValueExpression ve = getValueExpression("target");
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

public void setTarget(String _target){
this._target = _target;
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
Object [] state = new Object[42];
state[0] = super.saveState(context);
state[1] = _accesskey;
state[2] = saveAttachedState(context, _actionExpression);
state[3] = saveAttachedState(context, _actionListener);
state[4] = _charset;
state[5] = _conversationName;
state[6] = _coords;
state[7] = _dir;
state[8] = Boolean.valueOf(_disabled);
state[9] = Boolean.valueOf(_disabledSet);
state[10] = _fragment;
state[11] = _hreflang;
state[12] = Boolean.valueOf(_immediate);
state[13] = Boolean.valueOf(_immediateSet);
state[14] = Boolean.valueOf(_includePageParams);
state[15] = Boolean.valueOf(_includePageParamsSet);
state[16] = _lang;
state[17] = _onblur;
state[18] = _onclick;
state[19] = _ondblclick;
state[20] = _onfocus;
state[21] = _onkeydown;
state[22] = _onkeypress;
state[23] = _onkeyup;
state[24] = _onmousedown;
state[25] = _onmousemove;
state[26] = _onmouseout;
state[27] = _onmouseover;
state[28] = _onmouseup;
state[29] = _outcome;
state[30] = _pageflow;
state[31] = _propagation;
state[32] = _rel;
state[33] = _rev;
state[34] = _shape;
state[35] = _style;
state[36] = _styleClass;
state[37] = _tabindex;
state[38] = _target;
state[39] = _title;
state[40] = _type;
state[41] = _view;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_accesskey = (String)states[1];;
		_actionExpression = (MethodExpression)restoreAttachedState(context, states[2]);
		_actionListener = (MethodBinding)restoreAttachedState(context, states[3]);
		_charset = (String)states[4];;
		_conversationName = (String)states[5];;
		_coords = (String)states[6];;
		_dir = (String)states[7];;
		_disabled = ((Boolean)states[8]).booleanValue();
		_disabledSet = ((Boolean)states[9]).booleanValue();
		_fragment = (String)states[10];;
		_hreflang = (String)states[11];;
		_immediate = ((Boolean)states[12]).booleanValue();
		_immediateSet = ((Boolean)states[13]).booleanValue();
		_includePageParams = ((Boolean)states[14]).booleanValue();
		_includePageParamsSet = ((Boolean)states[15]).booleanValue();
		_lang = (String)states[16];;
		_onblur = (String)states[17];;
		_onclick = (String)states[18];;
		_ondblclick = (String)states[19];;
		_onfocus = (String)states[20];;
		_onkeydown = (String)states[21];;
		_onkeypress = (String)states[22];;
		_onkeyup = (String)states[23];;
		_onmousedown = (String)states[24];;
		_onmousemove = (String)states[25];;
		_onmouseout = (String)states[26];;
		_onmouseover = (String)states[27];;
		_onmouseup = (String)states[28];;
		_outcome = (String)states[29];;
		_pageflow = (String)states[30];;
		_propagation = (String)states[31];;
		_rel = (String)states[32];;
		_rev = (String)states[33];;
		_shape = (String)states[34];;
		_style = (String)states[35];;
		_styleClass = (String)states[36];;
		_tabindex = (String)states[37];;
		_target = (String)states[38];;
		_title = (String)states[39];;
		_type = (String)states[40];;
		_view = (String)states[41];;
	
}

}
