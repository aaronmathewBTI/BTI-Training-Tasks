package Day5;

import java.time.LocalDate;

public class Profile implements Comparable<Profile> {
    private int id;
    private String name;
    private LocalDate dob;

    @Override
    public int compareTo(Profile o) {
        // TODO Auto-generated method stub
        return Integer.compare(this.id, o.getId());
    }

    public Profile() {

    }

    public Profile(int id, String name, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Profile [id= " + id + ", name= " + name + ", dob= " + dob + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Profile other = (Profile) obj;
        if (id != other.id)
            return false;
        return true;
    }


}

 