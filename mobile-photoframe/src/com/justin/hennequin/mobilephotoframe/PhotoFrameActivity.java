package com.justin.hennequin.mobilephotoframe;

import android.app.Activity;
import android.os.Bundle;
import com.justin.hennequin.mobilephotoframe.tasks.*;
import com.justin.hennequin.mobilephotoframe.model.*;

public class PhotoFrameActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewer);
        
        // Create ImageAdapter to be used for the application
        ImageAdapter images = new ImageAdapter(getApplicationContext());
        
        loadImages(images);
        
    }
    
    // Begins image load tasks
    private void loadImages(ImageAdapter images){
    	new LoadLocalImages(images).execute();
    }
}