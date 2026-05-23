package demo14;

public class AndioPlayer implements IPlay,IRecord{
    @Override
    public void play() {
        System.out.println("播放音频");
    }

    @Override
    public void record() {
        System.out.println("录制音频");
    }

}
