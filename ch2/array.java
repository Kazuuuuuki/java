import java.io.*;

class ArrayApp
  {
    public static void main(String[] args) throws IOException
      {
        int[] arr;
        arr = new int[100];
        int nElems = 0;
        int j;
        int searchKey;

        arr[0] = 77;
        arr[1] = 93;
        arr[2] = 21;
        arr[3] = 2;
        arr[4] = 212;
        arr[5] = 63;
        arr[6] = 43;
        arr[7] = 23;
        arr[8] = 61;
        arr[9] = 81;
        nElems = 10;

        for(j=0; j<nElems; j++)
          System.out.print(arr[j] + "  ");
        System.out.println(" ");

        searchKey = 63;

        for(j=0; j<nElems; j++)
          if(arr[j] == searchKey)
            break;
        if(j == nElems)
          System.out.println("Can not Found " + searchKey);
        else
          System.out.println("Found " + searchKey);

        searchKey = 212;

        for(j=0; j<nElems; j++)
          if(arr[j] == searchKey)
            break;

        for(int k=j; k<nElems; k++)
          arr[k] = arr[k+1];

        nElems--;

        for(j=0; j<nElems; j++)
          System.out.print( arr[j] + "  ");

        System.out.println("");

       }


  }