package com.paad.contactpicker;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Preferences extends PreferenceActivity {

  public static final String PREF_NAME_LEN = "PREF_NAME_LEN";

  SharedPreferences prefs;

  @Override
  public void onCreate(Bundle icicle) {
    super.onCreate(icicle);
    addPreferencesFromResource(R.xml.userpreferences);	
  }  
}