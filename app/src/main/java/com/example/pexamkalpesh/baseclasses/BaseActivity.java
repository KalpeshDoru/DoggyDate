package com.example.pexamkalpesh.baseclasses;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pexamkalpesh.customviews.CustomProgressDialog;

public class BaseActivity extends AppCompatActivity {

    private static CustomProgressDialog myProgressDialog = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static void startProgressDialog(Activity activity, boolean cancelable) {

        try {

            if (myProgressDialog == null)
                myProgressDialog = CustomProgressDialog.show(activity, cancelable);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void stopProgressDialog() {

        try {

            if (myProgressDialog != null && myProgressDialog.isShowing()) {
                myProgressDialog.dismiss();
                myProgressDialog = null;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



