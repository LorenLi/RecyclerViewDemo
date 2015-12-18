package recyclerview.ljb.android.com.recyclerviewdemo;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import recyclerview.ljb.android.com.recyclerviewdemo.adapter.BaseRecyclerAdapter;
import recyclerview.ljb.android.com.recyclerviewdemo.adapter.MyListAdapter;
import recyclerview.ljb.android.com.recyclerviewdemo.helper.DividerItemDecoration;

/**
 * Created by Ljb on 2015/12/17.
 */
public class Recycler2ListActivity extends BaseActivity {


    @Override
    protected void initData() {
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(manager);

        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL));
        mAdapter = new MyListAdapter(this, mData);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(Recycler2ListActivity.this , mData.get(position) ,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
