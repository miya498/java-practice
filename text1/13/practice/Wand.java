public class Wand {
    private String name;
    private double power;
    public String getName() { return this.name;}
    public void setName(String name) {
        if (name == null || name.length() < 3){
            throw new IllegalArgumentException("名前が短すぎます。処理を中断します。");
        }
        this.name = name;
    }
    public double getPower() { return this.power; }
    public void setPower(double power) {
        if (0.5 > power || power > 100.0){
            throw new IllegalArgumentException("増幅率が異常値です。処理を中断します。");
        }
        this.power = power;}
}
