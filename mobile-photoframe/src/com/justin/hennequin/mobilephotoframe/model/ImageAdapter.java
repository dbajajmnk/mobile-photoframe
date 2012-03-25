package com.justin.hennequin.mobilephotoframe.model;

import java.util.ArrayList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	
	private Context mContext; 
    private ArrayList<Image> photos = new ArrayList<Image>();

    public ImageAdapter(Context context) { 
        mContext = context; 
    } 
    
	public Context getContext() {
		return mContext;
	}

	public int getCount() {
		return photos.size();
	}

	public Object getItem(int position) {
		return photos.get(position);
	}

	public View getView(int position, View convertView, ViewGroup parent) {
        final ImageView imageView; 
        if (convertView == null) { 
            imageView = new ImageView(mContext); 
        } else { 
            imageView = (ImageView) convertView; 
        } 
		
        imageView.setImageBitmap(photos.get(position).getBitmap());
		return imageView;
	}

	public long getItemId(int position) {
		return position;
	}

}
