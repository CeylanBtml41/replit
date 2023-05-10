package arrays;

import java.util.ArrayList;

public class C01 {


    public static void main(String[] args) {


       /*Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.

not: Test datadaki değerleri kullanınız.

```
Test Data:
```

```
[1232, 1134,2345,1022]
```

```
[Java, Python, PHP, C#, C Programming, C++]
```

```
Beklenen Çıktı:
```

```
[1022,1134,1232,2345]
```

```
[C Programming, C#, C++, Java, PHP, Python]
```
 */

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1232);
        arr.add(1134);
        arr.add(2345);
        arr.add(1022);

        System.out.println(arr);


        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Java");
        arr1.add("Python");
        arr1.add("PHP");
        arr1.add("C#");
        arr1.add("C Programming");
        arr1.add("C++");

        System.out.println(arr1);
        
        System.out.println();



    }
}
