package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import org.jboss.seam.ui.component.UIResource;

public class HtmlResource extends UIResource{

final public static  String COMPONENT_FAMILY = "org.jboss.seam.ui.Resource";

final public static  String COMPONENT_TYPE = "org.jboss.seam.ui.Resource";

/*
* Content-type of given data
*/
private  String _contentType = null;

/*
* Inputstream, File or byte[].
*/
private  Object _data = null;

/*
* Content-Disposition for file (default: inline)
*/
private  String _disposition = null;

/*
* file name to send to browser (default: name of view)
*/
private  String _fileName = null;


public HtmlResource(){
setRendererType("org.jboss.seam.ui.ResourceRenderer");
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

public String getDisposition(){
	if (this._disposition != null) {
		return this._disposition;
	}
	ValueExpression ve = getValueExpression("disposition");
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

public void setDisposition(String _disposition){
this._disposition = _disposition;
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

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[5];
state[0] = super.saveState(context);
state[1] = _contentType;
state[2] = saveAttachedState(context, _data);
state[3] = _disposition;
state[4] = _fileName;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_contentType = (String)states[1];;
		_data = (Object)restoreAttachedState(context, states[2]);
		_disposition = (String)states[3];;
		_fileName = (String)states[4];;
	
}

}
