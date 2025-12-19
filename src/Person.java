package src;

public final class Person {
  private final String name;
  private final int age;
  private final java.util.Date birthDate; // mutable field

  public Person(String name, int age, java.util.Date birthDate) {
    this.name = name;
    this.age = age;
    // Defensive copy for mutable field
    this.birthDate = new java.util.Date(birthDate.getTime());
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public java.util.Date getBirthDate() {
    // Return a defensive copy
    return new java.util.Date(birthDate.getTime());
  }

  @Override
  public String toString() {
    return "Person{name='" + name + "', age=" + age + ", birthDate=" + birthDate + '}';
  }
}
