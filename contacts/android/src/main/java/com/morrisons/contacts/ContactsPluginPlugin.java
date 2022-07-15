package com.morrisons.contacts;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        map.put("firstName", "John");
        map.put("lastName", "Doe");
        map.put("telephone", "1111122222");
        contactList.add(map);

        JSONArray jsonArray = new JSONArray(contactList);
        JSObject ret = new JSObject();
        ret.put("results", jsonArray);

        call.resolve(ret);
    }
}
