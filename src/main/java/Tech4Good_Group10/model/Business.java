package Tech4Good_Group10.model;

public class Business {

    private Long id;

    private String name;

    private TypeBusiness typeBusiness;

    private String longitude;

    private String latitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeBusiness getTypeBusiness() {
        return typeBusiness;
    }

    public void setTypeBusiness(TypeBusiness typeBusiness) {
        this.typeBusiness = typeBusiness;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Business(Long id, String name, TypeBusiness typeBusiness, String longitude, String latitude) {
        this.id = id;
        this.name = name;
        this.typeBusiness = typeBusiness;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Business() {

    }
}
