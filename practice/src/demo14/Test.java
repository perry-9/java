package demo14;

public class Test {
    public static void main(String[] args) {
        IPlay iPlay=new AndioPlayer();
        IPlay iRecord =new VideoPlayer();
        IRecord iRecord1=new AndioPlayer();
        iPlay.play();
        iRecord.play();
        iRecord1.record();
    }
}
