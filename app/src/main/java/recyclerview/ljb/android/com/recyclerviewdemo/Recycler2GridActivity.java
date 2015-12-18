package recyclerview.ljb.android.com.recyclerviewdemo;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import recyclerview.ljb.android.com.recyclerviewdemo.adapter.BaseRecyclerAdapter;
import recyclerview.ljb.android.com.recyclerviewdemo.adapter.MyListAdapter;

/**
 * Created by Ljb on 2015/12/17.
 */
public class Recycler2GridActivity  extends BaseActivity{


    @Override
    protected void initData() {
        RecyclerView.LayoutManager manager = new GridLayoutManager(this, 3);
        mRecyclerView.setLayoutManager(manager);

        mAdapter = new MyListAdapter(this, mData);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(Recycler2GridActivity.this, mData.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
