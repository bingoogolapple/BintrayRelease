package cn.bingoogolapple.bintrayrelease.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import cn.bingoogolapple.bintrayrelease.TestJCenterClass;

public class MainActivity extends Activity {
    private TextView mResultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mResultTv = (TextView) findViewById(R.id.tv_main_result);
        TestJCenterClass testJCenterClass = new TestJCenterClass();
        mResultTv.setText(testJCenterClass.getChinese() + testJCenterClass.add(5, 10));
    }

}