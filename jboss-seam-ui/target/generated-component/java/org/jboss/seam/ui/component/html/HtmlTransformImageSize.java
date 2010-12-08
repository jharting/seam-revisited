package org.jboss.seam.ui.component.html;

import javax.el.ELException;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import org.jboss.seam.ui.graphicImage.UITransformImageSize;

public class HtmlTransformImageSize extends UITransformImageSize{

final public static  String COMPONENT_FAMILY = "org.jboss.seam.ui.graphicImage.TransformImageSize";

final public static  String COMPONENT_TYPE = "org.jboss.seam.ui.graphicImage.TransformImageSize";

/*
* Change the size of the image by a fraction. If factor is specified, height, width and maintainRatio should not be specified
*/
private  Double _factor = null;

/*
* The new height of the image
*/
private  Integer _height = null;

/*
* If true, don't alter the ratio of the image. In this case only height or width should be specificed.
*/
private  boolean _maintainRatio = false;

private  boolean _maintainRatioSet = false;

/*
* The new width of the image
*/
private  Integer _width = null;


public HtmlTransformImageSize(){

}

public Double getFactor(){
	if (this._factor != null) {
		return this._factor;
	}
	ValueExpression ve = getValueExpression("factor");
	if (ve != null) {
	    Double value = null;
	    
	    try {
			value = (Double) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    return value;
	} 

    return null;
	

}

public void setFactor(Double _factor){
this._factor = _factor;
}

public Integer getHeight(){
	if (this._height != null) {
		return this._height;
	}
	ValueExpression ve = getValueExpression("height");
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

public void setHeight(Integer _height){
this._height = _height;
}

public boolean isMaintainRatio(){
	if (this._maintainRatioSet) {
	    return (this._maintainRatio);
	}
	ValueExpression ve = getValueExpression("maintainRatio");
	if (ve != null) {
	    Boolean value = null;
	    
	    try {
			value = (Boolean) ve.getValue(getFacesContext().getELContext());
	    } catch (ELException e) {
			throw new FacesException(e);
	    }
	    
	    if (null == value) {
			return (this._maintainRatio);
	    }
	    
	    return value;
	} else {
	    return (this._maintainRatio);
	}

}

public void setMaintainRatio(boolean _maintainRatio){
this._maintainRatio = _maintainRatio;
this._maintainRatioSet = true;
}

public Integer getWidth(){
	if (this._width != null) {
		return this._width;
	}
	ValueExpression ve = getValueExpression("width");
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

public void setWidth(Integer _width){
this._width = _width;
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[6];
state[0] = super.saveState(context);
state[1] = _factor;
state[2] = _height;
state[3] = Boolean.valueOf(_maintainRatio);
state[4] = Boolean.valueOf(_maintainRatioSet);
state[5] = _width;
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);
	_factor = (Double)states[1];;
		_height = (Integer)states[2];;
		_maintainRatio = ((Boolean)states[3]).booleanValue();
		_maintainRatioSet = ((Boolean)states[4]).booleanValue();
		_width = (Integer)states[5];;
	
}

}
