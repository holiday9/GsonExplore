package com.seven.testBusLine;

import java.io.Serializable;

/**
 * Created by htyuan on 15-6-24.
 */
public class BusLine implements Serializable {
    private String busName;

    private String abbrBusName;

    private String lineId;

    private String statName;

    private String statDist;

    private String statNo;

    private String partStatNames;

    private String nextStatNames;

    private String lastStatName;

    private String leftStatNames;

    private String isFirst;

    private String askCount;

    private String answerCount;

    public void setBusName(String busName){
        this.busName = busName;
    }
    public String getBusName(){
        return this.busName;
    }
    public void setAbbrBusName(String abbrBusName){
        this.abbrBusName = abbrBusName;
    }
    public String getAbbrBusName(){
        return this.abbrBusName;
    }
    public void setLineId(String lineId){
        this.lineId = lineId;
    }
    public String getLineId(){
        return this.lineId;
    }
    public void setStatName(String statName){
        this.statName = statName;
    }
    public String getStatName(){
        return this.statName;
    }
    public void setStatDist(String statDist){
        this.statDist = statDist;
    }
    public String getStatDist(){
        return this.statDist;
    }
    public void setStatNo(String statNo){
        this.statNo = statNo;
    }
    public String getStatNo(){
        return this.statNo;
    }
    public void setPartStatNames(String partStatNames){
        this.partStatNames = partStatNames;
    }
    public String getPartStatNames(){
        return this.partStatNames;
    }
    public void setNextStatNames(String nextStatNames){
        this.nextStatNames = nextStatNames;
    }
    public String getNextStatNames(){
        return this.nextStatNames;
    }
    public void setLastStatName(String lastStatName){
        this.lastStatName = lastStatName;
    }
    public String getLastStatName(){
        return this.lastStatName;
    }
    public void setLeftStatNames(String leftStatNames){
        this.leftStatNames = leftStatNames;
    }
    public String getLeftStatNames(){
        return this.leftStatNames;
    }
    public void setIsFirst(String isFirst){
        this.isFirst = isFirst;
    }
    public String getIsFirst(){
        return this.isFirst;
    }
    public void setAskCount(String askCount){
        this.askCount = askCount;
    }
    public String getAskCount(){
        return this.askCount;
    }
    public void setAnswerCount(String answerCount){
        this.answerCount = answerCount;
    }
    public String getAnswerCount(){
        return this.answerCount;
    }

}
