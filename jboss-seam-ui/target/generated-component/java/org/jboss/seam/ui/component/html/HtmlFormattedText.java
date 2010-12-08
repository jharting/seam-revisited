package org.jboss.seam.ui.component.html;

import javax.faces.context.FacesContext;
import org.jboss.seam.ui.component.UIFormattedText;

public class HtmlFormattedText extends UIFormattedText{

final public static  String COMPONENT_FAMILY = "org.jboss.seam.ui.FormattedText";

final public static  String COMPONENT_TYPE = "org.jboss.seam.ui.FormattedText";


public HtmlFormattedText(){
setRendererType("org.jboss.seam.ui.FormattedTextRenderer");
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
