package MV.Ami;
import java.util.ArrayList;
import java.util.Scanner;
public class SupportChat {
    static ArrayList<String> arrayListDef = new ArrayList<String>();
    static Scanner scanner =  new Scanner(System.in);
    static String sumDef = "";
    static String sum = "";
    static String text = "";
    
    private static void menu(){
        System.out.println("chọn tính năng muốn sữ dụng.");
        System.out.println("1: chuyển thể văn bản sang mã XML");
        System.out.println("2: chuyển mã XML sang văn bản");
    }
    
    private static void coverCodeToXml(){
        System.out.println("Vui lòng nhập vào code cần chuyển sang XML");
        System.out.println("-------------------------------------------");
        while (true){
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("ok")){
                break;
            }
            else {
                arrayListDef.add(s);
            }
        }
        for (String s : arrayListDef){
            sumDef += s + "\n";
        }
        sum = sumDef
                .replace("\n", "\\n")
                .replace("\"", "\\\"")
                .replace("	", "\\t");
        System.out.println("-------------------------------------------");
        System.out.println("\n\"\"\""+sumDef+"\"\"\"\n");
        System.out.println("-------------------------------------------\n");
        System.out.println("-------------------------------------------");
        System.out.println("\\n\\\"\\\"\\\""+sum+"\\n\\\"\\\"\\\"\\n");
        System.out.println("-------------------------------------------");
    }
    private static void coverXmlToCode(){
        System.out.println("nhập vào một đoạn mã xml");
        System.out.println("-------------------------------------------");
        while(true){
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("ok")){
                break;
            }
            else{
                text += s;
            }
        }
        String text2 = text.replace("\\t", "	");
        String text3[] = text2.split("\\n");
        System.out.println("-------------------------------------------");
        for (String s : text3){
            System.out.println(s);
        }
        System.out.println("-------------------------------------------");
    }
    public static void main(String[] args) {
        try{
            menu();
            switch (scanner.nextInt()){
                case 1:
                    coverCodeToXml();
                    break;
                case 2:
                    coverXmlToCode();
                    break;
                default:
                    System.out.println("nhập sai rồi, phải làm theo hướng dẩn nhé!!");
                    break;
            }
        }
        catch(Exception e){
            System.out.println("Code gặp lỗi: "+e);
        }
    }
}
