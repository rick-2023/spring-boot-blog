package EffectiveJava;

/**
 * Created by Administrator on 2017/6/3 0003.
 */
public class Elvis {
    private static  final  Elvis INSTANCE = null;
    private Elvis(){}
    public static Elvis getInstance(){
        if(INSTANCE == null){
            return new Elvis();//第一次使用的时候创建
        }
        return INSTANCE;//永远都返回同一个对象的引用
    }
    public void leaveTheBuilding(){}
    public Object readResolve(){
        return INSTANCE;
    }
}
