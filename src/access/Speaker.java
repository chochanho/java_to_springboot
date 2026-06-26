package access;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume = volume;

    }
    void volumeUp(){
        if(volume>=100){
            System.out.println("음량을 증가할 수 없습니다.");
        }else{
            volume += 1;
            System.out.println("음량을 1증가합니다. ");
        }
    }
    void volumeDown(){
        if(volume<=0) {
            System.out.println("볼륨이 0입니다.");
        }else{
            volume -= 1;
            System.out.println("볼륨을 1 낮춥니다.");
        }
    }

    void showVolume(){
        System.out.println("현재 음량: "+ volume);
    }
}
