package com.example.adslib;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by root on 9/28/17.
 */

public class AdsDisplay {
    Context context;

    public AdsDisplay(Context context){
        this.context = context;
    }

    public void displayAds(){
        new AlertDialog.Builder(context)
                .setTitle("Ads")
                .setMessage("Wonderful coffee apps for free")
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // navigate to app url
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                })
                .create()
                .show();


    }
}
