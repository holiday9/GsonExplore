package com.seven.gsonexplore;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

import com.google.gson.Gson;
import com.seven.cusomTypeAdapter.DatasetTypeAdapterExample8;
import com.seven.testBusLine.BusLineList;
import com.seven.utils.Util;

import junit.framework.Assert;

import java.io.IOException;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.jsonParserBusLine) {
            testParserBusList();
        } else if (v.getId() == R.id.jsonParserCustomAdapter) {
            testjsonParserCustomAdapter();
        }
    }

    private void testjsonParserCustomAdapter() {
        DatasetTypeAdapterExample8 customAdapter = new DatasetTypeAdapterExample8();
        try {
            customAdapter.testCustomAdapter(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void testParserBusList() {
        try {
            String values = Util.getFileStringFromAssert(this,"buslines.json");
            Gson gson = new Gson();
            BusLineList busLineList = gson.fromJson(values, BusLineList.class);
            Assert.assertEquals("123", busLineList.getUpdate());
            Assert.assertNotNull(busLineList.getBusLinesList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
