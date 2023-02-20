public class Business {
    private String business_id;
    private String name;
    private double longitude;
    private double latitude;

    public Business(String business_id, String name, double longitude, double latitude){
        this.business_id = business_id;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getBusinessId(){
        return business_id;
    }

    public String getName(){
        return name;
    }

    public double getLongitude(){
        return longitude;
    }

    public double getLatitude(){
        return latitude;
    }

    public double[] getCoordinates(){
        double[] coordinates = new double[2];
        coordinates[0] = longitude;
        coordinates[1] = latitude;
        return coordinates;
    }
}
