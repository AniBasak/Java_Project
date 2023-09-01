import java.util.Scanner;

public class Ani1_Array {
    public static void main(String[] args) {
        array1 ar1 = new array1();
        //array1 ar2 = new array1();

        //ar1.farray1();
        ar1.farray2();
    }

}

class array1{
    void farray1()
    {
        int arr1[] = new int[5];
        int num = 22;
        for(int i=0;i<5;i++)
        {
            arr1[i] = num;
            System.out.println("arr1["+i+"] = "+num);
            num++;
        }
    }

     void farray2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("User array:\nHow many elements in the array =");
        int size = sc.nextInt();
        //sc.close();
        int arr2[] = new int[size];
        System.out.println("Enter elements:\n");
        for(int i=0;i<size;i++)
        {
            System.out.println("arr2["+i+"] =");
            arr2[i] = sc.nextInt();
            //System.out.println("arr2["+i+"] = "+arr2[i]);
        }
        System.out.println("\nElements:\n");
        for(int i=0;i<size;i++)
        {
            // System.out.println("arr2["+i+"] = ");
            // arr2[i] = sc.nextInt();
            System.out.println("arr2["+i+"] = "+arr2[i]);
        }
        sc.close();
    }
}
