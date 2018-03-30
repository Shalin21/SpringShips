package ua.shalin.springsecurityapp.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import ua.shalin.springsecurityapp.model.Issue;
import ua.shalin.springsecurityapp.service.IssueService;

@Component
public class IssueValidator implements Validator {


    @Override
    public boolean supports(Class<?> aClass) {
        return Issue.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Issue issue = (Issue) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Name", "Required");
        if (issue.getName().length() < 3 || issue.getName().length() > 32) {
            errors.rejectValue("Name", "Size.issueForm.Name");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Discription", "Required");
        if (issue.getDiscription().length() < 8 || issue.getDiscription().length() > 32) {
            errors.rejectValue("Discription", "Size.issueForm.Discription");
        }

    }
}
