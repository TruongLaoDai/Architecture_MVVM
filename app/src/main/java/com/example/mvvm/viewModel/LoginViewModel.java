package com.example.mvvm.viewModel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm.model.User;

public class LoginViewModel extends ViewModel {
    public MutableLiveData<String> email = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();

    public void checkLogin() {
        User user = new User(email.getValue(), password.getValue());
        if (user.checkAccount()) {
            Log.e("success", "success");
        } else {
            Log.e("error", "error");
        }
    }
}
