import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class PersonalInformation {
    private String name;
    private int age;
    private String address;

    public PersonalInformation(String name, int age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

public class PassportFounder {
    public static void main(String[] args) {
        PersonalInformation information1 = new PersonalInformation("Ram", 33, "Mumbai");
        PersonalInformation information2 = new PersonalInformation("Sham", 10, "Delhi");
        PersonalInformation information3 = new PersonalInformation("Rabi", 20, "Kolkata");
        PersonalInformation information4 = new PersonalInformation("Anik", 40, "Kolkata");
        PersonalInformation information5 = new PersonalInformation("Suraj", 22, "Bangalore");
        PersonalInformation information6 = new PersonalInformation("Sourav", 35, "Mumbai");
        PersonalInformation information7 = new PersonalInformation("Shuvankar", 9, "Bangalore");
        PersonalInformation information8 = new PersonalInformation("Prianka", 18, "Bangalore");
        PersonalInformation information9 = new PersonalInformation("Gopal", 19, "Kolkata");
        PersonalInformation information10 = new PersonalInformation("Laxman", 20, "Delhi");

        HashMap<Integer, Object> passport = new HashMap<>();

        passport.put(100, information1);
        passport.put(101, information2);
        passport.put(102, information3);
        passport.put(103, information4);
        passport.put(104, information5);
        passport.put(105, information6);
        passport.put(106, information7);
        passport.put(107, information8);
        passport.put(108, information9);
        passport.put(109, information10);

        Scanner scn = new Scanner(System.in);

        Integer searchedpassport = scn.nextInt();

        Set<Integer> key = passport.keySet();
        Iterator<Integer> itrkey = key.iterator();

        boolean flag = false;
        Integer getpassportkey = 0;
        while (itrkey.hasNext()) {
            Integer value = (Integer) itrkey.next();
            if (value.equals(searchedpassport)) {
                flag = true;
                getpassportkey = value;
                break;
            } else {
                flag = false;
            }
        }
        scn.close();

        if (flag == true) {
            System.out.println("Passport Data Found");
            PersonalInformation valueinfo = (PersonalInformation) passport.get(getpassportkey);
            System.out.println("Name:       " + valueinfo.getName());
            System.out.println("Age:        " + valueinfo.getAge());
            System.out.println("Address:    " + valueinfo.getAddress());

        } else {
            System.out.println("Passport Data Not Found");
        }
    }
}
