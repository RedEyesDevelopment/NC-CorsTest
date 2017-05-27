package projectpackage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import projectpackage.model.Model;
import projectpackage.services.ModelService;

/**
 * Created by Gvozd on 30.12.2016.
 */
@RestController
public class MainController {

    @Autowired
    ModelService modelService;

    private final String PREFIX="/fuck/";

    @ResponseBody
    @RequestMapping(value = PREFIX + "gimme")
    public ResponseEntity getModelViaAjax() {
        Model model = modelService.getStaticModel();
        ResponseEntity result = new ResponseEntity(model, HttpStatus.OK);
        return result;
    }

}
