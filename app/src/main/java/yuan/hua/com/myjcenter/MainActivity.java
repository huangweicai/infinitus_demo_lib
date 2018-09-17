package yuan.hua.com.myjcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.infinitus_demo_lib.TestUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestUtil.test1(this);
    }
}
