package com.morrisons.contacts;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "ContactsPlugin")
public class ContactsPluginPlugin extends Plugin {

    private ContactsPlugin implementation = new ContactsPlugin();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @PluginMethod()
    public void getContacts(PluginCall call) {

        ArrayList<Map> contactList = new ArrayList<>();
        Map<String,String> map =  new HashMap<String, String>();
 
        map.put("firstName", "Arif");
        map.put("lastName", "Shaikh");
        map.put("telephone", "1111111111");

        contactList.add(map);
        call.resolve(contactList);
    }
}
