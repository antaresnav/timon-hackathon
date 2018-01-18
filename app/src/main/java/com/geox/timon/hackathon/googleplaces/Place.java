package com.geox.timon.hackathon.googleplaces;

import java.util.List;

public class Place {

    private String id;
    private String name;
    private Geometry geometry;
    private String icon;
    private String placeId;
    private Double rating;
    private String reference;
    private String scope;
    private List<String> types;
    private String vicinity;
    private Integer priceLevel;

    public Place() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }

    public Integer getPriceLevel() {
        return priceLevel;
    }

    public void setPriceLevel(Integer priceLevel) {
        this.priceLevel = priceLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Place place = (Place) o;

        if (id != null ? !id.equals(place.id) : place.id != null) return false;
        if (name != null ? !name.equals(place.name) : place.name != null) return false;
        if (geometry != null ? !geometry.equals(place.geometry) : place.geometry != null)
            return false;
        if (icon != null ? !icon.equals(place.icon) : place.icon != null) return false;
        if (placeId != null ? !placeId.equals(place.placeId) : place.placeId != null) return false;
        if (rating != null ? !rating.equals(place.rating) : place.rating != null) return false;
        if (reference != null ? !reference.equals(place.reference) : place.reference != null)
            return false;
        if (scope != null ? !scope.equals(place.scope) : place.scope != null) return false;
        if (types != null ? !types.equals(place.types) : place.types != null) return false;
        if (vicinity != null ? !vicinity.equals(place.vicinity) : place.vicinity != null)
            return false;
        return priceLevel != null ? priceLevel.equals(place.priceLevel) : place.priceLevel == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (geometry != null ? geometry.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (placeId != null ? placeId.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (reference != null ? reference.hashCode() : 0);
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        result = 31 * result + (types != null ? types.hashCode() : 0);
        result = 31 * result + (vicinity != null ? vicinity.hashCode() : 0);
        result = 31 * result + (priceLevel != null ? priceLevel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", geometry=" + geometry +
                ", icon='" + icon + '\'' +
                ", placeId='" + placeId + '\'' +
                ", rating=" + rating +
                ", reference='" + reference + '\'' +
                ", scope='" + scope + '\'' +
                ", types=" + types +
                ", vicinity='" + vicinity + '\'' +
                ", priceLevel=" + priceLevel +
                '}';
    }
}
