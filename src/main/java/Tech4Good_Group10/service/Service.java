package Tech4Good_Group10.service;

import Tech4Good_Group10.model.Business;

import java.util.List;

public interface Service {
    List<Business> getBusinessByType(List<String> types);
}
