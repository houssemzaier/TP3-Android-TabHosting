package eniso.ia31.tp3.contact;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AddContactActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView textView =new TextView (getApplicationContext());
		textView.setText("AddContactActivity");
		setContentView(textView);
	}
}
