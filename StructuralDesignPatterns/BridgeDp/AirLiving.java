public class AirLiving extends LivingThings{

    AirLiving(BreatheImplementor obj)
    {
        super(obj);
    }
    public void breatheProcess()
    {
      breatheInstance.breathe();
    }
}