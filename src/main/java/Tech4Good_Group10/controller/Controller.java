package Tech4Good_Group10.controller;

import Tech4Good_Group10.service.Service;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequiredArgsConstructor
@Tag(name = "Model Controller")
public class Controller {

    private final Service service;


}
