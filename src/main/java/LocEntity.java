import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WBWOBAFW")
public class LocEntity extends Entity {

    @OriginalMember(owner = "client!WBWOBAFW", name = "m", descriptor = "B")
    private byte _flowObfuscator6 = 7;

    @OriginalMember(owner = "client!WBWOBAFW", name = "n", descriptor = "I")
    private int animFrame;

    @OriginalMember(owner = "client!WBWOBAFW", name = "o", descriptor = "[I")
    public int[] multiloc;

    @OriginalMember(owner = "client!WBWOBAFW", name = "p", descriptor = "I")
    public int multivarbit;

    @OriginalMember(owner = "client!WBWOBAFW", name = "q", descriptor = "I")
    public int mutlivarp;

    @OriginalMember(owner = "client!WBWOBAFW", name = "r", descriptor = "I")
    private int heightmapSW;

    @OriginalMember(owner = "client!WBWOBAFW", name = "s", descriptor = "I")
    private int heightmapSE;

    @OriginalMember(owner = "client!WBWOBAFW", name = "t", descriptor = "I")
    private int heightmapNE;

    @OriginalMember(owner = "client!WBWOBAFW", name = "u", descriptor = "I")
    private int heightmapNW;

    @OriginalMember(owner = "client!WBWOBAFW", name = "v", descriptor = "LLKGEGIEW;")
    private SeqType anim;

    @OriginalMember(owner = "client!WBWOBAFW", name = "w", descriptor = "I")
    private int animCycle;

    @OriginalMember(owner = "client!WBWOBAFW", name = "x", descriptor = "Lclient;")
    public static client varProvider;

    @OriginalMember(owner = "client!WBWOBAFW", name = "y", descriptor = "I")
    private int type;

    @OriginalMember(owner = "client!WBWOBAFW", name = "z", descriptor = "I")
    private int shape;

    @OriginalMember(owner = "client!WBWOBAFW", name = "A", descriptor = "I")
    private int rotation;

    @OriginalMember(owner = "client!WBWOBAFW", name = "B", descriptor = "I")
    private int _flowObfuscator7;

    @OriginalMember(owner = "client!WBWOBAFW", name = "a", descriptor = "(I)LZKARKDQW;")
    public final Model getModel(int arg0) {
        int var2 = -1;
        if (arg0 != 4016) {
            this._flowObfuscator7 = -272;
        }
        if (this.anim != null) {
            int var3 = client.loopCycle - this.animCycle;
            if (var3 > 100 && this.anim.replayoff > 0) {
                var3 = 100;
            }
            label44: {
                do {
                    do {
                        if (var3 <= this.anim.getFrameDuration(this.animFrame, (byte) -39)) {
                            break label44;
                        }
                        var3 -= this.anim.getFrameDuration(this.animFrame, (byte) -39);
                        this.animFrame++;
                    } while (this.animFrame < this.anim.frameCount);
                    this.animFrame -= this.anim.replayoff;
                } while (this.animFrame >= 0 && this.animFrame < this.anim.frameCount);
                this.anim = null;
            }
            this.animCycle = client.loopCycle - var3;
            if (this.anim != null) {
                var2 = this.anim.frames[this.animFrame];
            }
        }
        LocType var5;
        if (this.multiloc != null) {
            var5 = this.getMultiLoc(true);
        } else {
            var5 = LocType.get(this.type);
        }
        return var5 == null ? null : var5.getModel(this.shape, this.rotation, this.heightmapSW, this.heightmapSE, this.heightmapNE, this.heightmapNW, var2);
    }

    @OriginalMember(owner = "client!WBWOBAFW", name = "a", descriptor = "(Z)LYZDBYLRM;")
    public final LocType getMultiLoc(boolean arg0) {
        int var2 = -1;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.multivarbit != -1) {
            VarbitType var8 = VarbitType.instances[this.multivarbit];
            int var4 = var8.basevar;
            int var5 = var8.startbit;
            int var6 = var8.endbit;
            int var7 = client.BITMASK[var6 - var5];
            var2 = varProvider.varps[var4] >> var5 & var7;
        } else if (this.mutlivarp != -1) {
            var2 = varProvider.varps[this.mutlivarp];
        }
        return var2 >= 0 && var2 < this.multiloc.length && this.multiloc[var2] != -1 ? LocType.get(this.multiloc[var2]) : null;
    }

    @OriginalMember(owner = "client!WBWOBAFW", name = "<init>", descriptor = "(IIIIBIIIIZ)V")
    public LocEntity(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (arg4 != this._flowObfuscator6) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        this.type = arg0;
        this.shape = arg2;
        this.rotation = arg1;
        this.heightmapSW = arg6;
        this.heightmapSE = arg3;
        this.heightmapNE = arg5;
        this.heightmapNW = arg7;
        if (arg8 != -1) {
            this.anim = SeqType.instances[arg8];
            this.animFrame = 0;
            this.animCycle = client.loopCycle;
            if (arg9 && this.anim.replayoff != -1) {
                this.animFrame = (int) (Math.random() * (double) this.anim.frameCount);
                this.animCycle -= (int) (Math.random() * (double) this.anim.getFrameDuration(this.animFrame, (byte) -39));
            }
        }
        LocType var12 = LocType.get(this.type);
        this.multivarbit = var12.multivarbit;
        this.mutlivarp = var12.multivarp;
        this.multiloc = var12.multiloc;
    }
}
