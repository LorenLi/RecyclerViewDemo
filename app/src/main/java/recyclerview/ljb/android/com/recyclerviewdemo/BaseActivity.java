package recyclerview.ljb.android.com.recyclerviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import recyclerview.ljb.android.com.recyclerviewdemo.adapter.BaseRecyclerAdapter;

/**
 * Created by Ljb on 2015/12/17.
 */
public abstract class BaseActivity extends Activity implements View.OnClickListener {
    public RecyclerView mRecyclerView;
    public List<String> mData;
    public BaseRecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_list);
        findViewById(R.id.add).setOnClickListener(this);
        findViewById(R.id.remove).setOnClickListener(this);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        init();
        initData();
    }

    protected abstract void initData();

    private void init() {
        mData = new ArrayList<>();
        for (int i = 'A'; i <= 'Z'; i++) {
            mData.add(String.valueOf((char) i));
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add:
                if (mAdapter != null && mData != null) {
                    mData.add(1 , "new Item data");
                    mAdapter.notifyItemInserted(1);
                }
                break;
            case R.id.remove:
                if (mAdapter != null && mData != null) {
                    mData.remove(1);
                    mAdapter.notifyItemRemoved(1);
                }
                break;
        }
    }
}
