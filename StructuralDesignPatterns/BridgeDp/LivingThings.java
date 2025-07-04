public abstract  class LivingThings{
    BreatheImplementor breatheInstance;
    LivingThings(BreatheImplementor obj)
    {
        this.breatheInstance = obj;
    }
    public abstract void breatheProcess();
}