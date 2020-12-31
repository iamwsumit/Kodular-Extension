package com.test.sumit1334;

import android.content.Context;
import android.util.Log;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.common.ComponentCategory;

@DesignerComponent(version = 1,  description = "only for learning.<br>",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,   iconName = "your icon name or link")
@SimpleObject(external = true)
public class Test extends AndroidNonvisibleComponent {
    private ComponentContainer container;
    public Test(ComponentContainer container) {
        super(container.$form());
        this.container = container;
    }

    String property = "value here";

    @SimpleEvent(description = "Simple event")
//               In this bracket(after block name) you have to pass all variable
    public void Simpleevent(String first,String second){
//        In evry event block you have to write same code and in bracket(after dispatch event)
//        write this,your block name in"",your variable names
        EventDispatcher.dispatchEvent(this,"Siimpleevent",first,second);
    }
    @SimpleFunction(description = "return methode block")
//  If you want to make a return method then write datatype
//  that you want to return after public
    public String returnmethod(String parametres){
//      You have to write your code here
//      Make sure if you have to return that datatype
//      that you have wrote after public
//      if you have written String after public then
//      You can return only String otherwise error
        return parametres;
    }

    @SimpleFunction(description = "non return method block")
//  As you can see I have written void afetr public
//  because I dont want to return anything
//  After block name you have to pass parameter with datatype
    public void nonreturn(String parametres){
//  You have to write your code here
//  I am just storing entered params in store variable
        String store = parametres;
    }

    @SimpleProperty(description = "get datatypes")
//  After public you have to write datatype
//  that you wat to return
// here you have to pass not parameter otherwise error
    public String property(){
//    As I have told you ;
//    You have to store value in variable
//    You can see here I have returned that value here
        return property;
    }

    // For set property block you have to write following code
// you can write here property category and description
    @SimpleProperty(category = PropertyCategory.BEHAVIOR, description = "Set your property")
// Here you have to give the default value
// mainly in all blocks default value is null
// Default value of a lable text = Text For Lable1
    @DesignerProperty(editorType = "String", defaultValue = "")
// On set property block you have to write void after public
    public void setproperty(String value) {

//    Here you have to set the value of vari
        property = value;
    }

    @SimpleFunction(description = "Call event")
//    we have ceated a mehod with 2 params block that calls event
    public void callevent(String firstvalue,String secondvaue){
//    for calling event
//    Just write event block name and pass the value by sequence in bracket
//    And you will got the value in event block
        Simpleevent(firstvalue, secondvaue);
    }



