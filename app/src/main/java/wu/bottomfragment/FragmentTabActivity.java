package wu.bottomfragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;

import wu.baselib.BaseActivity;

public class FragmentTabActivity extends BaseActivity implements OnClickListener {
    private View mTabWeixin;
    private View mTabFriend;

    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private PreferenceFragment1 fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.fragmen_main);

        // 初始化控件和声明事件
        mTabWeixin = findViewById(R.id.textView);
        mTabFriend = findViewById(R.id.textView2);
        mTabWeixin.setOnClickListener(this);
        mTabFriend.setOnClickListener(this);
        findViewById(R.id.textView3).setOnClickListener(this);

        // 设置默认的Fragment
        if (savedInstanceState == null)
            setDefaultFragment();
    }

    private void setDefaultFragment() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        fragment1 = new Fragment1();
        transaction.add(R.id.id_content, fragment1, "1");
        transaction.commit();
    }

    @Override
    public void onClick(View v) {
        FragmentManager fm = getFragmentManager();
        // 开启Fragment事务
        FragmentTransaction transaction = fm.beginTransaction();

        switch (v.getId()) {
            case R.id.textView:
                if (fragment1 == null) {
                    fragment1 = new Fragment1();
                    transaction.add(R.id.id_content, fragment1, "1");
                } else {
                    transaction.show(fragment1);
                }
                if (fragment2 != null) {
                    transaction.hide(fragment2);
                }
                break;
            case R.id.textView2:
                if (fragment2 == null) {
                    fragment2 = new Fragment2();
                    transaction.add(R.id.id_content, fragment2, "2");
                } else {
                    transaction.show(fragment2);
                }

                if (fragment1 != null && !fragment1.isHidden()) {
                    transaction.hide(fragment1);
                }
                break;
            case R.id.textView3:
                if (fragment3 == null) {
                    fragment3 = new PreferenceFragment1();
                    transaction.add(R.id.id_content, fragment3, "2");
                } else {
                    transaction.show(fragment3);
                }



                if (fragment1 != null && !fragment1.isHidden()) {
                    transaction.hide(fragment1);
                }
                if (fragment2 != null && !fragment2.isHidden()) {
                    transaction.hide(fragment2);
                }
                break;
        }
        // 事务提交
        transaction.commit();
    }

}
