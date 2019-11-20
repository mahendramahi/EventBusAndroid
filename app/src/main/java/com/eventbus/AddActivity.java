package com.eventbus;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.eventbus.models.AdapterEvent;

import org.greenrobot.eventbus.EventBus;

public class AddActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }

    public void addNewItem(View view) {
        EventBus.getDefault().post(new AdapterEvent("New item"));
    }
}
