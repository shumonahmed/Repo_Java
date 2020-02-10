package Date;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList.add("Rani");
        arrayList.add("Rana");
        arrayList.add("Delwar");
        boolean b = arrayList.isEmpty();
        boolean a = arrayList.contains("Shumon");
        for (String name: arrayList){
           if(name.contains("rana")) {
              arrayList.remove("Rana");
              arrayList2.add("Rana");
           }

        }
       // arrayList.remove(0);
        arrayList.remove(1);
        System.out.println(arrayList);
        //System.out.println(b);
        //System.out.println(a);


    }
}
