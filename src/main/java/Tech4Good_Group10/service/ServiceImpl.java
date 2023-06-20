package Tech4Good_Group10.service;

import Tech4Good_Group10.model.Business;
import Tech4Good_Group10.model.TypeBusiness;

import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
import java.io.FileReader;
import java.io.IOException;

public class ServiceImpl implements Service {

    @Override
    public List<Business> getBusinessByType(List<String> types) {

            try (JsonReader reader = Json.createReader(new FileReader("src/main/resources/json/2019_censcomercialbcn_detall.json"))) {
                JsonArray jsonArray = reader.readArray();
                for (JsonValue jsonValue : jsonArray) {
                    JsonObject jsonObject = (JsonObject) jsonValue;
                    Business business = new Business();
                    business.setName(jsonObject.getString("Nom_Local"));
                    business.setTypeBusiness(transformToEnum(jsonObject.getString("Nom_Activitat")));
                    business.setLatitude(jsonObject.getString("Latitud"));
                    business.setLongitude(jsonObject.getString("Longitud"));

                    // Haz algo con el business Java
                    System.out.println(business);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        return null;
    }

    private static TypeBusiness transformToEnum(String activity) {
        for (TypeBusiness typeBusiness : TypeBusiness.values()) {
            if (typeBusiness.getName().equals(activity)) {
                return typeBusiness;
            }
        }
        throw new IllegalArgumentException("Valor de activitat no válido: " + activity);
    }
}
