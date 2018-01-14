package XML;

/**
 * @author 范正荣
 * @Date 2017/9/29 0029 9:49.
 */
class Gizmo{
    public void spin(){}
}
public class FinalArgument {
    final void with(final Gizmo g){
       // g = new Gizmo();// g is final
    }
 private void without(Gizmo g){
        g = new Gizmo();
        g.spin();
    }
}
