package Streams;

public class City {
    private String cityId;
    private String cityName;
    private String pincode;


    public City(String cityId, String cityName, String pincode) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.pincode = pincode;
    }

    public City() {
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "{" +
                "cityId='" + cityId + '\'' +
                ", cityName='" + cityName + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
