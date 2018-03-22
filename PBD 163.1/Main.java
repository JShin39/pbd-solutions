class Address {
  String streetName;
  String cityName;
  String state;
  int zipCode;
}

class Main {
  public static void main(String[] args) {
    Address address1 = new Address();
    Address address2 = new Address();
    Address address3 = new Address();
    
    address1.streetName = "1313 Disneyland Dr";
    address1.cityName = "Anaheim";
    address1.state = "California";
    address1.zipCode = 123456;
    
    address2.streetName = "4959 Road Dr";
    address2.cityName = "AAA";
    address2.state = "New York";
    address2.zipCode = 000010;
    
    address3.streetName = "5555 Street Dr";
    address3.cityName = "BBB";
    address3.state = "Chicago";
    address3.zipCode = 333333;
    
    System.out.println(address1.streetName + ", " + address1.cityName + ", " + address1.state + " " + address1.zipCode);
    
    System.out.println(address2.streetName + ", " + address2.cityName + ", " + address2.state + " " + address2.zipCode);
    
    System.out.println(address3.streetName + ", " + address3.cityName + ", " + address3.state + " " + address3.zipCode);
  }
}