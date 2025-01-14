import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QPNUVGRI")
public class BZip2State {

    @OriginalMember(owner = "client!QPNUVGRI", name = "a", descriptor = "I")
    public final int MTFA_SIZE = 4096;

    @OriginalMember(owner = "client!QPNUVGRI", name = "b", descriptor = "I")
    public final int MTFL_SIZE = 16;

    @OriginalMember(owner = "client!QPNUVGRI", name = "c", descriptor = "I")
    public final int BZ_MAX_ALPHA_SIZE = 258;

    @OriginalMember(owner = "client!QPNUVGRI", name = "d", descriptor = "I")
    public final int BZ_MAX_CODE_LEN = 23;

    @OriginalMember(owner = "client!QPNUVGRI", name = "e", descriptor = "I")
    public final int field1294 = 1;

    @OriginalMember(owner = "client!QPNUVGRI", name = "f", descriptor = "I")
    public final int BZ_N_GROUPS = 6;

    @OriginalMember(owner = "client!QPNUVGRI", name = "g", descriptor = "I")
    public final int BZ_G_SIZE = 50;

    @OriginalMember(owner = "client!QPNUVGRI", name = "h", descriptor = "I")
    public final int field1297 = 4;

    @OriginalMember(owner = "client!QPNUVGRI", name = "i", descriptor = "I")
    public final int BZ_MAX_SELECTORS = 18002;

    @OriginalMember(owner = "client!QPNUVGRI", name = "j", descriptor = "[B")
    public byte[] stream;

    @OriginalMember(owner = "client!QPNUVGRI", name = "k", descriptor = "I")
    public int next_in;

    @OriginalMember(owner = "client!QPNUVGRI", name = "l", descriptor = "I")
    public int avail_in;

    @OriginalMember(owner = "client!QPNUVGRI", name = "m", descriptor = "I")
    public int total_in_lo32;

    @OriginalMember(owner = "client!QPNUVGRI", name = "n", descriptor = "I")
    public int total_in_hi32;

    @OriginalMember(owner = "client!QPNUVGRI", name = "o", descriptor = "[B")
    public byte[] decompressed;

    @OriginalMember(owner = "client!QPNUVGRI", name = "p", descriptor = "I")
    public int next_out;

    @OriginalMember(owner = "client!QPNUVGRI", name = "q", descriptor = "I")
    public int avail_out;

    @OriginalMember(owner = "client!QPNUVGRI", name = "r", descriptor = "I")
    public int total_out_lo32;

    @OriginalMember(owner = "client!QPNUVGRI", name = "s", descriptor = "I")
    public int total_out_hi32;

    @OriginalMember(owner = "client!QPNUVGRI", name = "t", descriptor = "B")
    public byte state_out_ch;

    @OriginalMember(owner = "client!QPNUVGRI", name = "u", descriptor = "I")
    public int state_out_len;

    @OriginalMember(owner = "client!QPNUVGRI", name = "v", descriptor = "Z")
    public boolean blockRandomized;

    @OriginalMember(owner = "client!QPNUVGRI", name = "w", descriptor = "I")
    public int bsBuff;

    @OriginalMember(owner = "client!QPNUVGRI", name = "x", descriptor = "I")
    public int bsLive;

    @OriginalMember(owner = "client!QPNUVGRI", name = "y", descriptor = "I")
    public int blockSize100k;

    @OriginalMember(owner = "client!QPNUVGRI", name = "z", descriptor = "I")
    public int currBlockNo;

    @OriginalMember(owner = "client!QPNUVGRI", name = "A", descriptor = "I")
    public int origPtr;

    @OriginalMember(owner = "client!QPNUVGRI", name = "B", descriptor = "I")
    public int tPos;

    @OriginalMember(owner = "client!QPNUVGRI", name = "C", descriptor = "I")
    public int k0;

    @OriginalMember(owner = "client!QPNUVGRI", name = "D", descriptor = "[I")
    public int[] unzftab = new int[256];

    @OriginalMember(owner = "client!QPNUVGRI", name = "E", descriptor = "I")
    public int c_nblock_used;

    @OriginalMember(owner = "client!QPNUVGRI", name = "F", descriptor = "[I")
    public int[] cftab = new int[257];

    @OriginalMember(owner = "client!QPNUVGRI", name = "G", descriptor = "[I")
    public int[] cftabCopy = new int[257];

    @OriginalMember(owner = "client!QPNUVGRI", name = "H", descriptor = "[I")
    public static int[] tt;

    @OriginalMember(owner = "client!QPNUVGRI", name = "I", descriptor = "I")
    public int nInUse;

    @OriginalMember(owner = "client!QPNUVGRI", name = "J", descriptor = "[Z")
    public boolean[] inUse = new boolean[256];

    @OriginalMember(owner = "client!QPNUVGRI", name = "K", descriptor = "[Z")
    public boolean[] inUse16 = new boolean[16];

    @OriginalMember(owner = "client!QPNUVGRI", name = "L", descriptor = "[B")
    public byte[] seqToUnseq = new byte[256];

    @OriginalMember(owner = "client!QPNUVGRI", name = "M", descriptor = "[B")
    public byte[] mtfa = new byte[4096];

    @OriginalMember(owner = "client!QPNUVGRI", name = "N", descriptor = "[I")
    public int[] mtfbase = new int[16];

    @OriginalMember(owner = "client!QPNUVGRI", name = "O", descriptor = "[B")
    public byte[] selector = new byte[18002];

    @OriginalMember(owner = "client!QPNUVGRI", name = "P", descriptor = "[B")
    public byte[] selectorMtf = new byte[18002];

    @OriginalMember(owner = "client!QPNUVGRI", name = "Q", descriptor = "[[B")
    public byte[][] len = new byte[6][258];

    @OriginalMember(owner = "client!QPNUVGRI", name = "R", descriptor = "[[I")
    public int[][] limit = new int[6][258];

    @OriginalMember(owner = "client!QPNUVGRI", name = "S", descriptor = "[[I")
    public int[][] base = new int[6][258];

    @OriginalMember(owner = "client!QPNUVGRI", name = "T", descriptor = "[[I")
    public int[][] perm = new int[6][258];

    @OriginalMember(owner = "client!QPNUVGRI", name = "U", descriptor = "[I")
    public int[] minLens = new int[6];

    @OriginalMember(owner = "client!QPNUVGRI", name = "V", descriptor = "I")
    public int save_nblock;
}
