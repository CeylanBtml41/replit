package arrays;

import java.util.ArrayList;

public class C05 {

    public static void main(String[] args) {

        /*
        Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

Array: [12,15,43,23,56,76,78,90,77,43]

```
Aranan değer:56
```

```
Beklenen Çıktı:
```

```
56 sayısı arrayin 4. elemanı
```


        int[] arr = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};

        int arananDeger = 56;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananDeger) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println(arananDeger + " sayısı arrayin " + (index + 1) + ". elemanı");
        } else {
            System.out.println(arananDeger + " sayısı arrayda bulunamadı");
        }
*/

        /*
        yazılan değerin array içerisinde arayan Java Kodu yazınız.

Array: [1551,1223,1443,1267,1789,1023,2020]

```
Aranan Değer:2020
```

```
Beklenen Çıktı:**True**
```

```
Aranan Değer:2010
```

```
Beklenen Çıktı :**False**
```*/


        Integer arr1[] = {1551, 1223, 1443, 1267, 1789, 1023, 2020};

        ArrayList<Integer> arr =new ArrayList<>();

        arr.add(1551);
        arr.add(1223);
        arr.add(1443);
        arr.add(1267);
        arr.add(1789);
        arr.add(1023);
        arr.add(2020);

        boolean r1 =arr.contains(2020);
        boolean r2 =arr.contains(2010);

        System.out.println(r1);
        System.out.println(r2);


    }
}