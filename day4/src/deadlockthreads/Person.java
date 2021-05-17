package main.deadlockthreads;

public class Person {

    Long UID;
    String Name;

    public Person(Long UID, String name) {
        this.UID = UID;
        Name = name;
    }

    public Long getUID() {
        return UID;
    }

    public void setUID(Long UID) {
        this.UID = UID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
