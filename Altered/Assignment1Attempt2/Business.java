public class Business {
    private String business_id;
    private String name;
    private double longitude;
    private double latitude;
    private int stars;
    private String reviews;
    private int reviewCount; 

    public Business(String business_id, String name, double longitude, double latitude){
        this.business_id = business_id;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.stars = 0;
        this.reviews = "";
        this.reviewCount = 0;
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
    public int getStars(){
        return stars;
    }
    public void setStars(int stars){
        this.stars = stars;
    }
    public void addReview(String text){
        reviews.concat(text);
    }
    public String getReviews(){
        return reviews;
    }
    public void increaseReviewCount(){
        reviewCount++;
    }
    public int getReviewCount(){
        return reviewCount;
    }

    public double[] getCoordinates(){
        double[] coordinates = new double[2];
        coordinates[0] = longitude;
        coordinates[1] = latitude;
        return coordinates;
    }
}
