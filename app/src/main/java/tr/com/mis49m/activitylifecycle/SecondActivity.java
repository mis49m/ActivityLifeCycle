package tr.com.mis49m.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private static String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "onCreate");
        showMessage("onCreate");
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showMessage("onDestroy");
        Log.v(TAG, "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showMessage("onPause");
        Log.v(TAG, "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showMessage("onRestart");
        Log.v(TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showMessage("onResume");
        Log.v(TAG, "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showMessage("onStart");
        Log.v(TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showMessage("onStop");
        Log.v(TAG, "onStop");
    }

    private void showMessage(String msg){
        Toast.makeText(this, TAG + " - " + msg, Toast.LENGTH_LONG).show();
    }
}
