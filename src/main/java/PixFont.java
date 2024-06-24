import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YXVQXWYR")
public class PixFont extends Draw2D {

    @OriginalMember(owner = "client!YXVQXWYR", name = "x", descriptor = "Z")
    private boolean _flowObfuscator9 = false;

    @OriginalMember(owner = "client!YXVQXWYR", name = "y", descriptor = "I")
    private int _flowObfuscator10 = 445;

    @OriginalMember(owner = "client!YXVQXWYR", name = "z", descriptor = "I")
    private int _flowObfuscator11 = -471;

    @OriginalMember(owner = "client!YXVQXWYR", name = "A", descriptor = "I")
    private int _flowObfuscator12 = -471;

    @OriginalMember(owner = "client!YXVQXWYR", name = "B", descriptor = "Z")
    private boolean _flowObfuscator13 = false;

    @OriginalMember(owner = "client!YXVQXWYR", name = "C", descriptor = "I")
    private int _flowObfuscator14 = 3;

    @OriginalMember(owner = "client!YXVQXWYR", name = "D", descriptor = "Z")
    private boolean _flowObfuscator15 = false;

    @OriginalMember(owner = "client!YXVQXWYR", name = "E", descriptor = "[[B")
    public byte[][] charMask = new byte[256][];

    @OriginalMember(owner = "client!YXVQXWYR", name = "F", descriptor = "[I")
    public int[] charMaskWidth = new int[256];

    @OriginalMember(owner = "client!YXVQXWYR", name = "G", descriptor = "[I")
    public int[] charMaskHeight = new int[256];

    @OriginalMember(owner = "client!YXVQXWYR", name = "H", descriptor = "[I")
    public int[] charOffsetX = new int[256];

    @OriginalMember(owner = "client!YXVQXWYR", name = "I", descriptor = "[I")
    public int[] charOffsetY = new int[256];

    @OriginalMember(owner = "client!YXVQXWYR", name = "J", descriptor = "[I")
    public int[] charAdvance = new int[256];

    @OriginalMember(owner = "client!YXVQXWYR", name = "K", descriptor = "I")
    public int height;

    @OriginalMember(owner = "client!YXVQXWYR", name = "L", descriptor = "Ljava/util/Random;")
    public Random random = new Random();

    @OriginalMember(owner = "client!YXVQXWYR", name = "M", descriptor = "Z")
    public boolean strikethrough = false;

    @OriginalMember(owner = "client!YXVQXWYR", name = "<init>", descriptor = "(ZLjava/lang/String;ILXTGLDHGX;)V")
    public PixFont(boolean arg0, String arg1, int arg2, Jagfile arg3) {
        Packet var5 = new Packet(arg3.read(arg1 + ".dat", (byte[]) null), 891);
        Packet var6 = new Packet(arg3.read("index.dat", (byte[]) null), 891);
        boolean var7 = true;
        if (arg2 != 0) {
            this._flowObfuscator15 = !this._flowObfuscator15;
        }
        var6.pos = var5.g2() + 4;
        int var8 = var6.g1();
        if (var8 > 0) {
            var6.pos += 3 * (var8 - 1);
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.charOffsetX[var9] = var6.g1();
            this.charOffsetY[var9] = var6.g1();
            int var10 = this.charMaskWidth[var9] = var6.g2();
            int var11 = this.charMaskHeight[var9] = var6.g2();
            int var12 = var6.g1();
            int var13 = var10 * var11;
            this.charMask[var9] = new byte[var13];
            int var14;
            int var15;
            if (var12 == 0) {
                for (var14 = 0; var14 < var13; var14++) {
                    this.charMask[var9][var14] = var5.g1b();
                }
            } else if (var12 == 1) {
                for (var14 = 0; var14 < var10; var14++) {
                    for (var15 = 0; var15 < var11; var15++) {
                        this.charMask[var9][var14 + var15 * var10] = var5.g1b();
                    }
                }
            }
            if (var11 > this.height && var9 < 128) {
                this.height = var11;
            }
            this.charOffsetX[var9] = 1;
            this.charAdvance[var9] = var10 + 2;
            var14 = 0;
            for (var15 = var11 / 7; var15 < var11; var15++) {
                var14 += this.charMask[var9][var15 * var10];
            }
            int var10002;
            if (var14 <= var11 / 7) {
                var10002 = this.charAdvance[var9]--;
                this.charOffsetX[var9] = 0;
            }
            var14 = 0;
            for (int var16 = var11 / 7; var16 < var11; var16++) {
                var14 += this.charMask[var9][var10 - 1 + var16 * var10];
            }
            if (var14 <= var11 / 7) {
                var10002 = this.charAdvance[var9]--;
            }
        }
        if (arg0) {
            this.charAdvance[32] = this.charAdvance[73];
        } else {
            this.charAdvance[32] = this.charAdvance[105];
            if (Linkable._flowObfuscator2) {
            }
        }
    }

