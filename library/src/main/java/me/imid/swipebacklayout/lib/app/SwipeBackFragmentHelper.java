package me.imid.swipebacklayout.lib.app;

import android.view.LayoutInflater;
import android.view.View;

import me.imid.swipebacklayout.lib.R;
import me.imid.swipebacklayout.lib.SwipeBackLayout;


public class SwipeBackFragmentHelper {

    private SwipeBackFragment mFragment;
    private SwipeBackLayout mSwipeBackLayout;

    public SwipeBackFragmentHelper(SwipeBackFragment fragment) {
        mFragment = fragment;
    }
    
    public void onFragmentCreateView(){
        mSwipeBackLayout = (SwipeBackLayout) LayoutInflater.from(mFragment.getActivity()).inflate(R.layout.swipeback_layout,null);
        mSwipeBackLayout.attachToFragment(mFragment);
    }
    
    public View findViewById(int id) {
        if (mSwipeBackLayout != null) {
            return mSwipeBackLayout.findViewById(id);
        }
        return null;
    }
    
    public SwipeBackLayout getSwipeBackLayout() {
        return mSwipeBackLayout;
    }

}
