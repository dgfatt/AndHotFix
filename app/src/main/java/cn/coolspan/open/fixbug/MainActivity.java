package cn.coolspan.open.fixbug;

import java.io.File;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

/**
 * MainActivity 2015-12-22 下午10:30:57
 *
 * @author 乔晓松 965266509@qq.com
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                MyApplication myApplication = (MyApplication) getApplication();
                File patch = new File(
                        Environment.getExternalStorageDirectory(), "patch.jar");
                myApplication.fixBugManage.addPatch(patch.getAbsolutePath());
            }
        });
        findViewById(R.id.button2).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "...bug...",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
