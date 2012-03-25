package com.justin.hennequin.mobilephotoframe.model;

import android.graphics.Bitmap;

public class Image {
    Bitmap mBitmap;
    String fileName;
    String caption;
    
    Image(Bitmap bitmap, String fileName, String caption) {
        mBitmap = bitmap; 
        this.fileName = fileName;
        this.caption = caption;
    }
    
    public Bitmap getBitmap() {
        return mBitmap;
    }

	public String getFileName() {
    	return fileName;
    }
    
    public String getCaption(){
    	return caption;
    }
}
