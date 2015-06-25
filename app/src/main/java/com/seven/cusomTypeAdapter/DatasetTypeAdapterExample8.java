package com.seven.cusomTypeAdapter;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.seven.utils.Util;

import junit.framework.Assert;

import java.io.IOException;

/**
 * Created by htyuan on 15-6-24.
 *
 * this example refer to http://www.studytrails.com/java/json/java-google-json-type-adapter.jsp
 */
public class DatasetTypeAdapterExample8 {
    public void testCustomAdapter(Context ctx) throws IOException {
        //String url = "http://freemusicarchive.org/api/get/albums.json?api_key=60BLHNQCAOUFPIBZ&limit=5";

        String json = Util.getFileStringFromAssert(ctx, "customAdapter.json");
        // Create the custom type adapter and register it with the GsonBuilder
        // class.
//        Gson gson = new GsonBuilder().registerTypeAdapter(Dataset.class, new DatasetTypeAdapter()).create();
        Gson gson = new Gson();
        // deserialize the json to Albums class. The Dataset objects are part of
        // the Albums class. Whenever Gson encounters an object of type DataSet
        // it calls the DatasetTypeAdapter to read and write json.
        Albums albums = gson.fromJson(json, Albums.class);
        String title =  albums.getDataset()[1].getAlbum_title();
        String id =  albums.getDataset()[1].getAlbum_id();
        Assert.assertEquals(5, albums.getDataset().length);
        System.out.println(title);
        System.out.println(id);
    }
}
