package eniso.ia31.tp3.appels;

import eniso.ia31.tp3.R;
import eniso.ia31.tp3.R.layout;
import eniso.ia31.tp3.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.app.ActivityGroup;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabHostActivity extends ActivityGroup {

	private TabHost tabHost; 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_host);
        tabHost=(TabHost)findViewById(R.id.tabhost);
//        tabHost.setup();
        tabHost.setup(getLocalActivityManager());
        Intent intent=new Intent().setClass(getApplicationContext(), AppelAbsenceActivity.class);
        TabSpec tabSpec= tabHost.newTabSpec("AppelAbsence");
        tabSpec.setIndicator("AppelAbsence", getResources().getDrawable(R.drawable.ic_launcher));
//        tabSpec.setContent(intent);
        tabSpec.setContent(intent);
        tabHost.addTab(tabSpec);
        
        //
//        Intent intent2=new Intent().setClass(getApplicationContext(), AppelEmisActivity.class);
//        tabHost.addTab(tabHost.newTabSpec("AppelEmisActivity").setIndicator("AppelEmisActivity", getResources().getDrawable(R.drawable.ic_menu_appels)).setContent(intent2));
//
//        Intent intent3=new Intent().setClass(getApplicationContext(), AppelsRecusActivity.class);
//        tabHost.addTab(tabHost.newTabSpec("AppelsRecusActivity").setIndicator("AppelsRecusActivity", getResources().getDrawable(R.drawable.ic_menu_appels)).setContent(intent3));
//        
        
    }

  
}
