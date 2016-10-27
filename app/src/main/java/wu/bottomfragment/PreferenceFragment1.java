package wu.bottomfragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Administrator on 2015/11/4.
 */
public class PreferenceFragment1 extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 从xml文件加载选项
        addPreferencesFromResource(R.xml.preferences1);
    }
}
