package Tech4Good_Group10.service;

import Tech4Good_Group10.model.Business;
import Tech4Good_Group10.model.TypeBusiness;
import Tech4Good_Group10.repository.BusinessRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
import java.io.FileReader;
import java.io.IOException;

@Service
@AllArgsConstructor
public class ServiceImpl implements AppService {

    private final BusinessRepository repository;

    @Override
    public List<Business> getBusinessByType(List<String> types) {
        return repository.findAll().stream()
                .filter(business -> types.contains(business.getTypeBusiness()))
                .toList();
    }
}
