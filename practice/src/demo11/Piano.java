package demo11;

public class Piano extends Instrument{
    @Override
    public void play() {
        System.out.println("弹钢琴");
    }
    public void oi(){
        System.out.println("父类没有");
    }
}
