package org.jboss.seam.ui.component.html;

import javax.faces.context.FacesContext;
import org.jboss.seam.ui.component.UIConversationName;

public class HtmlConversationName extends UIConversationName{

final static public  String COMPONENT_FAMILY = "org.jboss.seam.ui.ConversationName";

final static public  String COMPONENT_TYPE = "org.jboss.seam.ui.ConversationName";


public HtmlConversationName(){
setRendererType("org.jboss.seam.ui.ConversationNameRenderer");
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
