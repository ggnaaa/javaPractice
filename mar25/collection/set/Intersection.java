package mar25.collection.set;

import java.util.*;

//Find the intersection of two sets.
public class Intersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        //without retainAll().
        List<Integer> a=new ArrayList<>(set1);
        List<Integer> b=new ArrayList<>(set2);
        Set<Integer> intersection=new HashSet<>();

        for(int i=0;i<set1.size();i++){
            for(int j=0;j<set2.size();j++){
                if(Objects.equals(a.get(i), b.get(j))){
                    intersection.add(a.get(i));
                }
            }
        }
        System.out.println("inter: "+intersection);

        // Perform intersection using retainAll()
        set1.retainAll(set2);
        System.out.println("Intersection: " + set1);
    }
}
