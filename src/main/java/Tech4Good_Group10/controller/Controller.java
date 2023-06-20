package Tech4Good_Group10.controller;
import Tech4Good_Group10.service.AppService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Tag(name = "Model Controller")
public class Controller {
    private final AppService service;
  
    @GetMapping("/getBusiness")
    public void listBusiness(@RequestBody List<String> types) {
        service.getBusinessByType(types);
    }
}