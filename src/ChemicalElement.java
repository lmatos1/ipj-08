// 3.2.30 incomplete this is my best attempt without using your code.
// elements file taken from your github
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class ChemicalElement {
    static Map<String,String> map = new HashMap<String,String>();
    static String symbol;
    static String weight;
    public static void main(String[] args) {
        readValues("elements");
        printValues();
    }
    public static void readValues(String sy)
    {
        try {
            File text = new File(sy);
            Scanner s = new Scanner(text);
            while (s.hasNextLine())
            {
                if(s.hasNext()) {
                    s.next();

                    s.next();
                    symbol = s.next();
                    weight = s.next();

                    s.nextLine();

                    map.put(symbol, weight);

                }
            }System.out.println("Date red from text file");
        }catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }
    public static void printValues()
    {
        String sym;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your symbol : ");
        sym = sc.next();
        java.util.Iterator<Entry<String, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {

        }

    }
}
