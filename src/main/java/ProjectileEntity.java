import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SWTXAYDT")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "client!SWTXAYDT", name = "m", descriptor = "I")
    public int startCycle;

    @OriginalMember(owner = "client!SWTXAYDT", name = "n", descriptor = "I")
    public int endCycle;

    @OriginalMember(owner = "client!SWTXAYDT", name = "o", descriptor = "I")
    private int _flowObfuscator1 = 9;

    @OriginalMember(owner = "client!SWTXAYDT", name = "p", descriptor = "D")
    private double velocityX;

    @OriginalMember(owner = "client!SWTXAYDT", name = "q", descriptor = "D")
    private double velocityZ;

    @OriginalMember(owner = "client!SWTXAYDT", name = "r", descriptor = "D")
    private double velocity;

    @OriginalMember(owner = "client!SWTXAYDT", name = "s", descriptor = "D")
    private double velocityY;

    @OriginalMember(owner = "client!SWTXAYDT", name = "t", descriptor = "D")
    private double accelerationY;

    @OriginalMember(owner = "client!SWTXAYDT", name = "u", descriptor = "Z")
    public boolean mobile = false;

    @OriginalMember(owner = "client!SWTXAYDT", name = "v", descriptor = "I")
    public int srcX;

    @OriginalMember(owner = "client!SWTXAYDT", name = "w", descriptor = "I")
    public int srcZ;

    @OriginalMember(owner = "client!SWTXAYDT", name = "x", descriptor = "I")
    public int srcY;

    @OriginalMember(owner = "client!SWTXAYDT", name = "y", descriptor = "I")
    public int offsetY;

    @OriginalMember(owner = "client!SWTXAYDT", name = "z", descriptor = "I")
    private int _flowObfuscator2;

    @OriginalMember(owner = "client!SWTXAYDT", name = "A", descriptor = "D")
    public double x;

    @OriginalMember(owner = "client!SWTXAYDT", name = "B", descriptor = "D")
    public double z;

    @OriginalMember(owner = "client!SWTXAYDT", name = "C", descriptor = "D")
    public double y;

    @OriginalMember(owner = "client!SWTXAYDT", name = "D", descriptor = "I")
    public int peakPitch;

    @OriginalMember(owner = "client!SWTXAYDT", name = "E", descriptor = "I")
    public int arc;

    @OriginalMember(owner = "client!SWTXAYDT", name = "F", descriptor = "I")
    public int target;

    @OriginalMember(owner = "client!SWTXAYDT", name = "G", descriptor = "Z")
    private boolean _flowObfuscator3 = true;

    @OriginalMember(owner = "client!SWTXAYDT", name = "H", descriptor = "LMUDLUUBC;")
    private SpotAnimType spotanim;

    @OriginalMember(owner = "client!SWTXAYDT", name = "I", descriptor = "I")
    private int seqFrame;

    @OriginalMember(owner = "client!SWTXAYDT", name = "J", descriptor = "I")
    private int seqCycle;

    @OriginalMember(owner = "client!SWTXAYDT", name = "K", descriptor = "I")
    public int yaw;

    @OriginalMember(owner = "client!SWTXAYDT", name = "L", descriptor = "I")
    public int pitch;

    @OriginalMember(owner = "client!SWTXAYDT", name = "M", descriptor = "I")
    public int level;

    @OriginalMember(owner = "client!SWTXAYDT", name = "a", descriptor = "(IIIIB)V")
    public final void updateVelocity(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        double var6;
        if (!this.mobile) {
            var6 = (double) (arg3 - this.srcX);
            double var8 = (double) (arg1 - this.srcZ);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.x = (double) this.srcX + var6 * (double) this.arc / var10;
            this.z = (double) this.srcZ + var8 * (double) this.arc / var10;
            this.y = (double) this.srcY;
        }
        var6 = (double) (this.endCycle + 1 - arg0);
        this.velocityX = ((double) arg3 - this.x) / var6;
        if (arg4 == -83) {
            this.velocityZ = ((double) arg1 - this.z) / var6;
            this.velocity = Math.sqrt(this.velocityX * this.velocityX + this.velocityZ * this.velocityZ);
            if (!this.mobile) {
                this.velocityY = -this.velocity * Math.tan((double) this.peakPitch * 0.02454369D);
            }
            this.accelerationY = 2.0D * ((double) arg2 - this.y - this.velocityY * var6) / (var6 * var6);
        }
    }

    @OriginalMember(owner = "client!SWTXAYDT", name = "a", descriptor = "(I)LZKARKDQW;")
    public final Model getModel(int arg0) {
        Model var2 = this.spotanim.getModel();
        if (var2 == null) {
            return null;
        } else {
            int var3 = -1;
            if (this.spotanim.seq != null) {
                var3 = this.spotanim.seq.frames[this.seqFrame];
            }
            Model var4 = new Model(9, true, AnimFrame.isNull(var3, false), false, var2);
            if (var3 != -1) {
                var4.createLabelReferences((byte) -71);
                var4.applyTransform(var3, 40542);
                var4.labelFaces = null;
                var4.labelVertices = null;
            }
            if (this.spotanim.resizeh != 128 || this.spotanim.resizev != 128) {
                var4.scale(this.spotanim.resizeh, this.spotanim.resizeh, this._flowObfuscator1, this.spotanim.resizev);
            }
            var4.rotateX(this.pitch, 1);
            var4.calculateNormals(64 + this.spotanim.ambient, 850 + this.spotanim.contrast, -30, -50, -30, true);
            if (arg0 != 4016) {
                throw new NullPointerException();
            } else {
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!SWTXAYDT", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.spotanim = SpotAnimType.instances[arg11];
        if (arg2 != 46883) {
            this._flowObfuscator3 = !this._flowObfuscator3;
        }
        this.level = arg6;
        this.srcX = arg9;
        this.srcZ = arg8;
        this.srcY = arg7;
        this.startCycle = arg3;
        this.endCycle = arg4;
        this.peakPitch = arg0;
        this.arc = arg5;
        this.target = arg10;
        this.offsetY = arg1;
        this.mobile = false;
    }

    @OriginalMember(owner = "client!SWTXAYDT", name = "a", descriptor = "(II)V")
    public final void update(int arg0, int arg1) {
        this.mobile = true;
        this.x += this.velocityX * (double) arg0;
        this.z += this.velocityZ * (double) arg0;
        this.y += this.velocityY * (double) arg0 + 0.5D * this.accelerationY * (double) arg0 * (double) arg0;
        this.velocityY += this.accelerationY * (double) arg0;
        if (arg1 != 0) {
            this._flowObfuscator2 = 16;
        }
        this.yaw = (int) (Math.atan2(this.velocityX, this.velocityZ) * 325.949D) + 1024 & 2047;
        this.pitch = (int) (Math.atan2(this.velocityY, this.velocity) * 325.949D) & 2047;
        if (this.spotanim.seq != null) {
            this.seqCycle += arg0;
            while (this.seqCycle > this.spotanim.seq.getFrameDuration(this.seqFrame, (byte) -39)) {
                this.seqCycle -= this.spotanim.seq.getFrameDuration(this.seqFrame, (byte) -39) + 1;
                this.seqFrame++;
                if (this.seqFrame >= this.spotanim.seq.frameCount) {
                    this.seqFrame = 0;
                }
            }
        }
    }
}
