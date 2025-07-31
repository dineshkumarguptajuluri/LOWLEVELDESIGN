public class Remote {
//    public int channelNo;
//    public int volume;
    public boolean status;
    public Remote()
    {
//        this.channelNo = num;
//        this.volume = vol;
//        this.status = status;
    }
//    public void setChannel(int num)
//    {
//        this.channelNo = num;
//    }
//    public void setVolume(int vol)
//    {
//        this.volume = vol;
//
//    }
    public void turnOn()
    {
        this.status = true;
        System.out.println("Turned On");

    }
    public void turnOff()
    {
        this.status = false;
        System.out.println("Turned Off");
    }

}