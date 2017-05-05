package model;

import org.springframework.beans.propertyeditors.PropertiesEditor;
//mport  java.beans.PropertyEditorSupport;
/**
 * Created by linhtran on 04/05/2017.
 */
public class PersonNameEditor extends PropertiesEditor {
    @Override
    public void setAsText(String personName) throws IllegalArgumentException {
        if(personName.contains("Mr.")||personName.contains("Ms"))
        {
            setValue(personName);
        }else {
            personName="Mr."+personName;
            setValue(personName);
        }
    }
}
