package com.learning.profuturo.en501863.lproject.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.learning.profuturo.en501863.lproject.R;

import java.util.ArrayList;

/**
 * Created by EN501863 on 15/12/2017.
 */

public class CatalogoDetalles extends RecyclerView.Adapter {

    private ArrayList dataSet;
    Context context;
    int total_types;

    public class ViewHolderPort extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public Button button;

        public ViewHolderPort(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.img_resourse_base_port);
            button = (Button) itemView.findViewById(R.id.button_port);
            Log.d("TimeLine","ViewHolderPort");
        }
    }

    public class ViewHolderLand extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public Button button;
        public TextView textView;


        public ViewHolderLand(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.img_resourse_land);
            button = (Button) itemView.findViewById(R.id.button_land);
            textView = (TextView) itemView.findViewById(R.id.text_land);
            Log.d("TimeLine","ViewHolderLand");

        }
    }

    public CatalogoDetalles() {
        super();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("TimeLine","onCreateViewHolder");

        View view;
        switch (viewType) {
            case ModelAdapter.PORT_LAYOUT:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_base, parent, false);
                return new ViewHolderPort(view);
            case ModelAdapter.LAND_LAYOUT:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_base, parent, false);
                return new ViewHolderLand(view);
        }
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        Log.d("TimeLine","getItemViewType");

        switch (dataSet.get(position).type){}
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        Log.d("TimeLine","getItemCount");

//        return itemList.size();
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        Log.d("TimeLine","onBindViewHolder");

    }

}
