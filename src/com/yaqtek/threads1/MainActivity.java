package com.yaqtek.threads1;

import com.yaqtek.threads1.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Add a listener to the first Button
        Button threadBtn1 = (Button)findViewById(R.id.threadBtn1);
        threadBtn1.setOnClickListener(new Toaster());
        
        // Add a listener to the first Button
        Button threadBtn2 = (Button)findViewById(R.id.threadBtn2);
        threadBtn2.setOnClickListener(new Toaster());
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    private class Toaster implements OnClickListener {
    	@Override
    	public void onClick(View clickedBtn) {
    		
    		int id = clickedBtn.getId();
    		String text = getString(R.string.clicked_string);
    		
    		Toast tempMessage = Toast.makeText(MainActivity.this,
    											text + id,
    											Toast.LENGTH_SHORT);
    		tempMessage.show();		
    	}
    }
   
}
