package concert;


public aspect CriticAspect {

    public CriticAspect() {
    }

    pointcut performance(): execution(* concert.Performance.perform(..));

    after(): execution(* concert.Performance.perform(..)) {
        System.out.println(criticismEngine.getCriticism());
    }

    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}