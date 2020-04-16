package com.nttdata.Modal;





import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class RegistrationModal {

 @NotEmpty( message = "You can't leave this empty.")
private String firstName;

@NotEmpty( message = "You can't leave this empty.")
private String lastName;




@NotEmpty(message = "You can't leave this empty.")

@Email(message = "enter valid details.")
private String email;


@NotEmpty(message = "You can't leave this empty.")
private String State;
@NotEmpty(message = "You can't leave this empty.")
private String City;



public String getState() {
	return State;
}

public void setState(String state) {
	State = state;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}



public String getFirstName() {
  return firstName;
}

public void setFirstName(String firstName) {
  this.firstName = firstName;
}

public String getLastName() {
  return lastName;
}

public void setLastName(String lastName) {
  this.lastName = lastName;
}

/*public Integer getAge() {
  return age;
}

public void setAge(Integer age) {
  this.age = age;
}
*/
public String getEmail() {
  return email;
}

public void setEmail(String email) {
  this.email = email;
}

}
