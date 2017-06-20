package com.example.android.materialdesign1.adapter;

import android.content.Context;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.materialdesign1.R;
import com.example.android.materialdesign1.model.NavDrawerItem;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by zengzhi on 2017/6/20.
 */

public class NavigationDrawerAdapter extends RecyclerView.Adapter<NavigationDrawerAdapter.MyViewHolder> {

    private Context mContext;
    private List<NavDrawerItem> data;

    public NavigationDrawerAdapter(Context mContext, List<NavDrawerItem> data) {
        this.mContext = mContext;
        this.data = data;
    }

    public void delete(int position) {

        data.remove(position);
        notifyItemRemoved(position);
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(mContext).inflate(R.layout.nav_drawer_row, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        NavDrawerItem current = data.get(position);

        holder.title.setText(current.getTitle());

    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        public MyViewHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
