package com.seven.testBusLine;

import com.seven.testBusLine.BusLine;

import java.io.Serializable;
import java.util.List;

/**
 * Created by htyuan on 15-6-24.
 */
public class BusLineList implements Serializable {
    private String update;

    private String xy;

    private String dist;

    private List<BusLine> busLinesList;

    public void setUpdate(String update){
        this.update = update;
    }
    public String getUpdate(){
        return this.update;
    }
    public void setXy(String xy){
        this.xy = xy;
    }
    public String getXy(){
        return this.xy;
    }
    public void setDist(String dist){
        this.dist = dist;
    }
    public String getDist(){
        return this.dist;
    }
    public void setBusLinesList(List<BusLine> busLinesList){
        this.busLinesList = busLinesList;
    }
    public List<BusLine> getBusLinesList(){
        return this.busLinesList;
    }

}
