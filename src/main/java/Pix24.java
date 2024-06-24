import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CXGZMTJK")
public class Pix24 extends Draw2D {

    @OriginalMember(owner = "client!CXGZMTJK", name = "x", descriptor = "Z")
    private boolean _flowObfuscator9 = false;

    @OriginalMember(owner = "client!CXGZMTJK", name = "y", descriptor = "I")
    private int _flowObfuscator10 = 24869;

    @OriginalMember(owner = "client!CXGZMTJK", name = "z", descriptor = "I")
    private int _flowObfuscator11;

    @OriginalMember(owner = "client!CXGZMTJK", name = "A", descriptor = "I")
    private int _flowObfuscator12 = -32357;

    @OriginalMember(owner = "client!CXGZMTJK", name = "B", descriptor = "B")
    private byte _flowObfuscator13 = 3;

    @OriginalMember(owner = "client!CXGZMTJK", name = "C", descriptor = "Z")
    private boolean _flowObfuscator14 = false;

    @OriginalMember(owner = "client!CXGZMTJK", name = "D", descriptor = "I")
    private int _flowObfuscator15 = -388;

    @OriginalMember(owner = "client!CXGZMTJK", name = "E", descriptor = "Z")
    private boolean _flowObfuscator16 = false;

    @OriginalMember(owner = "client!CXGZMTJK", name = "F", descriptor = "Z")
    private boolean _flowObfuscator17 = true;

    @OriginalMember(owner = "client!CXGZMTJK", name = "G", descriptor = "Z")
    private boolean _flowObfuscator18 = true;

    @OriginalMember(owner = "client!CXGZMTJK", name = "H", descriptor = "Z")
    private boolean _flowObfuscator19 = false;

    @OriginalMember(owner = "client!CXGZMTJK", name = "I", descriptor = "[I")
    public int[] pixels;

    @OriginalMember(owner = "client!CXGZMTJK", name = "J", descriptor = "I")
    public int cropRight;

    @OriginalMember(owner = "client!CXGZMTJK", name = "K", descriptor = "I")
    public int cropBottom;

    @OriginalMember(owner = "client!CXGZMTJK", name = "L", descriptor = "I")
    public int cropLeft;

    @OriginalMember(owner = "client!CXGZMTJK", name = "M", descriptor = "I")
    public int cropTop;

    @OriginalMember(owner = "client!CXGZMTJK", name = "N", descriptor = "I")
    public int width;

    @OriginalMember(owner = "client!CXGZMTJK", name = "O", descriptor = "I")
    public int height;

    @OriginalMember(owner = "client!CXGZMTJK", name = "<init>", descriptor = "(II)V")
    public Pix24(int arg0, int arg1) {
        this.pixels = new int[arg0 * arg1];
        this.cropRight = this.width = arg0;
        this.cropBottom = this.height = arg1;
        this.cropLeft = this.cropTop = 0;
    }

