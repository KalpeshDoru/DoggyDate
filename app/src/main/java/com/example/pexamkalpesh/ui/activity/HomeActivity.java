package com.example.pexamkalpesh.ui.activity;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;

import com.example.pexamkalpesh.R;
import com.example.pexamkalpesh.baseclasses.BaseActivity;
import com.example.pexamkalpesh.databinding.ActivityHomeBinding;

public class HomeActivity extends BaseActivity {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);

        String userID = getIntent().getStringExtra("UserID");
        String status = getIntent().getStringExtra("Status");

        binding.tvUserInfo.setText("User ID : " + userID + "\nStatus : " + status);

    }
}