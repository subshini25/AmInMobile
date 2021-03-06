package org.simple.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btn = (Button) findViewById(R.id.button1);
        
        btn.setOnClickListener(new OnClickListener() {
        	
			@Override
			public void onClick(View arg0) {
				Toast toast = Toast.makeText(MainActivity.this, ((EditText) findViewById(R.id.textView1)).getText().toString(), Toast.LENGTH_LONG);
				toast.show();
				Log.i("MainActivity", "Inside Toaster");
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
