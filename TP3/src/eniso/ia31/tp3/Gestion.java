package eniso.ia31.tp3;

import eniso.ia31.tp3.appels.TabHostActivity;
import eniso.ia31.tp3.contact.AddContactActivity;
import eniso.ia31.tp3.contact.DeleteContactActivity;
import eniso.ia31.tp3.contact.UpdateContactActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Gestion extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gestion);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_gestion, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.item_gestion_add_contact:
			Intent intent =new Intent(getApplicationContext(),AddContactActivity.class);
			startActivity(intent);
			return true;
			
		case R.id.item_gestion_modifier_contact:
			Intent intent1 =new Intent(getApplicationContext(),UpdateContactActivity.class);
			startActivity(intent1);
			return true;
	
		case R.id.item_gestion_supprimer_contact:
			Intent intent11 =new Intent(getApplicationContext(),DeleteContactActivity.class);
			startActivity(intent11);
			return true;
		case R.id.menu_gestion_appels:
			Intent intent111 =new Intent(getApplicationContext(),TabHostActivity.class);
			startActivity(intent111);
			return true;
			
		default:
			return super.onContextItemSelected(item);
		}
	}

//	@Override
//	public boolean onContextItemSelected(MenuItem item) {
//		switch (item.getItemId()) {
//		case R.id.item_gestion_add_contact:
//			Toast.makeText(this, "add", Toast.LENGTH_SHORT).show();
//			Log.i("osama", "ok");
//			return true;
//
//		default:
//			return super.onContextItemSelected(item);
//		}
//	}

}
