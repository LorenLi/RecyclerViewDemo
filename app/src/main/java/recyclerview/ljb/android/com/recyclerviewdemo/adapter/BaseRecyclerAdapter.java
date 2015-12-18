package recyclerview.ljb.android.com.recyclerviewdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import recyclerview.ljb.android.com.recyclerviewdemo.R;
import recyclerview.ljb.android.com.recyclerviewdemo.holder.MyViewHolder;

/**
 * Created by Ljb on 2015/12/17.
 */
public  abstract class BaseRecyclerAdapter extends RecyclerView.Adapter<MyViewHolder>  {
    public interface  OnItemClickListener{
        void onItemClick( View view, int position);
    }

    public Context mContext;
    public List<String> mDatas;
    private LayoutInflater mInflater;
    public OnItemClickListener mItemClickListener;

    public BaseRecyclerAdapter(Context context, List<String> datas) {
        mInflater = LayoutInflater.from(context);
        this.mContext = context;
        this.mDatas = datas;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup,  int i) {
        Log.d("xgo","i="+i);
        final View view = mInflater.inflate(R.layout.item_list, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public  void onBindViewHolder(final MyViewHolder myViewHolder, final int i){
        if(mItemClickListener!=null){
            myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mItemClickListener.onItemClick(myViewHolder.itemView, i);
                }
            });
        }

        initData(myViewHolder ,i);
    }

   public abstract void initData(MyViewHolder myViewHolder,  int position);

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        this.mItemClickListener = listener;
    }
}
