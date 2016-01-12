package com.snowpuppet.localimageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;

import java.io.InputStream;
import java.io.OutputStream;

public class Utils {
    public static void CopyStream(InputStream is, OutputStream os)
    {
        final int buffer_size=1024;
        try
        {
            byte[] bytes=new byte[buffer_size];
            for(;;)
            {
              int count=is.read(bytes, 0, buffer_size);
              if(count==-1)
                  break;
              os.write(bytes, 0, count);
            }
        }
        catch(Exception ex){}
    }

    public static Bitmap getBitmap(Context context,String path) {
        MediaMetadataRetriever metadataRetriever = new MediaMetadataRetriever();
        if(path != null) {
            if (path.matches("")) {
                return BitmapFactory.decodeResource(context.getResources(), R.drawable.stub);
            } else {
                metadataRetriever.setDataSource(path);
                byte[] data = metadataRetriever.getEmbeddedPicture();
                if (data != null) {
                    return BitmapFactory.decodeByteArray(data, 0, data.length);
                } else {
                    return BitmapFactory.decodeResource(context.getResources(), R.drawable.stub);
                }
            }
        }
        return null;
    }

    public static Bitmap decodeImageFromResource(String path, Context context, int Stub) {

        Bitmap b;
        if(path != null) {
            b =  BitmapFactory.decodeFile(path);
        } else {
            b = BitmapFactory.decodeResource(context.getResources(),Stub);
        }
        return b;

    }
}