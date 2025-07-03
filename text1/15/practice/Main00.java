public class Main00 {
    public static void main(String[] args){

        StringBuffer sb = new StringBuffer();
        for(int i=1;i<101;i++){
            sb.append(i + ",");
        }
        String s = sb.toString();
        String[] a = s.split(",");
        for(String A:a){
            System.out.print(A + "+");
        }

        String folder = "c:¥javadev";
        String file = "readme.txt";

        System.out.println(folderAddFile(folder,file));
    }

    public static String folderAddFile(String folder,String file){
        if (folder.endsWith("¥")){
            return folder + file;
        }else{
            return folder + "¥" + file;
        }
    }
}
