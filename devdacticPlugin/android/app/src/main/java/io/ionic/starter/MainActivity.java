package io.ionic.starter;
import android.os.Bundle;
import com.getcapacitor.Plugin;

import java.util.ArrayList;

import com.morrisons.contacts.ContactsPluginPlugin;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Initializes the Bridge
    this.init(savedInstanceState, new ArrayList<Class<? extends Plugin>>() {{
      // Additional plugins you've installed go here
      add(ContactsPluginPlugin.class);
    }});
  }
}
