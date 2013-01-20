package eniso.ia31.tp3.appels;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class AppelsRecusActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Toast.makeText(getApplicationContext(), "AppelsRecusActivity",
				Toast.LENGTH_SHORT).show();
		TextView textView =new TextView (getApplicationContext());
		textView.setText("AppelsRecusActivity");
		setContentView(textView);
	}
}
