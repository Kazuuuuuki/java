import java.io.*;

class LowArray
  {
    private double[] a;

    public LowArray(int size)
      {
        a = new double[size];
      }

    public void setElem(int index, double value)
      {
        a[index] = value;
      }

    public double getElem(int index)
      {
        return a[index];
      }

  }

  class LowArrayApp
    {
      public static void main(String[] args)
        {
          LowArray arr;
          arr = new LowArray(100);
          int nElems = 0;
          int j;

          arr.setElem(0, 77);
          arr.setElem(1, 12);
          arr.setElem(2, 71);
          arr.setElem(3, 4);
          arr.setElem(4, 43);
          arr.setElem(5, 52);
          arr.setElem(6, 87);
          arr.setElem(7, 82);
          arr.setElem(8, 92);
          arr.setElem(9, 12);

          nElems = 10;
          int searchKey = 52;

          for(j=0; j<nElems; j++)
            if(arr.getElem(j) == searchKey)
              break;

          if(j == nElems)
            System.out.println("Can't find " + searchKey);
          else
            System.out.println("Found " + searchKey);

          for(j=0; j<nElems; j++)
            if(arr.getElem(j) == 43)
              break;
          for(int k=j; k<nElems; k++)
            arr.setElem(k, arr.getElem(k+1));
          nElems--;

          for(j=0; j<nElems; j++)
            System.out.print(arr.getElem(j) + " ");


        }
    }