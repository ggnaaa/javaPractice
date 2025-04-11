package practice.extra;

public class StoCArray {
    public static void main(String[] args) {
        String a = "Gagana";
        char[] c = a.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if(i==0){
                System.out.println(i + " : " +"s");
            }else {
                System.out.println(i + " : " +c[i]);
            }
        }
    }
}
