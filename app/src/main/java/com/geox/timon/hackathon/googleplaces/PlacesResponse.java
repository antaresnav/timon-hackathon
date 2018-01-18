package com.geox.timon.hackathon.googleplaces;

import java.util.List;

public class PlacesResponse {

    private List<Place> results;
    private String status;

    public PlacesResponse() {
    }

    public List<Place> getResults() {
        return results;
    }

    public void setResults(List<Place> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlacesResponse placesResponse = (PlacesResponse) o;

        if (results != null ? !results.equals(placesResponse.results) : placesResponse.results != null)
            return false;
        return status != null ? status.equals(placesResponse.status) : placesResponse.status == null;
    }

    @Override
    public int hashCode() {
        int result = results != null ? results.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PlacesResponse{" +
                "results=" + results +
                ", status='" + status + '\'' +
                '}';
    }
}
