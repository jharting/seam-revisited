package org.jboss.seam.ui.component.html;

import javax.faces.context.FacesContext;
import org.jboss.seam.ui.component.UILabel;

public class HtmlLabel extends UILabel{

final static public  String COMPONENT_FAMILY = "javax.faces.Output";

final static public  String COMPONENT_TYPE = "org.jboss.seam.ui.Label";


public HtmlLabel(){

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
