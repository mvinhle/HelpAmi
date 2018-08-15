package MV.Ami;
import java.util.ArrayList;
import java.util.Scanner;
public class SupportChat {
    static ArrayList<String> arrayListDef = new ArrayList<String>();
    static Scanner scanner =  new Scanner(System.in);
    static String sumDef = "";
    static String sum = "";
    
    private static void menu(){
        System.out.println("chọn tính năng muốn sữ dụng.");
        System.out.println("1: chuyển thể code sang mã XML");
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
    public static void main(String[] args) {
        try{
            menu();
        switch (scanner.nextInt()){
            case 1:
                coverCodeToXml();
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
