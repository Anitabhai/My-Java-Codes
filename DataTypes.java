import java.io.*;
import java.util.*;

public class DataTypes {
    public void doDataTypes(){
        System.out.println(" Enter the number of data types and the corresponding values");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();

        for (int i = 0; i < t; i++){
            String s = in.nextLine();
            List<String> types = new ArrayList<String >();
            try{
                long lg = Long.parseLong(s);
                types.add("long");
                int ig = Integer.parseInt(s);
                types.add("int");
                short sr = Short.parseShort(s);
                types.add("short");
                byte by = Byte.parseByte(s);
                types.add("byte");

                if (s.equals("0") || s.equals("1"))
                    types.add("boolean");

                }catch(NumberFormatException exc){

                }finally{
                    if (types.size() == 0)
                        System.out.println( s + " can't be fitted anywhere.");
                    else {
                        System.out.println(s + " can be fitted in: ");
                        for (int j = types.size()-1; j >= 0; j--)
                            System.out.println("* " + types.get(j));
                    }
                }
            }
        }
    }
