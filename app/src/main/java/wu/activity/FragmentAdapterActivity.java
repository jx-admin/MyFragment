package wu.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import wu.baselib.BaseFragmentActivity;
import wu.bottomfragment.FragmentText;
import wu.bottomfragment.R;

/**
 * Created by jx on 2016/10/25.
 */
public class FragmentAdapterActivity extends BaseFragmentActivity {
    Fragment[] fragments = new Fragment[3];
    SectionsPagerAdapter mSectionsPagerAdapter;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_adapter);
        for (int i = 0; i < fragments.length; i++) {
            FragmentText fragmentText = new FragmentText();
            fragmentText.setArgment("test " + i);
            fragments[i] = fragmentText;
        }
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments[position];
        }

        @Override
        public int getCount() {
            return fragments.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "标签1";
                case 1:
                    return "标签2";
                case 2:
                    return "标签3";
            }
            return null;
        }
    }
}
