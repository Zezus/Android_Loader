package com.example.loader;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

/**
 * Created by СадвакасовР on 09.04.2018.
 */

public class MyLoader extends AsyncTaskLoader<String> {


    public MyLoader(Context context) {
        super(context);
    }

    @Override
    public String loadInBackground() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Zezus";
    }
}