    @OriginalMember(owner = "client!CXGZMTJK", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix24(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.cropRight = var3.getWidth(arg1);
            this.cropBottom = var3.getHeight(arg1);
            this.width = this.cropRight;
            this.height = this.cropBottom;
            this.cropLeft = 0;
            this.cropTop = 0;
            this.pixels = new int[this.cropRight * this.cropBottom];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.cropRight, this.cropBottom, this.pixels, 0, this.cropRight);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!CXGZMTJK", name = "<init>", descriptor = "(LXTGLDHGX;Ljava/lang/String;I)V")
    public Pix24(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.read(arg1 + ".dat", (byte[]) null), 891);
        Packet var5 = new Packet(arg0.read("index.dat", (byte[]) null), 891);
        var5.pos = var4.g2();
        this.width = var5.g2();
        this.height = var5.g2();
        int var6 = var5.g1();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.g3();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.pos += 2;
            var4.pos += var5.g2() * var5.g2();
            var5.pos++;
        }
        this.cropLeft = var5.g1();
        this.cropTop = var5.g1();
        this.cropRight = var5.g2();
        this.cropBottom = var5.g2();
        int var10 = var5.g1();
        int var11 = this.cropRight * this.cropBottom;
        this.pixels = new int[var11];
        int var12;
        if (var10 == 0) {
            for (var12 = 0; var12 < var11; var12++) {
                this.pixels[var12] = var7[var4.g1()];
            }
        } else {
            if (var10 == 1) {
                for (var12 = 0; var12 < this.cropRight; var12++) {
                    for (int var13 = 0; var13 < this.cropBottom; var13++) {
                        this.pixels[var12 + var13 * this.cropRight] = var7[var4.g1()];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!CXGZMTJK", name = "b", descriptor = "(I)V")
    public void bind(int arg0) {
        if (arg0 != 0) {
            this._flowObfuscator19 = !this._flowObfuscator19;
        }
        Draw2D.bind(this.cropBottom, this.cropRight, -293, this.pixels);
    }

    @OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "(IIII)V")
    public void translate(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            this._flowObfuscator11 = 314;
        }
        for (int var5 = 0; var5 < this.pixels.length; var5++) {
            int var6 = this.pixels[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 255;
                var7 += arg0;
                if (var7 < 1) {
                    var7 = 1;
                } else if (var7 > 255) {
                    var7 = 255;
                }
                int var8 = var6 >> 8 & 255;
                var8 += arg1;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 & 255;
                var9 += arg2;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                this.pixels[var5] = (var7 << 16) + (var8 << 8) + var9;
            }
        }
    }

    @OriginalMember(owner = "client!CXGZMTJK", name = "c", descriptor = "(I)V")
    public void crop(int arg0) {
        int[] var2 = new int[this.width * this.height];
        if (arg0 != 5059) {
            this._flowObfuscator10 = -247;
        }
        for (int var3 = 0; var3 < this.cropBottom; var3++) {
            for (int var4 = 0; var4 < this.cropRight; var4++) {
                var2[(var3 + this.cropTop) * this.width + var4 + this.cropLeft] = this.pixels[var3 * this.cropRight + var4];
            }
        }
        this.pixels = var2;
        this.cropRight = this.width;
        this.cropBottom = this.height;
        this.cropLeft = 0;
        this.cropTop = 0;
    }

    @OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "(III)V")
    public void blitOpaque(int arg0, int arg1, int arg2) {
        arg0 += this.cropLeft;
        arg1 += this.cropTop;
        int var4 = arg0 + arg1 * Draw2D.width2d;
        int var5 = 0;
        int var6 = this.cropBottom;
        int var7 = this.cropRight;
        int var8 = Draw2D.width2d - var7;
        int var9 = 0;
        if (arg2 != this._flowObfuscator12) {
            this._flowObfuscator19 = !this._flowObfuscator19;
        }
        int var10;
        if (arg1 < Draw2D.top) {
            var10 = Draw2D.top - arg1;
            var6 -= var10;
            arg1 = Draw2D.top;
            var5 += var10 * var7;
            var4 += var10 * Draw2D.width2d;
        }
        if (arg1 + var6 > Draw2D.bottom) {
            var6 -= arg1 + var6 - Draw2D.bottom;
        }
        if (arg0 < Draw2D.left) {
            var10 = Draw2D.left - arg0;
            var7 -= var10;
            arg0 = Draw2D.left;
            var5 += var10;
            var4 += var10;
            var9 += var10;
            var8 += var10;
        }
        if (arg0 + var7 > Draw2D.right) {
            var10 = arg0 + var7 - Draw2D.right;
            var7 -= var10;
            var9 += var10;
            var8 += var10;
        }
        if (var7 > 0 && var6 > 0) {
            this.copyPixels(var4, var7, var6, var9, var5, 28339, var8, this.pixels, Draw2D.data);
        }
    }

    @OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "(IIIIIII[I[I)V")
    private void copyPixels(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8) {
        int var10 = -(arg1 >> 2);
        int var14 = -(arg1 & 3);
        for (int var11 = -arg2; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                arg8[arg0++] = arg7[arg4++];
                arg8[arg0++] = arg7[arg4++];
                arg8[arg0++] = arg7[arg4++];
                arg8[arg0++] = arg7[arg4++];
            }
            for (int var13 = var14; var13 < 0; var13++) {
                arg8[arg0++] = arg7[arg4++];
            }
            arg0 += arg6;
            arg4 += arg3;
        }
        if (arg5 != 28339) {
            this._flowObfuscator12 = 90;
        }
    }

    @OriginalMember(owner = "client!CXGZMTJK", name = "b", descriptor = "(III)V")
    public void draw(int arg0, int arg1, int arg2) {
        arg0 += this.cropLeft;
        arg2 += this.cropTop;
        if (arg1 == 16083) {
            int var4 = arg0 + arg2 * Draw2D.width2d;
            int var5 = 0;
            int var6 = this.cropBottom;
            int var7 = this.cropRight;
            int var8 = Draw2D.width2d - var7;
            int var9 = 0;
            int var10;
            if (arg2 < Draw2D.top) {
                var10 = Draw2D.top - arg2;
                var6 -= var10;
                arg2 = Draw2D.top;
                var5 += var10 * var7;
                var4 += var10 * Draw2D.width2d;
            }
            if (arg2 + var6 > Draw2D.bottom) {
                var6 -= arg2 + var6 - Draw2D.bottom;
            }
            if (arg0 < Draw2D.left) {
                var10 = Draw2D.left - arg0;
                var7 -= var10;
                arg0 = Draw2D.left;
                var5 += var10;
                var4 += var10;
                var9 += var10;
                var8 += var10;
            }
            if (arg0 + var7 > Draw2D.right) {
                var10 = arg0 + var7 - Draw2D.right;
                var7 -= var10;
                var9 += var10;
                var8 += var10;
            }
            if (var7 > 0 && var6 > 0) {
                this.copyPixels(Draw2D.data, this.pixels, 0, var5, var4, var7, var6, var8, var9);
            }
        }
    }

    @OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "([I[IIIIIIII)V")
    private void copyPixels(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var15 = -(arg5 & 3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var14;
            for (int var12 = var10; var12 < 0; var12++) {
                var14 = arg1[arg3++];
                if (var14 != 0) {
                    arg0[arg4++] = var14;
                } else {
                    arg4++;
                }
                var14 = arg1[arg3++];
                if (var14 != 0) {
                    arg0[arg4++] = var14;
                } else {
                    arg4++;
                }
                var14 = arg1[arg3++];
                if (var14 != 0) {
                    arg0[arg4++] = var14;
                } else {
                    arg4++;
                }
                var14 = arg1[arg3++];
                if (var14 != 0) {
                    arg0[arg4++] = var14;
                } else {
                    arg4++;
                }
            }
            for (int var13 = var15; var13 < 0; var13++) {
                var14 = arg1[arg3++];
                if (var14 != 0) {
                    arg0[arg4++] = var14;
                } else {
                    arg4++;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "(IIIZ)V")
    public void drawAlpha(int arg0, int arg1, int arg2, boolean arg3) {
        arg0 += this.cropLeft;
        int var5;
        if (arg3) {
            for (var5 = 1; var5 > 0; var5++) {
            }
        }
        arg1 += this.cropTop;
        var5 = arg0 + arg1 * Draw2D.width2d;
        int var6 = 0;
        int var7 = this.cropBottom;
        int var8 = this.cropRight;
        int var9 = Draw2D.width2d - var8;
        int var10 = 0;
        int var11;
        if (arg1 < Draw2D.top) {
            var11 = Draw2D.top - arg1;
            var7 -= var11;
            arg1 = Draw2D.top;
            var6 += var11 * var8;
            var5 += var11 * Draw2D.width2d;
        }
        if (arg1 + var7 > Draw2D.bottom) {
            var7 -= arg1 + var7 - Draw2D.bottom;
        }
        if (arg0 < Draw2D.left) {
            var11 = Draw2D.left - arg0;
            var8 -= var11;
            arg0 = Draw2D.left;
            var6 += var11;
            var5 += var11;
            var10 += var11;
            var9 += var11;
        }
        if (arg0 + var8 > Draw2D.right) {
            var11 = arg0 + var8 - Draw2D.right;
            var8 -= var11;
            var10 += var11;
            var9 += var11;
        }
        if (var8 > 0 && var7 > 0) {
            this.copyPixelsAlpha(var6, var8, Draw2D.data, 0, this.pixels, var10, var7, var9, arg2, var5, 8);
        }
    }

    @OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "(II[II[IIIIIII)V")
    private void copyPixelsAlpha(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg8;
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = -arg1; var14 < 0; var14++) {
                int var16 = arg4[arg0++];
                if (var16 != 0) {
                    int var15 = arg2[arg9];
                    arg2[arg9++] = ((var16 & 16711935) * arg8 + (var15 & 16711935) * var12 & -16711936) + ((var16 & 65280) * arg8 + (var15 & 65280) * var12 & 16711680) >> 8;
                } else {
                    arg9++;
                }
            }
            arg9 += arg7;
            arg0 += arg5;
        }
        if (arg10 < 8 || arg10 > 8) {
            this._flowObfuscator9 = !this._flowObfuscator9;
        }
    }

    @OriginalMember(owner = "client!CXGZMTJK", name = "b", descriptor = "(II[II[IIIIIII)V")
    public void drawRotatedMasked(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        while (arg5 >= 0) {
            this._flowObfuscator15 = 362;
        }
        try {
            int var12 = -arg9 / 2;
            int var13 = -arg0 / 2;
            int var14 = (int) (Math.sin((double) arg1 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg1 / 326.11D) * 65536.0D);
            int var24 = var14 * arg3 >> 8;
            int var25 = var15 * arg3 >> 8;
            int var16 = (arg10 << 16) + var13 * var24 + var12 * var25;
            int var17 = (arg6 << 16) + (var13 * var25 - var12 * var24);
            int var18 = arg8 + arg7 * Draw2D.width2d;
            for (int var26 = 0; var26 < arg0; var26++) {
                int var19 = arg4[var26];
                int var20 = var18 + var19;
                int var21 = var16 + var25 * var19;
                int var22 = var17 - var24 * var19;
                for (int var27 = -arg2[var26]; var27 < 0; var27++) {
                    Draw2D.data[var20++] = this.pixels[(var21 >> 16) + (var22 >> 16) * this.cropRight];
                    var21 += var25;
                    var22 -= var24;
                }
                var16 += var24;
                var17 += var25;
                var18 += Draw2D.width2d;
            }
        } catch (Exception var23) {
        }
    }

    @OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "(IIIIIIIDI)V")
    public void drawRotated(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, double arg7, int arg8) {
        if (arg4 == 41960) {
            try {
                int var11 = -arg2 / 2;
                int var12 = -arg6 / 2;
                int var13 = (int) (Math.sin(arg7) * 65536.0D);
                int var14 = (int) (Math.cos(arg7) * 65536.0D);
                int var23 = var13 * arg5 >> 8;
                int var24 = var14 * arg5 >> 8;
                int var15 = (arg3 << 16) + var12 * var23 + var11 * var24;
                int var16 = (arg1 << 16) + (var12 * var24 - var11 * var23);
                int var17 = arg8 + arg0 * Draw2D.width2d;
                for (int var25 = 0; var25 < arg6; var25++) {
                    int var18 = var17;
                    int var19 = var15;
                    int var20 = var16;
                    for (int var26 = -arg2; var26 < 0; var26++) {
                        int var21 = this.pixels[(var19 >> 16) + (var20 >> 16) * this.cropRight];
                        if (var21 != 0) {
                            Draw2D.data[var18++] = var21;
                        } else {
                            var18++;
                        }
                        var19 += var24;
                        var20 -= var23;
                    }
                    var15 += var23;
                    var16 += var24;
                    var17 += Draw2D.width2d;
                }
            } catch (Exception var22) {
            }
        }
    }

    @OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "(LDSMJIEPN;ZII)V")
    public void drawMasked(Pix8 arg0, boolean arg1, int arg2, int arg3) {
        arg3 += this.cropLeft;
        arg2 += this.cropTop;
        int var5 = arg3 + arg2 * Draw2D.width2d;
        int var6 = 0;
        if (arg1) {
            this._flowObfuscator10 = -364;
        }
        int var7 = this.cropBottom;
        int var8 = this.cropRight;
        int var9 = Draw2D.width2d - var8;
        int var10 = 0;
        int var11;
        if (arg2 < Draw2D.top) {
            var11 = Draw2D.top - arg2;
            var7 -= var11;
            arg2 = Draw2D.top;
            var6 += var11 * var8;
            var5 += var11 * Draw2D.width2d;
        }
        if (arg2 + var7 > Draw2D.bottom) {
            var7 -= arg2 + var7 - Draw2D.bottom;
        }
        if (arg3 < Draw2D.left) {
            var11 = Draw2D.left - arg3;
            var8 -= var11;
            arg3 = Draw2D.left;
            var6 += var11;
            var5 += var11;
            var10 += var11;
            var9 += var11;
        }
        if (arg3 + var8 > Draw2D.right) {
            var11 = arg3 + var8 - Draw2D.right;
            var8 -= var11;
            var10 += var11;
            var9 += var11;
        }
        if (var8 > 0 && var7 > 0) {
            this.copyPixelsMasked(this.pixels, var8, arg0.pixels, var7, Draw2D.data, 0, this._flowObfuscator17, var9, var5, var10, var6);
        }
    }

    @OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "([II[BI[IIZIIII)V")
    private void copyPixelsMasked(int[] arg0, int arg1, byte[] arg2, int arg3, int[] arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg1 >> 2);
        int var13;
        if (!arg6) {
            for (var13 = 1; var13 > 0; var13++) {
            }
        }
        int var16 = -(arg1 & 3);
        for (var13 = -arg3; var13 < 0; var13++) {
            int var17;
            for (int var14 = var12; var14 < 0; var14++) {
                var17 = arg0[arg10++];
                if (var17 != 0 && arg2[arg8] == 0) {
                    arg4[arg8++] = var17;
                } else {
                    arg8++;
                }
                var17 = arg0[arg10++];
                if (var17 != 0 && arg2[arg8] == 0) {
                    arg4[arg8++] = var17;
                } else {
                    arg8++;
                }
                var17 = arg0[arg10++];
                if (var17 != 0 && arg2[arg8] == 0) {
                    arg4[arg8++] = var17;
                } else {
                    arg8++;
                }
                var17 = arg0[arg10++];
                if (var17 != 0 && arg2[arg8] == 0) {
                    arg4[arg8++] = var17;
                } else {
                    arg8++;
                }
            }
            for (int var15 = var16; var15 < 0; var15++) {
                var17 = arg0[arg10++];
                if (var17 != 0 && arg2[arg8] == 0) {
                    arg4[arg8++] = var17;
                } else {
                    arg8++;
                }
            }
            arg8 += arg7;
            arg10 += arg9;
        }
    }
}
