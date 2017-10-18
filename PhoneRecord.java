// Represents a record containing a name and a phone number
class PhoneRecord {
  private String firstName;
  private String lastName;
  private String number;
  private String zipCode;

  ///////////////////////////////////////////////////////////
  // NAME:       PhoneRecord
  // BEHAVIOR:   Constructs a phone record containing the
  //             specified name and phone number
  // PARAMETERS: personName - name of a person
  //             phoneNumber - phone number for that person
  ///////////////////////////////////////////////////////////
  public PhoneRecord(String firstName, String lastName, String phoneNumber, String zipCode) {
    this.firstName = firstName;
    this.lastName = lastName;
    number = phoneNumber;
    this.zipCode = zipCode;
  }

  ///////////////////////////////////////////////////////////
  // NAME:       getName
  // BEHAVIOR:   Returns the name stored in this record
  // PARAMETERS: None
  // RETURNS:    The name stored in this record
  ///////////////////////////////////////////////////////////
  public String getName() {
    return firstName+" "+lastName;
    
  }
  
  public String getFirstName(){
	  return firstName;
  }
  public String getLastName(){
	  return lastName;
  }

  ///////////////////////////////////////////////////////////
  // NAME:       getNumber
  // BEHAVIOR:   Returns the phone number stored in this
  //             record
  // PARAMETERS: None
  // RETURNS:    The phone number stored in this record
  ///////////////////////////////////////////////////////////
  public String getNumber() {
    return number;
  }

  public String getZipCode(){
	  return zipCode;
  }
}