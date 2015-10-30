package wu.bottomfragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {
    public static final String TAG = "Fragment1";

    @Override
    public void onAttach(Context context) {
        Log.d(TAG, "onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, TAG+"onCreateView");
        return inflater.inflate(R.layout.fragment_content, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.d(TAG,TAG+ "onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(TAG, TAG+"onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG, TAG+"onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG,TAG+ "onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG,TAG+ "onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d(TAG,TAG+ "onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG,TAG+ "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d(TAG,TAG+ "onDetach");
        super.onDetach();
    }
}
