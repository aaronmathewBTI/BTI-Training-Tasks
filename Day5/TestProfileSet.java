package Day5;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestProfileSet {
    public static void main(String[] args) {
        Profile profile1 = new Profile(1234, "Sujan", LocalDate.parse("2000-10-15"));
        Profile profile2 = new Profile(4567, "Vishnu", LocalDate.parse("2002-11-15"));
        Profile profile3 = new Profile(7890, "Athary", LocalDate.parse("2003-10-15"));
        Profile profile4 = new Profile(8910, "Sujan", LocalDate.parse("2000-11-15"));
        Profile profile5 = new Profile(1234, "Sujan", LocalDate.parse("2000-10-15"));
        // System.out.println(profile1); // inovkes .toString() internally, comes from Object Class

        Set<Profile> profileSet = new TreeSet<>();
        profileSet.add(profile1);
        profileSet.add(profile2);
        profileSet.add(profile3);
        profileSet.add(profile4);
        profileSet.add(profile5);

        for(Profile profile : profileSet){
            System.out.println(profile);
        }
    }
}

 