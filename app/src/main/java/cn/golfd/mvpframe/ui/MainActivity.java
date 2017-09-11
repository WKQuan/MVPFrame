package cn.golfd.mvpframe.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import cn.golfd.mvpframe.R;
import cn.golfd.mvpframe.presenter.TextPresenter;
import cn.golfd.mvpframe.presenter.listener.OnGetTextListener;

public class MainActivity extends AppCompatActivity implements OnGetTextListener,View.OnClickListener{

    private Button btn;
    private TextView textview;

    private TextPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化控件
        initView();
        //获取数据
        initData();
    }

    //初始化控件
    private void initView() {
        btn = (Button) findViewById(R.id.btn);
        textview = (TextView) findViewById(R.id.textview);
        btn.setOnClickListener(this);
    }

    //获取数据
    private void initData() {
        presenter = new TextPresenter(this);
    }

    //数据成功回调
    @Override
    public void onGetTextSuccess(String string) {
        textview.setText("回调成功：" + string);

    }

    //数据失败回调
    @Override
    public void onFetTextFail(String string) {
        textview.setText("回调失败：" + string);
    }

    @Override
    public void onClick(View v) {
        presenter.onGetText();
    }
}
