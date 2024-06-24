import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CDEJWOSB")
public class WorldRegion {

    @OriginalMember(owner = "client!CDEJWOSB", name = "a", descriptor = "I")
    private static int _flowObfuscator1 = -12499;

    @OriginalMember(owner = "client!CDEJWOSB", name = "b", descriptor = "I")
    private static int _flowObfuscator2 = -192;

    @OriginalMember(owner = "client!CDEJWOSB", name = "a", descriptor = "(IIIZ)I")
    public static int rotateX(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = arg0 & 3;
        if (arg3) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var5 == 0) {
            return arg2;
        } else if (var5 == 1) {
            return arg1;
        } else {
            return var5 == 2 ? 7 - arg2 : 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!CDEJWOSB", name = "a", descriptor = "(IIII)I")
    public static int rotateZ(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 0) {
            _flowObfuscator2 = -146;
        }
        int var4 = arg1 & 3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else {
            return var4 == 2 ? 7 - arg0 : arg3;
        }
    }

    @OriginalMember(owner = "client!CDEJWOSB", name = "a", descriptor = "(IIIBII)I")
    public static int rotateLocX(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != 113) {
            return _flowObfuscator1;
        } else {
            int var6 = arg0 & 3;
            if (var6 == 0) {
                return arg2;
            } else if (var6 == 1) {
                return arg4;
            } else {
                return var6 == 2 ? 7 - arg2 - (arg5 - 1) : 7 - arg4 - (arg1 - 1);
            }
        }
    }

    @OriginalMember(owner = "client!CDEJWOSB", name = "a", descriptor = "(IIIIII)I")
    public static int rotateLocZ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg3 & 3;
        if (arg0 >= 0) {
            return _flowObfuscator2;
        } else if (var6 == 0) {
            return arg1;
        } else if (var6 == 1) {
            return 7 - arg5 - (arg4 - 1);
        } else {
            return var6 == 2 ? 7 - arg1 - (arg2 - 1) : arg5;
        }
    }
}
