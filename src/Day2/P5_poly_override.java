package Day2;
class light{
    void glow(){
        System.out.println("Light glow!");
    }
}
class tublight extends light{

    @Override
    void glow(){
        System.out.println("Tubelight is power efficient & glow!");
    }
}
public class P5_poly_override {
    public static void main(){
        tublight t1 = new tublight();
        t1.glow();
    }
}
