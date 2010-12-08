package org.jboss.seam.ui.component.html;

import javax.faces.context.FacesContext;
import org.jboss.seam.ui.component.UIConversationId;

public class HtmlConversationId extends UIConversationId{

final public static  String COMPONENT_FAMILY = "org.jboss.seam.ui.ConversationId";

final public static  String COMPONENT_TYPE = "org.jboss.seam.ui.ConversationId";

/*
* viewId
*/
transient private  String _viewId = null;


public HtmlConversationId(){

}

public String getViewId(){
return _viewId;
}

public void setViewId(String _viewId){
this._viewId = _viewId;
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
