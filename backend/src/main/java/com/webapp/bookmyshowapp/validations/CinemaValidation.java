package com.webapp.bookmyshowapp.validations;



import com.webapp.bookmyshowapp.exceptions.CinemaException;
import com.webapp.bookmyshowapp.form.CinemaCreateForm;
import com.webapp.bookmyshowapp.messages.CommonErrorMessageConstant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List;

public class CinemaValidation {
    Logger log = LoggerFactory.getLogger(CinemaValidation.class);

    @Autowired
    private CommonErrorMessageConstant commonErrorMessageConstant;

    /*
     * validate student
     * @param entity
     *
     */

    public List<String> validate(CinemaCreateForm cinemaCreateForm, List<String> validationErrorList) throws CinemaException {
        try {
            if(StringUtils.isEmpty(cinemaCreateForm.getCinema_name())) {
                validationErrorList.add("Cinema Name" + commonErrorMessageConstant.getBlankError());
            }
        }catch(Exception e) {
            throw new CinemaException(e.getMessage());
        }
        return validationErrorList;
    }
}