    @OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(Ljava/lang/String;IIBI)V")
    public void drawStringRight(String arg0, int arg1, int arg2, byte arg3, int arg4) {
        this.drawString(arg2, arg0, arg4, 822, arg1 - this.stringWidth(arg0, true));
        if (arg3 != -80) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void drawStringCenter(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 23693) {
            this._flowObfuscator14 = 467;
        }
        this.drawString(arg0, arg1, arg3, 822, arg4 - this.stringWidth(arg1, true) / 2);
    }

    @OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
    public void drawStringCenterTag(int arg0, int arg1, int arg2, String arg3, int arg4, boolean arg5) {
        int var7 = 74 / arg2;
        this.drawStringTag(false, arg5, arg1 - this.stringWidthTag(this._flowObfuscator10, arg3) / 2, arg0, arg3, arg4);
    }

    @OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int stringWidthTag(int arg0, String arg1) {
        int var5 = 75 / arg0;
        if (arg1 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg1.length(); var4++) {
                if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                    var4 += 4;
                } else {
                    var3 += this.charAdvance[arg1.charAt(var4)];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int stringWidth(String arg0, boolean arg1) {
        int var3;
        if (!arg1) {
            for (var3 = 1; var3 > 0; var3++) {
            }
        }
        if (arg0 == null) {
            return 0;
        } else {
            var3 = 0;
            for (int var4 = 0; var4 < arg0.length(); var4++) {
                var3 += this.charAdvance[arg0.charAt(var4)];
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!YXVQXWYR", name = "b", descriptor = "(ILjava/lang/String;III)V")
    public void drawString(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg1 != null) {
            int var8 = arg2 - this.height;
            for (int var6 = 0; var6 < arg1.length(); var6++) {
                char var7 = arg1.charAt(var6);
                if (var7 != ' ') {
                    this.drawChar(this.charMask[var7], arg4 + this.charOffsetX[var7], var8 + this.charOffsetY[var7], this.charMaskWidth[var7], this.charMaskHeight[var7], arg0);
                }
                arg4 += this.charAdvance[var7];
            }
            int var9 = 50 / arg3;
        }
    }

    @OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(IZLjava/lang/String;III)V")
    public void drawStringWave(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5) {
        if (!arg1) {
            this._flowObfuscator15 = !this._flowObfuscator15;
        }
        if (arg2 != null) {
            arg3 -= this.stringWidth(arg2, true) / 2;
            int var9 = arg5 - this.height;
            for (int var7 = 0; var7 < arg2.length(); var7++) {
                char var8 = arg2.charAt(var7);
                if (var8 != ' ') {
                    this.drawChar(this.charMask[var8], arg3 + this.charOffsetX[var8], var9 + this.charOffsetY[var8] + (int) (Math.sin((double) var7 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.charMaskWidth[var8], this.charMaskHeight[var8], arg0);
                }
                arg3 += this.charAdvance[var8];
            }
        }
    }

    @OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(ILjava/lang/String;IIBI)V")
    public void drawStringWave2(int arg0, String arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg1 != null) {
            arg0 -= this.stringWidth(arg1, true) / 2;
            int var9 = arg3 - this.height;
            if (arg4 == 5) {
                for (int var7 = 0; var7 < arg1.length(); var7++) {
                    char var8 = arg1.charAt(var7);
                    if (var8 != ' ') {
                        this.drawChar(this.charMask[var8], arg0 + this.charOffsetX[var8] + (int) (Math.sin((double) var7 / 5.0D + (double) arg2 / 5.0D) * 5.0D), var9 + this.charOffsetY[var8] + (int) (Math.sin((double) var7 / 3.0D + (double) arg2 / 5.0D) * 5.0D), this.charMaskWidth[var8], this.charMaskHeight[var8], arg5);
                    }
                    arg0 += this.charAdvance[var8];
                }
            }
        }
    }

    @OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(ILjava/lang/String;ZIIII)V")
    public void drawStringShake(int arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg2) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (arg1 != null) {
            double var13 = 7.0D - (double) arg0 / 8.0D;
            if (var13 < 0.0D) {
                var13 = 0.0D;
            }
            arg5 -= this.stringWidth(arg1, true) / 2;
            int var12 = arg4 - this.height;
            for (int var10 = 0; var10 < arg1.length(); var10++) {
                char var11 = arg1.charAt(var10);
                if (var11 != ' ') {
                    this.drawChar(this.charMask[var11], arg5 + this.charOffsetX[var11], var12 + this.charOffsetY[var11] + (int) (Math.sin((double) var10 / 1.5D + (double) arg3) * var13), this.charMaskWidth[var11], this.charMaskHeight[var11], arg6);
                }
                arg5 += this.charAdvance[var11];
            }
        }
    }

    @OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(ZZIILjava/lang/String;I)V")
    public void drawStringTag(boolean arg0, boolean arg1, int arg2, int arg3, String arg4, int arg5) {
        this.strikethrough = false;
        int var7 = arg2;
        if (arg4 != null) {
            int var10 = arg5 - this.height;
            for (int var8 = 0; var8 < arg4.length(); var8++) {
                if (arg4.charAt(var8) == '@' && var8 + 4 < arg4.length() && arg4.charAt(var8 + 4) == '@') {
                    int var11 = this.evaluateTag(arg4.substring(var8 + 1, var8 + 4), this._flowObfuscator11);
                    if (var11 != -1) {
                        arg3 = var11;
                    }
                    var8 += 4;
                } else {
                    char var9 = arg4.charAt(var8);
                    if (var9 != ' ') {
                        if (arg1) {
                            this.drawChar(this.charMask[var9], arg2 + this.charOffsetX[var9] + 1, var10 + this.charOffsetY[var9] + 1, this.charMaskWidth[var9], this.charMaskHeight[var9], 0);
                        }
                        this.drawChar(this.charMask[var9], arg2 + this.charOffsetX[var9], var10 + this.charOffsetY[var9], this.charMaskWidth[var9], this.charMaskHeight[var9], arg3);
                    }
                    arg2 += this.charAdvance[var9];
                }
            }
            if (!arg0) {
                if (this.strikethrough) {
                    Draw2D.drawHorizontalLine(var10 + (int) ((double) this.height * 0.7D), 8388608, arg2 - var7, var7, (byte) 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(ZIILjava/lang/String;III)V")
    public void drawStringTooltip(boolean arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg3 != null) {
            this.random.setSeed((long) arg4);
            int var8 = 192 + (this.random.nextInt() & 31);
            int var12 = arg6 - this.height;
            int var11 = 10 / arg5;
            for (int var9 = 0; var9 < arg3.length(); var9++) {
                if (arg3.charAt(var9) == '@' && var9 + 4 < arg3.length() && arg3.charAt(var9 + 4) == '@') {
                    int var13 = this.evaluateTag(arg3.substring(var9 + 1, var9 + 4), this._flowObfuscator11);
                    if (var13 != -1) {
                        arg2 = var13;
                    }
                    var9 += 4;
                } else {
                    char var10 = arg3.charAt(var9);
                    if (var10 != ' ') {
                        if (arg0) {
                            this.drawCharAlpha(192, arg1 + this.charOffsetX[var10] + 1, this.charMask[var10], this.charMaskWidth[var10], var12 + this.charOffsetY[var10] + 1, this.charMaskHeight[var10], false, 0);
                        }
                        this.drawCharAlpha(var8, arg1 + this.charOffsetX[var10], this.charMask[var10], this.charMaskWidth[var10], var12 + this.charOffsetY[var10], this.charMaskHeight[var10], false, arg2);
                    }
                    arg1 += this.charAdvance[var10];
                    if ((this.random.nextInt() & 3) == 0) {
                        arg1++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int evaluateTag(String arg0, int arg1) {
        if (arg1 >= 0) {
            this._flowObfuscator9 = !this._flowObfuscator9;
        }
        if (arg0.equals("red")) {
            return 16711680;
        } else if (arg0.equals("gre")) {
            return 65280;
        } else if (arg0.equals("blu")) {
            return 255;
        } else if (arg0.equals("yel")) {
            return 16776960;
        } else if (arg0.equals("cya")) {
            return 65535;
        } else if (arg0.equals("mag")) {
            return 16711935;
        } else if (arg0.equals("whi")) {
            return 16777215;
        } else if (arg0.equals("bla")) {
            return 0;
        } else if (arg0.equals("lre")) {
            return 16748608;
        } else if (arg0.equals("dre")) {
            return 8388608;
        } else if (arg0.equals("dbl")) {
            return 128;
        } else if (arg0.equals("or1")) {
            return 16756736;
        } else if (arg0.equals("or2")) {
            return 16740352;
        } else if (arg0.equals("or3")) {
            return 16723968;
        } else if (arg0.equals("gr1")) {
            return 12648192;
        } else if (arg0.equals("gr2")) {
            return 8453888;
        } else if (arg0.equals("gr3")) {
            return 4259584;
        } else {
            if (arg0.equals("str")) {
                this.strikethrough = true;
            }
            if (arg0.equals("end")) {
                this.strikethrough = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "([BIIIII)V")
    private void drawChar(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1 + arg2 * Draw2D.width2d;
        int var8 = Draw2D.width2d - arg3;
        int var9 = 0;
        int var10 = 0;
        int var11;
        if (arg2 < Draw2D.top) {
            var11 = Draw2D.top - arg2;
            arg4 -= var11;
            arg2 = Draw2D.top;
            var10 += var11 * arg3;
            var7 += var11 * Draw2D.width2d;
        }
        if (arg2 + arg4 >= Draw2D.bottom) {
            arg4 -= arg2 + arg4 - Draw2D.bottom + 1;
        }
        if (arg1 < Draw2D.left) {
            var11 = Draw2D.left - arg1;
            arg3 -= var11;
            arg1 = Draw2D.left;
            var10 += var11;
            var7 += var11;
            var9 += var11;
            var8 += var11;
        }
        if (arg1 + arg3 >= Draw2D.right) {
            var11 = arg1 + arg3 - Draw2D.right + 1;
            arg3 -= var11;
            var9 += var11;
            var8 += var11;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.copyPixels(Draw2D.data, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "([I[BIIIIIII)V")
    private void copyPixels(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var14 = -(arg5 & 3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg1[arg3++] != 0) {
                    arg0[arg4++] = arg2;
                } else {
                    arg4++;
                }
                if (arg1[arg3++] != 0) {
                    arg0[arg4++] = arg2;
                } else {
                    arg4++;
                }
                if (arg1[arg3++] != 0) {
                    arg0[arg4++] = arg2;
                } else {
                    arg4++;
                }
                if (arg1[arg3++] != 0) {
                    arg0[arg4++] = arg2;
                } else {
                    arg4++;
                }
            }
            for (int var13 = var14; var13 < 0; var13++) {
                if (arg1[arg3++] != 0) {
                    arg0[arg4++] = arg2;
                } else {
                    arg4++;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "(II[BIIIZI)V")
    private void drawCharAlpha(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        int var9 = arg1 + arg4 * Draw2D.width2d;
        int var10 = Draw2D.width2d - arg3;
        int var11 = 0;
        int var12 = 0;
        int var13;
        if (arg4 < Draw2D.top) {
            var13 = Draw2D.top - arg4;
            arg5 -= var13;
            arg4 = Draw2D.top;
            var12 += var13 * arg3;
            var9 += var13 * Draw2D.width2d;
        }
        if (arg4 + arg5 >= Draw2D.bottom) {
            arg5 -= arg4 + arg5 - Draw2D.bottom + 1;
        }
        if (arg1 < Draw2D.left) {
            var13 = Draw2D.left - arg1;
            arg3 -= var13;
            arg1 = Draw2D.left;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (arg1 + arg3 >= Draw2D.right) {
            var13 = arg1 + arg3 - Draw2D.right + 1;
            arg3 -= var13;
            var11 += var13;
            var10 += var13;
        }
        if (arg3 > 0 && arg5 > 0) {
            this.copyPixelsAlpha(arg2, arg5, var9, Draw2D.data, 520, var12, arg3, var11, var10, arg7, arg0);
            if (arg6) {
                for (var13 = 1; var13 > 0; var13++) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!YXVQXWYR", name = "a", descriptor = "([BII[IIIIIIII)V")
    private void copyPixelsAlpha(byte[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var15 = 98 / arg4;
        int var16 = ((arg9 & 16711935) * arg10 & -16711936) + ((arg9 & 65280) * arg10 & 16711680) >> 8;
        int var17 = 256 - arg10;
        for (int var12 = -arg1; var12 < 0; var12++) {
            for (int var13 = -arg6; var13 < 0; var13++) {
                if (arg0[arg5++] != 0) {
                    int var14 = arg3[arg2];
                    arg3[arg2++] = (((var14 & 16711935) * var17 & -16711936) + ((var14 & 65280) * var17 & 16711680) >> 8) + var16;
                } else {
                    arg2++;
                }
            }
            arg2 += arg8;
            arg5 += arg7;
        }
    }
}
