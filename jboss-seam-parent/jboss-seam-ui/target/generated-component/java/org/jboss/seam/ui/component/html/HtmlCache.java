package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import org.jboss.seam.cache.CacheProvider;
import org.jboss.seam.ui.component.UICache;

public class HtmlCache extends UICache{

final static public  String COMPONENT_FAMILY = "org.jboss.seam.ui.Cache";

final static public  String COMPONENT_TYPE = "org.jboss.seam.ui.Cache";

/*
* The cache provider to use, only needed if you install alter the default cache provider in an application where multiple cache providers are in use
*/
private  CacheProvider _cacheProvider = null;

/*
* a value expression that determines if the cache should be used.
*/
private  boolean _enabled = true;

private  boolean _enabledSet = false;

/*
* the key to cache rendered content, often a value expression. For example, if we were caching a page fragment that displays a document, we might use key="Document-#{document.id}".
*/
private  String _key = null;

/*
* a cache node to use (different nodes can have different expiry policies).
*/
private  String _region = null;


public HtmlCache(){
setRendererType("org.jboss.seam.ui.CacheRenderer");
}

public CacheProvider getCacheProvider(){
	if (this._cacheProvider != null) {
		return this._cacheProvider;
	}
	ValueExpression ve = getValueExpression("cacheProvider");
	if (ve != null) {
	    CacheProvider value = null;
	    
	    try {
			value = (CacheProvider) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return org.jboss.seam.cache.CacheProvider.instance();
	

}

public void setCacheProvider(CacheProvider _cacheProvider){
this._cacheProvider = _cacheProvider;
}

public boolean isEnabled(){
	if (this._enabledSet) {
	    return (this._enabled);
	}
	ValueExpression ve = getValueExpression("enabled");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._enabled);
	    }
	    
	    return value;
	} else {
	    return (this._enabled);
	}

}

public void setEnabled(boolean _enabled){
this._enabled = _enabled;
this._enabledSet = true;
}

public String getKey(){
	if (this._key != null) {
		return this._key;
	}
	ValueExpression ve = getValueExpression("key");
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

public void setKey(String _key){
this._key = _key;
}

public String getRegion(){
	if (this._region != null) {
		return this._region;
	}
	ValueExpression ve = getValueExpression("region");
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

public void setRegion(String _region){
this._region = _region;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[6];
state[0] = super.saveState(context);
state[1] = saveAttachedState(context, _cacheProvider);
state[2] = Boolean.valueOf(_enabled);
state[3] = Boolean.valueOf(_enabledSet);
state[4] = _key;
state[5] = _region;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_cacheProvider = (CacheProvider)restoreAttachedState(context, states[1]);
		_enabled = ((Boolean)states[2]).booleanValue();
		_enabledSet = ((Boolean)states[3]).booleanValue();
		_key = (String)states[4];;
		_region = (String)states[5];;
	
}

}
