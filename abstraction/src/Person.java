public abstract class Person {
    private String name;
    private String Gender;

    public Person(String name, String gender) {
        this.name = name;
        this.Gender = gender;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
