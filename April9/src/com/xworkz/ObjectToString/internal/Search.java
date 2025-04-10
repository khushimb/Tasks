package com.xworkz.ObjectToString.internal;


public class Search {
    private String query;
    private String results;
    private String filter;

    public Search(String query, String results, String filter) {
        this.query = query;
        this.results = results;
        this.filter = filter;
    }

    @Override
    public String toString() {
        return "Query:" + query + " Results:" + results + " Filter:" + filter;
    }

    @Override
    public int hashCode() {
        return 56;
    }
}
