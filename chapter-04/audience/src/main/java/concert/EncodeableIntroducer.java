package concert;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncodeableIntroducer {

    @DeclareParents(value="concert.Performance+",
            defaultImpl=DefaultEncoreable.class)
    public static Encoreable encoreable;
}