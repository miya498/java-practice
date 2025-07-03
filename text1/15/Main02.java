public class Main02 {
    public static void main(String[] args){
        String s1 = "Java and JavaScripts";
        if (s1.contains("Java")){
            System.out.println("文字列s1はJavaを含みます");
        }

        if (s1.endsWith("Java")){
            System.out.println("文字列s1は末尾にJavaを含みます");
        }
        System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));

        System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
    }
}
