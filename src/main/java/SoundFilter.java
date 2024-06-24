import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VADHJTLJ")
public class SoundFilter {

    @OriginalMember(owner = "client!VADHJTLJ", name = "a", descriptor = "I")
    private int _flowObfuscator1 = 748;

    @OriginalMember(owner = "client!VADHJTLJ", name = "b", descriptor = "I")
    private int _flowObfuscator2 = 201;

    @OriginalMember(owner = "client!VADHJTLJ", name = "c", descriptor = "[I")
    public int[] pairs = new int[2];

    @OriginalMember(owner = "client!VADHJTLJ", name = "d", descriptor = "[[[I")
    public int[][][] frequencies = new int[2][2][4];

    @OriginalMember(owner = "client!VADHJTLJ", name = "e", descriptor = "[[[I")
    public int[][][] ranges = new int[2][2][4];

    @OriginalMember(owner = "client!VADHJTLJ", name = "f", descriptor = "[I")
    public int[] unities = new int[2];

    @OriginalMember(owner = "client!VADHJTLJ", name = "g", descriptor = "[[F")
    public static float[][] coefficient = new float[2][8];

    @OriginalMember(owner = "client!VADHJTLJ", name = "h", descriptor = "[[I")
    public static int[][] coefficient16 = new int[2][8];

    @OriginalMember(owner = "client!VADHJTLJ", name = "i", descriptor = "F")
    public static float unity;

    @OriginalMember(owner = "client!VADHJTLJ", name = "j", descriptor = "I")
    public static int unity16;

    @OriginalMember(owner = "client!VADHJTLJ", name = "a", descriptor = "(IIFZ)F")
    private float gain(int arg0, int arg1, float arg2, boolean arg3) {
        float var5 = (float) this.ranges[arg0][0][arg1] + arg2 * (float) (this.ranges[arg0][1][arg1] - this.ranges[arg0][0][arg1]);
        if (arg3) {
            throw new NullPointerException();
        } else {
            var5 *= 0.0015258789F;
            return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
        }
    }

    @OriginalMember(owner = "client!VADHJTLJ", name = "a", descriptor = "(BF)F")
    private float normalize(byte arg0, float arg1) {
        float var3 = 32.703197F * (float) Math.pow(2.0D, (double) arg1);
        if (arg0 == 8) {
            boolean var4 = false;
            return var3 * 3.1415927F / 11025.0F;
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!VADHJTLJ", name = "a", descriptor = "(BFII)F")
    private float phase(byte arg0, float arg1, int arg2, int arg3) {
        if (arg0 == 9) {
            boolean var6 = false;
        } else {
            this._flowObfuscator1 = -457;
        }
        float var5 = (float) this.frequencies[arg3][0][arg2] + arg1 * (float) (this.frequencies[arg3][1][arg2] - this.frequencies[arg3][0][arg2]);
        float var7 = var5 * 1.2207031E-4F;
        return this.normalize((byte) 8, var7);
    }

    @OriginalMember(owner = "client!VADHJTLJ", name = "a", descriptor = "(IFI)I")
    public int evaluate(int arg0, float arg1, int arg2) {
        int var9 = 31 / arg2;
        float var4;
        if (arg0 == 0) {
            var4 = (float) this.unities[0] + (float) (this.unities[1] - this.unities[0]) * arg1;
            float var10 = var4 * 0.0030517578F;
            unity = (float) Math.pow(0.1D, (double) (var10 / 20.0F));
            unity16 = (int) (unity * 65536.0F);
        }
        if (this.pairs[arg0] == 0) {
            return 0;
        } else {
            var4 = this.gain(arg0, 0, arg1, false);
            coefficient[arg0][0] = -2.0F * var4 * (float) Math.cos((double) this.phase((byte) 9, arg1, 0, arg0));
            coefficient[arg0][1] = var4 * var4;
            for (int var5 = 1; var5 < this.pairs[arg0]; var5++) {
                var4 = this.gain(arg0, var5, arg1, false);
                float var6 = -2.0F * var4 * (float) Math.cos((double) this.phase((byte) 9, arg1, var5, arg0));
                float var7 = var4 * var4;
                coefficient[arg0][var5 * 2 + 1] = coefficient[arg0][var5 * 2 - 1] * var7;
                coefficient[arg0][var5 * 2] = coefficient[arg0][var5 * 2 - 1] * var6 + coefficient[arg0][var5 * 2 - 2] * var7;
                for (int var8 = var5 * 2 - 1; var8 >= 2; var8--) {
                    coefficient[arg0][var8] += coefficient[arg0][var8 - 1] * var6 + coefficient[arg0][var8 - 2] * var7;
                }
                coefficient[arg0][1] += coefficient[arg0][0] * var6 + var7;
                coefficient[arg0][0] += var6;
            }
            int var11;
            if (arg0 == 0) {
                for (var11 = 0; var11 < this.pairs[0] * 2; var11++) {
                    coefficient[0][var11] *= unity;
                }
            }
            for (var11 = 0; var11 < this.pairs[arg0] * 2; var11++) {
                coefficient16[arg0][var11] = (int) (coefficient[arg0][var11] * 65536.0F);
            }
            return this.pairs[arg0] * 2;
        }
    }

    @OriginalMember(owner = "client!VADHJTLJ", name = "a", descriptor = "(LMBMGIXGO;ZLOZKFTHAD;)V")
    public final void read(Packet arg0, boolean arg1, SoundEnvelope arg2) {
        int var4 = arg0.g1();
        this.pairs[0] = var4 >> 4;
        if (!arg1) {
            this.pairs[1] = var4 & 15;
            if (var4 == 0) {
                this.unities[0] = this.unities[1] = 0;
            } else {
                this.unities[0] = arg0.g2();
                this.unities[1] = arg0.g2();
                int var5 = arg0.g1();
                int var7;
                for (int var6 = 0; var6 < 2; var6++) {
                    for (var7 = 0; var7 < this.pairs[var6]; var7++) {
                        this.frequencies[var6][0][var7] = arg0.g2();
                        this.ranges[var6][0][var7] = arg0.g2();
                    }
                }
                for (var7 = 0; var7 < 2; var7++) {
                    for (int var8 = 0; var8 < this.pairs[var7]; var8++) {
                        if ((var5 & 1 << var7 * 4 << var8) != 0) {
                            this.frequencies[var7][1][var8] = arg0.g2();
                            this.ranges[var7][1][var8] = arg0.g2();
                        } else {
                            this.frequencies[var7][1][var8] = this.frequencies[var7][0][var8];
                            this.ranges[var7][1][var8] = this.ranges[var7][0][var8];
                        }
                    }
                }
                if (var5 != 0 || this.unities[1] != this.unities[0]) {
                    arg2.readShape((byte) -112, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!VADHJTLJ", name = "<init>", descriptor = "()V")
    public SoundFilter() {
        if (Linkable._flowObfuscator2) {
        }
    }
}
