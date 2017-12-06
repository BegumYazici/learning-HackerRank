package HackerRankExamples.JavaTutorial;

import java.util.HashSet;

public class JavaHashSet {

    public static void main(String[] args) {

        try {
            HashSet<Students> students = new HashSet<>();
            Students students1 = new Students(1, "alex", "cover", 17);
            Students students2 = new Students(2, "david", "green", 16);
            Students students3 = new Students(2, "venissa", "bing", 15);
            Students students4 = new Students(4, "maria", "geller", 17);
            Students students5 = new Students(4, "monica", "tall", 18);

            students.add(students1);
            students.add(students2);
            students.add(students3);
            students.add(students4);
            students.add(students5);

            for(Students st: students){
                System.out.println(st.getNo() + " " + st.getName() + " " + st.getSurname() + " " + st.getAge());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Students {
    private int no;
    private String name, surname;
    private int age;

    public Students() {
    }

    public Students(int no, String name, String surname, int age) {
        this.no = no;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this.no == ((Students) o).no) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return no; //ayırt edici değişkenimiz
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
