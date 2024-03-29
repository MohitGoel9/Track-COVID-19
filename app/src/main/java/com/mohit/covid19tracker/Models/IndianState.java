package com.mohit.covid19tracker.Models;

import com.google.gson.annotations.SerializedName;

public class IndianState implements Comparable<IndianState>{

    @SerializedName("state")
    private String state;

    @SerializedName("recovered")
    private String recovered;

    @SerializedName("active")
    private String active;

    @SerializedName("confirmed")
    private String confirmed;

    @SerializedName("deaths")
    private String deaths;

    private Integer confiredCases;  // Used for sorting and removing states with zero cases

    public Integer getConfiredCases() {
        return confiredCases;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    @Override
    public String toString() {
        return "IndiaStateWise [recovered = " + recovered + ", active = " + active + ", state = " + state + ", confirmed = " + confirmed + ", deaths = " + deaths + "]";
    }

    @Override
    public int compareTo(IndianState o) {
        this.confiredCases = Integer.parseInt(this.getConfirmed());
        o.confiredCases = Integer.parseInt(o.getConfirmed());
        return this.getConfiredCases().compareTo(o.getConfiredCases());
    }
}
