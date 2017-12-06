package HackerRankExamples.JavaTutorial;

import java.lang.reflect.Method;

public class JavaReflection {

    public static void main(String[] args) {
        try {

            // İlk önce test edeceğimiz Clası çağırıyoruz ve nesnemize atıyoruz.
            // iki türlüde kullanabilrisiniz.
             Class cls = ReflectionClass.class;
            // Metodları okumaya başlayalım metod isimleri,
            // dönüş tipleri,default değeri,kaç parametre alıyorsa sayısı
            // parametlerin isimleri ve çoğu bilgiye oluşturduğumuz
            // Class nesnesinin getDeclaredMethods()
            // metodunu çağırarak çekebiliriz.

            for (Method m : cls.getDeclaredMethods()) {
                m.getName();
                m.getReturnType();
                m.getParameterCount();
                System.out.println(" Metod ismi : " + m.getName() + " \n"
                        + " Metod Dönüş Tipi : " + m.getReturnType() + " \n"
                        + " Parametre Sayısı : " + m.getParameterCount());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class ReflectionClass {

    private int sayi;

    public void goster() {
        System.out.println("goster() aldığı parametre yok");
    }

    public String gosterString(String temp) {
        System.out.println("gosterString() String parametresi : " + temp);
        return temp;
    }

    public int gosterInteger(int temp) {
        System.out.println("gosterInterger() Integer parametresi : " + temp);
        return temp;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
        System.out.println("setSayi() setlenen sayi : " + sayi);
    }

    public void gosterSayi() {
        System.out.println("gosterSayi() : " + this.sayi);
    }
}
