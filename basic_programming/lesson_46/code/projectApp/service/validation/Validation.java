package code.projectApp.service.validation;

import code.projectApp.dto.ClientRequest;

import java.util.ArrayList;
import java.util.List;

public class Validation {

    public boolean checkRequest(ClientRequest request){
        /*
        name != null
        name.length > 5 && < 15

        description != null
        description.length > 3 && < 30
         */

        List<String> errors = new ArrayList<>();

        if (request.getTaskName().isBlank()) errors.add("Task name must be not null \n");
        if (request.getTaskDescription().isBlank()) errors.add("Task description must be not null \n");

        if (request.getTaskName().length() < 5 || request.getTaskName().length() > 15) errors.add("Task name length must be between 5 and 15 letters \n");
        if (request.getTaskDescription().length() < 3 || request.getTaskDescription().length() > 30) errors.add("Task description length must be between 5 and 15 letters \n");

        if (errors.isEmpty()) {
            return true;
        } else {
            throw new ValidationException(errors.toString());
        }

    }
}
