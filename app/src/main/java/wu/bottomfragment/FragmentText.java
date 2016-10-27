package wu.bottomfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import wu.baselib.BaseFragment;

/**
 * Created by jx on 2016/10/25.
 */
public class FragmentText extends BaseFragment {

    private TextView textView;
    private String text;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setContentView(inflater.inflate(R.layout.fragment_text, container, false));
        textView = findView(R.id.text_view);
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    public void setArgment(String str) {
        text = str;
        if (view != null) {
            onBindData();
        }
    }

    protected void onBindData() {
        if (text != null) {
            textView.setText(text);
        }
    }
}
