package recyclerview.ljb.android.com.recyclerviewdemo.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import recyclerview.ljb.android.com.recyclerviewdemo.R;

/**
 * Created by Ljb on 2015/12/17.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView tv;

    public MyViewHolder(View itemView) {
        super(itemView);
        tv = (TextView) itemView.findViewById(R.id.tv);
    }
}