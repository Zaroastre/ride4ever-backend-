package io.nirahtech.ride4ever.microservice.geomap.domain.repositories;

public class GpsCoordinatesDotNet extends AbstractCoordinatesConverter {

    public GpsCoordinatesDotNet() {
        super("https://www.gps-coordinates.net/");
    }

    @Override
    public String resolve(double latitude, double longitude) {
        // TODO Auto-generated method stub
        return null;
    }
}
