package ro.cipri.stack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityStackActivity extends Activity {
	static public String TAG = "HomeActivity";
	
	public static final String INTENT_EXTRA_LOGOUT = "logout";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.i(TAG, "onCreate");
        this.setTitle(TAG);
        
        if (getIntent().hasExtra(INTENT_EXTRA_LOGOUT)) {
        	login();
        }
    }
    
    
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i(TAG, "onDestroy");
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onNewIntent(android.content.Intent)
	 */
	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		
		Log.i(TAG, "onNewIntent");
		if (intent.hasExtra(INTENT_EXTRA_LOGOUT)) {
			login();
        }
		
	}

	void login() {
		Intent intent2 = new Intent(this, LoginActivity.class);
		intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		this.startActivity(intent2);
		this.finish();
	}

	@Override
	protected void onRestart() {
		
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
		Intent intent = new Intent(this, FirstActivity.class);
		
		//intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
		this.startActivity(intent);
	}
	
	public void homeActivity(View view) {
		//Intent intent = new Intent(this, ActivityStackActivity.class); 
		Intent intent = new Intent(this, LoginActivity.class);
		this.startActivity(intent);
		this.finish();
	}
	
}