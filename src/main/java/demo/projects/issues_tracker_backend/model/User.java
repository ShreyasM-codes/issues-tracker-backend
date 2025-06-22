package demo.projects.issues_tracker_backend.model;


public class User {
    private String name;
    private Gender gender;
    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public User(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

}
