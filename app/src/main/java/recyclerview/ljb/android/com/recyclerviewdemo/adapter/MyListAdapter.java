package recyclerview.ljb.android.com.recyclerviewdemo.adapter;

import android.content.Context;

import java.util.List;

import recyclerview.ljb.android.com.recyclerviewdemo.holder.MyViewHolder;

/**
 * Created by Ljb on 2015/12/17.
 */
public class MyListAdapter extends BaseRecyclerAdapter {

    public MyListAdapter(Context context, List<String> datas) {
        super(context, datas);
    }

    @Override
    public void initData(MyViewHolder myViewHolder, int position) {
        myViewHolder.tv.setText(mDatas.get(position));
    }


}


