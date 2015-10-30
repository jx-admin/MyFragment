package wu.bottomfragment;

import android.os.Bundle;
import android.view.Window;

public class FragmentActivity extends BaseActivity {
    String TAG = "wjx_" + FragmentActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }
}
