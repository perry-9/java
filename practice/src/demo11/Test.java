package demo11;

public class Test {
    public static void palyMusic(Instrument i){
        i.play();
    }
    public static void main(String[] args) {
        Piano piano =new Piano();
        Violin violin=new Violin();
        Instrument[] arr={piano,violin};
        for(Instrument x:arr){
            palyMusic(x);
        }
        Instrument i=new Piano();
        if (i instanceof Piano){
            Piano piano1=(Piano) i;
            piano1.oi();
        }

    }
}
