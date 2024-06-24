import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CLRWXPOI")
public class SoundTone {

    @OriginalMember(owner = "client!CLRWXPOI", name = "a", descriptor = "Z")
    private boolean _flowObfuscator1 = true;

    @OriginalMember(owner = "client!CLRWXPOI", name = "b", descriptor = "LOZKFTHAD;")
    private SoundEnvelope frequencyBase;

    @OriginalMember(owner = "client!CLRWXPOI", name = "c", descriptor = "LOZKFTHAD;")
    private SoundEnvelope amplitudeBase;

    @OriginalMember(owner = "client!CLRWXPOI", name = "d", descriptor = "LOZKFTHAD;")
    private SoundEnvelope frequencyModRate;

    @OriginalMember(owner = "client!CLRWXPOI", name = "e", descriptor = "LOZKFTHAD;")
    private SoundEnvelope frequencyModRange;

    @OriginalMember(owner = "client!CLRWXPOI", name = "f", descriptor = "LOZKFTHAD;")
    private SoundEnvelope amplitudeModRate;

    @OriginalMember(owner = "client!CLRWXPOI", name = "g", descriptor = "LOZKFTHAD;")
    private SoundEnvelope amplitudeModRange;

    @OriginalMember(owner = "client!CLRWXPOI", name = "h", descriptor = "LOZKFTHAD;")
    private SoundEnvelope release;

    @OriginalMember(owner = "client!CLRWXPOI", name = "i", descriptor = "LOZKFTHAD;")
    private SoundEnvelope attack;

    @OriginalMember(owner = "client!CLRWXPOI", name = "j", descriptor = "[I")
    private int[] harmonicVolume = new int[5];

    @OriginalMember(owner = "client!CLRWXPOI", name = "k", descriptor = "[I")
    private int[] harmonicSemitone = new int[5];

    @OriginalMember(owner = "client!CLRWXPOI", name = "l", descriptor = "[I")
    private int[] harmonicDelay = new int[5];

    @OriginalMember(owner = "client!CLRWXPOI", name = "m", descriptor = "I")
    private int reverbDelay;

    @OriginalMember(owner = "client!CLRWXPOI", name = "n", descriptor = "I")
    private int reverbVolume = 100;

    @OriginalMember(owner = "client!CLRWXPOI", name = "o", descriptor = "LVADHJTLJ;")
    private SoundFilter filter;

    @OriginalMember(owner = "client!CLRWXPOI", name = "p", descriptor = "LOZKFTHAD;")
    private SoundEnvelope filterRange;

    @OriginalMember(owner = "client!CLRWXPOI", name = "q", descriptor = "I")
    public int length = 500;

    @OriginalMember(owner = "client!CLRWXPOI", name = "r", descriptor = "I")
    public int start;

    @OriginalMember(owner = "client!CLRWXPOI", name = "s", descriptor = "[I")
    private static int[] buffer;

    @OriginalMember(owner = "client!CLRWXPOI", name = "t", descriptor = "[I")
    private static int[] noise;

    @OriginalMember(owner = "client!CLRWXPOI", name = "u", descriptor = "[I")
    private static int[] sin;

    @OriginalMember(owner = "client!CLRWXPOI", name = "v", descriptor = "[I")
    private static int[] tmpPhases = new int[5];

    @OriginalMember(owner = "client!CLRWXPOI", name = "w", descriptor = "[I")
    private static int[] tmpDelays = new int[5];

    @OriginalMember(owner = "client!CLRWXPOI", name = "x", descriptor = "[I")
    private static int[] tmpVolumes = new int[5];

    @OriginalMember(owner = "client!CLRWXPOI", name = "y", descriptor = "[I")
    private static int[] tmpSemitones = new int[5];

    @OriginalMember(owner = "client!CLRWXPOI", name = "z", descriptor = "[I")
    private static int[] tmpStarts = new int[5];

