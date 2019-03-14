package me.imid.swipebacklayout.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import me.imid.swipebacklayout.lib.app.SwipeBackFragment;


public class DemoFragment extends SwipeBackFragment {
    TextView textView;

    int num;

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        textView = view.findViewById(R.id.name);

        textView.setText("Fragment" + num);
        return view;
    }


    @Override
    public void close() {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.remove(this);
        transaction.commitAllowingStateLoss();
    }
}
