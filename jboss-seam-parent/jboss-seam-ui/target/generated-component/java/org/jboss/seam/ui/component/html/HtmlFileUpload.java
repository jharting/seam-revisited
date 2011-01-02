package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import org.jboss.seam.ui.component.UIFileUpload;

public class HtmlFileUpload extends UIFileUpload{

final static public  String COMPONENT_FAMILY = "org.jboss.seam.ui.FileUpload";

final static public  String COMPONENT_TYPE = "org.jboss.seam.ui.FileUpload";

/*
* a comma-separated list of content types to accept, may not be supported by the browser. E.g. "images/png,images/jpg", "images/*".
*/
transient private  String _accept = null;

/*
* This attribute assigns an access key to an element. An access key is a single character from the document character set. Note: Authors should consider the input method of the expected reader when specifying an accesskey
*/
private  String _accesskey = null;

/*
* Deprecated. This attribute specifies the horizontal alignment of its element with respect to the surrounding context. The  possible values are "left", "center", "right" and "justify".  
            The default depends on the base text direction. For left to right text, the default is align="left", while for right to left text, the default is align="right".
*/
private  String _align = null;

/*
* For a user agents that cannot display images, forms, or applets, this attribute specifies alternate text. The language of the alternate text is specified by the lang attribute
*/
private  String _alt = null;

/*
* the property to receive the contentType
*/
private  String _contentType = null;

/*
* this value binding receives the file's content type (optional).
*/
private  Object _data = null;

/*
* When set for a form control, this boolean attribute disables the control for your input
*/
private  boolean _disabled = false;

private  boolean _disabledSet = false;

/*
* this value binding receives the filename (optional).
*/
private  String _fileName = null;

/*
* this value binding receives the file size (optional).
*/
private  Integer _fileSize = null;

/*
* Specifies the maximum number of digits that could be entered into the input field. 
		The maximum number is unlimited by default. 
		If entered value exceeds the value specified in "maxValue" attribute than the slider takes a maximum value position.
*/
private  int _maxlength = Integer.MIN_VALUE;

private  boolean _maxlengthSet = false;

/*
* The client-side script method to be called when the element loses the focus
*/
private  String _onblur = null;

/*
* The client-side script method to be called when the element value is changed
*/
private  String _onchange = null;

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
* The client-side script method to be called when some text is selected in the text field. This attribute can be used with the INPUT and TEXTAREA elements.
*/
private  String _onselect = null;

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


public HtmlFileUpload(){
setRendererType("org.jboss.seam.ui.FileUploadRenderer");
}

public String getAccept(){
	if (this._accept != null) {
		return this._accept;
	}
	ValueExpression ve = getValueExpression("accept");
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

public void setAccept(String _accept){
this._accept = _accept;
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

public String getAlign(){
	if (this._align != null) {
		return this._align;
	}
	ValueExpression ve = getValueExpression("align");
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

public void setAlign(String _align){
this._align = _align;
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

public String getContentType(){
	if (this._contentType != null) {
		return this._contentType;
	}
	ValueExpression ve = getValueExpression("contentType");
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

public void setContentType(String _contentType){
this._contentType = _contentType;
}

public Object getData(){
	if (this._data != null) {
		return this._data;
	}
	ValueExpression ve = getValueExpression("data");
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

public void setData(Object _data){
this._data = _data;
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

public String getFileName(){
	if (this._fileName != null) {
		return this._fileName;
	}
	ValueExpression ve = getValueExpression("fileName");
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

public void setFileName(String _fileName){
this._fileName = _fileName;
}

public Integer getFileSize(){
	if (this._fileSize != null) {
		return this._fileSize;
	}
	ValueExpression ve = getValueExpression("fileSize");
	if (ve != null) {
	    Integer value = null;
	    
	    try {
			value = (Integer) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setFileSize(Integer _fileSize){
this._fileSize = _fileSize;
}

public int getMaxlength(){
	if (this._maxlengthSet) {
	    return (this._maxlength);
	}
	ValueExpression ve = getValueExpression("maxlength");
	if (ve != null) {
	    Integer value = null;
	    
	    try {
			value = (Integer) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._maxlength);
	    }
	    
	    return value;
	} else {
	    return (this._maxlength);
	}

}

public void setMaxlength(int _maxlength){
this._maxlength = _maxlength;
this._maxlengthSet = true;
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

public String getOnchange(){
	if (this._onchange != null) {
		return this._onchange;
	}
	ValueExpression ve = getValueExpression("onchange");
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

public void setOnchange(String _onchange){
this._onchange = _onchange;
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

public String getOnselect(){
	if (this._onselect != null) {
		return this._onselect;
	}
	ValueExpression ve = getValueExpression("onselect");
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

public void setOnselect(String _onselect){
this._onselect = _onselect;
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

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[31];
state[0] = super.saveState(context);
state[1] = _accesskey;
state[2] = _align;
state[3] = _alt;
state[4] = _contentType;
state[5] = saveAttachedState(context, _data);
state[6] = Boolean.valueOf(_disabled);
state[7] = Boolean.valueOf(_disabledSet);
state[8] = _fileName;
state[9] = _fileSize;
state[10] = Integer.valueOf(_maxlength);
state[11] = Boolean.valueOf(_maxlengthSet);
state[12] = _onblur;
state[13] = _onchange;
state[14] = _onclick;
state[15] = _ondblclick;
state[16] = _onfocus;
state[17] = _onkeydown;
state[18] = _onkeypress;
state[19] = _onkeyup;
state[20] = _onmousedown;
state[21] = _onmousemove;
state[22] = _onmouseout;
state[23] = _onmouseover;
state[24] = _onmouseup;
state[25] = _onselect;
state[26] = Integer.valueOf(_size);
state[27] = Boolean.valueOf(_sizeSet);
state[28] = _style;
state[29] = _styleClass;
state[30] = _tabindex;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_accesskey = (String)states[1];;
		_align = (String)states[2];;
		_alt = (String)states[3];;
		_contentType = (String)states[4];;
		_data = (Object)restoreAttachedState(context, states[5]);
		_disabled = ((Boolean)states[6]).booleanValue();
		_disabledSet = ((Boolean)states[7]).booleanValue();
		_fileName = (String)states[8];;
		_fileSize = (Integer)states[9];;
		_maxlength = ((Integer)states[10]).intValue();
		_maxlengthSet = ((Boolean)states[11]).booleanValue();
		_onblur = (String)states[12];;
		_onchange = (String)states[13];;
		_onclick = (String)states[14];;
		_ondblclick = (String)states[15];;
		_onfocus = (String)states[16];;
		_onkeydown = (String)states[17];;
		_onkeypress = (String)states[18];;
		_onkeyup = (String)states[19];;
		_onmousedown = (String)states[20];;
		_onmousemove = (String)states[21];;
		_onmouseout = (String)states[22];;
		_onmouseover = (String)states[23];;
		_onmouseup = (String)states[24];;
		_onselect = (String)states[25];;
		_size = ((Integer)states[26]).intValue();
		_sizeSet = ((Boolean)states[27]).booleanValue();
		_style = (String)states[28];;
		_styleClass = (String)states[29];;
		_tabindex = (String)states[30];;
	
}

}
