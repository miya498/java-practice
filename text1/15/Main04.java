public class Main04 {
    public static void main(String[] args){

        String s = "abc,def:ghi";
        String[] words = s.split("[:,]");
        for (String w: words){
            System.out.print(w+"->");
        }

        String w = s.replaceAll("[beh]", "X");
        System.out.println(w);

        final String FORMAT = "%-9s %-13s 所持金%,6d";
        String s_format = String.format(FORMAT,"友利","ニートゥチェスト",985);
        System.out.println(s_format);

    }

    public boolean isValidPlayerName(String name){
        return name.matches("[A-Z][A-Z0-9]{7}");
    }
}