    @OriginalMember(owner = "client!CLRWXPOI", name = "a", descriptor = "()V")
    public static final void init() {
        noise = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                noise[var0] = 1;
            } else {
                noise[var0] = -1;
            }
        }
        sin = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            sin[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        buffer = new int[220500];
    }

    @OriginalMember(owner = "client!CLRWXPOI", name = "a", descriptor = "(II)[I")
    public final int[] generate(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            buffer[var3] = 0;
        }
        if (arg1 < 10) {
            return buffer;
        } else {
            double var4 = (double) arg0 / ((double) arg1 + 0.0D);
            this.frequencyBase.reset((byte) 8);
            this.amplitudeBase.reset((byte) 8);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            if (this.frequencyModRate != null) {
                this.frequencyModRate.reset((byte) 8);
                this.frequencyModRange.reset((byte) 8);
                var6 = (int) ((double) (this.frequencyModRate.end - this.frequencyModRate.start) * 32.768D / var4);
                var7 = (int) ((double) this.frequencyModRate.start * 32.768D / var4);
            }
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (this.amplitudeModRate != null) {
                this.amplitudeModRate.reset((byte) 8);
                this.amplitudeModRange.reset((byte) 8);
                var9 = (int) ((double) (this.amplitudeModRate.end - this.amplitudeModRate.start) * 32.768D / var4);
                var10 = (int) ((double) this.amplitudeModRate.start * 32.768D / var4);
            }
            for (int var12 = 0; var12 < 5; var12++) {
                if (this.harmonicVolume[var12] != 0) {
                    tmpPhases[var12] = 0;
                    tmpDelays[var12] = (int) ((double) this.harmonicDelay[var12] * var4);
                    tmpVolumes[var12] = (this.harmonicVolume[var12] << 14) / 100;
                    tmpSemitones[var12] = (int) ((double) (this.frequencyBase.end - this.frequencyBase.start) * 32.768D * Math.pow(1.0057929410678534D, (double) this.harmonicSemitone[var12]) / var4);
                    tmpStarts[var12] = (int) ((double) this.frequencyBase.start * 32.768D / var4);
                }
            }
            int var14;
            int var15;
            int var16;
            int var17;
            for (int var13 = 0; var13 < arg0; var13++) {
                var14 = this.frequencyBase.evaluate(true, arg0);
                var15 = this.amplitudeBase.evaluate(true, arg0);
                if (this.frequencyModRate != null) {
                    var16 = this.frequencyModRate.evaluate(true, arg0);
                    var17 = this.frequencyModRange.evaluate(true, arg0);
                    var14 += this.generate(var17, 0, var8, this.frequencyModRate.form) >> 1;
                    var8 += (var16 * var6 >> 16) + var7;
                }
                if (this.amplitudeModRate != null) {
                    var16 = this.amplitudeModRate.evaluate(true, arg0);
                    var17 = this.amplitudeModRange.evaluate(true, arg0);
                    var15 = var15 * ((this.generate(var17, 0, var11, this.amplitudeModRate.form) >> 1) + 32768) >> 15;
                    var11 += (var16 * var9 >> 16) + var10;
                }
                for (var16 = 0; var16 < 5; var16++) {
                    if (this.harmonicVolume[var16] != 0) {
                        var17 = var13 + tmpDelays[var16];
                        if (var17 < arg0) {
                            buffer[var17] += this.generate(var15 * tmpVolumes[var16] >> 15, 0, tmpPhases[var16], this.frequencyBase.form);
                            tmpPhases[var16] += (var14 * tmpSemitones[var16] >> 16) + tmpStarts[var16];
                        }
                    }
                }
            }
            int var18;
            int var19;
            if (this.release != null) {
                this.release.reset((byte) 8);
                this.attack.reset((byte) 8);
                var14 = 0;
                boolean var23 = false;
                boolean var24 = true;
                for (var17 = 0; var17 < arg0; var17++) {
                    var18 = this.release.evaluate(true, arg0);
                    var19 = this.attack.evaluate(true, arg0);
                    if (var24) {
                        var15 = this.release.start + ((this.release.end - this.release.start) * var18 >> 8);
                    } else {
                        var15 = this.release.start + ((this.release.end - this.release.start) * var19 >> 8);
                    }
                    var14 += 256;
                    if (var14 >= var15) {
                        var14 = 0;
                        var24 = !var24;
                    }
                    if (var24) {
                        buffer[var17] = 0;
                    }
                }
            }
            if (this.reverbDelay > 0 && this.reverbVolume > 0) {
                var14 = (int) ((double) this.reverbDelay * var4);
                for (var15 = var14; var15 < arg0; var15++) {
                    buffer[var15] += buffer[var15 - var14] * this.reverbVolume / 100;
                }
            }
            if (this.filter.pairs[0] > 0 || this.filter.pairs[1] > 0) {
                this.filterRange.reset((byte) 8);
                var14 = this.filterRange.evaluate(true, arg0 + 1);
                var15 = this.filter.evaluate(0, (float) var14 / 65536.0F, 201);
                var16 = this.filter.evaluate(1, (float) var14 / 65536.0F, 201);
                if (arg0 >= var15 + var16) {
                    var17 = 0;
                    var18 = var16;
                    if (var16 > arg0 - var15) {
                        var18 = arg0 - var15;
                    }
                    int var20;
                    int var21;
                    while (var17 < var18) {
                        var19 = (int) ((long) buffer[var17 + var15] * (long) SoundFilter.unity16 >> 16);
                        for (var20 = 0; var20 < var15; var20++) {
                            var19 += (int) ((long) buffer[var17 + var15 - 1 - var20] * (long) SoundFilter.coefficient16[0][var20] >> 16);
                        }
                        for (var21 = 0; var21 < var17; var21++) {
                            var19 -= (int) ((long) buffer[var17 - 1 - var21] * (long) SoundFilter.coefficient16[1][var21] >> 16);
                        }
                        buffer[var17] = var19;
                        var14 = this.filterRange.evaluate(true, arg0 + 1);
                        var17++;
                    }
                    short var25 = 128;
                    var18 = var25;
                    while (true) {
                        if (var18 > arg0 - var15) {
                            var18 = arg0 - var15;
                        }
                        int var22;
                        while (var17 < var18) {
                            var20 = (int) ((long) buffer[var17 + var15] * (long) SoundFilter.unity16 >> 16);
                            for (var21 = 0; var21 < var15; var21++) {
                                var20 += (int) ((long) buffer[var17 + var15 - 1 - var21] * (long) SoundFilter.coefficient16[0][var21] >> 16);
                            }
                            for (var22 = 0; var22 < var16; var22++) {
                                var20 -= (int) ((long) buffer[var17 - 1 - var22] * (long) SoundFilter.coefficient16[1][var22] >> 16);
                            }
                            buffer[var17] = var20;
                            var14 = this.filterRange.evaluate(true, arg0 + 1);
                            var17++;
                        }
                        if (var17 >= arg0 - var15) {
                            while (var17 < arg0) {
                                var20 = 0;
                                for (var21 = var17 + var15 - arg0; var21 < var15; var21++) {
                                    var20 += (int) ((long) buffer[var17 + var15 - 1 - var21] * (long) SoundFilter.coefficient16[0][var21] >> 16);
                                }
                                for (var22 = 0; var22 < var16; var22++) {
                                    var20 -= (int) ((long) buffer[var17 - 1 - var22] * (long) SoundFilter.coefficient16[1][var22] >> 16);
                                }
                                buffer[var17] = var20;
                                this.filterRange.evaluate(true, arg0 + 1);
                                var17++;
                            }
                            break;
                        }
                        var15 = this.filter.evaluate(0, (float) var14 / 65536.0F, 201);
                        var16 = this.filter.evaluate(1, (float) var14 / 65536.0F, 201);
                        var18 += var25;
                    }
                }
            }
            for (var14 = 0; var14 < arg0; var14++) {
                if (buffer[var14] < -32768) {
                    buffer[var14] = -32768;
                }
                if (buffer[var14] > 32767) {
                    buffer[var14] = 32767;
                }
            }
            return buffer;
        }
    }

    @OriginalMember(owner = "client!CLRWXPOI", name = "a", descriptor = "(IIII)I")
    private final int generate(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            this._flowObfuscator1 = !this._flowObfuscator1;
        }
        if (arg3 == 1) {
            return (arg2 & 32767) < 16384 ? arg0 : -arg0;
        } else if (arg3 == 2) {
            return sin[arg2 & 32767] * arg0 >> 14;
        } else if (arg3 == 3) {
            return ((arg2 & 32767) * arg0 >> 14) - arg0;
        } else {
            return arg3 == 4 ? noise[arg2 / 2607 & 32767] * arg0 : 0;
        }
    }

    @OriginalMember(owner = "client!CLRWXPOI", name = "a", descriptor = "(ZLMBMGIXGO;)V")
    public final void read(boolean arg0, Packet arg1) {
        this.frequencyBase = new SoundEnvelope();
        this.frequencyBase.read(true, arg1);
        this.amplitudeBase = new SoundEnvelope();
        if (!arg0) {
            throw new NullPointerException();
        } else {
            this.amplitudeBase.read(true, arg1);
            int var3 = arg1.g1();
            if (var3 != 0) {
                arg1.pos--;
                this.frequencyModRate = new SoundEnvelope();
                this.frequencyModRate.read(true, arg1);
                this.frequencyModRange = new SoundEnvelope();
                this.frequencyModRange.read(true, arg1);
            }
            var3 = arg1.g1();
            if (var3 != 0) {
                arg1.pos--;
                this.amplitudeModRate = new SoundEnvelope();
                this.amplitudeModRate.read(true, arg1);
                this.amplitudeModRange = new SoundEnvelope();
                this.amplitudeModRange.read(true, arg1);
            }
            var3 = arg1.g1();
            if (var3 != 0) {
                arg1.pos--;
                this.release = new SoundEnvelope();
                this.release.read(true, arg1);
                this.attack = new SoundEnvelope();
                this.attack.read(true, arg1);
            }
            for (int var4 = 0; var4 < 10; var4++) {
                int var5 = arg1.gsmarts();
                if (var5 == 0) {
                    break;
                }
                this.harmonicVolume[var4] = var5;
                this.harmonicSemitone[var4] = arg1.gsmart();
                this.harmonicDelay[var4] = arg1.gsmarts();
            }
            this.reverbDelay = arg1.gsmarts();
            this.reverbVolume = arg1.gsmarts();
            this.length = arg1.g2();
            this.start = arg1.g2();
            this.filter = new SoundFilter();
            this.filterRange = new SoundEnvelope();
            this.filter.read(arg1, false, this.filterRange);
        }
    }
}
