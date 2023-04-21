package com.example.mvvmbasepackage;

import android.widget.Toast;

import com.example.mvvmbasepackage.base.BaseActivity;
import com.example.mvvmbasepackage.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainActivityViewModel>
{
    @Override
    protected int getLayoutId()
    {
        return R.layout.activity_main;
    }

    @Override
    protected Class<MainActivityViewModel> getViewModelClass()
    {
        return MainActivityViewModel.class;
    }

    @Override
    protected int getViewModelVariableId()
    {
        return BR.viewModel;
    }

    @Override
    protected void initView()
    {
        super.initView();
        initButton();
    }

    private void initButton()
    {
        binding.button.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "Hello World", Toast.LENGTH_LONG).show());
    }
}