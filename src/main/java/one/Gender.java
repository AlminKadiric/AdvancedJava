package one;

public enum Gender {
    MALE("M"),FEMALE("F");
    private String name;


    Gender (String name){
        this.name=name;

    }

    public String getName() {
        return name;
    }

}
