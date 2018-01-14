package ThreadSafe;

import jdk.nashorn.internal.ir.annotations.Immutable;
import org.bouncycastle.util.Arrays;

import java.math.BigInteger;

/**
 * @author 范正荣
 * @Date 2017/7/27 0027 上午 11:32.
 */
@Immutable
public class OneValueCache {
    private  final BigInteger lastNumber;
    private final BigInteger[] lastFactors;

    public OneValueCache(BigInteger i,BigInteger[] factors){
        lastFactors = Arrays.copyOf(factors,factors.length);
        lastNumber = i;
    }

    public BigInteger[] getLastFactors(BigInteger i){
        if (lastNumber == null || !lastNumber.equals(i)){
                return  null;
        }
        return  Arrays.copyOf(lastFactors,lastFactors.length);
    }
}
