package dauruy.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class SkeletonFragment extends Fragment {

    private static final String TAG = SkeletonFragment.class.getName();

    public void showToast(String text) {
        Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT).show();
    }

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
        Log.d(TAG, "onAttach");
        showToast("onAttach");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        showToast("onCreate");
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated");
        showToast("onActivityCreated");
	}

	@Override
	public void onStart() {
		super.onStart();
        Log.d(TAG, "onStart");
        showToast("onStart");
	}

	@Override
	public void onResume() {
		super.onResume();
        Log.d(TAG, "onResume");
        showToast("onResume");
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState");
        showToast("onSaveInstanceState");
	}

	@Override
	public void onPause() {
		super.onPause();
        Log.d(TAG, "onPause");
        showToast("onPause");
	}

	@Override
	public void onStop() {
		super.onStop();
        Log.d(TAG, "onStop");
        showToast("onStop");
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
        Log.d(TAG, "onDestroyView");
        showToast("onDestroyView");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
        Log.d(TAG, "onDestroy");
        showToast("onDestroy");
	}

	@Override
	public void onDetach() {
		super.onDetach();
        Log.d(TAG, "onDetach");
        showToast("onDetach");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		//return super.onCreateView(inflater, container, savedInstanceState);
        Log.d(TAG, "onCreateView");
        showToast("onCreateView");
		return inflater.inflate(R.layout.skeleton_fragment, container, false);
	}
}
