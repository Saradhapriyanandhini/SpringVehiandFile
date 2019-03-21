package org.vehiclemanagement.pwdvalidator;
 
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
//import org.vehiclemanagement.model.Brake;
//import org.vehiclemanagement.model.Parts;
import org.vehiclemanagement.model.User;


 
 
public class PasswordValidator implements Validator {
 
    public boolean supports(Class<?> paramClass) {
        return User.class.equals(paramClass);
     // return Brake.class.equals(paramClass);
    }
    
 
    public void validate(Object obj, Errors errors) {
    	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "valid.username");
    	 User user= (User) obj;
    	 //Parts parts=(Parts)obj;
    	 //System.out.println(user.getUsername().length());
    	 
    	 if(!(user.getUsername().length()<20))
         {
         	errors.rejectValue("username", "valid.usernamelength");
         }
    	 if(user.getPassword().length()<8 )
    	 {
    		 errors.rejectValue("password", "valid.passwordlength");
    		 
    	 }
    	 
    	 if(user.getPassword().length()>12 )
    	 {
    		 errors.rejectValue("password", "valid.passwordlength1");
    		 
    	 }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "valid.password");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwordConf", "valid.passwordConf");
       
        if (!user.getPassword().equals(user.getPasswordConf())) {
            errors.rejectValue("passwordConf", "valid.passwordConfDiff");
        }
       
    }
}