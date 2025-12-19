package src;

import java.util.Date;

public class mainu {

  public static void main(String[] args) {
    Person person = new Person("ded", 12, new Date());
    person.getAge();
    person = new Person("erw", 23, new Date());
    System.out.println(person);
  }

}
