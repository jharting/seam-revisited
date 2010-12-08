package org.jboss.seam.ui.component.html;

import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;

public class HtmlDefaultAction extends UIOutput{

final public static  String COMPONENT_FAMILY = "org.jboss.seam.ui.DefaultAction";

final public static  String COMPONENT_TYPE = "org.jboss.seam.ui.DefaultAction";


public HtmlDefaultAction(){
setRendererType("org.jboss.seam.ui.DefaultActionRenderer");
}

public String getFamily(){
return COMPONENT_FAMILY;
}

@Override
public Object saveState(FacesContext context){
Object [] state = new Object[1];
state[0] = super.saveState(context);
return state;
}

@Override
public void restoreState(FacesContext context, Object state){
Object[] states = (Object[]) state;
super.restoreState(context, states[0]);

}

}
