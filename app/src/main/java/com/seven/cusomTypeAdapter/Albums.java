package com.seven.cusomTypeAdapter;

import java.io.Serializable;

/**
 * Created by htyuan on 15-6-24.
 */
public class Albums implements Serializable{
    private String title;
    private Dataset[] dataset;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDataset(Dataset[] dataset) {
        this.dataset = dataset;
    }

    public String getTitle() {
        return title;
    }

    public Dataset[] getDataset() {
        return dataset;
    }
}
