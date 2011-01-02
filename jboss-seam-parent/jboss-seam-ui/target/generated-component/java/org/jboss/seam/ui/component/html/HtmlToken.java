package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import org.jboss.seam.ui.component.UIToken;

public class HtmlToken extends UIToken{

final static public  String COMPONENT_FAMILY = "org.jboss.seam.ui.Token";

final static public  String COMPONENT_TYPE = "org.jboss.seam.ui.Token";

/*
* A flag indicating whether the form can be submitted multiple times with the same signature (i.e., token).
*/
private  boolean _allowMultiplePosts = false;

private  boolean _allowMultiplePostsSet = false;

/*
* A flag indicating whether a notice should be presented to the user if cookies are disabled.
*/
private  boolean _enableCookieNotice = false;

private  boolean _enableCookieNoticeSet = false;

/*
* A flag indicating whether the session id should be tied into the secure token.
*/
private  boolean _requireSession = false;

private  boolean _requireSessionSet = false;


public HtmlToken(){
setRendererType("org.jboss.seam.ui.TokenRenderer");
}

public boolean isAllowMultiplePosts(){
	if (this._allowMultiplePostsSet) {
	    return (this._allowMultiplePosts);
	}
	ValueExpression ve = getValueExpression("allowMultiplePosts");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._allowMultiplePosts);
	    }
	    
	    return value;
	} else {
	    return (this._allowMultiplePosts);
	}

}

public void setAllowMultiplePosts(boolean _allowMultiplePosts){
this._allowMultiplePosts = _allowMultiplePosts;
this._allowMultiplePostsSet = true;
}

public boolean isEnableCookieNotice(){
	if (this._enableCookieNoticeSet) {
	    return (this._enableCookieNotice);
	}
	ValueExpression ve = getValueExpression("enableCookieNotice");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._enableCookieNotice);
	    }
	    
	    return value;
	} else {
	    return (this._enableCookieNotice);
	}

}

public void setEnableCookieNotice(boolean _enableCookieNotice){
this._enableCookieNotice = _enableCookieNotice;
this._enableCookieNoticeSet = true;
}

public boolean isRequireSession(){
	if (this._requireSessionSet) {
	    return (this._requireSession);
	}
	ValueExpression ve = getValueExpression("requireSession");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._requireSession);
	    }
	    
	    return value;
	} else {
	    return (this._requireSession);
	}

}

public void setRequireSession(boolean _requireSession){
this._requireSession = _requireSession;
this._requireSessionSet = true;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[7];
state[0] = super.saveState(context);
state[1] = Boolean.valueOf(_allowMultiplePosts);
state[2] = Boolean.valueOf(_allowMultiplePostsSet);
state[3] = Boolean.valueOf(_enableCookieNotice);
state[4] = Boolean.valueOf(_enableCookieNoticeSet);
state[5] = Boolean.valueOf(_requireSession);
state[6] = Boolean.valueOf(_requireSessionSet);
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_allowMultiplePosts = ((Boolean)states[1]).booleanValue();
		_allowMultiplePostsSet = ((Boolean)states[2]).booleanValue();
		_enableCookieNotice = ((Boolean)states[3]).booleanValue();
		_enableCookieNoticeSet = ((Boolean)states[4]).booleanValue();
		_requireSession = ((Boolean)states[5]).booleanValue();
		_requireSessionSet = ((Boolean)states[6]).booleanValue();
	
}

}
