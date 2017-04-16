import java.io.* ;

class OrdArray
  {
    private double[] a;
    private int nElems;

    public OrdArray(int max)
      {
        a = new double[max];
        nElems = 0;

      }

    public int size()
      { return nElems; }

    public int find(double searchKey)
      {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while(true)
          {
            curIn = (lowerBound + upperBound) / 2;
            if(a[curIn] == searchKey)
              return curIn;
            else if(lowerBound > upperBound)
              return nElems;
            else
              {
                if(a[curIn] < searchKey)
                  lowerBound = curIn + 1;
                else
                  upperBound = curIn - 1;
              }
          }

        }


      public void insert(double value)
        {
          int j;
          for(j=0; j<nElems; j++)
            if(a[j] > value)
              break;
          for(int k=nElems; k>j; k--)
            a[k] = a[k-1];
          a[j] = value;
          nElems++;
        }

      public boolean delete(double value)
        {
          int j = find(value);
          if(j==nElems)
            return false;
          else
            {
              for(int k=j; k<nElems; k++)
                a[k] = a[k+1];
              nElems--;
              return true;
            }
        }

        public void display()
          {
            for(int j=0; j<nElems; j++)
              System.out.print(a[j] + " ");
            System.out.println("");

          }
  }

class OrderedApp
  {
    public static void main(String[] args)
    {
    int maxSize = 100;
    OrdArray arr;
    arr = new OrdArray(maxSize);

    arr.insert(77);
    arr.insert(99);
    arr.insert(33);
    arr.insert(44);
    arr.insert(11);
    arr.insert(00);
    arr.insert(22);
    arr.insert(88);
    arr.insert(66);
    arr.insert(55);

    int searchKey = 55;
    if( arr.find(searchKey) != arr.size())
      System.out.println("Found " + searchKey);
    else
      System.out.println("Can not find" + searchKey);

    arr.display();

    arr.delete(22);
    arr.delete(33);
    arr.delete(00);

    arr.display();
    }
    }