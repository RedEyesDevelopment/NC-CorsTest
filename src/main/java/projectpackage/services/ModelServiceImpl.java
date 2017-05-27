package projectpackage.services;

import org.springframework.stereotype.Service;
import projectpackage.model.Model;

import java.util.Date;

/**
 * Created by Gvozd on 27.05.2017.
 */
@Service
public class ModelServiceImpl implements ModelService {
    @Override
    public Model getStaticModel() {
        Model model = new Model();
        model.setId(11);
        model.setDateOfCreation(new Date(System.currentTimeMillis()));
        model.setStringData("DIEBITCH");
        return null;
    }
}
