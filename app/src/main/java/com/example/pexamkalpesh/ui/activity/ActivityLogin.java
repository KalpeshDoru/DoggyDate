package com.example.pexamkalpesh.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;

import com.example.pexamkalpesh.R;
import com.example.pexamkalpesh.baseclasses.BaseActivity;
import com.example.pexamkalpesh.databinding.ActivityLoginBinding;
import com.example.pexamkalpesh.models.BaseResponse;
import com.example.pexamkalpesh.models.CommanRequestModel;
import com.example.pexamkalpesh.networks.ApiClient;
import com.example.pexamkalpesh.networks.ApiListener;
import com.example.pexamkalpesh.networks.ApiManager;
import com.example.pexamkalpesh.networks.ApiService;
import com.google.gson.Gson;

import retrofit2.Call;

import static com.example.pexamkalpesh.networks.ApiConstant.LOG_IN;

public class ActivityLogin extends BaseActivity implements ApiListener {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        binding.btnLogIn.setOnClickListener(v -> {
            makeLogInAuth();
        });
    }

    private void makeLogInAuth() {

        try {

            CommanRequestModel commanRequestModel = new CommanRequestModel();
            commanRequestModel.setEmail(binding.tnlEmail.getEditText().getText().toString());
            commanRequestModel.setPassword(binding.tnlPassword.getEditText().getText().toString());
            commanRequestModel.setDeviceToken(123);
            commanRequestModel.setDeviceType("IOS");

            String requestString = new Gson().toJson(commanRequestModel);
            Log.e("TAG", requestString);

            ApiService apiService = ApiClient.createService(ApiService.class, "", "");
            Call<BaseResponse> call = apiService.authenticateUser(commanRequestModel);

            ApiManager.callRetrofit(call, LOG_IN, this, false);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onApiSuccess(String endPointName, Object responseBody) {

        switch (endPointName) {

            case LOG_IN:

                BaseResponse baseResponse = (BaseResponse) responseBody;
                processResponse(baseResponse);
                break;
        }
    }

    @Override
    public void onApiError(String endPointName, String errorMessage) {
        switch (endPointName) {

            case LOG_IN:
                Toast.makeText(this, "" + errorMessage, Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onApiFailure(String endPointName, String failureMessage) {
        switch (endPointName) {

            case LOG_IN:
                Toast.makeText(this, "" + failureMessage, Toast.LENGTH_SHORT).show();
                break;
        }
    }


    private void processResponse(BaseResponse baseResponse) {

        try {

            if (baseResponse.getMessage().equals("success")) {

                Intent intent = new Intent(this, HomeActivity.class);
                intent.putExtra("UserID", baseResponse.getDataModel().getUserID());
                intent.putExtra("Status", baseResponse.getDataModel().getStatus());
                startActivity(intent);

            } else {
                Toast.makeText(this, "Something went wrong!", Toast.LENGTH_SHORT).show();
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}