package recyclerview.ljb.android.com.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import recyclerview.ljb.android.com.recyclerviewdemo.adapter.BaseRecyclerAdapter;
import recyclerview.ljb.android.com.recyclerviewdemo.holder.MyViewHolder;

/**
 * Created by Ljb on 2015/12/17.
 */
public class Recycler2PinterestActivity  extends BaseActivity{

    @Override
    protected void initData() {
        RecyclerView.LayoutManager manager = new StaggeredGridLayoutManager(3 , StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manager);

        mAdapter = new PinterestAdapter(this, mData);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(Recycler2PinterestActivity.this, mData.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    class PinterestAdapter extends BaseRecyclerAdapter {

        public PinterestAdapter(Context context, List<String> datas) {
            super(context, datas);
        }

        @Override
        public void initData(MyViewHolder myViewHolder, int position) {
            ViewGroup.LayoutParams params = myViewHolder.itemView.getLayoutParams();
            if(position%3==0){
                params.height = dip2px(150);
            }else {
                params.height = dip2px(80);
            }
            myViewHolder.tv.setText(mDatas.get(position));
        }

    }

    public  int dip2px(float dip) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dip * scale + 0.5f);
    }

}
