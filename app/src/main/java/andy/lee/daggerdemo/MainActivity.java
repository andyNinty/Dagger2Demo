package andy.lee.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    @Inject
    User mUser;
    @Inject
    Gson mGson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 使用Dagger2生成的类 生成组件进行构造，并注入
        DaggerMainComponent.builder()
                .build()
                .inject(this);

        initViews();

    }

    private void initViews() {
        mTextView = (TextView) findViewById(R.id.name);
        String json = mGson.toJson(mUser);
        mTextView.setText(json);

    }
}
