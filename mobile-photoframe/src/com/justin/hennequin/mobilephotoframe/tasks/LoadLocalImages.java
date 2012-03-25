package com.justin.hennequin.mobilephotoframe.tasks;

import android.database.Cursor;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.provider.MediaStore.Images.*;

import com.justin.hennequin.mobilephotoframe.model.*;

/*
 * Loads images stored locally on the device in the background.
 * 
 * @author Justin Hennequin
 */

public class LoadLocalImages extends AsyncTask<Object, Image, Object> {

	private ImageAdapter imageAdapter;
	
	public LoadLocalImages(ImageAdapter im)
	{
		imageAdapter = im;
		
	}
	
	@Override
	protected Object doInBackground(Object... params) {
		
		String[] projection = { MediaStore.Images.Media._ID };
	    
	    Cursor imagesCursor = Media.query(imageAdapter.getContext().getContentResolver(),
	    							MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
	    							projection);
	    
	    int columnIndex = imagesCursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
	    

		
		return null;
	}

}
