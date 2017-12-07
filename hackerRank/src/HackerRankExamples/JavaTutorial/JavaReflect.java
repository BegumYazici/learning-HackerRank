package HackerRankExamples.JavaTutorial;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class JavaReflect {
    public static void main(String[] args){

        Class student = Studentt.class;

        Method[] methods =student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();

        for(Method m : methods){
            methodList.add(m.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}
class Studentt{

    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
}
