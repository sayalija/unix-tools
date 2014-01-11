package sayalija.UnixTools.Head;

import sayalija.UnixTools.FileSystem;

public class HeadClient {
    public static void main(String[] args) {
        int lines = 0;
        String fileName;
        if(args[0].contains(".")){
            fileName = args[0];
        }
        else{
            lines = Integer.parseInt(args[0]) * -1;
            fileName = args[1];
        }
        FileSystem fs= new FileSystem();
        String text = fs.readFile(fileName);
        String str = "";
        Head client1 = new Head(text);
        str = client1.getHeader();
        System.out.println("10 lines--->   \n"+str);
        Head client2 = new Head(text,lines);
        str = client2.getHeader();
        System.out.println("3 lines--->   \n"+str);
    }
}