public class LandLiving extends LivingThings{

    LandLiving(BreatheImplementor obj)
    {
        super(obj);
    }
    public void breatheProcess()
    {
      breatheInstance.breathe();
    }
}