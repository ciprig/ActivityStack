/**
 * 
 */
package ro.cipri.stack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * @author ciprian
 *
 */
public class FirstActivity extends Activity {

	static public String TAG = "FirstActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        Log.i(TAG, "onCreate");
        this.setTitle(TAG);
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i(TAG, "onDestroy");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		
		Log.i(TAG, "onRestart");
	}

	@Override
	protected void onStart() {
		Log.i(TAG, "onStart");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.i(TAG, "onStop");
		super.onStop();
	}
	
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onPause()
	 */
	@Override
	protected void onPause() {
		Log.i(TAG, "onPause");
		super.onPause();
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onUserLeaveHint()
	 */
	@Override
	protected void onUserLeaveHint() {
		Log.i(TAG, "onUserLeaveHint");
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onUserInteraction()
	 */
	@Override
	public void onUserInteraction() {
		Log.i(TAG, "onUserInteraction");
	}
	
	public void nextActivity(View view) {
		this.startActivity(new Intent(this, SecondActivity.class));
	}

	
	public void homeActivity(View view) {
		//Intent intent = new Intent(this, ActivityStackActivity.class); 
		Intent intent = new Intent(Intent.ACTION_MAIN);
		intent.setClass(this, ActivityStackActivity.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK );//  Intent.FLAG_ACTIVITY_SINGLE_TOP 
		this.startActivity(intent);		
	}
}
