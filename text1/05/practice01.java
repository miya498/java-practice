public class practice01 {
    public static void introduceOneself(String name,int age,double height,char animals){
        System.out.println("私の名前は"+name+"です。歳は"+age+"です。身長は"+height+"cmです。"+"十二支は"+animals+"です。");
    }

    public static void email(String title,String address,String text){
        System.out.println(address+"に以下のメールを送信しました。");
        System.out.println("件名:"+title);
        System.out.println("本文:"+text);
    }

    public static void email(String address,String text){
        System.out.println(address+"に、以下のメールを送信しました。");
        System.out.println("件名:無題");
        System.out.println("本文:"+text);
    }

    public static double calcTriangleArea(double bottom,double height){
        double ans = bottom*height/2;
        return ans;
    }

    public static double calcCircleArea(double radius){
        double ans = radius* radius * 3.14;
        return ans;
    }

    public static void main(String[] args){
        introduceOneself("田中", 25, 170.5, '寅');
        
        email("テスト", "test@example.com", "これはテストです");
        email("info@example.com", "お世話になっております");
        
        double triangleArea = calcTriangleArea(10.0, 5.0);
        System.out.println("三角形の面積：" + triangleArea);
        
        double circleArea = calcCircleArea(5.0);
        System.out.println("円の面積：" + circleArea);
    }
}
