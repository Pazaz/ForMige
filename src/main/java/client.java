import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sign.signlink;

@OriginalClass("client!client")
public class client extends GameShell {

    @OriginalMember(owner = "client!client", name = "I", descriptor = "I")
    private int ignoreCount;

    @OriginalMember(owner = "client!client", name = "J", descriptor = "B")
    private static byte _flowObfuscator5 = 77;

    @OriginalMember(owner = "client!client", name = "K", descriptor = "J")
    private long sceneLoadStartTime;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "[[I")
    private int[][] bfsCost = new int[104][104];

    @OriginalMember(owner = "client!client", name = "M", descriptor = "[I")
    private int[] friendWorld = new int[200];

    @OriginalMember(owner = "client!client", name = "N", descriptor = "[[[LLHGXPZPG;")
    private LinkList[][][] levelObjStacks = new LinkList[4][104][104];

    @OriginalMember(owner = "client!client", name = "O", descriptor = "[I")
    private int[] flameBuffer3;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "[I")
    private int[] flameBuffer2;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "Z")
    private boolean _flowObfuscator6 = true;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "Z")
    private volatile boolean flameActive = false;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Ljava/net/Socket;")
    private Socket jaggrabSocket;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    private int titleScreenState;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "LMBMGIXGO;")
    private Packet chatBuffer = new Packet(new byte[5000], 891);

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[LCWNCPMLX;")
    private NpcEntity[] npcs = new NpcEntity[16384];

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    private int npcCount;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "[I")
    public int[] npcIds = new int[16384];

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    private int _flowObfuscator7 = 9;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    private int entityRemovalCount;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "[I")
    public int[] entityRemovalIds = new int[1000];

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    private int lastPacketType0;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    private int lastPacketType1;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    private int lastPacketType2;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Ljava/lang/String;")
    private String modalMessage;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    private int privateChatSetting;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    private static int _flowObfuscator8;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "LMBMGIXGO;")
    private Packet login = Packet.alloc(1, 9);

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
    private boolean waveEnabled = true;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    private static int cyclelogic1;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
    private int[] flameGradient;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
    private int[] flameGradient0;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
    private int[] flameGradient1;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "[I")
    private int[] flameGradient2;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    private static int cyclelogic2;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    private int hintType;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger RSA_MODULUS = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    private int viewportInterfaceId = -1;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    private int cameraX;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    private int cameraY;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    private int cameraZ;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    private int cameraPitch;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    private int cameraYaw;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    private int rights;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "[I")
    private int[] skillExperience = new int[Stats.count];

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "LDSMJIEPN;")
    private Pix8 imageRedstone1v;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "LDSMJIEPN;")
    private Pix8 imageRedstone2v;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "LDSMJIEPN;")
    private Pix8 imageRedstone3v;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "LDSMJIEPN;")
    private Pix8 imageRedstone1hv;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "LDSMJIEPN;")
    private Pix8 imageRedstone2hv;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "LCXGZMTJK;")
    private Pix24 imageMapmarker0;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "LCXGZMTJK;")
    private Pix24 imageMapmarker1;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "Z")
    private boolean jaggrabEnabled = false;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "[I")
    private int[] cameraModifierJitter = new int[5];

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
    private int lastWaveId = -1;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
    private int _flowObfuscator9 = -680;

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "[Z")
    private boolean[] cameraModifierEnabled = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
    private int _flowObfuscator10 = 1834;

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
    private int weightCarried;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "LZIJPRJEC;")
    public MouseTracking mouseTracking;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "Z")
    private volatile boolean flamesThread = false;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "Ljava/lang/String;")
    private String reportAbuseInput = "";

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
    private int _flowObfuscator11 = -30815;

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
    private int _flowObfuscator12 = 533;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
    private int localPid = -1;

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "Z")
    private boolean menuVisible = false;

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
    private int lastHoveredInterfaceId;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "Ljava/lang/String;")
    private String chatTyped = "";

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
    private int MAX_PLAYER_COUNT = 2048;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
    private int LOCAL_PLAYER_INDEX = 2047;

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "[LDLZHLHNK;")
    private PlayerEntity[] players = new PlayerEntity[this.MAX_PLAYER_COUNT];

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
    private int playerCount;

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "[I")
    public int[] playerIds = new int[this.MAX_PLAYER_COUNT];

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
    private int entityUpdateCount;

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "[I")
    private int[] entityUpdateIds = new int[this.MAX_PLAYER_COUNT];

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "[LMBMGIXGO;")
    private Packet[] playerAppearanceBuffer = new Packet[this.MAX_PLAYER_COUNT];

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
    private int cameraAnticheatAngle;

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
    private int cameraOffsetYawModifier = 1;

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
    private int _flowObfuscator13;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
    private int friendCount;

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
    private int friendListStatus;

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "[[I")
    private int[][] bfsDirection = new int[104][104];

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
    private int SCROLLBAR_GRIP_HIGHLIGHT = 7759444;

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "LIVIFZQBK;")
    private PixMap areaBackleft1;

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "LIVIFZQBK;")
    private PixMap areaBackleft2;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "LIVIFZQBK;")
    private PixMap areaBackright1;

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "LIVIFZQBK;")
    private PixMap areaBackright2;

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "LIVIFZQBK;")
    private PixMap areaBacktop1;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "LIVIFZQBK;")
    private PixMap areaBackvmid1;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "LIVIFZQBK;")
    private PixMap areaBackvmid2;

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "LIVIFZQBK;")
    private PixMap areaBackvmid3;

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "LIVIFZQBK;")
    private PixMap areaBackhmid2;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "[B")
    private byte[] textureBuffer = new byte[16384];

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
    private int bankArrangeMode;

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
    private int crossX;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
    private int crossY;

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
    private int crossCycle;

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
    private int crossMode;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
    private int currentLevel;

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "Z")
    private static boolean _flowObfuscator14 = true;

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "B")
    private byte _flowObfuscator15 = 14;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
    private int _flowObfuscator16 = 732;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "[I")
    private int[] skillLevel = new int[Stats.count];

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "B")
    private byte _flowObfuscator17 = 25;

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
    private static int oplogic5;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "[J")
    private long[] ignoreName37 = new long[100];

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "Z")
    private boolean errorLoading = false;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
    private int SCROLLBAR_GRIP_LOWLIGHT = 3353893;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "[I")
    private int[] cameraModifierWobbleSpeed = new int[5];

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "[[I")
    private int[][] tileLastOccupiedCycle = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 crc32 = new CRC32();

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "LCXGZMTJK;")
    private Pix24 genderButtonImage0;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "LCXGZMTJK;")
    private Pix24 genderButtonImage1;

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
    private int hintPlayer;

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
    private int hintTileX;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
    private int hintTileZ;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
    private int hintHeight;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
    private int hintOffsetX;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
    private int hintOffsetZ;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
    private int _flowObfuscator18 = 748;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
    private static int gamelogic1;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
    private static int oplogic9;

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "[I")
    private int[] messageType = new int[100];

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "[Ljava/lang/String;")
    private String[] messageSender = new String[100];

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "[Ljava/lang/String;")
    private String[] messageText = new String[100];

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
    private int sceneDelta;

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "LNYFUGYQS;")
    private World3D scene;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "[LDSMJIEPN;")
    private Pix8[] imageSideicons = new Pix8[13];

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
    private int menuArea;

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
    private int menuX;

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
    private int menuY;

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
    private int menuWidth;

    @OriginalMember(owner = "client!client", name = "id", descriptor = "I")
    private int menuHeight;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "J")
    private long socialName37;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
    public boolean focused = true;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "[J")
    private long[] friendName37 = new long[200];

    @OriginalMember(owner = "client!client", name = "md", descriptor = "I")
    private int nextMidiSong = -1;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
    private static int nodeId = 10;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "I")
    public static int portOffset;

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "Z")
    private static boolean members = true;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "Z")
    private static boolean lowMemory;

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
    private int _flowObfuscator19;

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "Z")
    private volatile boolean flameThread = false;

    @OriginalMember(owner = "client!client", name = "td", descriptor = "I")
    private int projectX = -1;

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
    private int projectY = -1;

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "[I")
    private int[] CHAT_COLORS = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "LDSMJIEPN;")
    private Pix8 imageTitlebox;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "LDSMJIEPN;")
    private Pix8 imageTitlebutton;

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
    private int[] compassMaskLineOffsets = new int[33];

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
    private int[] flameLineOffset = new int[256];

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "[LIGSLDTHC;")
    public FileStream[] fileStreams = new FileStream[5];

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
    public int[] varps = new int[2000];

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "Z")
    private boolean scrollGrabbed = false;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "B")
    private byte _flowObfuscator20 = -74;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
    private int chatCount;

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
    private int MAX_CHATS = 50;

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "[I")
    private int[] chatX = new int[this.MAX_CHATS];

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "[I")
    private int[] chatY = new int[this.MAX_CHATS];

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "[I")
    private int[] chatHeight = new int[this.MAX_CHATS];

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "[I")
    private int[] chatWidth = new int[this.MAX_CHATS];

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "[I")
    private int[] chatColors = new int[this.MAX_CHATS];

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "[I")
    private int[] chatStyles = new int[this.MAX_CHATS];

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
    private int[] chatTimers = new int[this.MAX_CHATS];

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "[Ljava/lang/String;")
    private String[] chats = new String[this.MAX_CHATS];

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
    private int cameraPitchClamp;

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
    private int minimapLevel = -1;

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
    private static int oplogic3;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "[LCXGZMTJK;")
    private Pix24[] imageHitmarks = new Pix24[20];

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
    private int cameraOffsetCycle;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
    private int objDragCycles;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "[I")
    private int[] designColors = new int[5];

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "Z")
    private boolean _flowObfuscator21 = false;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
    private int scrollInputPadding;

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "Z")
    private static boolean started;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "Z")
    private boolean _flowObfuscator22 = false;

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
    private int cutsceneDstLocalTileX;

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
    private int cutsceneDstLocalTileZ;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "I")
    private int cutsceneDstHeight;

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
    private int cutsceneRotateSpeed;

    @OriginalMember(owner = "client!client", name = "de", descriptor = "I")
    private int cutsceneRotateAcceleration;

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "LJOCFVBOI;")
    private Isaac randomIn;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "LCXGZMTJK;")
    private Pix24 imageMapedge;

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
    private int SCROLLBAR_TRACK = 2301979;

    @OriginalMember(owner = "client!client", name = "he", descriptor = "[[I")
    public static final int[][] DESIGN_BODY_COLOR = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "Ljava/lang/String;")
    private String chatbackInput = "";

    @OriginalMember(owner = "client!client", name = "je", descriptor = "I")
    private static int gamelogic2;

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
    private int daysSinceLastLogin;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "I")
    private int packetSize;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "I")
    private int packetType;

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
    private int idleNetCycles;

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
    private int heartbeatTimer;

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
    private int idleTimeout;

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "B")
    private byte _flowObfuscator23 = 24;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "LLHGXPZPG;")
    private LinkList projectiles = new LinkList(169);

    @OriginalMember(owner = "client!client", name = "se", descriptor = "I")
    private int orbitCameraX;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "I")
    private int orbitCameraZ;

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
    private int sendCameraDelay;

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "Z")
    private boolean sendCamera = false;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "I")
    private int viewportOverlayInterfaceId = -1;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "[I")
    private static int[] levelExperience = new int[99];

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
    private int _flowObfuscator24;

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
    private int minimapState;

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
    public int lastWriteDuplicates;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
    private int sceneState;

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "LDSMJIEPN;")
    private Pix8 imageScrollbar0;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "LDSMJIEPN;")
    private Pix8 imageScrollbar1;

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
    private int viewportHoveredInterfaceIndex;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "LDSMJIEPN;")
    private Pix8 imageBackbase1;

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "LDSMJIEPN;")
    private Pix8 imageBackbase2;

    @OriginalMember(owner = "client!client", name = "He", descriptor = "LDSMJIEPN;")
    private Pix8 imageBackhmid1;

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "[I")
    private int[] cameraModifierCycle = new int[5];

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "Z")
    private boolean updateDesignModel = false;

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger RSA_EXPONENT;

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "[LCXGZMTJK;")
    private Pix24[] imageMapfunction = new Pix24[100];

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
    private int sceneBaseTileX;

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
    private int sceneBaseTileZ;

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
    private int scenePrevBaseTileX;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
    private int scenePrevBaseTileZ;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
    private int loginAttempts;

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
    private int chatHoveredInterfaceIndex;

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
    private int flameGradientCycle0;

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
    private int flameGradientCycle1;

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
    private int stickyChatInterfaceId = -1;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "Z")
    private boolean _flowObfuscator25 = false;

    @OriginalMember(owner = "client!client", name = "We", descriptor = "[I")
    private int[] skillBaseLevel = new int[Stats.count];

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "[I")
    private int[] varCache = new int[2000];

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
    private int isMember;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
    private boolean designGenderMale = true;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "I")
    private int sidebarHoveredInterfaceIndex;

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "Ljava/lang/String;")
    private String lastProgressMessage;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
    private int _flowObfuscator26 = 111;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "I")
    private static int gamelogic3;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "[I")
    private int[] minimapMaskLineOffsets = new int[151];

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "LXTGLDHGX;")
    private Jagfile archiveTitle;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
    private int flashingTab = -1;

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
    private int inMultizone;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "LLHGXPZPG;")
    private LinkList spotanims = new LinkList(169);

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "[I")
    private int[] compassMaskLineLengths = new int[33];

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
    private int _flowObfuscator27 = 24869;

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "LDUCMKFAY;")
    private Component chatInterface = new Component();

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "[LDSMJIEPN;")
    private Pix8[] imageMapscene = new Pix8[100];

    @OriginalMember(owner = "client!client", name = "of", descriptor = "I")
    public static int drawCycle;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
    private int waveCount;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
    private int SCROLLBAR_GRIP_FOREGROUND = 5063219;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
    private int socialAction;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
    private int[] designIdentikits = new int[7];

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
    private int hoveredSlot;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
    private int hoveredSlotParentId;

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "LGHOWLKWN;")
    private OnDemand ondemand;

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
    private int sceneCenterZoneX;

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
    private int sceneCenterZoneZ;

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
    private int activeMapFunctionCount;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "[I")
    private int[] activeMapFunctionX = new int[1000];

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
    private int[] activeMapFunctionZ = new int[1000];

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "LCXGZMTJK;")
    private Pix24 imageMapdot0;

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "LCXGZMTJK;")
    private Pix24 imageMapdot1;

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "LCXGZMTJK;")
    private Pix24 imageMapdot2;

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "LCXGZMTJK;")
    private Pix24 imageMapdot3;

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "LCXGZMTJK;")
    private Pix24 imageMapdot4;

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
    private int lastProgressPercent;

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "Z")
    private boolean awaitingSync = false;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "I")
    private int _flowObfuscator28 = -733;

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "[Ljava/lang/String;")
    private String[] friendName = new String[200];

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "LMBMGIXGO;")
    private Packet in = Packet.alloc(1, 9);

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
    private int objDragInterfaceId;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
    private int objDragSlot;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
    private int objDragArea;

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
    private int objGrabX;

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
    private int objGrabY;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
    private int chatScrollOffset;

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "[I")
    private int[] archiveChecksum = new int[9];

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "[I")
    private int[] menuParamB = new int[500];

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "[I")
    private int[] menuParamC = new int[500];

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "[I")
    private int[] menuAction = new int[500];

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "[I")
    private int[] menuParamA = new int[500];

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "[LCXGZMTJK;")
    private Pix24[] imageHeadicons = new Pix24[20];

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
    private static int _flowObfuscator29;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
    private static int gamelogic4;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
    private int cutsceneSrcLocalTileX;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
    private int cutsceneSrcLocalTileZ;

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
    private int cutsceneSrcHeight;

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
    private int cutsceneMoveSpeed;

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
    private int cutsceneMoveAcceleration;

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "Z")
    private boolean redrawSideicons = false;

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
    private int systemUpdateTimer;

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
    private int _flowObfuscator30 = 519;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "Z")
    private boolean _flowObfuscator31 = false;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "LIVIFZQBK;")
    private PixMap imageTitle2;

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "LIVIFZQBK;")
    private PixMap imageTitle3;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "LIVIFZQBK;")
    private PixMap imageTitle4;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "LIVIFZQBK;")
    private PixMap imageTitle0;

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "LIVIFZQBK;")
    private PixMap imageTitle1;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "LIVIFZQBK;")
    private PixMap imageTitle5;

    @OriginalMember(owner = "client!client", name = "og", descriptor = "LIVIFZQBK;")
    private PixMap imageTitle6;

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "LIVIFZQBK;")
    private PixMap imageTitle7;

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "LIVIFZQBK;")
    private PixMap imageTitle8;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
    private int _flowObfuscator32 = 445;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
    private static int gamelogic5;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
    private int _flowObfuscator33 = -29508;

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
    private int _flowObfuscator34 = -77;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
    private int warnMembersInNonMembers;

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "Ljava/lang/String;")
    private String socialMessage = "";

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "LCXGZMTJK;")
    private Pix24 imageCompass;

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "LIVIFZQBK;")
    private PixMap areaBackbase1;

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "LIVIFZQBK;")
    private PixMap areaBackbase2;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "LIVIFZQBK;")
    private PixMap areaBackhmid1;

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "LDLZHLHNK;")
    public static PlayerEntity localPlayer;

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "[Ljava/lang/String;")
    private String[] playerOptions = new String[5];

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "[Z")
    private boolean[] playerOptionPushDown = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "[[[I")
    private int[][][] levelChunkBitset = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "[I")
    private int[] tabInterfaceId = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
    private int cameraAnticheatOffsetZ;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
    private int cameraOffsetZModifier = 2;

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
    private int menuSize;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
    private static int oplogic2;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
    private int _flowObfuscator35 = -12499;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
    private int spellSelected;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
    private int activeSpellId;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
    private int activeSpellFlags;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "Ljava/lang/String;")
    public String spellCaption;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "[LCXGZMTJK;")
    private Pix24[] activeMapFunctions = new Pix24[1000];

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "Z")
    private boolean withinTutorialIsland = false;

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
    private static int gamelogic6;

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "LDSMJIEPN;")
    private Pix8 imageRedstone1;

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "LDSMJIEPN;")
    private Pix8 imageRedstone2;

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "LDSMJIEPN;")
    private Pix8 imageRedstone3;

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "LDSMJIEPN;")
    private Pix8 imageRedstone1h;

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "LDSMJIEPN;")
    private Pix8 imageRedstone2h;

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
    private int energy;

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "Z")
    private boolean pressedContinueOption = false;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "[LCXGZMTJK;")
    private Pix24[] imageCrosses = new Pix24[8];

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "Z")
    private boolean midiActive = true;

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "[LDSMJIEPN;")
    private Pix8[] imageRunes;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "Z")
    private boolean redrawSidebar = false;

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
    private int unreadMessages;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
    private static int oplogic7;

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "Z")
    public static boolean showFps;

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "Z")
    public boolean ingame = false;

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "Z")
    private boolean reportAbuseMuteOption = false;

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "Z")
    private boolean sceneInstanced = false;

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "Z")
    private boolean cutscene = false;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
    public static int loopCycle;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "Ljava/lang/String;")
    private static String CHARSET;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "LIVIFZQBK;")
    private PixMap areaSidebar;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "LIVIFZQBK;")
    private PixMap areaMapback;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "LIVIFZQBK;")
    private PixMap areaViewport;

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "LIVIFZQBK;")
    private PixMap areaChatback;

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
    private int daysSinceRecoveriesChanged;

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "LNQABEVLK;")
    private ClientStream stream;

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
    private int privateMessageCount;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "I")
    private int minimapZoom;

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
    private int minimapZoomModifier = 1;

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "J")
    private long lastWaveStartTime;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "Ljava/lang/String;")
    private String username = "";

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "Ljava/lang/String;")
    private String password = "";

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
    private static int oplogic1;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "Z")
    private boolean errorHost = false;

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "[I")
    private final int[] LOC_LAYER = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
    private int reportAbuseInterfaceId = -1;

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "LLHGXPZPG;")
    private LinkList temporaryLocs = new LinkList(169);

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "[I")
    private int[] areaChatbackOffsets;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "[I")
    private int[] areaSidebarOffsets;

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "[I")
    private int[] areaViewportOffsets;

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "[[B")
    private byte[][] sceneMapLandData;

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
    private int orbitCameraPitch = 128;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
    private int orbitCameraYaw;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
    private int orbitCameraYawVelocity;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
    private int orbitCameraPitchVelocity;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
    private static int oplogic6;

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
    private int sidebarInterfaceId = -1;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "[I")
    private int[] flameBuffer0;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "[I")
    private int[] flameBuffer1;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "LMBMGIXGO;")
    private Packet out = Packet.alloc(1, 9);

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
    private int lastAddress;

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "B")
    private byte _flowObfuscator36 = 5;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
    private int splitPrivateChat;

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "LDSMJIEPN;")
    private Pix8 imageInvback;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "LDSMJIEPN;")
    private Pix8 imageMapback;

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "LDSMJIEPN;")
    private Pix8 imageChatback;

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "[Ljava/lang/String;")
    private String[] menuOption = new String[500];

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "B")
    private static byte _flowObfuscator37;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "LCXGZMTJK;")
    private Pix24 imageFlamesLeft;

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "LCXGZMTJK;")
    private Pix24 imageFlamesRight;

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "[I")
    private int[] cameraModifierWobbleScale = new int[5];

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "[I")
    public static final int[] DESIGN_HAIR_COLOR;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "Z")
    public static boolean flagged;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "Z")
    private boolean _flowObfuscator38 = true;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "[I")
    private int[] waveIds = new int[50];

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
    private int frameCycle;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
    private int minimapAnticheatAngle;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
    private int minimapAngleModifier = 2;

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
    private int chatScrollHeight = 78;

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "Ljava/lang/String;")
    private String socialInput = "";

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
    private int dragCycles;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "[[[I")
    private int[][][] levelHeightmap;

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "J")
    private long serverSeed;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
    private int titleLoginField;

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "B")
    private byte _flowObfuscator39 = 6;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
    private int _flowObfuscator40 = -589;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "[LDSMJIEPN;")
    private Pix8[] imageModIcons = new Pix8[2];

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "J")
    public long prevMousePressTime;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "I")
    private int selectedTab = 3;

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
    private int hintNpc;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "Z")
    private boolean redrawChatback = false;

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "Z")
    private static boolean _flowObfuscator41;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
    private int chatbackInputOpen;

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
    private static int oplogic8;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
    private int midiSong;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "Z")
    private boolean midiFading = true;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "[I")
    private int[] minimapMaskLineLengths = new int[151];

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "[LFTPNODIB;")
    private CollisionMap[] levelCollisionMap = new CollisionMap[4];

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "Z")
    private static boolean _flowObfuscator42;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "[I")
    public static int[] BITMASK;

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "Z")
    private boolean redrawPrivacySettings = false;

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "[I")
    private int[] sceneMapIndex;

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "[I")
    private int[] sceneMapLandFile;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "[I")
    private int[] sceneMapLocFile;

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
    public int lastWriteX;

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
    public int lastWriteY;

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
    private final int _flowObfuscator43 = 100;

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "[I")
    private int[] messageIds = new int[100];

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "[I")
    private int[] waveLoops = new int[50];

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "Z")
    private boolean objGrabThreshold = false;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
    private int selectedCycle;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
    private int selectedInterface;

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
    private int selectedItem;

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
    private int selectedArea;

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "[[B")
    private byte[][] sceneMapLocData;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
    private int tradeChatSetting;

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
    private int chatEffects;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "[I")
    private int[] waveDelay = new int[50];

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
    private int overrideChat;

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "Z")
    private boolean errorStarted = false;

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
    private int mouseButtonsOption;

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
    private int minimapOffsetCycle;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "Z")
    private boolean redrawTitleBackground = false;

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "Z")
    private boolean showSocialInput = false;

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
    private int lastWaveLength;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "[[[B")
    private byte[][][] levelTileFlags;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
    private int nextMusicDelay;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
    private static int oplogic10;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
    private int flagSceneTileX;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
    private int flagSceneTileZ;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "LCXGZMTJK;")
    private Pix24 imageMinimap;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
    private int tryMoveNearest;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
    private int sceneCycle;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "Ljava/lang/String;")
    private String loginMessage0 = "";

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "Ljava/lang/String;")
    private String loginMessage1 = "";

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
    private int baseX;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
    private int baseZ;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "LYXVQXWYR;")
    private PixFont fontPlain11;

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "LYXVQXWYR;")
    private PixFont fontPlain12;

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "LYXVQXWYR;")
    private PixFont fontBold12;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "LYXVQXWYR;")
    private PixFont fontQuill8;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "B")
    private byte _flowObfuscator44 = -13;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
    private int flameCycle0;

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
    private int chatInterfaceId = -1;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "Z")
    private boolean _flowObfuscator45 = true;

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
    private int cameraAnticheatOffsetX;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
    private int cameraOffsetXModifier = 2;

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
    private int[] bfsStepX = new int[4000];

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "[I")
    private int[] bfsStepZ = new int[4000];

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
    private int objSelected;

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
    private int objSelectedSlot;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
    private int objSelectedInterface;

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
    private int _flowObfuscator46;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "Ljava/lang/String;")
    public String objSelectedName;

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
    private int publicChatSetting;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
    private static int oplogic4;

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
    private int lastWaveLoops = -1;

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
    public static int _flowObfuscator47;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Ljava/lang/String;")
    private static final String formatObjCountTagged(int arg0, int arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 != 0) {
            _flowObfuscator41 = !_flowObfuscator41;
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void stopMidi(int arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 <= 0) {
            this._flowObfuscator38 = !this._flowObfuscator38;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void loadArchiveChecksums(int arg0) {
        if (arg0 <= 0) {
            this._flowObfuscator40 = this.randomIn.nextInt();
        }
        int var2 = 5;
        this.archiveChecksum[8] = 0;
        int var3 = 0;
        while (this.archiveChecksum[8] == 0) {
            String var4 = "Unknown problem";
            this.drawProgress(20, (byte) 4, "Connecting to web server");
            try {
                DataInputStream var5 = this.openUrl("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 317);
                Packet var6 = new Packet(new byte[40], 891);
                var5.readFully(var6.data, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; var7++) {
                    this.archiveChecksum[var7] = var6.g4();
                }
                int var8 = var6.g4();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; var10++) {
                    var9 = (var9 << 1) + this.archiveChecksum[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.archiveChecksum[8] = 0;
                }
            } catch (EOFException var12) {
                var4 = "EOF problem";
                this.archiveChecksum[8] = 0;
            } catch (IOException var13) {
                var4 = "connection problem";
                this.archiveChecksum[8] = 0;
            } catch (Exception var14) {
                var4 = "logic problem";
                this.archiveChecksum[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.archiveChecksum[8] == 0) {
                var3++;
                for (int var15 = var2; var15 > 0; var15--) {
                    if (var3 >= 10) {
                        this.drawProgress(10, (byte) 4, "Game updated - please reload page");
                        var15 = 10;
                    } else {
                        this.drawProgress(10, (byte) 4, var4 + " - Will retry in " + var15 + " secs.");
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var11) {
                    }
                }
                var2 *= 2;
                if (var2 > 60) {
                    var2 = 60;
                }
                this.jaggrabEnabled = !this.jaggrabEnabled;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Z")
    public final boolean isAddFriendOption(int arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.menuAction[arg1];
            if (arg0 != 9) {
                this.packetType = -1;
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 337;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void drawChat(int arg0) {
        this.areaChatback.bind(0);
        Draw3D.lineOffset = this.areaChatbackOffsets;
        this.imageChatback.draw(0, 16083, 0);
        if (this.showSocialInput) {
            this.fontBold12.drawStringCenter(0, this.socialMessage, 23693, 40, 239);
            this.fontBold12.drawStringCenter(128, this.socialInput + "*", 23693, 60, 239);
        } else if (this.chatbackInputOpen == 1) {
            this.fontBold12.drawStringCenter(0, "Enter amount:", 23693, 40, 239);
            this.fontBold12.drawStringCenter(128, this.chatbackInput + "*", 23693, 60, 239);
        } else if (this.chatbackInputOpen == 2) {
            this.fontBold12.drawStringCenter(0, "Enter name:", 23693, 40, 239);
            this.fontBold12.drawStringCenter(128, this.chatbackInput + "*", 23693, 60, 239);
        } else if (this.modalMessage != null) {
            this.fontBold12.drawStringCenter(0, this.modalMessage, 23693, 40, 239);
            this.fontBold12.drawStringCenter(128, "Click to continue", 23693, 60, 239);
        } else if (this.chatInterfaceId != -1) {
            this.drawInterface(8, 0, 0, Component.instances[this.chatInterfaceId], 0);
        } else if (this.stickyChatInterfaceId != -1) {
            this.drawInterface(8, 0, 0, Component.instances[this.stickyChatInterfaceId], 0);
        } else {
            PixFont var2 = this.fontPlain12;
            int var3 = 0;
            Draw2D.setBounds(77, 0, false, 463, 0);
            for (int var4 = 0; var4 < 100; var4++) {
                if (this.messageText[var4] != null) {
                    int var5 = this.messageType[var4];
                    int var6 = 70 - var3 * 14 + this.chatScrollOffset;
                    String var7 = this.messageSender[var4];
                    byte var8 = 0;
                    if (var7 != null && var7.startsWith("@cr1@")) {
                        var7 = var7.substring(5);
                        var8 = 1;
                    }
                    if (var7 != null && var7.startsWith("@cr2@")) {
                        var7 = var7.substring(5);
                        var8 = 2;
                    }
                    if (var5 == 0) {
                        if (var6 > 0 && var6 < 110) {
                            var2.drawString(0, this.messageText[var4], var6, 822, 4);
                        }
                        var3++;
                    }
                    int var9;
                    if ((var5 == 1 || var5 == 2) && (var5 == 1 || this.publicChatSetting == 0 || this.publicChatSetting == 1 && this.isFriend(false, var7))) {
                        if (var6 > 0 && var6 < 110) {
                            var9 = 4;
                            if (var8 == 1) {
                                this.imageModIcons[0].draw(var9, 16083, var6 - 12);
                                var9 += 14;
                            }
                            if (var8 == 2) {
                                this.imageModIcons[1].draw(var9, 16083, var6 - 12);
                                var9 += 14;
                            }
                            var2.drawString(0, var7 + ":", var6, 822, var9);
                            var9 += var2.stringWidthTag(this._flowObfuscator32, var7) + 8;
                            var2.drawString(255, this.messageText[var4], var6, 822, var9);
                        }
                        var3++;
                    }
                    if ((var5 == 3 || var5 == 7) && this.splitPrivateChat == 0 && (var5 == 7 || this.privateChatSetting == 0 || this.privateChatSetting == 1 && this.isFriend(false, var7))) {
                        if (var6 > 0 && var6 < 110) {
                            byte var11 = 4;
                            var2.drawString(0, "From", var6, 822, var11);
                            var9 = var11 + var2.stringWidthTag(this._flowObfuscator32, "From ");
                            if (var8 == 1) {
                                this.imageModIcons[0].draw(var9, 16083, var6 - 12);
                                var9 += 14;
                            }
                            if (var8 == 2) {
                                this.imageModIcons[1].draw(var9, 16083, var6 - 12);
                                var9 += 14;
                            }
                            var2.drawString(0, var7 + ":", var6, 822, var9);
                            var9 += var2.stringWidthTag(this._flowObfuscator32, var7) + 8;
                            var2.drawString(8388608, this.messageText[var4], var6, 822, var9);
                        }
                        var3++;
                    }
                    if (var5 == 4 && (this.tradeChatSetting == 0 || this.tradeChatSetting == 1 && this.isFriend(false, var7))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.drawString(8388736, var7 + " " + this.messageText[var4], var6, 822, 4);
                        }
                        var3++;
                    }
                    if (var5 == 5 && this.splitPrivateChat == 0 && this.privateChatSetting < 2) {
                        if (var6 > 0 && var6 < 110) {
                            var2.drawString(8388608, this.messageText[var4], var6, 822, 4);
                        }
                        var3++;
                    }
                    if (var5 == 6 && this.splitPrivateChat == 0 && this.privateChatSetting < 2) {
                        if (var6 > 0 && var6 < 110) {
                            var2.drawString(0, "To " + var7 + ":", var6, 822, 4);
                            var2.drawString(8388608, this.messageText[var4], var6, 822, 12 + var2.stringWidthTag(this._flowObfuscator32, "To " + var7));
                        }
                        var3++;
                    }
                    if (var5 == 8 && (this.tradeChatSetting == 0 || this.tradeChatSetting == 1 && this.isFriend(false, var7))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.drawString(8270336, var7 + " " + this.messageText[var4], var6, 822, 4);
                        }
                        var3++;
                    }
                }
            }
            Draw2D.resetBounds(4);
            this.chatScrollHeight = var3 * 14 + 7;
            if (this.chatScrollHeight < 78) {
                this.chatScrollHeight = 78;
            }
            this.drawScrollbar(519, 77, this.chatScrollHeight - this.chatScrollOffset - 77, 0, 463, this.chatScrollHeight);
            String var10;
            if (localPlayer != null && localPlayer.name != null) {
                var10 = localPlayer.name;
            } else {
                var10 = JString.toSentenceCase(-45804, this.username);
            }
            var2.drawString(0, var10 + ":", 90, 822, 4);
            var2.drawString(255, this.chatTyped + "*", 90, 822, 6 + var2.stringWidthTag(this._flowObfuscator32, var10 + ": "));
            Draw2D.drawHorizontalLine(77, 0, 479, 0, (byte) 4);
        }
        if (this.menuVisible && this.menuArea == 2) {
            this.drawMenu((byte) 9);
        }
        this.areaChatback.draw(357, 23680, super.graphics, 17);
        this.areaViewport.bind(0);
        Draw3D.lineOffset = this.areaViewportOffsets;
        if (arg0 < 6 || arg0 > 6) {
            this._flowObfuscator21 = !this._flowObfuscator21;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        nodeId = Integer.parseInt(this.getParameter("nodeid"));
        portOffset = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            setLowMemory((byte) 77);
        } else {
            setHighMemory(false);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            members = false;
        } else {
            members = true;
        }
        this.initApplet(503, false, 765);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void startThread(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.startThread(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)Ljava/net/Socket;")
    public final Socket openSocket(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void handleMouseInput(int arg0) {
        if (arg0 != 4) {
            this.packetType = this.in.g1();
        }
        if (this.objDragArea == 0) {
            int var2 = super.mouseClickButton;
            if (this.spellSelected == 1 && super.mouseClickX >= 516 && super.mouseClickY >= 160 && super.mouseClickX <= 765 && super.mouseClickY <= 205) {
                var2 = 0;
            }
            int var3;
            int var4;
            int var5;
            if (this.menuVisible) {
                if (var2 != 1) {
                    var3 = super.mouseX;
                    var4 = super.mouseY;
                    if (this.menuArea == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.menuArea == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.menuArea == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.menuX - 10 || var3 > this.menuX + this.menuWidth + 10 || var4 < this.menuY - 10 || var4 > this.menuY + this.menuHeight + 10) {
                        this.menuVisible = false;
                        if (this.menuArea == 1) {
                            this.redrawSidebar = true;
                        }
                        if (this.menuArea == 2) {
                            this.redrawChatback = true;
                        }
                    }
                }
                if (var2 == 1) {
                    var3 = this.menuX;
                    var4 = this.menuY;
                    var5 = this.menuWidth;
                    int var11 = super.mouseClickX;
                    int var7 = super.mouseClickY;
                    if (this.menuArea == 0) {
                        var11 -= 4;
                        var7 -= 4;
                    }
                    if (this.menuArea == 1) {
                        var11 -= 553;
                        var7 -= 205;
                    }
                    if (this.menuArea == 2) {
                        var11 -= 17;
                        var7 -= 357;
                    }
                    int var8 = -1;
                    for (int var9 = 0; var9 < this.menuSize; var9++) {
                        int var10 = var4 + 31 + (this.menuSize - 1 - var9) * 15;
                        if (var11 > var3 && var11 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        this.useMenuOption(var8, false);
                    }
                    this.menuVisible = false;
                    if (this.menuArea == 1) {
                        this.redrawSidebar = true;
                    }
                    if (this.menuArea == 2) {
                        this.redrawChatback = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.menuSize > 0) {
                    var3 = this.menuAction[this.menuSize - 1];
                    if (var3 == 632 || var3 == 78 || var3 == 867 || var3 == 431 || var3 == 53 || var3 == 74 || var3 == 454 || var3 == 539 || var3 == 493 || var3 == 847 || var3 == 447 || var3 == 1125) {
                        var4 = this.menuParamB[this.menuSize - 1];
                        var5 = this.menuParamC[this.menuSize - 1];
                        Component var6 = Component.instances[var5];
                        if (var6.draggable || var6.swappable) {
                            this.objGrabThreshold = false;
                            this.objDragCycles = 0;
                            this.objDragInterfaceId = var5;
                            this.objDragSlot = var4;
                            this.objDragArea = 2;
                            this.objGrabX = super.mouseClickX;
                            this.objGrabY = super.mouseClickY;
                            if (Component.instances[var5].layer == this.viewportInterfaceId) {
                                this.objDragArea = 1;
                            }
                            if (Component.instances[var5].layer == this.chatInterfaceId) {
                                this.objDragArea = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.mouseButtonsOption == 1 || this.isAddFriendOption(9, this.menuSize - 1)) && this.menuSize > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.menuSize > 0) {
                    this.useMenuOption(this.menuSize - 1, false);
                }
                if (var2 != 2 || this.menuSize <= 0) {
                    return;
                }
                this.showContextMenu(true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI[B)V")
    public final void saveMidi(boolean arg0, int arg1, byte[] arg2) {
        signlink.midifade = arg0 ? 1 : 0;
        signlink.midisave(arg2, arg2.length);
        if (arg1 != 0) {
            this.packetType = this.in.g1();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void buildScene(boolean arg0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var20;
        try {
            this.minimapLevel = -1;
            this.spotanims.clear();
            this.projectiles.clear();
            Draw3D.clearTexels(_flowObfuscator8);
            this.clearCache(false);
            this.scene.reset(619);
            System.gc();
            for (var2 = 0; var2 < 4; var2++) {
                this.levelCollisionMap[var2].reset();
            }
            for (var3 = 0; var3 < 4; var3++) {
                for (var4 = 0; var4 < 104; var4++) {
                    for (var5 = 0; var5 < 104; var5++) {
                        this.levelTileFlags[var3][var4][var5] = 0;
                    }
                }
            }
            World var19 = new World(this.levelTileFlags, -60, 104, 104, this.levelHeightmap);
            var5 = this.sceneMapLandData.length;
            this.out.p1isaac((byte) 6, 0);
            int var11;
            int var21;
            if (!this.sceneInstanced) {
                byte[] var9;
                for (var6 = 0; var6 < var5; var6++) {
                    var7 = (this.sceneMapIndex[var6] >> 8) * 64 - this.sceneBaseTileX;
                    var8 = (this.sceneMapIndex[var6] & 255) * 64 - this.sceneBaseTileZ;
                    var9 = this.sceneMapLandData[var6];
                    if (var9 != null) {
                        var19.readLand(var9, var8, var7, (this.sceneCenterZoneX - 6) * 8, (this.sceneCenterZoneZ - 6) * 8, (byte) 4, this.levelCollisionMap);
                    }
                }
                for (var7 = 0; var7 < var5; var7++) {
                    var8 = (this.sceneMapIndex[var7] >> 8) * 64 - this.sceneBaseTileX;
                    var20 = (this.sceneMapIndex[var7] & 255) * 64 - this.sceneBaseTileZ;
                    byte[] var10 = this.sceneMapLandData[var7];
                    if (var10 == null && this.sceneCenterZoneZ < 800) {
                        var19.stitchHeightmap(var20, 64, 0, 64, var8);
                    }
                }
                gamelogic4++;
                if (gamelogic4 > 160) {
                    gamelogic4 = 0;
                    this.out.p1isaac((byte) 6, 238);
                    this.out.p1(96);
                }
                this.out.p1isaac((byte) 6, 0);
                for (var8 = 0; var8 < var5; var8++) {
                    var9 = this.sceneMapLocData[var8];
                    if (var9 != null) {
                        var21 = (this.sceneMapIndex[var8] >> 8) * 64 - this.sceneBaseTileX;
                        var11 = (this.sceneMapIndex[var8] & 255) * 64 - this.sceneBaseTileZ;
                        var19.readLoc(var21, this.levelCollisionMap, var11, 7, this.scene, var9);
                    }
                }
            }
            if (this.sceneInstanced) {
                var6 = 0;
                label252: while (true) {
                    int var12;
                    int var13;
                    int var14;
                    int var15;
                    if (var6 >= 4) {
                        for (var7 = 0; var7 < 13; var7++) {
                            for (var8 = 0; var8 < 13; var8++) {
                                var20 = this.levelChunkBitset[0][var7][var8];
                                if (var20 == -1) {
                                    var19.stitchHeightmap(var8 * 8, 8, 0, 8, var7 * 8);
                                }
                            }
                        }
                        this.out.p1isaac((byte) 6, 0);
                        var8 = 0;
                        while (true) {
                            if (var8 >= 4) {
                                break label252;
                            }
                            for (var20 = 0; var20 < 13; var20++) {
                                for (var21 = 0; var21 < 13; var21++) {
                                    var11 = this.levelChunkBitset[var8][var20][var21];
                                    if (var11 != -1) {
                                        var12 = var11 >> 24 & 3;
                                        var13 = var11 >> 1 & 3;
                                        var14 = var11 >> 14 & 1023;
                                        var15 = var11 >> 3 & 2047;
                                        int var16 = (var14 / 8 << 8) + var15 / 8;
                                        for (int var17 = 0; var17 < this.sceneMapIndex.length; var17++) {
                                            if (this.sceneMapIndex[var17] == var16 && this.sceneMapLocData[var17] != null) {
                                                var19.readLocRegion(this.levelCollisionMap, this.scene, var12, var20 * 8, (var15 & 7) * 8, true, var8, this.sceneMapLocData[var17], (var14 & 7) * 8, var13, var21 * 8);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            var8++;
                        }
                    }
                    for (var7 = 0; var7 < 13; var7++) {
                        for (var8 = 0; var8 < 13; var8++) {
                            var20 = this.levelChunkBitset[var6][var7][var8];
                            if (var20 != -1) {
                                var21 = var20 >> 24 & 3;
                                var11 = var20 >> 1 & 3;
                                var12 = var20 >> 14 & 1023;
                                var13 = var20 >> 3 & 2047;
                                var14 = (var12 / 8 << 8) + var13 / 8;
                                for (var15 = 0; var15 < this.sceneMapIndex.length; var15++) {
                                    if (this.sceneMapIndex[var15] == var14 && this.sceneMapLandData[var15] != null) {
                                        var19.readLandRegion(var21, var11, this.levelCollisionMap, 9, var7 * 8, (var12 & 7) * 8, this.sceneMapLandData[var15], (var13 & 7) * 8, var6, var8 * 8);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    var6++;
                }
            }
            this.out.p1isaac((byte) 6, 0);
            var19.build(this.levelCollisionMap, this.scene, 2);
            this.areaViewport.bind(0);
            this.out.p1isaac((byte) 6, 0);
            var6 = World.currentLevel;
            if (var6 > this.currentLevel) {
                var6 = this.currentLevel;
            }
            if (var6 < this.currentLevel - 1) {
                var6 = this.currentLevel - 1;
            }
            if (lowMemory) {
                this.scene.setMinLevel(World.currentLevel, -34686);
            } else {
                this.scene.setMinLevel(0, -34686);
            }
            for (var7 = 0; var7 < 104; var7++) {
                for (var8 = 0; var8 < 104; var8++) {
                    this.sortObjStacks(var7, var8);
                }
            }
            gamelogic3++;
            if (gamelogic3 > 98) {
                gamelogic3 = 0;
                this.out.p1isaac((byte) 6, 150);
            }
            this.clearTemporaryLocs(-919);
        } catch (Exception var18) {
        }
        LocType.modelCacheStatic.clear();
        this.ingame &= arg0;
        if (super.frame != null) {
            this.out.p1isaac((byte) 6, 210);
            this.out.p4(1057001181);
        }
        if (lowMemory && signlink.cache_dat != null) {
            var2 = this.ondemand.getFileCount(79, 0);
            for (var3 = 0; var3 < var2; var3++) {
                var4 = this.ondemand.getModelFlags(var3, -203);
                if ((var4 & 121) == 0) {
                    Model.unload(116, var3);
                }
            }
        }
        System.gc();
        Draw3D.initPool(20, true);
        this.ondemand.clearPrefetches(0);
        var2 = (this.sceneCenterZoneX - 6) / 8 - 1;
        var3 = (this.sceneCenterZoneX + 6) / 8 + 1;
        var4 = (this.sceneCenterZoneZ - 6) / 8 - 1;
        var5 = (this.sceneCenterZoneZ + 6) / 8 + 1;
        if (this.withinTutorialIsland) {
            var2 = 49;
            var3 = 50;
            var4 = 49;
            var5 = 50;
        }
        for (var6 = var2; var6 <= var3; var6++) {
            for (var7 = var4; var7 <= var5; var7++) {
                if (var6 == var2 || var6 == var3 || var7 == var4 || var7 == var5) {
                    var8 = this.ondemand.getMapFile(0, 0, var7, var6);
                    if (var8 != -1) {
                        this.ondemand.prefetch(var8, 3, false);
                    }
                    var20 = this.ondemand.getMapFile(1, 0, var7, var6);
                    if (var20 != -1) {
                        this.ondemand.prefetch(var20, 3, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void clearCache(boolean arg0) {
        LocType.modelCacheStatic.clear();
        LocType.modelCacheDynamic.clear();
        NpcType.modelCacheStatic.clear();
        ObjType.modelCache.clear();
        ObjType.iconCache.clear();
        if (arg0) {
            this.packetType = -1;
        }
        PlayerEntity.modelCache.clear();
        SpotAnimType.modelCache.clear();
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    public final void createMinimap(boolean arg0, int arg1) {
        int[] var3 = this.imageMinimap.pixels;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 0;
        }
        int var7;
        int var8;
        for (int var6 = 1; var6 < 103; var6++) {
            var7 = 24628 + (103 - var6) * 512 * 4;
            for (var8 = 1; var8 < 103; var8++) {
                if ((this.levelTileFlags[arg1][var8][var6] & 24) == 0) {
                    this.scene.drawMinimapTile(var3, var7, 512, arg1, var8, var6);
                }
                if (arg1 < 3 && (this.levelTileFlags[arg1 + 1][var8][var6] & 8) != 0) {
                    this.scene.drawMinimapTile(var3, var7, 512, arg1 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.imageMinimap.bind(0);
        int var10;
        for (int var9 = 1; var9 < 103; var9++) {
            for (var10 = 1; var10 < 103; var10++) {
                if ((this.levelTileFlags[arg1][var10][var9] & 24) == 0) {
                    this.drawMinimapLoc(var9, -960, var7, var10, var8, arg1);
                }
                if (arg1 < 3 && (this.levelTileFlags[arg1 + 1][var10][var9] & 8) != 0) {
                    this.drawMinimapLoc(var9, -960, var7, var10, var8, arg1 + 1);
                }
            }
        }
        this.areaViewport.bind(0);
        this.ingame &= arg0;
        this.activeMapFunctionCount = 0;
        for (var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                int var12 = this.scene.getGroundDecorationBitset(this.currentLevel, var10, var11);
                if (var12 != 0) {
                    var12 = var12 >> 14 & 32767;
                    int var13 = LocType.get(var12).mapfunction;
                    if (var13 >= 0) {
                        int var14 = var10;
                        int var15 = var11;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            byte var16 = 104;
                            byte var17 = 104;
                            int[][] var18 = this.levelCollisionMap[this.currentLevel].flags;
                            for (int var19 = 0; var19 < 10; var19++) {
                                int var20 = (int) (Math.random() * 4.0D);
                                if (var20 == 0 && var14 > 0 && var14 > var10 - 3 && (var18[var14 - 1][var15] & 19398920) == 0) {
                                    var14--;
                                }
                                if (var20 == 1 && var14 < var16 - 1 && var14 < var10 + 3 && (var18[var14 + 1][var15] & 19399040) == 0) {
                                    var14++;
                                }
                                if (var20 == 2 && var15 > 0 && var15 > var11 - 3 && (var18[var14][var15 - 1] & 19398914) == 0) {
                                    var15--;
                                }
                                if (var20 == 3 && var15 < var17 - 1 && var15 < var11 + 3 && (var18[var14][var15 + 1] & 19398944) == 0) {
                                    var15++;
                                }
                            }
                        }
                        this.activeMapFunctions[this.activeMapFunctionCount] = this.imageMapfunction[var13];
                        this.activeMapFunctionX[this.activeMapFunctionCount] = var14;
                        this.activeMapFunctionZ[this.activeMapFunctionCount] = var15;
                        this.activeMapFunctionCount++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
    public final void sortObjStacks(int arg0, int arg1) {
        LinkList var3 = this.levelObjStacks[this.currentLevel][arg0][arg1];
        if (var3 == null) {
            this.scene.removeObjStack(this.currentLevel, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            ObjStackEntity var6;
            for (var6 = (ObjStackEntity) var3.head(); var6 != null; var6 = (ObjStackEntity) var3.next(false)) {
                ObjType var7 = ObjType.get(var6.type);
                int var8 = var7.cost;
                if (var7.stackable) {
                    var8 *= var6.count + 1;
                }
                if (var8 > var4) {
                    var4 = var8;
                    var5 = var6;
                }
            }
            var3.addHead(-493, var5);
            ObjStackEntity var10 = null;
            ObjStackEntity var11 = null;
            for (var6 = (ObjStackEntity) var3.head(); var6 != null; var6 = (ObjStackEntity) var3.next(false)) {
                if (var6.type != var5.type && var10 == null) {
                    var10 = var6;
                }
                if (var6.type != var5.type && var6.type != var10.type && var11 == null) {
                    var11 = var6;
                }
            }
            int var9 = arg0 + (arg1 << 7) + 1610612736;
            this.scene.addObjStack((byte) 7, arg0, var9, var10, this.getHeightmapY(this.currentLevel, arg1 * 128 + 64, true, arg0 * 128 + 64), var11, var5, this.currentLevel, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
    public final void pushNpcs(boolean arg0, int arg1) {
        for (int var3 = 0; var3 < this.npcCount; var3++) {
            NpcEntity var4 = this.npcs[this.npcIds[var3]];
            int var5 = 536870912 + (this.npcIds[var3] << 14);
            if (var4 != null && var4.isVisible(_flowObfuscator41) && var4.type.alwaysontop == arg0) {
                int var6 = var4.x >> 7;
                int var7 = var4.z >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.size == 1 && (var4.x & 127) == 64 && (var4.z & 127) == 64) {
                        if (this.tileLastOccupiedCycle[var6][var7] == this.sceneCycle) {
                            continue;
                        }
                        this.tileLastOccupiedCycle[var6][var7] = this.sceneCycle;
                    }
                    if (!var4.type.active) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.scene.addTemporary(this.currentLevel, var4.yaw, (byte) 6, this.getHeightmapY(this.currentLevel, var4.z, true, var4.x), var5, var4.z, (var4.size - 1) * 64 + 60, var4.x, var4, var4.needsForwardDrawPadding);
                }
            }
        }
        if (arg1 == -30815) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)Z")
    public final boolean replayWave(int arg0) {
        if (arg0 != 11456) {
            throw new NullPointerException();
        } else {
            return signlink.wavereplay();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void showLoadError(String arg0) {
        System.out.println(arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "loaderror_" + arg0 + ".html"));
        } catch (Exception var3) {
            var3.printStackTrace();
        }
        while (true) {
            while (true) {
                try {
                    Thread.sleep(1000L);
                } catch (Exception var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILDUCMKFAY;IIII)V")
    public final void handleInterfaceInput(int arg0, int arg1, Component arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2.type == 0 && arg2.children != null && !arg2.hide) {
            if (arg3 >= arg0 && arg5 >= arg4 && arg3 <= arg0 + arg2.width && arg5 <= arg4 + arg2.height) {
                int var8 = arg2.children.length;
                if (arg1 != 13037) {
                    this.levelObjStacks = null;
                }
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10 = arg2.childX[var9] + arg0;
                    int var11 = arg2.childY[var9] + arg4 - arg6;
                    Component var12 = Component.instances[arg2.children[var9]];
                    int var20 = var10 + var12.x;
                    int var21 = var11 + var12.y;
                    if ((var12.overlayer >= 0 || var12.overColour != 0) && arg3 >= var20 && arg5 >= var21 && arg3 < var20 + var12.width && arg5 < var21 + var12.height) {
                        if (var12.overlayer >= 0) {
                            this.lastHoveredInterfaceId = var12.overlayer;
                        } else {
                            this.lastHoveredInterfaceId = var12.id;
                        }
                    }
                    if (var12.type == 0) {
                        this.handleInterfaceInput(var20, 13037, var12, arg3, var21, arg5, var12.scrollPosition);
                        if (var12.scroll > var12.height) {
                            this.handleScrollInput(var20 + var12.width, var12.height, arg3, arg5, var12, var21, true, var12.scroll, 0);
                        }
                    } else {
                        if (var12.buttonType == 1 && arg3 >= var20 && arg5 >= var21 && arg3 < var20 + var12.width && arg5 < var21 + var12.height) {
                            boolean var13 = false;
                            if (var12.clientCode != 0) {
                                var13 = this.handleSocialMenuOption(var12, false);
                            }
                            if (!var13) {
                                this.menuOption[this.menuSize] = var12.option;
                                this.menuAction[this.menuSize] = 315;
                                this.menuParamC[this.menuSize] = var12.id;
                                this.menuSize++;
                            }
                        }
                        if (var12.buttonType == 2 && this.spellSelected == 0 && arg3 >= var20 && arg5 >= var21 && arg3 < var20 + var12.width && arg5 < var21 + var12.height) {
                            String var22 = var12.targetVerb;
                            if (var22.indexOf(" ") != -1) {
                                var22 = var22.substring(0, var22.indexOf(" "));
                            }
                            this.menuOption[this.menuSize] = var22 + " @gre@" + var12.targetText;
                            this.menuAction[this.menuSize] = 626;
                            this.menuParamC[this.menuSize] = var12.id;
                            this.menuSize++;
                        }
                        if (var12.buttonType == 3 && arg3 >= var20 && arg5 >= var21 && arg3 < var20 + var12.width && arg5 < var21 + var12.height) {
                            this.menuOption[this.menuSize] = "Close";
                            this.menuAction[this.menuSize] = 200;
                            this.menuParamC[this.menuSize] = var12.id;
                            this.menuSize++;
                        }
                        if (var12.buttonType == 4 && arg3 >= var20 && arg5 >= var21 && arg3 < var20 + var12.width && arg5 < var21 + var12.height) {
                            this.menuOption[this.menuSize] = var12.option;
                            this.menuAction[this.menuSize] = 169;
                            this.menuParamC[this.menuSize] = var12.id;
                            this.menuSize++;
                        }
                        if (var12.buttonType == 5 && arg3 >= var20 && arg5 >= var21 && arg3 < var20 + var12.width && arg5 < var21 + var12.height) {
                            this.menuOption[this.menuSize] = var12.option;
                            this.menuAction[this.menuSize] = 646;
                            this.menuParamC[this.menuSize] = var12.id;
                            this.menuSize++;
                        }
                        if (var12.buttonType == 6 && !this.pressedContinueOption && arg3 >= var20 && arg5 >= var21 && arg3 < var20 + var12.width && arg5 < var21 + var12.height) {
                            this.menuOption[this.menuSize] = var12.option;
                            this.menuAction[this.menuSize] = 679;
                            this.menuParamC[this.menuSize] = var12.id;
                            this.menuSize++;
                        }
                        if (var12.type == 2) {
                            int var23 = 0;
                            for (int var14 = 0; var14 < var12.height; var14++) {
                                for (int var15 = 0; var15 < var12.width; var15++) {
                                    int var16 = var20 + var15 * (32 + var12.marginX);
                                    int var17 = var21 + var14 * (32 + var12.marginY);
                                    if (var23 < 20) {
                                        var16 += var12.invSlotOffsetX[var23];
                                        var17 += var12.invSlotOffsetY[var23];
                                    }
                                    if (arg3 >= var16 && arg5 >= var17 && arg3 < var16 + 32 && arg5 < var17 + 32) {
                                        this.hoveredSlot = var23;
                                        this.hoveredSlotParentId = var12.id;
                                        if (var12.invSlotObjId[var23] > 0) {
                                            ObjType var18 = ObjType.get(var12.invSlotObjId[var23] - 1);
                                            if (this.objSelected == 1 && var12.interactable) {
                                                if (var12.id != this.objSelectedInterface || var23 != this.objSelectedSlot) {
                                                    this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @lre@" + var18.name;
                                                    this.menuAction[this.menuSize] = 870;
                                                    this.menuParamA[this.menuSize] = var18.type;
                                                    this.menuParamB[this.menuSize] = var23;
                                                    this.menuParamC[this.menuSize] = var12.id;
                                                    this.menuSize++;
                                                }
                                            } else if (this.spellSelected == 1 && var12.interactable) {
                                                if ((this.activeSpellFlags & 16) == 16) {
                                                    this.menuOption[this.menuSize] = this.spellCaption + " @lre@" + var18.name;
                                                    this.menuAction[this.menuSize] = 543;
                                                    this.menuParamA[this.menuSize] = var18.type;
                                                    this.menuParamB[this.menuSize] = var23;
                                                    this.menuParamC[this.menuSize] = var12.id;
                                                    this.menuSize++;
                                                }
                                            } else {
                                                int var19;
                                                if (var12.interactable) {
                                                    for (var19 = 4; var19 >= 3; var19--) {
                                                        if (var18.iop != null && var18.iop[var19] != null) {
                                                            this.menuOption[this.menuSize] = var18.iop[var19] + " @lre@" + var18.name;
                                                            if (var19 == 3) {
                                                                this.menuAction[this.menuSize] = 493;
                                                            }
                                                            if (var19 == 4) {
                                                                this.menuAction[this.menuSize] = 847;
                                                            }
                                                            this.menuParamA[this.menuSize] = var18.type;
                                                            this.menuParamB[this.menuSize] = var23;
                                                            this.menuParamC[this.menuSize] = var12.id;
                                                            this.menuSize++;
                                                        } else if (var19 == 4) {
                                                            this.menuOption[this.menuSize] = "Drop @lre@" + var18.name;
                                                            this.menuAction[this.menuSize] = 847;
                                                            this.menuParamA[this.menuSize] = var18.type;
                                                            this.menuParamB[this.menuSize] = var23;
                                                            this.menuParamC[this.menuSize] = var12.id;
                                                            this.menuSize++;
                                                        }
                                                    }
                                                }
                                                if (var12.usable) {
                                                    this.menuOption[this.menuSize] = "Use @lre@" + var18.name;
                                                    this.menuAction[this.menuSize] = 447;
                                                    this.menuParamA[this.menuSize] = var18.type;
                                                    this.menuParamB[this.menuSize] = var23;
                                                    this.menuParamC[this.menuSize] = var12.id;
                                                    this.menuSize++;
                                                }
                                                if (var12.interactable && var18.iop != null) {
                                                    for (var19 = 2; var19 >= 0; var19--) {
                                                        if (var18.iop[var19] != null) {
                                                            this.menuOption[this.menuSize] = var18.iop[var19] + " @lre@" + var18.name;
                                                            if (var19 == 0) {
                                                                this.menuAction[this.menuSize] = 74;
                                                            }
                                                            if (var19 == 1) {
                                                                this.menuAction[this.menuSize] = 454;
                                                            }
                                                            if (var19 == 2) {
                                                                this.menuAction[this.menuSize] = 539;
                                                            }
                                                            this.menuParamA[this.menuSize] = var18.type;
                                                            this.menuParamB[this.menuSize] = var23;
                                                            this.menuParamC[this.menuSize] = var12.id;
                                                            this.menuSize++;
                                                        }
                                                    }
                                                }
                                                if (var12.iop != null) {
                                                    for (var19 = 4; var19 >= 0; var19--) {
                                                        if (var12.iop[var19] != null) {
                                                            this.menuOption[this.menuSize] = var12.iop[var19] + " @lre@" + var18.name;
                                                            if (var19 == 0) {
                                                                this.menuAction[this.menuSize] = 632;
                                                            }
                                                            if (var19 == 1) {
                                                                this.menuAction[this.menuSize] = 78;
                                                            }
                                                            if (var19 == 2) {
                                                                this.menuAction[this.menuSize] = 867;
                                                            }
                                                            if (var19 == 3) {
                                                                this.menuAction[this.menuSize] = 431;
                                                            }
                                                            if (var19 == 4) {
                                                                this.menuAction[this.menuSize] = 53;
                                                            }
                                                            this.menuParamA[this.menuSize] = var18.type;
                                                            this.menuParamB[this.menuSize] = var23;
                                                            this.menuParamC[this.menuSize] = var12.id;
                                                            this.menuSize++;
                                                        }
                                                    }
                                                }
                                                this.menuOption[this.menuSize] = "Examine @lre@" + var18.name;
                                                this.menuAction[this.menuSize] = 1125;
                                                this.menuParamA[this.menuSize] = var18.type;
                                                this.menuParamB[this.menuSize] = var23;
                                                this.menuParamC[this.menuSize] = var12.id;
                                                this.menuSize++;
                                            }
                                        }
                                    }
                                    var23++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void drawScrollbar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.imageScrollbar0.draw(arg4, 16083, arg3);
        this.imageScrollbar1.draw(arg4, 16083, arg3 + arg1 - 16);
        Draw2D.fillRect(arg1 - 32, arg3 + 16, arg4, this.SCROLLBAR_TRACK, 16, 0);
        int var7 = (arg1 - 32) * arg1 / arg5;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg1 - 32 - var7) * arg2 / (arg5 - arg1);
        Draw2D.fillRect(var7, arg3 + 16 + var8, arg4, this.SCROLLBAR_GRIP_FOREGROUND, 16, 0);
        Draw2D.drawVerticalLine(arg3 + 16 + var8, this.SCROLLBAR_GRIP_HIGHLIGHT, var7, arg4, this._flowObfuscator35);
        Draw2D.drawVerticalLine(arg3 + 16 + var8, this.SCROLLBAR_GRIP_HIGHLIGHT, var7, arg4 + 1, this._flowObfuscator35);
        Draw2D.drawHorizontalLine(arg3 + 16 + var8, this.SCROLLBAR_GRIP_HIGHLIGHT, 16, arg4, (byte) 4);
        Draw2D.drawHorizontalLine(arg3 + 17 + var8, this.SCROLLBAR_GRIP_HIGHLIGHT, 16, arg4, (byte) 4);
        if (arg0 <= 0) {
            this._flowObfuscator30 = this.randomIn.nextInt();
        }
        Draw2D.drawVerticalLine(arg3 + 16 + var8, this.SCROLLBAR_GRIP_LOWLIGHT, var7, arg4 + 15, this._flowObfuscator35);
        Draw2D.drawVerticalLine(arg3 + 17 + var8, this.SCROLLBAR_GRIP_LOWLIGHT, var7 - 1, arg4 + 14, this._flowObfuscator35);
        Draw2D.drawHorizontalLine(arg3 + 15 + var8 + var7, this.SCROLLBAR_GRIP_LOWLIGHT, 16, arg4, (byte) 4);
        Draw2D.drawHorizontalLine(arg3 + 14 + var8 + var7, this.SCROLLBAR_GRIP_LOWLIGHT, 15, arg4 + 1, (byte) 4);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LMBMGIXGO;II)V")
    private final void readNpcInfo(Packet arg0, int arg1, int arg2) {
        this.entityRemovalCount = 0;
        this.entityUpdateCount = 0;
        if (arg2 <= 0) {
            this._flowObfuscator10 = this.randomIn.nextInt();
        }
        this.readNpcs(arg0, -45, arg1);
        this.readNewNpcs(arg1, arg0, (byte) 2);
        this.readNpcUpdates(arg1, arg0, true);
        int var5;
        for (int var4 = 0; var4 < this.entityRemovalCount; var4++) {
            var5 = this.entityRemovalIds[var4];
            if (this.npcs[var5].cycle != loopCycle) {
                this.npcs[var5].type = null;
                this.npcs[var5] = null;
            }
        }
        if (arg0.pos != arg1) {
            signlink.reporterror(this.username + " size mismatch in getnpcpos - pos:" + arg0.pos + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (var5 = 0; var5 < this.npcCount; var5++) {
                if (this.npcs[this.npcIds[var5]] == null) {
                    signlink.reporterror(this.username + " null entry in npc list - pos:" + var5 + " size:" + this.npcCount);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void handleChatSettingsInput(boolean arg0) {
        this.ingame &= arg0;
        if (super.mouseClickButton == 1) {
            if (super.mouseClickX >= 6 && super.mouseClickX <= 106 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
                this.publicChatSetting = (this.publicChatSetting + 1) % 4;
                this.redrawPrivacySettings = true;
                this.redrawChatback = true;
                this.out.p1isaac((byte) 6, 95);
                this.out.p1(this.publicChatSetting);
                this.out.p1(this.privateChatSetting);
                this.out.p1(this.tradeChatSetting);
            }
            if (super.mouseClickX >= 135 && super.mouseClickX <= 235 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
                this.privateChatSetting = (this.privateChatSetting + 1) % 3;
                this.redrawPrivacySettings = true;
                this.redrawChatback = true;
                this.out.p1isaac((byte) 6, 95);
                this.out.p1(this.publicChatSetting);
                this.out.p1(this.privateChatSetting);
                this.out.p1(this.tradeChatSetting);
            }
            if (super.mouseClickX >= 273 && super.mouseClickX <= 373 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
                this.tradeChatSetting = (this.tradeChatSetting + 1) % 3;
                this.redrawPrivacySettings = true;
                this.redrawChatback = true;
                this.out.p1isaac((byte) 6, 95);
                this.out.p1(this.publicChatSetting);
                this.out.p1(this.privateChatSetting);
                this.out.p1(this.tradeChatSetting);
            }
            int var2;
            if (super.mouseClickX >= 412 && super.mouseClickX <= 512 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
                if (this.viewportInterfaceId == -1) {
                    this.closeInterfaces(537);
                    this.reportAbuseInput = "";
                    this.reportAbuseMuteOption = false;
                    for (var2 = 0; var2 < Component.instances.length; var2++) {
                        if (Component.instances[var2] != null && Component.instances[var2].clientCode == 600) {
                            this.reportAbuseInterfaceId = this.viewportInterfaceId = Component.instances[var2].layer;
                            break;
                        }
                    }
                } else {
                    this.addMessage("Please close the interface you have open before using 'report abuse'", 0, "", this._flowObfuscator21);
                }
            }
            gamelogic1++;
            if (gamelogic1 > 1386) {
                gamelogic1 = 0;
                this.out.p1isaac((byte) 6, 165);
                this.out.p1(0);
                var2 = this.out.pos;
                this.out.p1(139);
                this.out.p1(150);
                this.out.p2(32131);
                this.out.p1((int) (Math.random() * 256.0D));
                this.out.p2(3250);
                this.out.p1(177);
                this.out.p2(24859);
                this.out.p1(119);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.out.p2(47234);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.out.p1(21);
                }
                this.out.psize1(this.out.pos - var2, (byte) 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(ZI)V")
    public final void updateVarp(boolean arg0, int arg1) {
        int var3 = VarpType.instances[arg1].clientcode;
        if (var3 != 0) {
            int var4 = this.varps[arg1];
            if (arg0) {
                this._flowObfuscator19 = this.randomIn.nextInt();
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    Draw3D.setBrightness(0.9D, _flowObfuscator37);
                }
                if (var4 == 2) {
                    Draw3D.setBrightness(0.8D, _flowObfuscator37);
                }
                if (var4 == 3) {
                    Draw3D.setBrightness(0.7D, _flowObfuscator37);
                }
                if (var4 == 4) {
                    Draw3D.setBrightness(0.6D, _flowObfuscator37);
                }
                ObjType.iconCache.clear();
                this.redrawTitleBackground = true;
            }
            if (var3 == 3) {
                boolean var5 = this.midiActive;
                if (var4 == 0) {
                    this.setMidiVolume((byte) 0, this.midiActive, 0);
                    this.midiActive = true;
                }
                if (var4 == 1) {
                    this.setMidiVolume((byte) 0, this.midiActive, -400);
                    this.midiActive = true;
                }
                if (var4 == 2) {
                    this.setMidiVolume((byte) 0, this.midiActive, -800);
                    this.midiActive = true;
                }
                if (var4 == 3) {
                    this.setMidiVolume((byte) 0, this.midiActive, -1200);
                    this.midiActive = true;
                }
                if (var4 == 4) {
                    this.midiActive = false;
                }
                if (this.midiActive != var5 && !lowMemory) {
                    if (this.midiActive) {
                        this.midiSong = this.nextMidiSong;
                        this.midiFading = true;
                        this.ondemand.request(2, this.midiSong);
                    } else {
                        this.stopMidi(860);
                    }
                    this.nextMusicDelay = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.waveEnabled = true;
                    this.setWaveVolume((byte) 2, 0);
                }
                if (var4 == 1) {
                    this.waveEnabled = true;
                    this.setWaveVolume((byte) 2, -400);
                }
                if (var4 == 2) {
                    this.waveEnabled = true;
                    this.setWaveVolume((byte) 2, -800);
                }
                if (var4 == 3) {
                    this.waveEnabled = true;
                    this.setWaveVolume((byte) 2, -1200);
                }
                if (var4 == 4) {
                    this.waveEnabled = false;
                }
            }
            if (var3 == 5) {
                this.mouseButtonsOption = var4;
            }
            if (var3 == 6) {
                this.chatEffects = var4;
            }
            if (var3 == 8) {
                this.splitPrivateChat = var4;
                this.redrawChatback = true;
            }
            if (var3 == 9) {
                this.bankArrangeMode = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void draw2DEntityElements(int arg0) {
        this.chatCount = 0;
        int var6;
        int var14;
        for (int var2 = -1; var2 < this.playerCount + this.npcCount; var2++) {
            PathingEntity var3;
            if (var2 == -1) {
                var3 = localPlayer;
            } else if (var2 < this.playerCount) {
                var3 = this.players[this.playerIds[var2]];
            } else {
                var3 = this.npcs[this.npcIds[var2 - this.playerCount]];
            }
            if (var3 != null && var3.isVisible(_flowObfuscator41)) {
                NpcType var4;
                if (var3 instanceof NpcEntity) {
                    var4 = ((NpcEntity) var3).type;
                    if (var4.multinpc != null) {
                        var4 = var4.getMultiNpc(this._flowObfuscator10);
                    }
                    if (var4 == null) {
                        continue;
                    }
                }
                if (var2 >= this.playerCount) {
                    var4 = ((NpcEntity) var3).type;
                    if (var4.headicon >= 0 && var4.headicon < this.imageHeadicons.length) {
                        this.projectFromGround(true, var3, var3.height + 15);
                        if (this.projectX > -1) {
                            this.imageHeadicons[var4.headicon].draw(this.projectX - 12, 16083, this.projectY - 30);
                        }
                    }
                    if (this.hintType == 1 && this.hintNpc == this.npcIds[var2 - this.playerCount] && loopCycle % 20 < 10) {
                        this.projectFromGround(true, var3, var3.height + 15);
                        if (this.projectX > -1) {
                            this.imageHeadicons[2].draw(this.projectX - 12, 16083, this.projectY - 28);
                        }
                    }
                } else {
                    var14 = 30;
                    PlayerEntity var5 = (PlayerEntity) var3;
                    if (var5.headicons != 0) {
                        this.projectFromGround(true, var3, var3.height + 15);
                        if (this.projectX > -1) {
                            for (var6 = 0; var6 < 8; var6++) {
                                if ((var5.headicons & 1 << var6) != 0) {
                                    this.imageHeadicons[var6].draw(this.projectX - 12, 16083, this.projectY - var14);
                                    var14 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.hintType == 10 && this.hintPlayer == this.playerIds[var2]) {
                        this.projectFromGround(true, var3, var3.height + 15);
                        if (this.projectX > -1) {
                            this.imageHeadicons[7].draw(this.projectX - 12, 16083, this.projectY - var14);
                        }
                    }
                }
                if (var3.chat != null && (var2 >= this.playerCount || this.publicChatSetting == 0 || this.publicChatSetting == 3 || this.publicChatSetting == 1 && this.isFriend(false, ((PlayerEntity) var3).name))) {
                    this.projectFromGround(true, var3, var3.height);
                    if (this.projectX > -1 && this.chatCount < this.MAX_CHATS) {
                        this.chatWidth[this.chatCount] = this.fontBold12.stringWidth(var3.chat, true) / 2;
                        this.chatHeight[this.chatCount] = this.fontBold12.height;
                        this.chatX[this.chatCount] = this.projectX;
                        this.chatY[this.chatCount] = this.projectY;
                        this.chatColors[this.chatCount] = var3.chatColor;
                        this.chatStyles[this.chatCount] = var3.chatStyle;
                        this.chatTimers[this.chatCount] = var3.chatTimer;
                        this.chats[this.chatCount++] = var3.chat;
                        if (this.chatEffects == 0 && var3.chatStyle >= 1 && var3.chatStyle <= 3) {
                            this.chatHeight[this.chatCount] += 10;
                            this.chatY[this.chatCount] += 5;
                        }
                        if (this.chatEffects == 0 && var3.chatStyle == 4) {
                            this.chatWidth[this.chatCount] = 60;
                        }
                        if (this.chatEffects == 0 && var3.chatStyle == 5) {
                            this.chatHeight[this.chatCount] += 5;
                        }
                    }
                }
                if (var3.combatCycle > loopCycle) {
                    this.projectFromGround(true, var3, var3.height + 15);
                    if (this.projectX > -1) {
                        var14 = var3.health * 30 / var3.totalHealth;
                        if (var14 > 30) {
                            var14 = 30;
                        }
                        Draw2D.fillRect(5, this.projectY - 3, this.projectX - 15, 65280, var14, 0);
                        Draw2D.fillRect(5, this.projectY - 3, this.projectX - 15 + var14, 16711680, 30 - var14, 0);
                    }
                }
                for (var14 = 0; var14 < 4; var14++) {
                    if (var3.damageCycle[var14] > loopCycle) {
                        this.projectFromGround(true, var3, var3.height / 2);
                        if (this.projectX > -1) {
                            if (var14 == 1) {
                                this.projectY -= 20;
                            }
                            if (var14 == 2) {
                                this.projectX -= 15;
                                this.projectY -= 10;
                            }
                            if (var14 == 3) {
                                this.projectX += 15;
                                this.projectY -= 10;
                            }
                            this.imageHitmarks[var3.damageType[var14]].draw(this.projectX - 12, 16083, this.projectY - 12);
                            this.fontPlain11.drawStringCenter(0, String.valueOf(var3.damage[var14]), 23693, this.projectY + 4, this.projectX);
                            this.fontPlain11.drawStringCenter(16777215, String.valueOf(var3.damage[var14]), 23693, this.projectY + 3, this.projectX - 1);
                        }
                    }
                }
            }
        }
        if (arg0 != 0) {
            this.load();
        }
        for (int var13 = 0; var13 < this.chatCount; var13++) {
            var14 = this.chatX[var13];
            int var15 = this.chatY[var13];
            var6 = this.chatWidth[var13];
            int var7 = this.chatHeight[var13];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var9 = 0; var9 < var13; var9++) {
                    if (var15 + 2 > this.chatY[var9] - this.chatHeight[var9] && var15 - var7 < this.chatY[var9] + 2 && var14 - var6 < this.chatX[var9] + this.chatWidth[var9] && var14 + var6 > this.chatX[var9] - this.chatWidth[var9] && this.chatY[var9] - this.chatHeight[var9] < var15) {
                        var15 = this.chatY[var9] - this.chatHeight[var9];
                        var8 = true;
                    }
                }
            }
            this.projectX = this.chatX[var13];
            this.projectY = this.chatY[var13] = var15;
            String var16 = this.chats[var13];
            if (this.chatEffects == 0) {
                int var10 = 16776960;
                if (this.chatColors[var13] < 6) {
                    var10 = this.CHAT_COLORS[this.chatColors[var13]];
                }
                if (this.chatColors[var13] == 6) {
                    var10 = this.sceneCycle % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.chatColors[var13] == 7) {
                    var10 = this.sceneCycle % 20 < 10 ? 255 : 65535;
                }
                if (this.chatColors[var13] == 8) {
                    var10 = this.sceneCycle % 20 < 10 ? 45056 : 8454016;
                }
                int var11;
                if (this.chatColors[var13] == 9) {
                    var11 = 150 - this.chatTimers[var13];
                    if (var11 < 50) {
                        var10 = 16711680 + 1280 * var11;
                    } else if (var11 < 100) {
                        var10 = 16776960 - 327680 * (var11 - 50);
                    } else if (var11 < 150) {
                        var10 = 65280 + 5 * (var11 - 100);
                    }
                }
                if (this.chatColors[var13] == 10) {
                    var11 = 150 - this.chatTimers[var13];
                    if (var11 < 50) {
                        var10 = 16711680 + 5 * var11;
                    } else if (var11 < 100) {
                        var10 = 16711935 - 327680 * (var11 - 50);
                    } else if (var11 < 150) {
                        var10 = 255 + 327680 * (var11 - 100) - 5 * (var11 - 100);
                    }
                }
                if (this.chatColors[var13] == 11) {
                    var11 = 150 - this.chatTimers[var13];
                    if (var11 < 50) {
                        var10 = 16777215 - 327685 * var11;
                    } else if (var11 < 100) {
                        var10 = 65280 + 327685 * (var11 - 50);
                    } else if (var11 < 150) {
                        var10 = 16777215 - 327680 * (var11 - 100);
                    }
                }
                if (this.chatStyles[var13] == 0) {
                    this.fontBold12.drawStringCenter(0, var16, 23693, this.projectY + 1, this.projectX);
                    this.fontBold12.drawStringCenter(var10, var16, 23693, this.projectY, this.projectX);
                }
                if (this.chatStyles[var13] == 1) {
                    this.fontBold12.drawStringWave(0, true, var16, this.projectX, this.sceneCycle, this.projectY + 1);
                    this.fontBold12.drawStringWave(var10, true, var16, this.projectX, this.sceneCycle, this.projectY);
                }
                if (this.chatStyles[var13] == 2) {
                    this.fontBold12.drawStringWave2(this.projectX, var16, this.sceneCycle, this.projectY + 1, this._flowObfuscator36, 0);
                    this.fontBold12.drawStringWave2(this.projectX, var16, this.sceneCycle, this.projectY, this._flowObfuscator36, var10);
                }
                if (this.chatStyles[var13] == 3) {
                    this.fontBold12.drawStringShake(150 - this.chatTimers[var13], var16, true, this.sceneCycle, this.projectY + 1, this.projectX, 0);
                    this.fontBold12.drawStringShake(150 - this.chatTimers[var13], var16, true, this.sceneCycle, this.projectY, this.projectX, var10);
                }
                int var12;
                if (this.chatStyles[var13] == 4) {
                    var11 = this.fontBold12.stringWidth(var16, true);
                    var12 = (150 - this.chatTimers[var13]) * (var11 + 100) / 150;
                    Draw2D.setBounds(334, this.projectX - 50, false, this.projectX + 50, 0);
                    this.fontBold12.drawString(0, var16, this.projectY + 1, 822, this.projectX + 50 - var12);
                    this.fontBold12.drawString(var10, var16, this.projectY, 822, this.projectX + 50 - var12);
                    Draw2D.resetBounds(4);
                }
                if (this.chatStyles[var13] == 5) {
                    var11 = 150 - this.chatTimers[var13];
                    var12 = 0;
                    if (var11 < 25) {
                        var12 = var11 - 25;
                    } else if (var11 > 125) {
                        var12 = var11 - 125;
                    }
                    Draw2D.setBounds(this.projectY + 5, 0, false, 512, this.projectY - this.fontBold12.height - 1);
                    this.fontBold12.drawStringCenter(0, var16, 23693, this.projectY + 1 + var12, this.projectX);
                    this.fontBold12.drawStringCenter(var10, var16, 23693, this.projectY + var12, this.projectX);
                    Draw2D.resetBounds(4);
                }
            } else {
                this.fontBold12.drawStringCenter(0, var16, 23693, this.projectY + 1, this.projectX);
                this.fontBold12.drawStringCenter(16776960, var16, 23693, this.projectY, this.projectX);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
    public final void removeFriend(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.friendCount; var4++) {
                if (this.friendName37[var4] == arg1) {
                    this.friendCount--;
                    this.redrawSidebar = true;
                    for (int var5 = var4; var5 < this.friendCount; var5++) {
                        this.friendName[var5] = this.friendName[var5 + 1];
                        this.friendWorld[var5] = this.friendWorld[var5 + 1];
                        this.friendName37[var5] = this.friendName37[var5 + 1];
                    }
                    this.out.p1isaac((byte) 6, 215);
                    this.out.p8(5, arg1);
                    break;
                }
            }
            if (!arg0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void drawSidebar(byte arg0) {
        this.areaSidebar.bind(0);
        Draw3D.lineOffset = this.areaSidebarOffsets;
        if (arg0 == -81) {
            this.imageInvback.draw(0, 16083, 0);
            if (this.sidebarInterfaceId != -1) {
                this.drawInterface(8, 0, 0, Component.instances[this.sidebarInterfaceId], 0);
            } else if (this.tabInterfaceId[this.selectedTab] != -1) {
                this.drawInterface(8, 0, 0, Component.instances[this.tabInterfaceId[this.selectedTab]], 0);
            }
            if (this.menuVisible && this.menuArea == 1) {
                this.drawMenu((byte) 9);
            }
            this.areaSidebar.draw(205, 23680, super.graphics, 553);
            this.areaViewport.bind(0);
            Draw3D.lineOffset = this.areaViewportOffsets;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
    public final void updateTextures(int arg0, int arg1) {
        if (arg0 <= 0) {
            this.packetType = -1;
        }
        if (!lowMemory) {
            Pix8 var3;
            int var4;
            int var5;
            byte[] var6;
            byte[] var7;
            int var8;
            if (Draw3D.textureCycle[17] >= arg1) {
                var3 = Draw3D.textures[17];
                var4 = var3.cropRight * var3.cropBottom - 1;
                var5 = var3.cropRight * this.sceneDelta * 2;
                var6 = var3.pixels;
                var7 = this.textureBuffer;
                for (var8 = 0; var8 <= var4; var8++) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.pixels = var7;
                this.textureBuffer = var6;
                Draw3D.pushTexture(17, -477);
                cyclelogic2++;
                if (cyclelogic2 > 1235) {
                    cyclelogic2 = 0;
                    this.out.p1isaac((byte) 6, 226);
                    this.out.p1(0);
                    int var9 = this.out.pos;
                    this.out.p2(58722);
                    this.out.p1(240);
                    this.out.p2((int) (Math.random() * 65536.0D));
                    this.out.p1((int) (Math.random() * 256.0D));
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.out.p2(51825);
                    }
                    this.out.p1((int) (Math.random() * 256.0D));
                    this.out.p2((int) (Math.random() * 65536.0D));
                    this.out.p2(7130);
                    this.out.p2((int) (Math.random() * 65536.0D));
                    this.out.p2(61657);
                    this.out.psize1(this.out.pos - var9, (byte) 0);
                }
            }
            if (Draw3D.textureCycle[24] >= arg1) {
                var3 = Draw3D.textures[24];
                var4 = var3.cropRight * var3.cropBottom - 1;
                var5 = var3.cropRight * this.sceneDelta * 2;
                var6 = var3.pixels;
                var7 = this.textureBuffer;
                for (var8 = 0; var8 <= var4; var8++) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.pixels = var7;
                this.textureBuffer = var6;
                Draw3D.pushTexture(24, -477);
            }
            if (Draw3D.textureCycle[34] >= arg1) {
                var3 = Draw3D.textures[34];
                var4 = var3.cropRight * var3.cropBottom - 1;
                var5 = var3.cropRight * this.sceneDelta * 2;
                var6 = var3.pixels;
                var7 = this.textureBuffer;
                for (var8 = 0; var8 <= var4; var8++) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.pixels = var7;
                this.textureBuffer = var6;
                Draw3D.pushTexture(34, -477);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void updateEntityChats(byte arg0) {
        if (arg0 != -92) {
            this.out.p1(214);
        }
        int var3;
        for (int var2 = -1; var2 < this.playerCount; var2++) {
            if (var2 == -1) {
                var3 = this.LOCAL_PLAYER_INDEX;
            } else {
                var3 = this.playerIds[var2];
            }
            PlayerEntity var4 = this.players[var3];
            if (var4 != null && var4.chatTimer > 0) {
                var4.chatTimer--;
                if (var4.chatTimer == 0) {
                    var4.chat = null;
                }
            }
        }
        for (var3 = 0; var3 < this.npcCount; var3++) {
            int var6 = this.npcIds[var3];
            NpcEntity var5 = this.npcs[var6];
            if (var5 != null && var5.chatTimer > 0) {
                var5.chatTimer--;
                if (var5.chatTimer == 0) {
                    var5.chat = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void applyCutscene(byte arg0) {
        int var2 = this.cutsceneSrcLocalTileX * 128 + 64;
        int var3 = this.cutsceneSrcLocalTileZ * 128 + 64;
        int var4 = this.getHeightmapY(this.currentLevel, var3, true, var2) - this.cutsceneSrcHeight;
        if (this.cameraX < var2) {
            this.cameraX += this.cutsceneMoveSpeed + (var2 - this.cameraX) * this.cutsceneMoveAcceleration / 1000;
            if (this.cameraX > var2) {
                this.cameraX = var2;
            }
        }
        if (this.cameraX > var2) {
            this.cameraX -= this.cutsceneMoveSpeed + (this.cameraX - var2) * this.cutsceneMoveAcceleration / 1000;
            if (this.cameraX < var2) {
                this.cameraX = var2;
            }
        }
        if (this.cameraY < var4) {
            this.cameraY += this.cutsceneMoveSpeed + (var4 - this.cameraY) * this.cutsceneMoveAcceleration / 1000;
            if (this.cameraY > var4) {
                this.cameraY = var4;
            }
        }
        if (this.cameraY > var4) {
            this.cameraY -= this.cutsceneMoveSpeed + (this.cameraY - var4) * this.cutsceneMoveAcceleration / 1000;
            if (this.cameraY < var4) {
                this.cameraY = var4;
            }
        }
        if (this.cameraZ < var3) {
            this.cameraZ += this.cutsceneMoveSpeed + (var3 - this.cameraZ) * this.cutsceneMoveAcceleration / 1000;
            if (this.cameraZ > var3) {
                this.cameraZ = var3;
            }
        }
        if (this.cameraZ > var3) {
            this.cameraZ -= this.cutsceneMoveSpeed + (this.cameraZ - var3) * this.cutsceneMoveAcceleration / 1000;
            if (this.cameraZ < var3) {
                this.cameraZ = var3;
            }
        }
        var2 = this.cutsceneDstLocalTileX * 128 + 64;
        var3 = this.cutsceneDstLocalTileZ * 128 + 64;
        var4 = this.getHeightmapY(this.currentLevel, var3, true, var2) - this.cutsceneDstHeight;
        int var5 = var2 - this.cameraX;
        int var6 = var4 - this.cameraY;
        int var7 = var3 - this.cameraZ;
        int var8 = (int) Math.sqrt((double) (var5 * var5 + var7 * var7));
        int var9 = (int) (Math.atan2((double) var6, (double) var8) * 325.949D) & 2047;
        if (arg0 == 5) {
            boolean var13 = false;
        }
        int var10 = (int) (Math.atan2((double) var5, (double) var7) * -325.949D) & 2047;
        if (var9 < 128) {
            var9 = 128;
        }
        if (var9 > 383) {
            var9 = 383;
        }
        if (this.cameraPitch < var9) {
            this.cameraPitch += this.cutsceneRotateSpeed + (var9 - this.cameraPitch) * this.cutsceneRotateAcceleration / 1000;
            if (this.cameraPitch > var9) {
                this.cameraPitch = var9;
            }
        }
        if (this.cameraPitch > var9) {
            this.cameraPitch -= this.cutsceneRotateSpeed + (this.cameraPitch - var9) * this.cutsceneRotateAcceleration / 1000;
            if (this.cameraPitch < var9) {
                this.cameraPitch = var9;
            }
        }
        int var11 = var10 - this.cameraYaw;
        if (var11 > 1024) {
            var11 -= 2048;
        }
        if (var11 < -1024) {
            var11 += 2048;
        }
        if (var11 > 0) {
            this.cameraYaw += this.cutsceneRotateSpeed + var11 * this.cutsceneRotateAcceleration / 1000;
            this.cameraYaw &= 2047;
        }
        if (var11 < 0) {
            this.cameraYaw -= this.cutsceneRotateSpeed + -var11 * this.cutsceneRotateAcceleration / 1000;
            this.cameraYaw &= 2047;
        }
        int var12 = var10 - this.cameraYaw;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 < 0 && var11 > 0 || var12 > 0 && var11 < 0) {
            this.cameraYaw = var10;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void drawMenu(byte arg0) {
        int var2 = this.menuX;
        int var3 = this.menuY;
        int var4 = this.menuWidth;
        int var5 = this.menuHeight;
        int var6 = 6116423;
        Draw2D.fillRect(var5, var3, var2, var6, var4, 0);
        if (arg0 == 9) {
            boolean var12 = false;
            Draw2D.fillRect(16, var3 + 1, var2 + 1, 0, var4 - 2, 0);
            Draw2D.drawRect(var2 + 1, var4 - 2, var5 - 19, 0, var3 + 18, true);
            this.fontBold12.drawString(var6, "Choose Option", var3 + 14, 822, var2 + 3);
            int var7 = super.mouseX;
            int var8 = super.mouseY;
            if (this.menuArea == 0) {
                var7 -= 4;
                var8 -= 4;
            }
            if (this.menuArea == 1) {
                var7 -= 553;
                var8 -= 205;
            }
            if (this.menuArea == 2) {
                var7 -= 17;
                var8 -= 357;
            }
            for (int var9 = 0; var9 < this.menuSize; var9++) {
                int var10 = var3 + 31 + (this.menuSize - 1 - var9) * 15;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                this.fontBold12.drawStringTag(false, true, var2 + 3, var11, this.menuOption[var9], var10);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
    public final void addFriend(byte arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.friendCount >= 100 && this.isMember != 1) {
                this.addMessage("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", this._flowObfuscator21);
            } else if (this.friendCount >= 200) {
                this.addMessage("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", this._flowObfuscator21);
            } else {
                String var4 = JString.toSentenceCase(-45804, JString.fromBase37(arg1, (byte) -99));
                for (int var5 = 0; var5 < this.friendCount; var5++) {
                    if (this.friendName37[var5] == arg1) {
                        this.addMessage(var4 + " is already on your friend list", 0, "", this._flowObfuscator21);
                        return;
                    }
                }
                if (arg0 != 68) {
                    this.packetType = -1;
                }
                for (int var6 = 0; var6 < this.ignoreCount; var6++) {
                    if (this.ignoreName37[var6] == arg1) {
                        this.addMessage("Please remove " + var4 + " from your ignore list first", 0, "", this._flowObfuscator21);
                        return;
                    }
                }
                if (!var4.equals(localPlayer.name)) {
                    this.friendName[this.friendCount] = var4;
                    this.friendName37[this.friendCount] = arg1;
                    this.friendWorld[this.friendCount] = 0;
                    this.friendCount++;
                    this.redrawSidebar = true;
                    this.out.p1isaac((byte) 6, 188);
                    this.out.p8(5, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)I")
    public final int getHeightmapY(int arg0, int arg1, boolean arg2, int arg3) {
        this.ingame &= arg2;
        int var5 = arg3 >> 7;
        int var6 = arg1 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg0;
            if (arg0 < 3 && (this.levelTileFlags[1][var5][var6] & 2) == 2) {
                var7 = arg0 + 1;
            }
            int var8 = arg3 & 127;
            int var9 = arg1 & 127;
            int var10 = this.levelHeightmap[var7][var5][var6] * (128 - var8) + this.levelHeightmap[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = this.levelHeightmap[var7][var5][var6 + 1] * (128 - var8) + this.levelHeightmap[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return var10 * (128 - var9) + var11 * var9 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
    private static final String formatObjCount(int arg0, int arg1) {
        if (arg0 != -33245) {
            _flowObfuscator8 = -65;
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void logout(boolean arg0) {
        try {
            if (this.stream != null) {
                this.stream.close();
            }
        } catch (Exception var3) {
        }
        this.stream = null;
        if (arg0) {
            this.ingame = false;
            this.titleScreenState = 0;
            this.username = "";
            this.password = "";
            this.clearCache(false);
            this.scene.reset(619);
            for (int var2 = 0; var2 < 4; var2++) {
                this.levelCollisionMap[var2].reset();
            }
            System.gc();
            this.stopMidi(860);
            this.nextMidiSong = -1;
            this.midiSong = -1;
            this.nextMusicDelay = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void validateCharacterDesign(int arg0) {
        if (arg0 != 0) {
            this.packetType = -1;
        }
        this.updateDesignModel = true;
        for (int var2 = 0; var2 < 7; var2++) {
            this.designIdentikits[var2] = -1;
            for (int var3 = 0; var3 < IdkType.count; var3++) {
                if (!IdkType.instances[var3].disable && IdkType.instances[var3].type == var2 + (this.designGenderMale ? 0 : 7)) {
                    this.designIdentikits[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILMBMGIXGO;B)V")
    private final void readNewNpcs(int arg0, Packet arg1, byte arg2) {
        int var4;
        if (arg2 != 2) {
            for (var4 = 1; var4 > 0; var4++) {
            }
        }
        while (arg1.bitPos + 21 < arg0 * 8) {
            var4 = arg1.gBit(14, 0);
            if (var4 == 16383) {
                break;
            }
            if (this.npcs[var4] == null) {
                this.npcs[var4] = new NpcEntity();
            }
            NpcEntity var5 = this.npcs[var4];
            this.npcIds[this.npcCount++] = var4;
            var5.cycle = loopCycle;
            int var6 = arg1.gBit(5, 0);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg1.gBit(5, 0);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg1.gBit(1, 0);
            var5.type = NpcType.get(arg1.gBit(12, 0));
            int var9 = arg1.gBit(1, 0);
            if (var9 == 1) {
                this.entityUpdateIds[this.entityUpdateCount++] = var4;
            }
            var5.size = var5.type.size;
            var5.turnSpeed = var5.type.turnspeed;
            var5.seqWalkId = var5.type.walkanim;
            var5.seqTurnAroundId = var5.type.walkanim_b;
            var5.seqTurnLeftId = var5.type.walkanim_r;
            var5.seqTurnRightId = var5.type.walkanim_l;
            var5.seqStandId = var5.type.readyanim;
            var5.move(localPlayer.pathTileX[0] + var7, localPlayer.pathTileZ[0] + var6, var8 == 1, false);
        }
        arg1.accessBytes(true);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void update(int arg0) {
        if (!this.errorStarted && !this.errorLoading && !this.errorHost) {
            loopCycle++;
            if (!this.ingame) {
                this.updateTitle(true);
            } else {
                this.updateGame(this._flowObfuscator40);
            }
            this.handleOnDemandRequests(false);
            if (arg0 != this._flowObfuscator27) {
                _flowObfuscator14 = true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    public final void pushPlayers(int arg0, boolean arg1) {
        if (localPlayer.x >> 7 == this.flagSceneTileX && localPlayer.z >> 7 == this.flagSceneTileZ) {
            this.flagSceneTileX = 0;
        }
        int var3 = this.playerCount;
        int var4;
        if (arg0 != 0) {
            for (var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1) {
            var3 = 1;
        }
        for (var4 = 0; var4 < var3; var4++) {
            PlayerEntity var5;
            int var6;
            if (arg1) {
                var5 = localPlayer;
                var6 = this.LOCAL_PLAYER_INDEX << 14;
            } else {
                var5 = this.players[this.playerIds[var4]];
                var6 = this.playerIds[var4] << 14;
            }
            if (var5 != null && var5.isVisible(_flowObfuscator41)) {
                var5.lowmem = false;
                if ((lowMemory && this.playerCount > 50 || this.playerCount > 200) && !arg1 && var5.secondarySeqId == var5.seqStandId) {
                    var5.lowmem = true;
                }
                int var7 = var5.x >> 7;
                int var8 = var5.z >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.locModel != null && loopCycle >= var5.locStartCycle && loopCycle < var5.locStopCycle) {
                        var5.lowmem = false;
                        var5.y = this.getHeightmapY(this.currentLevel, var5.z, true, var5.x);
                        this.scene.addTemporary(60, this.currentLevel, var5.z, var5, var5.yaw, var5.maxTileZ, var5.x, var5.y, var5.minTileX, var5.maxTileX, var6, var5.minTileZ, (byte) 35);
                    } else {
                        if ((var5.x & 127) == 64 && (var5.z & 127) == 64) {
                            if (this.tileLastOccupiedCycle[var7][var8] == this.sceneCycle) {
                                continue;
                            }
                            this.tileLastOccupiedCycle[var7][var8] = this.sceneCycle;
                        }
                        var5.y = this.getHeightmapY(this.currentLevel, var5.z, true, var5.x);
                        this.scene.addTemporary(this.currentLevel, var5.yaw, (byte) 6, var5.y, var6, var5.z, 60, var5.x, var5, var5.needsForwardDrawPadding);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILDUCMKFAY;)Z")
    public final boolean handleInterfaceAction(int arg0, Component arg1) {
        if (arg0 <= 0) {
            this.packetType = -1;
        }
        int var3 = arg1.clientCode;
        if (this.friendListStatus == 2) {
            if (var3 == 201) {
                this.redrawChatback = true;
                this.chatbackInputOpen = 0;
                this.showSocialInput = true;
                this.socialInput = "";
                this.socialAction = 1;
                this.socialMessage = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.redrawChatback = true;
                this.chatbackInputOpen = 0;
                this.showSocialInput = true;
                this.socialInput = "";
                this.socialAction = 2;
                this.socialMessage = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.idleTimeout = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.redrawChatback = true;
                this.chatbackInputOpen = 0;
                this.showSocialInput = true;
                this.socialInput = "";
                this.socialAction = 4;
                this.socialMessage = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.redrawChatback = true;
                this.chatbackInputOpen = 0;
                this.showSocialInput = true;
                this.socialInput = "";
                this.socialAction = 5;
                this.socialMessage = "Enter name of player to delete from list";
            }
            int var4;
            int var5;
            int var6;
            if (var3 >= 300 && var3 <= 313) {
                var4 = (var3 - 300) / 2;
                var5 = var3 & 1;
                var6 = this.designIdentikits[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            var6--;
                            if (var6 < 0) {
                                var6 = IdkType.count - 1;
                            }
                        }
                        if (var5 == 1) {
                            var6++;
                            if (var6 >= IdkType.count) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.instances[var6].disable && IdkType.instances[var6].type == var4 + (this.designGenderMale ? 0 : 7)) {
                            this.designIdentikits[var4] = var6;
                            this.updateDesignModel = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                var4 = (var3 - 314) / 2;
                var5 = var3 & 1;
                var6 = this.designColors[var4];
                if (var5 == 0) {
                    var6--;
                    if (var6 < 0) {
                        var6 = DESIGN_BODY_COLOR[var4].length - 1;
                    }
                }
                if (var5 == 1) {
                    var6++;
                    if (var6 >= DESIGN_BODY_COLOR[var4].length) {
                        var6 = 0;
                    }
                }
                this.designColors[var4] = var6;
                this.updateDesignModel = true;
            }
            if (var3 == 324 && !this.designGenderMale) {
                this.designGenderMale = true;
                this.validateCharacterDesign(0);
            }
            if (var3 == 325 && this.designGenderMale) {
                this.designGenderMale = false;
                this.validateCharacterDesign(0);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.reportAbuseMuteOption = !this.reportAbuseMuteOption;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.closeInterfaces(537);
                    if (this.reportAbuseInput.length() > 0) {
                        this.out.p1isaac((byte) 6, 218);
                        this.out.p8(5, JString.toBase37(this.reportAbuseInput));
                        this.out.p1(var3 - 601);
                        this.out.p1(this.reportAbuseMuteOption ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.out.p1isaac((byte) 6, 101);
                this.out.p1(this.designGenderMale ? 0 : 1);
                for (var4 = 0; var4 < 7; var4++) {
                    this.out.p1(this.designIdentikits[var4]);
                }
                for (var5 = 0; var5 < 5; var5++) {
                    this.out.p1(this.designColors[var5]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLMBMGIXGO;)V")
    private final void readPlayerUpdates(int arg0, byte arg1, Packet arg2) {
        if (arg1 == 2) {
            boolean var8 = false;
            for (int var4 = 0; var4 < this.entityUpdateCount; var4++) {
                int var5 = this.entityUpdateIds[var4];
                PlayerEntity var6 = this.players[var5];
                int var7 = arg2.g1();
                if ((var7 & 64) != 0) {
                    var7 += arg2.g1() << 8;
                }
                this.readPlayerUpdates(var7, var5, arg2, this._flowObfuscator17, var6);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
    public final void drawMinimapLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.scene.getWallBitset(arg5, arg3, arg0);
        if (arg1 < 0) {
            int var8;
            int var9;
            int var10;
            int var11;
            int var13;
            int var14;
            if (var7 != 0) {
                var8 = this.scene.getInfo(arg5, arg3, arg0, var7);
                var9 = var8 >> 6 & 3;
                var10 = var8 & 31;
                var11 = arg2;
                if (var7 > 0) {
                    var11 = arg4;
                }
                int[] var12 = this.imageMinimap.pixels;
                var13 = 24624 + arg3 * 4 + (103 - arg0) * 512 * 4;
                var14 = var7 >> 14 & 32767;
                LocType var15 = LocType.get(var14);
                if (var15.mapscene != -1) {
                    Pix8 var16 = this.imageMapscene[var15.mapscene];
                    if (var16 != null) {
                        int var17 = (var15.width * 4 - var16.cropRight) / 2;
                        int var18 = (var15.length * 4 - var16.cropBottom) / 2;
                        var16.draw(48 + arg3 * 4 + var17, 16083, 48 + (104 - arg0 - var15.length) * 4 + var18);
                    }
                } else {
                    if (var10 == 0 || var10 == 2) {
                        if (var9 == 0) {
                            var12[var13] = var11;
                            var12[var13 + 512] = var11;
                            var12[var13 + 1024] = var11;
                            var12[var13 + 1536] = var11;
                        } else if (var9 == 1) {
                            var12[var13] = var11;
                            var12[var13 + 1] = var11;
                            var12[var13 + 2] = var11;
                            var12[var13 + 3] = var11;
                        } else if (var9 == 2) {
                            var12[var13 + 3] = var11;
                            var12[var13 + 3 + 512] = var11;
                            var12[var13 + 3 + 1024] = var11;
                            var12[var13 + 3 + 1536] = var11;
                        } else if (var9 == 3) {
                            var12[var13 + 1536] = var11;
                            var12[var13 + 1536 + 1] = var11;
                            var12[var13 + 1536 + 2] = var11;
                            var12[var13 + 1536 + 3] = var11;
                        }
                    }
                    if (var10 == 3) {
                        if (var9 == 0) {
                            var12[var13] = var11;
                        } else if (var9 == 1) {
                            var12[var13 + 3] = var11;
                        } else if (var9 == 2) {
                            var12[var13 + 3 + 1536] = var11;
                        } else if (var9 == 3) {
                            var12[var13 + 1536] = var11;
                        }
                    }
                    if (var10 == 2) {
                        if (var9 == 3) {
                            var12[var13] = var11;
                            var12[var13 + 512] = var11;
                            var12[var13 + 1024] = var11;
                            var12[var13 + 1536] = var11;
                        } else if (var9 == 0) {
                            var12[var13] = var11;
                            var12[var13 + 1] = var11;
                            var12[var13 + 2] = var11;
                            var12[var13 + 3] = var11;
                        } else if (var9 == 1) {
                            var12[var13 + 3] = var11;
                            var12[var13 + 3 + 512] = var11;
                            var12[var13 + 3 + 1024] = var11;
                            var12[var13 + 3 + 1536] = var11;
                        } else if (var9 == 2) {
                            var12[var13 + 1536] = var11;
                            var12[var13 + 1536 + 1] = var11;
                            var12[var13 + 1536 + 2] = var11;
                            var12[var13 + 1536 + 3] = var11;
                        }
                    }
                }
            }
            var7 = this.scene.getLocBitset(arg5, arg3, arg0);
            if (var7 != 0) {
                var8 = this.scene.getInfo(arg5, arg3, arg0, var7);
                var9 = var8 >> 6 & 3;
                var10 = var8 & 31;
                var11 = var7 >> 14 & 32767;
                LocType var21 = LocType.get(var11);
                int var25;
                if (var21.mapscene != -1) {
                    Pix8 var23 = this.imageMapscene[var21.mapscene];
                    if (var23 != null) {
                        var14 = (var21.width * 4 - var23.cropRight) / 2;
                        var25 = (var21.length * 4 - var23.cropBottom) / 2;
                        var23.draw(48 + arg3 * 4 + var14, 16083, 48 + (104 - arg0 - var21.length) * 4 + var25);
                    }
                } else if (var10 == 9) {
                    var13 = 15658734;
                    if (var7 > 0) {
                        var13 = 15597568;
                    }
                    int[] var24 = this.imageMinimap.pixels;
                    var25 = 24624 + arg3 * 4 + (103 - arg0) * 512 * 4;
                    if (var9 != 0 && var9 != 2) {
                        var24[var25] = var13;
                        var24[var25 + 512 + 1] = var13;
                        var24[var25 + 1024 + 2] = var13;
                        var24[var25 + 1536 + 3] = var13;
                    } else {
                        var24[var25 + 1536] = var13;
                        var24[var25 + 1024 + 1] = var13;
                        var24[var25 + 512 + 2] = var13;
                        var24[var25 + 3] = var13;
                    }
                }
            }
            var7 = this.scene.getGroundDecorationBitset(arg5, arg3, arg0);
            if (var7 != 0) {
                var8 = var7 >> 14 & 32767;
                LocType var19 = LocType.get(var8);
                if (var19.mapscene != -1) {
                    Pix8 var20 = this.imageMapscene[var19.mapscene];
                    if (var20 != null) {
                        var11 = (var19.width * 4 - var20.cropRight) / 2;
                        int var22 = (var19.length * 4 - var20.cropBottom) / 2;
                        var20.draw(48 + arg3 * 4 + var11, 16083, 48 + (104 - arg0 - var19.length) * 4 + var22);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public final void loadTitleImages(int arg0) {
        this.imageTitlebox = new Pix8(this.archiveTitle, "titlebox", 0);
        if (arg0 <= 0) {
            _flowObfuscator42 = !_flowObfuscator42;
        }
        this.imageTitlebutton = new Pix8(this.archiveTitle, "titlebutton", 0);
        this.imageRunes = new Pix8[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var17) {
        }
        int var3;
        if (var2 == 0) {
            for (var3 = 0; var3 < 12; var3++) {
                this.imageRunes[var3] = new Pix8(this.archiveTitle, "runes", var3);
            }
        } else {
            for (var3 = 0; var3 < 12; var3++) {
                this.imageRunes[var3] = new Pix8(this.archiveTitle, "runes", 12 + (var3 & 3));
            }
        }
        this.imageFlamesLeft = new Pix24(128, 265);
        this.imageFlamesRight = new Pix24(128, 265);
        for (var3 = 0; var3 < 33920; var3++) {
            this.imageFlamesLeft.pixels[var3] = this.imageTitle0.data[var3];
        }
        for (int var4 = 0; var4 < 33920; var4++) {
            this.imageFlamesRight.pixels[var4] = this.imageTitle1.data[var4];
        }
        this.flameGradient0 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.flameGradient0[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.flameGradient0[var6 + 64] = 16711680 + 1024 * var6;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.flameGradient0[var7 + 128] = 16776960 + 4 * var7;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.flameGradient0[var8 + 192] = 16777215;
        }
        this.flameGradient1 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.flameGradient1[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.flameGradient1[var10 + 64] = 65280 + 4 * var10;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.flameGradient1[var11 + 128] = 65535 + 262144 * var11;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.flameGradient1[var12 + 192] = 16777215;
        }
        this.flameGradient2 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            this.flameGradient2[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            this.flameGradient2[var14 + 64] = 255 + 262144 * var14;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            this.flameGradient2[var15 + 128] = 16711935 + 1024 * var15;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            this.flameGradient2[var16 + 192] = 16777215;
        }
        this.flameGradient = new int[256];
        this.flameBuffer0 = new int[32768];
        this.flameBuffer1 = new int[32768];
        this.updateFlameBuffer((Pix8) null, -135);
        this.flameBuffer3 = new int[32768];
        this.flameBuffer2 = new int[32768];
        this.drawProgress(10, (byte) 4, "Connecting to fileserver");
        if (!this.flameActive) {
            this.flamesThread = true;
            this.flameActive = true;
            this.startThread(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public static final void setHighMemory(boolean arg0) {
        World3D.lowMemory = false;
        Draw3D.lowMemory = false;
        lowMemory = false;
        World.lowMemory = false;
        if (arg0) {
            _flowObfuscator14 = true;
        }
        LocType.lowMemory = false;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 317);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                nodeId = Integer.parseInt(arg0[0]);
                portOffset = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    setLowMemory((byte) 77);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    setHighMemory(false);
                }
                if (arg0[3].equals("free")) {
                    members = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    members = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.initApplication(503, false, 765);
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    public final void updateSceneState(int arg0) {
        if (arg0 == -48877) {
            if (lowMemory && this.sceneState == 2 && World.levelBuilt != this.currentLevel) {
                this.areaViewport.bind(0);
                this.fontPlain12.drawStringCenter(0, "Loading - please wait.", 23693, 151, 257);
                this.fontPlain12.drawStringCenter(16777215, "Loading - please wait.", 23693, 150, 256);
                this.areaViewport.draw(4, 23680, super.graphics, 4);
                this.sceneState = 1;
                this.sceneLoadStartTime = System.currentTimeMillis();
            }
            if (this.sceneState == 1) {
                int var2 = this.checkScene((byte) -95);
                if (var2 != 0 && System.currentTimeMillis() - this.sceneLoadStartTime > 360000L) {
                    signlink.reporterror(this.username + " glcfb " + this.serverSeed + "," + var2 + "," + lowMemory + "," + this.fileStreams[0] + "," + this.ondemand.remaining() + "," + this.currentLevel + "," + this.sceneCenterZoneX + "," + this.sceneCenterZoneZ);
                    this.sceneLoadStartTime = System.currentTimeMillis();
                }
            }
            if (this.sceneState == 2 && this.currentLevel != this.minimapLevel) {
                this.minimapLevel = this.currentLevel;
                this.createMinimap(true, this.currentLevel);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)I")
    public final int checkScene(byte arg0) {
        for (int var2 = 0; var2 < this.sceneMapLandData.length; var2++) {
            if (this.sceneMapLandData[var2] == null && this.sceneMapLandFile[var2] != -1) {
                return -1;
            }
            if (this.sceneMapLocData[var2] == null && this.sceneMapLocFile[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        if (arg0 != -95) {
            return 0;
        } else {
            for (int var4 = 0; var4 < this.sceneMapLandData.length; var4++) {
                byte[] var5 = this.sceneMapLocData[var4];
                if (var5 != null) {
                    int var6 = (this.sceneMapIndex[var4] >> 8) * 64 - this.sceneBaseTileX;
                    int var7 = (this.sceneMapIndex[var4] & 255) * 64 - this.sceneBaseTileZ;
                    if (this.sceneInstanced) {
                        var6 = 10;
                        var7 = 10;
                    }
                    var3 &= World.validateLocs(var6, var5, var7, 6);
                }
            }
            if (!var3) {
                return -3;
            } else if (this.awaitingSync) {
                return -4;
            } else {
                this.sceneState = 2;
                World.levelBuilt = this.currentLevel;
                this.buildScene(true);
                this.out.p1isaac((byte) 6, 121);
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void pushProjectiles(int arg0) {
        while (arg0 >= 0) {
            this.load();
        }
        for (ProjectileEntity var2 = (ProjectileEntity) this.projectiles.head(); var2 != null; var2 = (ProjectileEntity) this.projectiles.next(false)) {
            if (var2.level == this.currentLevel && loopCycle <= var2.endCycle) {
                if (loopCycle >= var2.startCycle) {
                    if (var2.target > 0) {
                        NpcEntity var3 = this.npcs[var2.target - 1];
                        if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.z >= 0 && var3.z < 13312) {
                            var2.updateVelocity(loopCycle, var3.z, this.getHeightmapY(var2.level, var3.z, true, var3.x) - var2.offsetY, var3.x, (byte) -83);
                        }
                    }
                    if (var2.target < 0) {
                        int var4 = -var2.target - 1;
                        PlayerEntity var5;
                        if (var4 == this.localPid) {
                            var5 = localPlayer;
                        } else {
                            var5 = this.players[var4];
                        }
                        if (var5 != null && var5.x >= 0 && var5.x < 13312 && var5.z >= 0 && var5.z < 13312) {
                            var2.updateVelocity(loopCycle, var5.z, this.getHeightmapY(var2.level, var5.z, true, var5.x) - var2.offsetY, var5.x, (byte) -83);
                        }
                    }
                    var2.update(this.sceneDelta, this._flowObfuscator24);
                    this.scene.addTemporary(this.currentLevel, var2.yaw, (byte) 6, (int) var2.y, -1, (int) var2.z, 60, (int) var2.x, var2, false);
                }
            } else {
                var2.unlink();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public final void loadTitleBackground(int arg0) {
        byte[] var2 = this.archiveTitle.read("title.dat", (byte[]) null);
        Pix24 var3 = new Pix24(var2, this);
        this.imageTitle0.bind(0);
        var3.blitOpaque(0, 0, -32357);
        this.imageTitle1.bind(0);
        var3.blitOpaque(-637, 0, -32357);
        this.imageTitle2.bind(0);
        var3.blitOpaque(-128, 0, -32357);
        this.imageTitle3.bind(0);
        var3.blitOpaque(-202, -371, -32357);
        this.imageTitle4.bind(0);
        var3.blitOpaque(-202, -171, -32357);
        this.imageTitle5.bind(0);
        var3.blitOpaque(0, -265, -32357);
        this.imageTitle6.bind(0);
        var3.blitOpaque(-562, -265, -32357);
        this.imageTitle7.bind(0);
        var3.blitOpaque(-128, -171, -32357);
        this.imageTitle8.bind(0);
        var3.blitOpaque(-562, -171, -32357);
        int[] var4 = new int[var3.cropRight];
        for (int var5 = 0; var5 < var3.cropBottom; var5++) {
            for (int var6 = 0; var6 < var3.cropRight; var6++) {
                var4[var6] = var3.pixels[var3.cropRight - var6 - 1 + var3.cropRight * var5];
            }
            for (int var7 = 0; var7 < var3.cropRight; var7++) {
                var3.pixels[var7 + var3.cropRight * var5] = var4[var7];
            }
        }
        this.imageTitle0.bind(0);
        var3.blitOpaque(382, 0, -32357);
        this.imageTitle1.bind(0);
        var3.blitOpaque(-255, 0, -32357);
        this.imageTitle2.bind(0);
        var3.blitOpaque(254, 0, -32357);
        this.imageTitle3.bind(0);
        var3.blitOpaque(180, -371, -32357);
        this.imageTitle4.bind(0);
        var3.blitOpaque(180, -171, -32357);
        this.imageTitle5.bind(0);
        var3.blitOpaque(382, -265, -32357);
        this.imageTitle6.bind(0);
        var3.blitOpaque(-180, -265, -32357);
        this.imageTitle7.bind(0);
        var3.blitOpaque(254, -171, -32357);
        this.imageTitle8.bind(0);
        if (arg0 == 0) {
            var3.blitOpaque(-180, -171, -32357);
            var3 = new Pix24(this.archiveTitle, "logo", 0);
            this.imageTitle2.bind(0);
            var3.draw(382 - var3.cropRight / 2 - 128, 16083, 18);
            var3 = null;
            Object var8 = null;
            Object var9 = null;
            System.gc();
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void handleOnDemandRequests(boolean arg0) {
        if (arg0) {
            this._flowObfuscator12 = -72;
        }
        while (true) {
            OnDemandRequest var2 = this.ondemand.poll();
            if (var2 == null) {
                return;
            }
            if (var2.archive == 0) {
                Model.unpack(var2.data, -4036, var2.file);
                if ((this.ondemand.getModelFlags(var2.file, -203) & 98) != 0) {
                    this.redrawSidebar = true;
                    if (this.chatInterfaceId != -1) {
                        this.redrawChatback = true;
                    }
                }
            }
            if (var2.archive == 1 && var2.data != null) {
                AnimFrame.unpack(var2.data, false);
            }
            if (var2.archive == 2 && var2.file == this.midiSong && var2.data != null) {
                this.saveMidi(this.midiFading, 0, var2.data);
            }
            if (var2.archive == 3 && this.sceneState == 1) {
                for (int var3 = 0; var3 < this.sceneMapLandData.length; var3++) {
                    if (this.sceneMapLandFile[var3] == var2.file) {
                        this.sceneMapLandData[var3] = var2.data;
                        if (var2.data == null) {
                            this.sceneMapLandFile[var3] = -1;
                        }
                        break;
                    }
                    if (this.sceneMapLocFile[var3] == var2.file) {
                        this.sceneMapLocData[var3] = var2.data;
                        if (var2.data == null) {
                            this.sceneMapLocFile[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.archive == 93 && this.ondemand.hasMapLocFile(var2.file, -520)) {
                World.prefetchLocs((byte) -107, new Packet(var2.data, 891), this.ondemand);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public final void updateFlames(int arg0) {
        short var2 = 256;
        int var4;
        for (int var3 = 10; var3 < 117; var3++) {
            var4 = (int) (Math.random() * 100.0D);
            if (var4 < 50) {
                this.flameBuffer3[var3 + (var2 - 2 << 7)] = 255;
            }
        }
        if (arg0 != 25106) {
            this.load();
        }
        int var5;
        int var6;
        int var7;
        for (var4 = 0; var4 < 100; var4++) {
            var5 = (int) (Math.random() * 124.0D) + 2;
            var6 = (int) (Math.random() * 128.0D) + 128;
            var7 = var5 + (var6 << 7);
            this.flameBuffer3[var7] = 192;
        }
        for (var5 = 1; var5 < var2 - 1; var5++) {
            for (var6 = 1; var6 < 127; var6++) {
                var7 = var6 + (var5 << 7);
                this.flameBuffer2[var7] = (this.flameBuffer3[var7 - 1] + this.flameBuffer3[var7 + 1] + this.flameBuffer3[var7 - 128] + this.flameBuffer3[var7 + 128]) / 4;
            }
        }
        this.flameCycle0 += 128;
        if (this.flameCycle0 > this.flameBuffer0.length) {
            this.flameCycle0 -= this.flameBuffer0.length;
            var6 = (int) (Math.random() * 12.0D);
            this.updateFlameBuffer(this.imageRunes[var6], -135);
        }
        int var8;
        for (var6 = 1; var6 < var2 - 1; var6++) {
            for (var7 = 1; var7 < 127; var7++) {
                var8 = var7 + (var6 << 7);
                int var9 = this.flameBuffer2[var8 + 128] - this.flameBuffer0[var8 + this.flameCycle0 & this.flameBuffer0.length - 1] / 5;
                if (var9 < 0) {
                    var9 = 0;
                }
                this.flameBuffer3[var8] = var9;
            }
        }
        for (var7 = 0; var7 < var2 - 1; var7++) {
            this.flameLineOffset[var7] = this.flameLineOffset[var7 + 1];
        }
        this.flameLineOffset[var2 - 1] = (int) (Math.sin((double) loopCycle / 14.0D) * 16.0D + Math.sin((double) loopCycle / 15.0D) * 14.0D + Math.sin((double) loopCycle / 16.0D) * 12.0D);
        if (this.flameGradientCycle0 > 0) {
            this.flameGradientCycle0 -= 4;
        }
        if (this.flameGradientCycle1 > 0) {
            this.flameGradientCycle1 -= 4;
        }
        if (this.flameGradientCycle0 == 0 && this.flameGradientCycle1 == 0) {
            var8 = (int) (Math.random() * 2000.0D);
            if (var8 == 0) {
                this.flameGradientCycle0 = 1024;
            }
            if (var8 == 1) {
                this.flameGradientCycle1 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BBI)Z")
    public final boolean saveWave(byte[] arg0, byte arg1, int arg2) {
        if (arg1 != 116) {
            throw new NullPointerException();
        } else {
            return arg0 == null ? true : signlink.wavesave(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    public final void resetInterfaceAnimation(int arg0, byte arg1) {
        Component var3 = Component.instances[arg0];
        for (int var4 = 0; var4 < var3.children.length && var3.children[var4] != -1; var4++) {
            Component var5 = Component.instances[var3.children[var4]];
            if (var5.type == 1) {
                this.resetInterfaceAnimation(var5.id, (byte) 6);
            }
            var5.animFrame = 0;
            var5.animCycle = 0;
        }
        if (arg1 == 6) {
            boolean var6 = false;
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void drawTileHint(int arg0) {
        if (this.hintType == 2) {
            this.projectFromGround((this.hintTileX - this.sceneBaseTileX << 7) + this.hintOffsetX, this.hintHeight * 2, this._flowObfuscator9, (this.hintTileZ - this.sceneBaseTileZ << 7) + this.hintOffsetZ);
            if (arg0 >= 0) {
                _flowObfuscator41 = !_flowObfuscator41;
            }
            if (this.projectX > -1 && loopCycle % 20 < 10) {
                this.imageHeadicons[2].draw(this.projectX - 12, 16083, this.projectY - 28);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void updateGame(int arg0) {
        if (this.systemUpdateTimer > 1) {
            this.systemUpdateTimer--;
        }
        if (this.idleTimeout > 0) {
            this.idleTimeout--;
        }
        for (int var2 = 0; var2 < 5 && this.read(true); var2++) {
        }
        if (this.ingame) {
            Object var3 = this.mouseTracking.lock;
            int var5;
            int var6;
            int var7;
            int var9;
            synchronized (this.mouseTracking.lock) {
                if (!flagged) {
                    this.mouseTracking.length = 0;
                } else if (super.mouseClickButton != 0 || this.mouseTracking.length >= 40) {
                    this.out.p1isaac((byte) 6, 45);
                    this.out.p1(0);
                    var5 = this.out.pos;
                    var6 = 0;
                    int var8;
                    for (var7 = 0; var7 < this.mouseTracking.length && var5 - this.out.pos < 240; var7++) {
                        var6++;
                        var8 = this.mouseTracking.y[var7];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 502) {
                            var8 = 502;
                        }
                        var9 = this.mouseTracking.x[var7];
                        if (var9 < 0) {
                            var9 = 0;
                        } else if (var9 > 764) {
                            var9 = 764;
                        }
                        int var10 = var8 * 765 + var9;
                        if (this.mouseTracking.y[var7] == -1 && this.mouseTracking.x[var7] == -1) {
                            var9 = -1;
                            var8 = -1;
                            var10 = 524287;
                        }
                        if (var9 == this.lastWriteX && var8 == this.lastWriteY) {
                            if (this.lastWriteDuplicates < 2047) {
                                this.lastWriteDuplicates++;
                            }
                        } else {
                            int var11 = var9 - this.lastWriteX;
                            this.lastWriteX = var9;
                            int var12 = var8 - this.lastWriteY;
                            this.lastWriteY = var8;
                            if (this.lastWriteDuplicates < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                var11 += 32;
                                var12 += 32;
                                this.out.p2((this.lastWriteDuplicates << 12) + (var11 << 6) + var12);
                                this.lastWriteDuplicates = 0;
                            } else if (this.lastWriteDuplicates < 8) {
                                this.out.p3(8388608 + (this.lastWriteDuplicates << 19) + var10);
                                this.lastWriteDuplicates = 0;
                            } else {
                                this.out.p4(-1073741824 + (this.lastWriteDuplicates << 19) + var10);
                                this.lastWriteDuplicates = 0;
                            }
                        }
                    }
                    this.out.psize1(this.out.pos - var5, (byte) 0);
                    if (var6 >= this.mouseTracking.length) {
                        this.mouseTracking.length = 0;
                    } else {
                        this.mouseTracking.length -= var6;
                        for (var8 = 0; var8 < this.mouseTracking.length; var8++) {
                            this.mouseTracking.x[var8] = this.mouseTracking.x[var8 + var6];
                            this.mouseTracking.y[var8] = this.mouseTracking.y[var8 + var6];
                        }
                    }
                }
            }
            if (super.mouseClickButton != 0) {
                long var16 = (super.mouseClickTime - this.prevMousePressTime) / 50L;
                if (var16 > 4095L) {
                    var16 = 4095L;
                }
                this.prevMousePressTime = super.mouseClickTime;
                var5 = super.mouseClickY;
                if (var5 < 0) {
                    var5 = 0;
                } else if (var5 > 502) {
                    var5 = 502;
                }
                var6 = super.mouseClickX;
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 764) {
                    var6 = 764;
                }
                var7 = var5 * 765 + var6;
                byte var21 = 0;
                if (super.mouseClickButton == 2) {
                    var21 = 1;
                }
                var9 = (int) var16;
                this.out.p1isaac((byte) 6, 241);
                this.out.p4((var9 << 20) + (var21 << 19) + var7);
            }
            if (this.sendCameraDelay > 0) {
                this.sendCameraDelay--;
            }
            if (super.actionKey[1] == 1 || super.actionKey[2] == 1 || super.actionKey[3] == 1 || super.actionKey[4] == 1) {
                this.sendCamera = true;
            }
            if (this.sendCamera && this.sendCameraDelay <= 0) {
                this.sendCameraDelay = 20;
                this.sendCamera = false;
                this.out.p1isaac((byte) 6, 86);
                this.out.p2(this.orbitCameraPitch);
                this.out.p2_alt2(-431, this.orbitCameraYaw);
            }
            if (super.hasFocus && !this.focused) {
                this.focused = true;
                this.out.p1isaac((byte) 6, 3);
                this.out.p1(1);
            }
            if (!super.hasFocus && this.focused) {
                this.focused = false;
                this.out.p1isaac((byte) 6, 3);
                this.out.p1(0);
            }
            this.updateSceneState(-48877);
            this.updateTemporaryLocs((byte) 8);
            this.updateAudio(false);
            this.idleNetCycles++;
            if (this.idleNetCycles > 750) {
                this.tryReconnect(-670);
            }
            this.updatePlayers((byte) -74);
            this.updateNpcs(-8066);
            this.updateEntityChats((byte) -92);
            this.sceneDelta++;
            if (this.crossMode != 0) {
                this.crossCycle += 20;
                if (this.crossCycle >= 400) {
                    this.crossMode = 0;
                }
            }
            if (this.selectedArea != 0) {
                this.selectedCycle++;
                if (this.selectedCycle >= 15) {
                    if (this.selectedArea == 2) {
                        this.redrawSidebar = true;
                    }
                    if (this.selectedArea == 3) {
                        this.redrawChatback = true;
                    }
                    this.selectedArea = 0;
                }
            }
            if (this.objDragArea != 0) {
                this.objDragCycles++;
                if (super.mouseX > this.objGrabX + 5 || super.mouseX < this.objGrabX - 5 || super.mouseY > this.objGrabY + 5 || super.mouseY < this.objGrabY - 5) {
                    this.objGrabThreshold = true;
                }
                if (super.mouseButton == 0) {
                    if (this.objDragArea == 2) {
                        this.redrawSidebar = true;
                    }
                    if (this.objDragArea == 3) {
                        this.redrawChatback = true;
                    }
                    this.objDragArea = 0;
                    if (this.objGrabThreshold && this.objDragCycles >= 5) {
                        this.hoveredSlotParentId = -1;
                        this.handleInput(0);
                        if (this.hoveredSlotParentId == this.objDragInterfaceId && this.hoveredSlot != this.objDragSlot) {
                            Component var17 = Component.instances[this.objDragInterfaceId];
                            byte var4 = 0;
                            if (this.bankArrangeMode == 1 && var17.clientCode == 206) {
                                var4 = 1;
                            }
                            if (var17.invSlotObjId[this.hoveredSlot] <= 0) {
                                var4 = 0;
                            }
                            if (var17.swappable) {
                                var5 = this.objDragSlot;
                                var6 = this.hoveredSlot;
                                var17.invSlotObjId[var6] = var17.invSlotObjId[var5];
                                var17.invSlotObjCount[var6] = var17.invSlotObjCount[var5];
                                var17.invSlotObjId[var5] = -1;
                                var17.invSlotObjCount[var5] = 0;
                            } else if (var4 == 1) {
                                var5 = this.objDragSlot;
                                var6 = this.hoveredSlot;
                                while (var5 != var6) {
                                    if (var5 > var6) {
                                        var17.swapObj(var5, (byte) 9, var5 - 1);
                                        var5--;
                                    } else if (var5 < var6) {
                                        var17.swapObj(var5, (byte) 9, var5 + 1);
                                        var5++;
                                    }
                                }
                            } else {
                                var17.swapObj(this.objDragSlot, (byte) 9, this.hoveredSlot);
                            }
                            this.out.p1isaac((byte) 6, 214);
                            this.out.p2_alt3(0, this.objDragInterfaceId);
                            this.out.p1_alt2(var4, 0);
                            this.out.p2_alt3(0, this.objDragSlot);
                            this.out.p2_alt1(true, this.hoveredSlot);
                        }
                    } else if ((this.mouseButtonsOption == 1 || this.isAddFriendOption(9, this.menuSize - 1)) && this.menuSize > 2) {
                        this.showContextMenu(true);
                    } else if (this.menuSize > 0) {
                        this.useMenuOption(this.menuSize - 1, false);
                    }
                    this.selectedCycle = 10;
                    super.mouseClickButton = 0;
                }
            }
            int var18;
            int var19;
            if (World3D.clickTileX != -1) {
                var18 = World3D.clickTileX;
                var19 = World3D.clickTileZ;
                boolean var20 = this.tryMove(0, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var19, localPlayer.pathTileX[0], true, var18);
                World3D.clickTileX = -1;
                if (var20) {
                    this.crossX = super.mouseClickX;
                    this.crossY = super.mouseClickY;
                    this.crossMode = 1;
                    this.crossCycle = 0;
                }
            }
            if (super.mouseClickButton == 1 && this.modalMessage != null) {
                this.modalMessage = null;
                this.redrawChatback = true;
                super.mouseClickButton = 0;
            }
            this.handleMouseInput(4);
            this.handleMinimapInput(true);
            this.handleTabInput(19);
            this.handleChatSettingsInput(true);
            if (super.mouseButton == 1 || super.mouseClickButton == 1) {
                this.dragCycles++;
            }
            if (this.sceneState == 2) {
                this.updateOrbitCamera(3);
            }
            if (this.sceneState == 2 && this.cutscene) {
                this.applyCutscene((byte) 5);
            }
            for (var18 = 0; var18 < 5; var18++) {
                int var10002 = this.cameraModifierCycle[var18]++;
            }
            this.handleInputKey(732);
            super.idleCycles++;
            if (super.idleCycles > 4500) {
                this.idleTimeout = 250;
                super.idleCycles -= 500;
                this.out.p1isaac((byte) 6, 202);
            }
            this.cameraOffsetCycle++;
            if (arg0 >= 0) {
                this.levelObjStacks = null;
            }
            if (this.cameraOffsetCycle > 500) {
                this.cameraOffsetCycle = 0;
                var19 = (int) (Math.random() * 8.0D);
                if ((var19 & 1) == 1) {
                    this.cameraAnticheatOffsetX += this.cameraOffsetXModifier;
                }
                if ((var19 & 2) == 2) {
                    this.cameraAnticheatOffsetZ += this.cameraOffsetZModifier;
                }
                if ((var19 & 4) == 4) {
                    this.cameraAnticheatAngle += this.cameraOffsetYawModifier;
                }
            }
            if (this.cameraAnticheatOffsetX < -50) {
                this.cameraOffsetXModifier = 2;
            }
            if (this.cameraAnticheatOffsetX > 50) {
                this.cameraOffsetXModifier = -2;
            }
            if (this.cameraAnticheatOffsetZ < -55) {
                this.cameraOffsetZModifier = 2;
            }
            if (this.cameraAnticheatOffsetZ > 55) {
                this.cameraOffsetZModifier = -2;
            }
            if (this.cameraAnticheatAngle < -40) {
                this.cameraOffsetYawModifier = 1;
            }
            if (this.cameraAnticheatAngle > 40) {
                this.cameraOffsetYawModifier = -1;
            }
            this.minimapOffsetCycle++;
            if (this.minimapOffsetCycle > 500) {
                this.minimapOffsetCycle = 0;
                var19 = (int) (Math.random() * 8.0D);
                if ((var19 & 1) == 1) {
                    this.minimapAnticheatAngle += this.minimapAngleModifier;
                }
                if ((var19 & 2) == 2) {
                    this.minimapZoom += this.minimapZoomModifier;
                }
            }
            if (this.minimapAnticheatAngle < -60) {
                this.minimapAngleModifier = 2;
            }
            if (this.minimapAnticheatAngle > 60) {
                this.minimapAngleModifier = -2;
            }
            if (this.minimapZoom < -20) {
                this.minimapZoomModifier = 1;
            }
            if (this.minimapZoom > 10) {
                this.minimapZoomModifier = -1;
            }
            this.heartbeatTimer++;
            if (this.heartbeatTimer > 50) {
                this.out.p1isaac((byte) 6, 0);
            }
            try {
                if (this.stream != null && this.out.pos > 0) {
                    this.stream.write(this.out.pos, 0, this.out.data, 0);
                    this.out.pos = 0;
                    this.heartbeatTimer = 0;
                }
            } catch (IOException var13) {
                this.tryReconnect(-670);
            } catch (Exception var14) {
                this.logout(true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    private final void clearTemporaryLocs(int arg0) {
        LocSpawned var2 = (LocSpawned) this.temporaryLocs.head();
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (var2 != null) {
            if (var2.duration == -1) {
                var2.delay = 0;
                this.storeLoc(false, var2);
            } else {
                var2.unlink();
            }
            var2 = (LocSpawned) this.temporaryLocs.next(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public final void loadTitle(int arg0) {
        if (this.imageTitle2 == null) {
            super.drawArea = null;
            this.areaChatback = null;
            this.areaMapback = null;
            this.areaSidebar = null;
            this.areaViewport = null;
            this.areaBackbase1 = null;
            this.areaBackbase2 = null;
            this.areaBackhmid1 = null;
            this.imageTitle0 = new PixMap(128, 265, this.getBaseComponent(0), 0);
            Draw2D.clear(this._flowObfuscator38);
            this.imageTitle1 = new PixMap(128, 265, this.getBaseComponent(0), 0);
            Draw2D.clear(this._flowObfuscator38);
            this.imageTitle2 = new PixMap(509, 171, this.getBaseComponent(0), 0);
            Draw2D.clear(this._flowObfuscator38);
            this.imageTitle3 = new PixMap(360, 132, this.getBaseComponent(0), 0);
            Draw2D.clear(this._flowObfuscator38);
            this.imageTitle4 = new PixMap(360, 200, this.getBaseComponent(0), 0);
            Draw2D.clear(this._flowObfuscator38);
            this.imageTitle5 = new PixMap(202, 238, this.getBaseComponent(0), 0);
            if (arg0 < 0 || arg0 > 0) {
                this.levelObjStacks = null;
            }
            Draw2D.clear(this._flowObfuscator38);
            this.imageTitle6 = new PixMap(203, 238, this.getBaseComponent(0), 0);
            Draw2D.clear(this._flowObfuscator38);
            this.imageTitle7 = new PixMap(74, 94, this.getBaseComponent(0), 0);
            Draw2D.clear(this._flowObfuscator38);
            this.imageTitle8 = new PixMap(75, 94, this.getBaseComponent(0), 0);
            Draw2D.clear(this._flowObfuscator38);
            if (this.archiveTitle != null) {
                this.loadTitleBackground(0);
                this.loadTitleImages(215);
            }
            this.redrawTitleBackground = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public final void drawProgress(int arg0, byte arg1, String arg2) {
        this.lastProgressPercent = arg0;
        this.lastProgressMessage = arg2;
        this.loadTitle(0);
        if (this.archiveTitle == null) {
            super.drawProgress(arg0, (byte) 4, arg2);
        } else {
            this.imageTitle4.bind(0);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.fontBold12.drawStringCenter(16777215, "RuneScape is loading - please wait...", 23693, var5 / 2 - 26 - var6, var4 / 2);
            int var7 = var5 / 2 - 18 - var6;
            Draw2D.drawRect(var4 / 2 - 152, 304, 34, 9179409, var7, true);
            Draw2D.drawRect(var4 / 2 - 151, 302, 32, 0, var7 + 1, true);
            Draw2D.fillRect(30, var7 + 2, var4 / 2 - 150, 9179409, arg0 * 3, 0);
            Draw2D.fillRect(30, var7 + 2, var4 / 2 - 150 + arg0 * 3, 0, 300 - arg0 * 3, 0);
            this.fontBold12.drawStringCenter(16777215, arg2, 23693, var5 / 2 + 5 - var6, var4 / 2);
            this.imageTitle4.draw(171, 23680, super.graphics, 202);
            if (arg1 != 4) {
                for (int var8 = 1; var8 > 0; var8++) {
                }
            }
            if (this.redrawTitleBackground) {
                this.redrawTitleBackground = false;
                if (!this.flameActive) {
                    this.imageTitle0.draw(0, 23680, super.graphics, 0);
                    this.imageTitle1.draw(0, 23680, super.graphics, 637);
                }
                this.imageTitle2.draw(0, 23680, super.graphics, 128);
                this.imageTitle3.draw(371, 23680, super.graphics, 202);
                this.imageTitle5.draw(265, 23680, super.graphics, 0);
                this.imageTitle6.draw(265, 23680, super.graphics, 562);
                this.imageTitle7.draw(171, 23680, super.graphics, 128);
                this.imageTitle8.draw(171, 23680, super.graphics, 562);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILDUCMKFAY;IZII)V")
    public final void handleScrollInput(int arg0, int arg1, int arg2, int arg3, Component arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (this.scrollGrabbed) {
            this.scrollInputPadding = 32;
        } else {
            this.scrollInputPadding = 0;
        }
        this.scrollGrabbed = false;
        this.packetSize += arg8;
        if (arg2 >= arg0 && arg2 < arg0 + 16 && arg3 >= arg5 && arg3 < arg5 + 16) {
            arg4.scrollPosition -= this.dragCycles * 4;
            if (arg6) {
                this.redrawSidebar = true;
                return;
            }
        } else if (arg2 >= arg0 && arg2 < arg0 + 16 && arg3 >= arg5 + arg1 - 16 && arg3 < arg5 + arg1) {
            arg4.scrollPosition += this.dragCycles * 4;
            if (arg6) {
                this.redrawSidebar = true;
                return;
            }
        } else {
            if (arg2 < arg0 - this.scrollInputPadding || arg2 >= arg0 + 16 + this.scrollInputPadding || arg3 < arg5 + 16 || arg3 >= arg5 + arg1 - 16 || this.dragCycles <= 0) {
                return;
            }
            int var10 = (arg1 - 32) * arg1 / arg7;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg3 - arg5 - 16 - var10 / 2;
            int var12 = arg1 - 32 - var10;
            arg4.scrollPosition = (arg7 - arg1) * var11 / var12;
            if (arg6) {
                this.redrawSidebar = true;
            }
            this.scrollGrabbed = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z")
    public final boolean interactWithLoc(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 14 & 32767;
        int var6 = this.scene.getInfo(this.currentLevel, arg2, arg1, arg0);
        if (arg3 >= 0) {
            throw new NullPointerException();
        } else if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.tryMove(2, var8, 0, -11308, var7 + 1, localPlayer.pathTileZ[0], 0, 0, arg1, localPlayer.pathTileX[0], false, arg2);
            } else {
                LocType var9 = LocType.get(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.length;
                    var11 = var9.width;
                } else {
                    var10 = var9.width;
                    var11 = var9.length;
                }
                int var12 = var9.forceapproach;
                if (var8 != 0) {
                    var12 = (var12 << var8 & 15) + (var12 >> 4 - var8);
                }
                this.tryMove(2, 0, var11, -11308, 0, localPlayer.pathTileZ[0], var10, var12, arg1, localPlayer.pathTileX[0], false, arg2);
            }
            this.crossX = super.mouseClickX;
            this.crossY = super.mouseClickY;
            this.crossMode = 2;
            this.crossCycle = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IBI)LXTGLDHGX;")
    public final Jagfile loadArchive(int arg0, String arg1, String arg2, int arg3, byte arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.fileStreams[0] != null) {
                var7 = this.fileStreams[0].read(true, arg0);
            }
        } catch (Exception var23) {
        }
        int var9;
        if (var7 != null) {
            this.crc32.reset();
            this.crc32.update(var7);
            var9 = (int) this.crc32.getValue();
            if (var9 != arg3) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(44820, var7);
        } else {
            var9 = 0;
            while (var7 == null) {
                String var10 = "Unknown error";
                this.drawProgress(arg5, (byte) 4, "Requesting " + arg1);
                DataInputStream var11 = null;
                int var12;
                try {
                    var12 = 0;
                    var11 = this.openUrl(arg2 + arg3);
                    byte[] var13 = new byte[6];
                    var11.readFully(var13, 0, 6);
                    Packet var14 = new Packet(var13, 891);
                    var14.pos = 3;
                    int var15 = var14.g3() + 6;
                    int var16 = 6;
                    var7 = new byte[var15];
                    for (int var17 = 0; var17 < 6; var17++) {
                        var7[var17] = var13[var17];
                    }
                    int var18;
                    while (var16 < var15) {
                        var18 = var15 - var16;
                        if (var18 > 1000) {
                            var18 = 1000;
                        }
                        int var19 = var11.read(var7, var16, var18);
                        if (var19 < 0) {
                            (new StringBuffer("Length error: ")).append(var16).append("/").append(var15).toString();
                            throw new IOException("EOF");
                        }
                        var16 += var19;
                        int var20 = var16 * 100 / var15;
                        if (var20 != var12) {
                            this.drawProgress(arg5, (byte) 4, "Loading " + arg1 + " - " + var20 + "%");
                        }
                        var12 = var20;
                    }
                    var11.close();
                    try {
                        if (this.fileStreams[0] != null) {
                            this.fileStreams[0].write(var7.length, var7, (byte) 2, arg0);
                        }
                    } catch (Exception var22) {
                        this.fileStreams[0] = null;
                    }
                    if (var7 != null) {
                        this.crc32.reset();
                        this.crc32.update(var7);
                        var18 = (int) this.crc32.getValue();
                        if (var18 != arg3) {
                            var7 = null;
                            var9++;
                            var10 = "Checksum error: " + var18;
                        }
                    }
                } catch (IOException var24) {
                    if (var10.equals("Unknown error")) {
                        var10 = "Connection error";
                    }
                    var7 = null;
                } catch (NullPointerException var25) {
                    var10 = "Null error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                } catch (ArrayIndexOutOfBoundsException var26) {
                    var10 = "Bounds error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                } catch (Exception var27) {
                    var10 = "Unexpected error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                }
                if (var7 == null) {
                    for (var12 = var8; var12 > 0; var12--) {
                        if (var9 >= 3) {
                            this.drawProgress(arg5, (byte) 4, "Game updated - please reload page");
                            var12 = 10;
                        } else {
                            this.drawProgress(arg5, (byte) 4, var10 + " - Retrying in " + var12);
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var21) {
                        }
                    }
                    var8 *= 2;
                    if (var8 > 60) {
                        var8 = 60;
                    }
                    this.jaggrabEnabled = !this.jaggrabEnabled;
                }
            }
            Jagfile var28 = new Jagfile(44820, var7);
            if (arg4 != -41) {
                throw new NullPointerException();
            } else {
                return var28;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void tryReconnect(int arg0) {
        if (this.idleTimeout > 0) {
            this.logout(true);
        } else {
            this.areaViewport.bind(0);
            this.fontPlain12.drawStringCenter(0, "Connection lost", 23693, 144, 257);
            this.fontPlain12.drawStringCenter(16777215, "Connection lost", 23693, 143, 256);
            this.fontPlain12.drawStringCenter(0, "Please wait - attempting to reestablish", 23693, 159, 257);
            this.fontPlain12.drawStringCenter(16777215, "Please wait - attempting to reestablish", 23693, 158, 256);
            while (arg0 >= 0) {
                this.out.p1(164);
            }
            this.areaViewport.draw(4, 23680, super.graphics, 4);
            this.minimapState = 0;
            this.flagSceneTileX = 0;
            ClientStream var2 = this.stream;
            this.ingame = false;
            this.loginAttempts = 0;
            this.login(this.username, this.password, true);
            if (!this.ingame) {
                this.logout(true);
            }
            try {
                var2.close();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
    public final void useMenuOption(int arg0, boolean arg1) {
        if (arg0 >= 0) {
            if (this.chatbackInputOpen != 0) {
                this.chatbackInputOpen = 0;
                this.redrawChatback = true;
            }
            int var3 = this.menuParamB[arg0];
            int var4 = this.menuParamC[arg0];
            int var5 = this.menuAction[arg0];
            int var6 = this.menuParamA[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            NpcEntity var7;
            if (var5 == 582) {
                var7 = this.npcs[var6];
                if (var7 != null) {
                    this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var7.pathTileZ[0], localPlayer.pathTileX[0], false, var7.pathTileX[0]);
                    this.crossX = super.mouseClickX;
                    this.crossY = super.mouseClickY;
                    this.crossMode = 2;
                    this.crossCycle = 0;
                    this.out.p1isaac((byte) 6, 57);
                    this.out.p2_alt2(-431, this._flowObfuscator46);
                    this.out.p2_alt2(-431, var6);
                    this.out.p2_alt1(true, this.objSelectedSlot);
                    this.out.p2_alt2(-431, this.objSelectedInterface);
                }
            }
            boolean var13;
            if (var5 == 234) {
                var13 = this.tryMove(2, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var4, localPlayer.pathTileX[0], false, var3);
                if (!var13) {
                    this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var4, localPlayer.pathTileX[0], false, var3);
                }
                this.crossX = super.mouseClickX;
                this.crossY = super.mouseClickY;
                this.crossMode = 2;
                this.crossCycle = 0;
                this.out.p1isaac((byte) 6, 236);
                this.out.p2_alt1(true, var4 + this.sceneBaseTileZ);
                this.out.p2(var6);
                this.out.p2_alt1(true, var3 + this.sceneBaseTileX);
            }
            if (var5 == 62 && this.interactWithLoc(var6, var4, var3, -770)) {
                this.out.p1isaac((byte) 6, 192);
                this.out.p2(this.objSelectedInterface);
                this.out.p2_alt1(true, var6 >> 14 & 32767);
                this.out.p2_alt3(0, var4 + this.sceneBaseTileZ);
                this.out.p2_alt1(true, this.objSelectedSlot);
                this.out.p2_alt3(0, var3 + this.sceneBaseTileX);
                this.out.p2(this._flowObfuscator46);
            }
            if (var5 == 511) {
                var13 = this.tryMove(2, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var4, localPlayer.pathTileX[0], false, var3);
                if (!var13) {
                    this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var4, localPlayer.pathTileX[0], false, var3);
                }
                this.crossX = super.mouseClickX;
                this.crossY = super.mouseClickY;
                this.crossMode = 2;
                this.crossCycle = 0;
                this.out.p1isaac((byte) 6, 25);
                this.out.p2_alt1(true, this.objSelectedInterface);
                this.out.p2_alt2(-431, this._flowObfuscator46);
                this.out.p2(var6);
                this.out.p2_alt2(-431, var4 + this.sceneBaseTileZ);
                this.out.p2_alt3(0, this.objSelectedSlot);
                this.out.p2(var3 + this.sceneBaseTileX);
            }
            if (var5 == 74) {
                this.out.p1isaac((byte) 6, 122);
                this.out.p2_alt3(0, var4);
                this.out.p2_alt2(-431, var3);
                this.out.p2_alt1(true, var6);
                this.selectedCycle = 0;
                this.selectedInterface = var4;
                this.selectedItem = var3;
                this.selectedArea = 2;
                if (Component.instances[var4].layer == this.viewportInterfaceId) {
                    this.selectedArea = 1;
                }
                if (Component.instances[var4].layer == this.chatInterfaceId) {
                    this.selectedArea = 3;
                }
            }
            Component var14;
            if (var5 == 315) {
                var14 = Component.instances[var4];
                boolean var8 = true;
                if (var14.clientCode > 0) {
                    var8 = this.handleInterfaceAction(505, var14);
                }
                if (var8) {
                    this.out.p1isaac((byte) 6, 185);
                    this.out.p2(var4);
                }
            }
            PlayerEntity var15;
            if (var5 == 561) {
                var15 = this.players[var6];
                if (var15 != null) {
                    this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var15.pathTileZ[0], localPlayer.pathTileX[0], false, var15.pathTileX[0]);
                    this.crossX = super.mouseClickX;
                    this.crossY = super.mouseClickY;
                    this.crossMode = 2;
                    this.crossCycle = 0;
                    oplogic6 += var6;
                    if (oplogic6 >= 90) {
                        this.out.p1isaac((byte) 6, 136);
                        oplogic6 = 0;
                    }
                    this.out.p1isaac((byte) 6, 128);
                    this.out.p2(var6);
                }
            }
            if (var5 == 20) {
                var7 = this.npcs[var6];
                if (var7 != null) {
                    this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var7.pathTileZ[0], localPlayer.pathTileX[0], false, var7.pathTileX[0]);
                    this.crossX = super.mouseClickX;
                    this.crossY = super.mouseClickY;
                    this.crossMode = 2;
                    this.crossCycle = 0;
                    this.out.p1isaac((byte) 6, 155);
                    this.out.p2_alt1(true, var6);
                }
            }
            if (var5 == 779) {
                var15 = this.players[var6];
                if (var15 != null) {
                    this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var15.pathTileZ[0], localPlayer.pathTileX[0], false, var15.pathTileX[0]);
                    this.crossX = super.mouseClickX;
                    this.crossY = super.mouseClickY;
                    this.crossMode = 2;
                    this.crossCycle = 0;
                    this.out.p1isaac((byte) 6, 153);
                    this.out.p2_alt1(true, var6);
                }
            }
            if (var5 == 516) {
                if (!this.menuVisible) {
                    this.scene.click(false, super.mouseClickY - 4, super.mouseClickX - 4);
                } else {
                    this.scene.click(false, var4 - 4, var3 - 4);
                }
            }
            if (var5 == 1062) {
                oplogic5 += this.sceneBaseTileX;
                if (oplogic5 >= 113) {
                    this.out.p1isaac((byte) 6, 183);
                    this.out.p3(15086193);
                    oplogic5 = 0;
                }
                this.interactWithLoc(var6, var4, var3, -770);
                this.out.p1isaac((byte) 6, 228);
                this.out.p2_alt2(-431, var6 >> 14 & 32767);
                this.out.p2_alt2(-431, var4 + this.sceneBaseTileZ);
                this.out.p2(var3 + this.sceneBaseTileX);
            }
            if (var5 == 679 && !this.pressedContinueOption) {
                this.out.p1isaac((byte) 6, 40);
                this.out.p2(var4);
                this.pressedContinueOption = true;
            }
            if (var5 == 431) {
                this.out.p1isaac((byte) 6, 129);
                this.out.p2_alt2(-431, var3);
                this.out.p2(var4);
                this.out.p2_alt2(-431, var6);
                this.selectedCycle = 0;
                this.selectedInterface = var4;
                this.selectedItem = var3;
                this.selectedArea = 2;
                if (Component.instances[var4].layer == this.viewportInterfaceId) {
                    this.selectedArea = 1;
                }
                if (Component.instances[var4].layer == this.chatInterfaceId) {
                    this.selectedArea = 3;
                }
            }
            long var9;
            int var16;
            String var17;
            if (var5 == 337 || var5 == 42 || var5 == 792 || var5 == 322) {
                var17 = this.menuOption[arg0];
                var16 = var17.indexOf("@whi@");
                if (var16 != -1) {
                    var9 = JString.toBase37(var17.substring(var16 + 5).trim());
                    if (var5 == 337) {
                        this.addFriend((byte) 68, var9);
                    }
                    if (var5 == 42) {
                        this.addIgnore(var9, 4);
                    }
                    if (var5 == 792) {
                        this.removeFriend(false, var9);
                    }
                    if (var5 == 322) {
                        this.removeIgnore(3, var9);
                    }
                }
            }
            if (var5 == 53) {
                this.out.p1isaac((byte) 6, 135);
                this.out.p2_alt1(true, var3);
                this.out.p2_alt2(-431, var4);
                this.out.p2_alt1(true, var6);
                this.selectedCycle = 0;
                this.selectedInterface = var4;
                this.selectedItem = var3;
                this.selectedArea = 2;
                if (Component.instances[var4].layer == this.viewportInterfaceId) {
                    this.selectedArea = 1;
                }
                if (Component.instances[var4].layer == this.chatInterfaceId) {
                    this.selectedArea = 3;
                }
            }
            if (var5 == 539) {
                this.out.p1isaac((byte) 6, 16);
                this.out.p2_alt2(-431, var6);
                this.out.p2_alt3(0, var3);
                this.out.p2_alt3(0, var4);
                this.selectedCycle = 0;
                this.selectedInterface = var4;
                this.selectedItem = var3;
                this.selectedArea = 2;
                if (Component.instances[var4].layer == this.viewportInterfaceId) {
                    this.selectedArea = 1;
                }
                if (Component.instances[var4].layer == this.chatInterfaceId) {
                    this.selectedArea = 3;
                }
            }
            int var11;
            String var18;
            if (var5 == 484 || var5 == 6) {
                var17 = this.menuOption[arg0];
                var16 = var17.indexOf("@whi@");
                if (var16 != -1) {
                    var17 = var17.substring(var16 + 5).trim();
                    var18 = JString.toSentenceCase(-45804, JString.fromBase37(JString.toBase37(var17), (byte) -99));
                    boolean var10 = false;
                    for (var11 = 0; var11 < this.playerCount; var11++) {
                        PlayerEntity var12 = this.players[this.playerIds[var11]];
                        if (var12 != null && var12.name != null && var12.name.equalsIgnoreCase(var18)) {
                            this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var12.pathTileZ[0], localPlayer.pathTileX[0], false, var12.pathTileX[0]);
                            if (var5 == 484) {
                                this.out.p1isaac((byte) 6, 139);
                                this.out.p2_alt1(true, this.playerIds[var11]);
                            }
                            if (var5 == 6) {
                                oplogic6 += var6;
                                if (oplogic6 >= 90) {
                                    this.out.p1isaac((byte) 6, 136);
                                    oplogic6 = 0;
                                }
                                this.out.p1isaac((byte) 6, 128);
                                this.out.p2(this.playerIds[var11]);
                            }
                            var10 = true;
                            break;
                        }
                    }
                    if (!var10) {
                        this.addMessage("Unable to find " + var18, 0, "", this._flowObfuscator21);
                    }
                }
            }
            if (var5 == 870) {
                this.out.p1isaac((byte) 6, 53);
                this.out.p2(var3);
                this.out.p2_alt2(-431, this.objSelectedSlot);
                this.out.p2_alt3(0, var6);
                this.out.p2(this.objSelectedInterface);
                this.out.p2_alt1(true, this._flowObfuscator46);
                this.out.p2(var4);
                this.selectedCycle = 0;
                this.selectedInterface = var4;
                this.selectedItem = var3;
                this.selectedArea = 2;
                if (Component.instances[var4].layer == this.viewportInterfaceId) {
                    this.selectedArea = 1;
                }
                if (Component.instances[var4].layer == this.chatInterfaceId) {
                    this.selectedArea = 3;
                }
            }
            if (var5 == 847) {
                this.out.p1isaac((byte) 6, 87);
                this.out.p2_alt2(-431, var6);
                this.out.p2(var4);
                this.out.p2_alt2(-431, var3);
                this.selectedCycle = 0;
                this.selectedInterface = var4;
                this.selectedItem = var3;
                this.selectedArea = 2;
                if (Component.instances[var4].layer == this.viewportInterfaceId) {
                    this.selectedArea = 1;
                }
                if (Component.instances[var4].layer == this.chatInterfaceId) {
                    this.selectedArea = 3;
                }
            }
            String var22;
            if (var5 == 626) {
                var14 = Component.instances[var4];
                this.spellSelected = 1;
                this.activeSpellId = var4;
                this.activeSpellFlags = var14.targetMask;
                this.objSelected = 0;
                this.redrawSidebar = true;
                var22 = var14.targetVerb;
                if (var22.indexOf(" ") != -1) {
                    var22 = var22.substring(0, var22.indexOf(" "));
                }
                var18 = var14.targetVerb;
                if (var18.indexOf(" ") != -1) {
                    var18 = var18.substring(var18.indexOf(" ") + 1);
                }
                this.spellCaption = var22 + " " + var14.targetText + " " + var18;
                if (this.activeSpellFlags == 16) {
                    this.redrawSidebar = true;
                    this.selectedTab = 3;
                    this.redrawSideicons = true;
                }
            } else {
                if (var5 == 78) {
                    this.out.p1isaac((byte) 6, 117);
                    this.out.p2_alt3(0, var4);
                    this.out.p2_alt3(0, var6);
                    this.out.p2_alt1(true, var3);
                    this.selectedCycle = 0;
                    this.selectedInterface = var4;
                    this.selectedItem = var3;
                    this.selectedArea = 2;
                    if (Component.instances[var4].layer == this.viewportInterfaceId) {
                        this.selectedArea = 1;
                    }
                    if (Component.instances[var4].layer == this.chatInterfaceId) {
                        this.selectedArea = 3;
                    }
                }
                if (var5 == 27) {
                    var15 = this.players[var6];
                    if (var15 != null) {
                        this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var15.pathTileZ[0], localPlayer.pathTileX[0], false, var15.pathTileX[0]);
                        this.crossX = super.mouseClickX;
                        this.crossY = super.mouseClickY;
                        this.crossMode = 2;
                        this.crossCycle = 0;
                        oplogic3 += var6;
                        if (oplogic3 >= 54) {
                            this.out.p1isaac((byte) 6, 189);
                            this.out.p1(234);
                            oplogic3 = 0;
                        }
                        this.out.p1isaac((byte) 6, 73);
                        this.out.p2_alt1(true, var6);
                    }
                }
                if (var5 == 213) {
                    var13 = this.tryMove(2, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var4, localPlayer.pathTileX[0], false, var3);
                    if (!var13) {
                        this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var4, localPlayer.pathTileX[0], false, var3);
                    }
                    this.crossX = super.mouseClickX;
                    this.crossY = super.mouseClickY;
                    this.crossMode = 2;
                    this.crossCycle = 0;
                    this.out.p1isaac((byte) 6, 79);
                    this.out.p2_alt1(true, var4 + this.sceneBaseTileZ);
                    this.out.p2(var6);
                    this.out.p2_alt2(-431, var3 + this.sceneBaseTileX);
                }
                if (var5 == 632) {
                    this.out.p1isaac((byte) 6, 145);
                    this.out.p2_alt2(-431, var4);
                    this.out.p2_alt2(-431, var3);
                    this.out.p2_alt2(-431, var6);
                    this.selectedCycle = 0;
                    this.selectedInterface = var4;
                    this.selectedItem = var3;
                    this.selectedArea = 2;
                    if (Component.instances[var4].layer == this.viewportInterfaceId) {
                        this.selectedArea = 1;
                    }
                    if (Component.instances[var4].layer == this.chatInterfaceId) {
                        this.selectedArea = 3;
                    }
                }
                if (var5 == 493) {
                    this.out.p1isaac((byte) 6, 75);
                    this.out.p2_alt3(0, var4);
                    this.out.p2_alt1(true, var3);
                    this.out.p2_alt2(-431, var6);
                    this.selectedCycle = 0;
                    this.selectedInterface = var4;
                    this.selectedItem = var3;
                    this.selectedArea = 2;
                    if (Component.instances[var4].layer == this.viewportInterfaceId) {
                        this.selectedArea = 1;
                    }
                    if (Component.instances[var4].layer == this.chatInterfaceId) {
                        this.selectedArea = 3;
                    }
                }
                if (var5 == 652) {
                    var13 = this.tryMove(2, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var4, localPlayer.pathTileX[0], false, var3);
                    if (!var13) {
                        this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var4, localPlayer.pathTileX[0], false, var3);
                    }
                    this.crossX = super.mouseClickX;
                    this.crossY = super.mouseClickY;
                    this.crossMode = 2;
                    this.crossCycle = 0;
                    this.out.p1isaac((byte) 6, 156);
                    this.out.p2_alt2(-431, var3 + this.sceneBaseTileX);
                    this.out.p2_alt1(true, var4 + this.sceneBaseTileZ);
                    this.out.p2_alt3(0, var6);
                }
                if (var5 == 94) {
                    var13 = this.tryMove(2, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var4, localPlayer.pathTileX[0], false, var3);
                    if (!var13) {
                        this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var4, localPlayer.pathTileX[0], false, var3);
                    }
                    this.crossX = super.mouseClickX;
                    this.crossY = super.mouseClickY;
                    this.crossMode = 2;
                    this.crossCycle = 0;
                    this.out.p1isaac((byte) 6, 181);
                    this.out.p2_alt1(true, var4 + this.sceneBaseTileZ);
                    this.out.p2(var6);
                    this.out.p2_alt1(true, var3 + this.sceneBaseTileX);
                    this.out.p2_alt2(-431, this.activeSpellId);
                }
                if (var5 == 646) {
                    this.out.p1isaac((byte) 6, 185);
                    this.out.p2(var4);
                    var14 = Component.instances[var4];
                    if (var14.scripts != null && var14.scripts[0][0] == 5) {
                        var16 = var14.scripts[0][1];
                        if (this.varps[var16] != var14.scriptOperand[0]) {
                            this.varps[var16] = var14.scriptOperand[0];
                            this.updateVarp(false, var16);
                            this.redrawSidebar = true;
                        }
                    }
                }
                if (var5 == 225) {
                    var7 = this.npcs[var6];
                    if (var7 != null) {
                        this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var7.pathTileZ[0], localPlayer.pathTileX[0], false, var7.pathTileX[0]);
                        this.crossX = super.mouseClickX;
                        this.crossY = super.mouseClickY;
                        this.crossMode = 2;
                        this.crossCycle = 0;
                        oplogic8 += var6;
                        if (oplogic8 >= 85) {
                            this.out.p1isaac((byte) 6, 230);
                            this.out.p1(239);
                            oplogic8 = 0;
                        }
                        this.out.p1isaac((byte) 6, 17);
                        this.out.p2_alt3(0, var6);
                    }
                }
                if (var5 == 965) {
                    var7 = this.npcs[var6];
                    if (var7 != null) {
                        this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var7.pathTileZ[0], localPlayer.pathTileX[0], false, var7.pathTileX[0]);
                        this.crossX = super.mouseClickX;
                        this.crossY = super.mouseClickY;
                        this.crossMode = 2;
                        this.crossCycle = 0;
                        oplogic2++;
                        if (oplogic2 >= 96) {
                            this.out.p1isaac((byte) 6, 152);
                            this.out.p1(88);
                            oplogic2 = 0;
                        }
                        this.out.p1isaac((byte) 6, 21);
                        this.out.p2(var6);
                    }
                }
                if (var5 == 413) {
                    var7 = this.npcs[var6];
                    if (var7 != null) {
                        this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var7.pathTileZ[0], localPlayer.pathTileX[0], false, var7.pathTileX[0]);
                        this.crossX = super.mouseClickX;
                        this.crossY = super.mouseClickY;
                        this.crossMode = 2;
                        this.crossCycle = 0;
                        this.out.p1isaac((byte) 6, 131);
                        this.out.p2_alt3(0, var6);
                        this.out.p2_alt2(-431, this.activeSpellId);
                    }
                }
                if (var5 == 200) {
                    this.closeInterfaces(537);
                }
                if (var5 == 1025) {
                    var7 = this.npcs[var6];
                    if (var7 != null) {
                        NpcType var19 = var7.type;
                        if (var19.multinpc != null) {
                            var19 = var19.getMultiNpc(this._flowObfuscator10);
                        }
                        if (var19 != null) {
                            if (var19.desc != null) {
                                var18 = new String(var19.desc);
                            } else {
                                var18 = "It's a " + var19.name + ".";
                            }
                            this.addMessage(var18, 0, "", this._flowObfuscator21);
                        }
                    }
                }
                if (var5 == 900) {
                    this.interactWithLoc(var6, var4, var3, -770);
                    this.out.p1isaac((byte) 6, 252);
                    this.out.p2_alt3(0, var6 >> 14 & 32767);
                    this.out.p2_alt1(true, var4 + this.sceneBaseTileZ);
                    this.out.p2_alt2(-431, var3 + this.sceneBaseTileX);
                }
                if (var5 == 412) {
                    var7 = this.npcs[var6];
                    if (var7 != null) {
                        this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var7.pathTileZ[0], localPlayer.pathTileX[0], false, var7.pathTileX[0]);
                        this.crossX = super.mouseClickX;
                        this.crossY = super.mouseClickY;
                        this.crossMode = 2;
                        this.crossCycle = 0;
                        this.out.p1isaac((byte) 6, 72);
                        this.out.p2_alt2(-431, var6);
                    }
                }
                if (var5 == 365) {
                    var15 = this.players[var6];
                    if (var15 != null) {
                        this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var15.pathTileZ[0], localPlayer.pathTileX[0], false, var15.pathTileX[0]);
                        this.crossX = super.mouseClickX;
                        this.crossY = super.mouseClickY;
                        this.crossMode = 2;
                        this.crossCycle = 0;
                        this.out.p1isaac((byte) 6, 249);
                        this.out.p2_alt2(-431, var6);
                        this.out.p2_alt1(true, this.activeSpellId);
                    }
                }
                if (var5 == 729) {
                    var15 = this.players[var6];
                    if (var15 != null) {
                        this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var15.pathTileZ[0], localPlayer.pathTileX[0], false, var15.pathTileX[0]);
                        this.crossX = super.mouseClickX;
                        this.crossY = super.mouseClickY;
                        this.crossMode = 2;
                        this.crossCycle = 0;
                        this.out.p1isaac((byte) 6, 39);
                        this.out.p2_alt1(true, var6);
                    }
                }
                if (var5 == 577) {
                    var15 = this.players[var6];
                    if (var15 != null) {
                        this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var15.pathTileZ[0], localPlayer.pathTileX[0], false, var15.pathTileX[0]);
                        this.crossX = super.mouseClickX;
                        this.crossY = super.mouseClickY;
                        this.crossMode = 2;
                        this.crossCycle = 0;
                        this.out.p1isaac((byte) 6, 139);
                        this.out.p2_alt1(true, var6);
                    }
                }
                if (var5 == 956 && this.interactWithLoc(var6, var4, var3, -770)) {
                    this.out.p1isaac((byte) 6, 35);
                    this.out.p2_alt1(true, var3 + this.sceneBaseTileX);
                    this.out.p2_alt2(-431, this.activeSpellId);
                    this.out.p2_alt2(-431, var4 + this.sceneBaseTileZ);
                    this.out.p2_alt1(true, var6 >> 14 & 32767);
                }
                if (var5 == 567) {
                    var13 = this.tryMove(2, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var4, localPlayer.pathTileX[0], false, var3);
                    if (!var13) {
                        this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var4, localPlayer.pathTileX[0], false, var3);
                    }
                    this.crossX = super.mouseClickX;
                    this.crossY = super.mouseClickY;
                    this.crossMode = 2;
                    this.crossCycle = 0;
                    this.out.p1isaac((byte) 6, 23);
                    this.out.p2_alt1(true, var4 + this.sceneBaseTileZ);
                    this.out.p2_alt1(true, var6);
                    this.out.p2_alt1(true, var3 + this.sceneBaseTileX);
                }
                if (var5 == 867) {
                    if ((var6 & 3) == 0) {
                        oplogic1++;
                    }
                    if (oplogic1 >= 59) {
                        this.out.p1isaac((byte) 6, 200);
                        this.out.p2(25501);
                        oplogic1 = 0;
                    }
                    this.out.p1isaac((byte) 6, 43);
                    this.out.p2_alt1(true, var4);
                    this.out.p2_alt2(-431, var6);
                    this.out.p2_alt2(-431, var3);
                    this.selectedCycle = 0;
                    this.selectedInterface = var4;
                    this.selectedItem = var3;
                    this.selectedArea = 2;
                    if (Component.instances[var4].layer == this.viewportInterfaceId) {
                        this.selectedArea = 1;
                    }
                    if (Component.instances[var4].layer == this.chatInterfaceId) {
                        this.selectedArea = 3;
                    }
                }
                if (var5 == 543) {
                    this.out.p1isaac((byte) 6, 237);
                    this.out.p2(var3);
                    this.out.p2_alt2(-431, var6);
                    this.out.p2(var4);
                    this.out.p2_alt2(-431, this.activeSpellId);
                    this.selectedCycle = 0;
                    this.selectedInterface = var4;
                    this.selectedItem = var3;
                    this.selectedArea = 2;
                    if (Component.instances[var4].layer == this.viewportInterfaceId) {
                        this.selectedArea = 1;
                    }
                    if (Component.instances[var4].layer == this.chatInterfaceId) {
                        this.selectedArea = 3;
                    }
                }
                if (var5 == 606) {
                    var17 = this.menuOption[arg0];
                    var16 = var17.indexOf("@whi@");
                    if (var16 != -1) {
                        if (this.viewportInterfaceId == -1) {
                            this.closeInterfaces(537);
                            this.reportAbuseInput = var17.substring(var16 + 5).trim();
                            this.reportAbuseMuteOption = false;
                            for (int var20 = 0; var20 < Component.instances.length; var20++) {
                                if (Component.instances[var20] != null && Component.instances[var20].clientCode == 600) {
                                    this.reportAbuseInterfaceId = this.viewportInterfaceId = Component.instances[var20].layer;
                                    break;
                                }
                            }
                        } else {
                            this.addMessage("Please close the interface you have open before using 'report abuse'", 0, "", this._flowObfuscator21);
                        }
                    }
                }
                if (var5 == 491) {
                    var15 = this.players[var6];
                    if (var15 != null) {
                        this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var15.pathTileZ[0], localPlayer.pathTileX[0], false, var15.pathTileX[0]);
                        this.crossX = super.mouseClickX;
                        this.crossY = super.mouseClickY;
                        this.crossMode = 2;
                        this.crossCycle = 0;
                        this.out.p1isaac((byte) 6, 14);
                        this.out.p2_alt2(-431, this.objSelectedInterface);
                        this.out.p2(var6);
                        this.out.p2(this._flowObfuscator46);
                        this.out.p2_alt1(true, this.objSelectedSlot);
                    }
                }
                if (var5 == 639) {
                    var17 = this.menuOption[arg0];
                    var16 = var17.indexOf("@whi@");
                    if (var16 != -1) {
                        var9 = JString.toBase37(var17.substring(var16 + 5).trim());
                        var11 = -1;
                        for (int var23 = 0; var23 < this.friendCount; var23++) {
                            if (this.friendName37[var23] == var9) {
                                var11 = var23;
                                break;
                            }
                        }
                        if (var11 != -1 && this.friendWorld[var11] > 0) {
                            this.redrawChatback = true;
                            this.chatbackInputOpen = 0;
                            this.showSocialInput = true;
                            this.socialInput = "";
                            this.socialAction = 3;
                            this.socialName37 = this.friendName37[var11];
                            this.socialMessage = "Enter message to send to " + this.friendName[var11];
                        }
                    }
                }
                if (var5 == 454) {
                    this.out.p1isaac((byte) 6, 41);
                    this.out.p2(var6);
                    this.out.p2_alt2(-431, var3);
                    this.out.p2_alt2(-431, var4);
                    this.selectedCycle = 0;
                    this.selectedInterface = var4;
                    this.selectedItem = var3;
                    this.selectedArea = 2;
                    if (Component.instances[var4].layer == this.viewportInterfaceId) {
                        this.selectedArea = 1;
                    }
                    if (Component.instances[var4].layer == this.chatInterfaceId) {
                        this.selectedArea = 3;
                    }
                }
                if (var5 == 478) {
                    var7 = this.npcs[var6];
                    if (var7 != null) {
                        this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var7.pathTileZ[0], localPlayer.pathTileX[0], false, var7.pathTileX[0]);
                        this.crossX = super.mouseClickX;
                        this.crossY = super.mouseClickY;
                        this.crossMode = 2;
                        this.crossCycle = 0;
                        if ((var6 & 3) == 0) {
                            oplogic7++;
                        }
                        if (oplogic7 >= 53) {
                            this.out.p1isaac((byte) 6, 85);
                            this.out.p1(66);
                            oplogic7 = 0;
                        }
                        this.out.p1isaac((byte) 6, 18);
                        this.out.p2_alt1(true, var6);
                    }
                }
                if (var5 == 113) {
                    this.interactWithLoc(var6, var4, var3, -770);
                    this.out.p1isaac((byte) 6, 70);
                    this.out.p2_alt1(true, var3 + this.sceneBaseTileX);
                    this.out.p2(var4 + this.sceneBaseTileZ);
                    this.out.p2_alt3(0, var6 >> 14 & 32767);
                }
                if (var5 == 872) {
                    this.interactWithLoc(var6, var4, var3, -770);
                    this.out.p1isaac((byte) 6, 234);
                    this.out.p2_alt3(0, var3 + this.sceneBaseTileX);
                    this.out.p2_alt2(-431, var6 >> 14 & 32767);
                    this.out.p2_alt3(0, var4 + this.sceneBaseTileZ);
                }
                if (var5 == 502) {
                    this.interactWithLoc(var6, var4, var3, -770);
                    this.out.p1isaac((byte) 6, 132);
                    this.out.p2_alt3(0, var3 + this.sceneBaseTileX);
                    this.out.p2(var6 >> 14 & 32767);
                    this.out.p2_alt2(-431, var4 + this.sceneBaseTileZ);
                }
                ObjType var25;
                if (var5 == 1125) {
                    var25 = ObjType.get(var6);
                    Component var21 = Component.instances[var4];
                    if (var21 != null && var21.invSlotObjCount[var3] >= 100000) {
                        var22 = var21.invSlotObjCount[var3] + " x " + var25.name;
                    } else if (var25.desc != null) {
                        var22 = new String(var25.desc);
                    } else {
                        var22 = "It's a " + var25.name + ".";
                    }
                    this.addMessage(var22, 0, "", this._flowObfuscator21);
                }
                if (var5 == 169) {
                    this.out.p1isaac((byte) 6, 185);
                    this.out.p2(var4);
                    var14 = Component.instances[var4];
                    if (var14.scripts != null && var14.scripts[0][0] == 5) {
                        var16 = var14.scripts[0][1];
                        this.varps[var16] = 1 - this.varps[var16];
                        this.updateVarp(false, var16);
                        this.redrawSidebar = true;
                    }
                }
                if (var5 == 447) {
                    this.objSelected = 1;
                    this.objSelectedSlot = var3;
                    this.objSelectedInterface = var4;
                    this._flowObfuscator46 = var6;
                    this.objSelectedName = ObjType.get(var6).name;
                    this.spellSelected = 0;
                    this.redrawSidebar = true;
                } else {
                    if (var5 == 1226) {
                        int var26 = var6 >> 14 & 32767;
                        LocType var24 = LocType.get(var26);
                        if (var24.desc != null) {
                            var18 = new String(var24.desc);
                        } else {
                            var18 = "It's a " + var24.name + ".";
                        }
                        this.addMessage(var18, 0, "", this._flowObfuscator21);
                    }
                    if (var5 == 244) {
                        var13 = this.tryMove(2, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var4, localPlayer.pathTileX[0], false, var3);
                        if (!var13) {
                            this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var4, localPlayer.pathTileX[0], false, var3);
                        }
                        this.crossX = super.mouseClickX;
                        this.crossY = super.mouseClickY;
                        this.crossMode = 2;
                        this.crossCycle = 0;
                        this.out.p1isaac((byte) 6, 253);
                        this.out.p2_alt1(true, var3 + this.sceneBaseTileX);
                        this.out.p2_alt3(0, var4 + this.sceneBaseTileZ);
                        this.out.p2_alt2(-431, var6);
                    }
                    if (var5 == 1448) {
                        var25 = ObjType.get(var6);
                        if (var25.desc != null) {
                            var22 = new String(var25.desc);
                        } else {
                            var22 = "It's a " + var25.name + ".";
                        }
                        this.addMessage(var22, 0, "", this._flowObfuscator21);
                    }
                    this.objSelected = 0;
                    if (!arg1) {
                        this.spellSelected = 0;
                        this.redrawSidebar = true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
    public final void drawWildyLevel(int arg0) {
        this.overrideChat = 0;
        int var2 = (localPlayer.x >> 7) + this.sceneBaseTileX;
        int var3 = (localPlayer.z >> 7) + this.sceneBaseTileZ;
        int var4 = 58 / arg0;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.overrideChat = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.overrideChat = 1;
        }
        if (this.overrideChat == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.overrideChat = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.flamesThread) {
            this.runFlames((byte) 59);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public final void handleViewportOptions(int arg0) {
        if (this.objSelected == 0 && this.spellSelected == 0) {
            this.menuOption[this.menuSize] = "Walk here";
            this.menuAction[this.menuSize] = 516;
            this.menuParamB[this.menuSize] = super.mouseX;
            this.menuParamC[this.menuSize] = super.mouseY;
            this.menuSize++;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < Model.pickedCount; var3++) {
            int var4 = Model.pickedBitsets[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var4 != var2) {
                var2 = var4;
                int var10;
                if (var7 == 2 && this.scene.getInfo(this.currentLevel, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.get(var8);
                    if (var9.multiloc != null) {
                        var9 = var9.getMultiLoc(true);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.objSelected == 1) {
                        this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @cya@" + var9.name;
                        this.menuAction[this.menuSize] = 62;
                        this.menuParamA[this.menuSize] = var4;
                        this.menuParamB[this.menuSize] = var5;
                        this.menuParamC[this.menuSize] = var6;
                        this.menuSize++;
                    } else if (this.spellSelected == 1) {
                        if ((this.activeSpellFlags & 4) == 4) {
                            this.menuOption[this.menuSize] = this.spellCaption + " @cya@" + var9.name;
                            this.menuAction[this.menuSize] = 956;
                            this.menuParamA[this.menuSize] = var4;
                            this.menuParamB[this.menuSize] = var5;
                            this.menuParamC[this.menuSize] = var6;
                            this.menuSize++;
                        }
                    } else {
                        if (var9.op != null) {
                            for (var10 = 4; var10 >= 0; var10--) {
                                if (var9.op[var10] != null) {
                                    this.menuOption[this.menuSize] = var9.op[var10] + " @cya@" + var9.name;
                                    if (var10 == 0) {
                                        this.menuAction[this.menuSize] = 502;
                                    }
                                    if (var10 == 1) {
                                        this.menuAction[this.menuSize] = 900;
                                    }
                                    if (var10 == 2) {
                                        this.menuAction[this.menuSize] = 113;
                                    }
                                    if (var10 == 3) {
                                        this.menuAction[this.menuSize] = 872;
                                    }
                                    if (var10 == 4) {
                                        this.menuAction[this.menuSize] = 1062;
                                    }
                                    this.menuParamA[this.menuSize] = var4;
                                    this.menuParamB[this.menuSize] = var5;
                                    this.menuParamC[this.menuSize] = var6;
                                    this.menuSize++;
                                }
                            }
                        }
                        this.menuOption[this.menuSize] = "Examine @cya@" + var9.name;
                        this.menuAction[this.menuSize] = 1226;
                        this.menuParamA[this.menuSize] = var9.type << 14;
                        this.menuParamB[this.menuSize] = var5;
                        this.menuParamC[this.menuSize] = var6;
                        this.menuSize++;
                    }
                }
                NpcEntity var11;
                PlayerEntity var12;
                int var16;
                if (var7 == 1) {
                    NpcEntity var13 = this.npcs[var8];
                    if (var13.type.size == 1 && (var13.x & 127) == 64 && (var13.z & 127) == 64) {
                        for (var10 = 0; var10 < this.npcCount; var10++) {
                            var11 = this.npcs[this.npcIds[var10]];
                            if (var11 != null && var11 != var13 && var11.type.size == 1 && var11.x == var13.x && var11.z == var13.z) {
                                this.addNPCOptions(var11.type, this.npcIds[var10], false, var6, var5);
                            }
                        }
                        for (var16 = 0; var16 < this.playerCount; var16++) {
                            var12 = this.players[this.playerIds[var16]];
                            if (var12 != null && var12.x == var13.x && var12.z == var13.z) {
                                this.addPlayerOptions(var5, this.playerIds[var16], var12, false, var6);
                            }
                        }
                    }
                    this.addNPCOptions(var13.type, var8, false, var6, var5);
                }
                if (var7 == 0) {
                    PlayerEntity var14 = this.players[var8];
                    if ((var14.x & 127) == 64 && (var14.z & 127) == 64) {
                        for (var10 = 0; var10 < this.npcCount; var10++) {
                            var11 = this.npcs[this.npcIds[var10]];
                            if (var11 != null && var11.type.size == 1 && var11.x == var14.x && var11.z == var14.z) {
                                this.addNPCOptions(var11.type, this.npcIds[var10], false, var6, var5);
                            }
                        }
                        for (var16 = 0; var16 < this.playerCount; var16++) {
                            var12 = this.players[this.playerIds[var16]];
                            if (var12 != null && var12 != var14 && var12.x == var14.x && var12.z == var14.z) {
                                this.addPlayerOptions(var5, this.playerIds[var16], var12, false, var6);
                            }
                        }
                    }
                    this.addPlayerOptions(var5, var8, var14, false, var6);
                }
                if (var7 == 3) {
                    LinkList var15 = this.levelObjStacks[this.currentLevel][var5][var6];
                    if (var15 != null) {
                        for (ObjStackEntity var17 = (ObjStackEntity) var15.tail(5); var17 != null; var17 = (ObjStackEntity) var15.prev(8)) {
                            ObjType var19 = ObjType.get(var17.type);
                            if (this.objSelected == 1) {
                                this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @lre@" + var19.name;
                                this.menuAction[this.menuSize] = 511;
                                this.menuParamA[this.menuSize] = var17.type;
                                this.menuParamB[this.menuSize] = var5;
                                this.menuParamC[this.menuSize] = var6;
                                this.menuSize++;
                            } else if (this.spellSelected == 1) {
                                if ((this.activeSpellFlags & 1) == 1) {
                                    this.menuOption[this.menuSize] = this.spellCaption + " @lre@" + var19.name;
                                    this.menuAction[this.menuSize] = 94;
                                    this.menuParamA[this.menuSize] = var17.type;
                                    this.menuParamB[this.menuSize] = var5;
                                    this.menuParamC[this.menuSize] = var6;
                                    this.menuSize++;
                                }
                            } else {
                                for (int var18 = 4; var18 >= 0; var18--) {
                                    if (var19.op != null && var19.op[var18] != null) {
                                        this.menuOption[this.menuSize] = var19.op[var18] + " @lre@" + var19.name;
                                        if (var18 == 0) {
                                            this.menuAction[this.menuSize] = 652;
                                        }
                                        if (var18 == 1) {
                                            this.menuAction[this.menuSize] = 567;
                                        }
                                        if (var18 == 2) {
                                            this.menuAction[this.menuSize] = 234;
                                        }
                                        if (var18 == 3) {
                                            this.menuAction[this.menuSize] = 244;
                                        }
                                        if (var18 == 4) {
                                            this.menuAction[this.menuSize] = 213;
                                        }
                                        this.menuParamA[this.menuSize] = var17.type;
                                        this.menuParamB[this.menuSize] = var5;
                                        this.menuParamC[this.menuSize] = var6;
                                        this.menuSize++;
                                    } else if (var18 == 2) {
                                        this.menuOption[this.menuSize] = "Take @lre@" + var19.name;
                                        this.menuAction[this.menuSize] = 234;
                                        this.menuParamA[this.menuSize] = var17.type;
                                        this.menuParamB[this.menuSize] = var5;
                                        this.menuParamC[this.menuSize] = var6;
                                        this.menuSize++;
                                    }
                                }
                                this.menuOption[this.menuSize] = "Examine @lre@" + var19.name;
                                this.menuAction[this.menuSize] = 1448;
                                this.menuParamA[this.menuSize] = var17.type;
                                this.menuParamB[this.menuSize] = var5;
                                this.menuParamC[this.menuSize] = var6;
                                this.menuSize++;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 33660) {
            this.packetType = this.in.g1();
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void unload(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.stream != null) {
                this.stream.close();
            }
        } catch (Exception var2) {
        }
        this.stream = null;
        this.stopMidi(860);
        if (this.mouseTracking != null) {
            this.mouseTracking.active = false;
        }
        this.mouseTracking = null;
        this.ondemand.stop();
        this.ondemand = null;
        this.chatBuffer = null;
        this.out = null;
        this.login = null;
        this.in = null;
        this.sceneMapIndex = null;
        this.sceneMapLandData = null;
        this.sceneMapLocData = null;
        this.sceneMapLandFile = null;
        this.sceneMapLocFile = null;
        this.levelHeightmap = null;
        this.levelTileFlags = null;
        this.scene = null;
        this.levelCollisionMap = null;
        this.bfsDirection = null;
        this.bfsCost = null;
        this.bfsStepX = null;
        this.bfsStepZ = null;
        this.textureBuffer = null;
        this.areaSidebar = null;
        this.areaMapback = null;
        this.areaViewport = null;
        this.areaChatback = null;
        this.areaBackbase1 = null;
        this.areaBackbase2 = null;
        this.areaBackhmid1 = null;
        this.areaBackleft1 = null;
        this.areaBackleft2 = null;
        this.areaBackright1 = null;
        this.areaBackright2 = null;
        this.areaBacktop1 = null;
        this.areaBackvmid1 = null;
        this.areaBackvmid2 = null;
        this.areaBackvmid3 = null;
        this.areaBackhmid2 = null;
        this.imageInvback = null;
        this.imageMapback = null;
        this.imageChatback = null;
        this.imageBackbase1 = null;
        this.imageBackbase2 = null;
        this.imageBackhmid1 = null;
        this.imageSideicons = null;
        this.imageRedstone1 = null;
        this.imageRedstone2 = null;
        this.imageRedstone3 = null;
        this.imageRedstone1h = null;
        this.imageRedstone2h = null;
        this.imageRedstone1v = null;
        this.imageRedstone2v = null;
        this.imageRedstone3v = null;
        this.imageRedstone1hv = null;
        this.imageRedstone2hv = null;
        this.imageCompass = null;
        this.imageHitmarks = null;
        this.imageHeadicons = null;
        this.imageCrosses = null;
        this.imageMapdot0 = null;
        this.imageMapdot1 = null;
        this.imageMapdot2 = null;
        this.imageMapdot3 = null;
        this.imageMapdot4 = null;
        this.imageMapscene = null;
        this.imageMapfunction = null;
        this.tileLastOccupiedCycle = null;
        this.players = null;
        this.playerIds = null;
        this.entityUpdateIds = null;
        this.playerAppearanceBuffer = null;
        this.entityRemovalIds = null;
        this.npcs = null;
        this.npcIds = null;
        this.levelObjStacks = null;
        this.temporaryLocs = null;
        int var3 = 55 / arg0;
        this.projectiles = null;
        this.spotanims = null;
        this.menuParamB = null;
        this.menuParamC = null;
        this.menuAction = null;
        this.menuParamA = null;
        this.menuOption = null;
        this.varps = null;
        this.activeMapFunctionX = null;
        this.activeMapFunctionZ = null;
        this.activeMapFunctions = null;
        this.imageMinimap = null;
        this.friendName = null;
        this.friendName37 = null;
        this.friendWorld = null;
        this.imageTitle0 = null;
        this.imageTitle1 = null;
        this.imageTitle2 = null;
        this.imageTitle3 = null;
        this.imageTitle4 = null;
        this.imageTitle5 = null;
        this.imageTitle6 = null;
        this.imageTitle7 = null;
        this.imageTitle8 = null;
        this.unloadTitle(3);
        LocType.unload(-501);
        NpcType.unload(-501);
        ObjType.unload(-501);
        FloType.instances = null;
        IdkType.instances = null;
        Component.instances = null;
        UnkType.instances = null;
        SeqType.instances = null;
        SpotAnimType.instances = null;
        SpotAnimType.modelCache = null;
        VarpType.instances = null;
        super.drawArea = null;
        PlayerEntity.modelCache = null;
        Draw3D.unload(-501);
        World3D.unload(-501);
        Model.unload(-501);
        AnimFrame.unload(-501);
        System.gc();
        if (Linkable._flowObfuscator2) {
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public void debug(byte arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.frameCycle);
        if (this.ondemand != null) {
            System.out.println("Od-cycle:" + this.ondemand.cycle);
        }
        System.out.println("loop-cycle:" + loopCycle);
        System.out.println("draw-cycle:" + drawCycle);
        System.out.println("ptype:" + this.packetType);
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this._flowObfuscator19 = 281;
        }
        System.out.println("psize:" + this.packetSize);
        if (this.stream != null) {
            this.stream.debug((byte) 1);
        }
        super.showDebug = true;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component getBaseComponent(int arg0) {
        this.packetSize += arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.frame != null ? super.frame : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public final void handleInputKey(int arg0) {
        int var8 = 55 / arg0;
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.pollKey(-796);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.viewportInterfaceId != -1 && this.viewportInterfaceId == this.reportAbuseInterfaceId) {
                        if (var2 == 8 && this.reportAbuseInput.length() > 0) {
                            this.reportAbuseInput = this.reportAbuseInput.substring(0, this.reportAbuseInput.length() - 1);
                        }
                        break;
                    }
                    int var3;
                    if (this.showSocialInput) {
                        if (var2 >= 32 && var2 <= 122 && this.socialInput.length() < 80) {
                            this.socialInput = this.socialInput + (char) var2;
                            this.redrawChatback = true;
                        }
                        if (var2 == 8 && this.socialInput.length() > 0) {
                            this.socialInput = this.socialInput.substring(0, this.socialInput.length() - 1);
                            this.redrawChatback = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.showSocialInput = false;
                            this.redrawChatback = true;
                            long var12;
                            if (this.socialAction == 1) {
                                var12 = JString.toBase37(this.socialInput);
                                this.addFriend((byte) 68, var12);
                            }
                            if (this.socialAction == 2 && this.friendCount > 0) {
                                var12 = JString.toBase37(this.socialInput);
                                this.removeFriend(false, var12);
                            }
                            if (this.socialAction == 3 && this.socialInput.length() > 0) {
                                this.out.p1isaac((byte) 6, 126);
                                this.out.p1(0);
                                var3 = this.out.pos;
                                this.out.p8(5, this.socialName37);
                                WordPack.pack(this.socialInput, this._flowObfuscator45, this.out);
                                this.out.psize1(this.out.pos - var3, (byte) 0);
                                this.socialInput = WordPack.format(this.socialInput, 0);
                                this.socialInput = WordFilter.filter(this.socialInput, 0);
                                this.addMessage(this.socialInput, 6, JString.toSentenceCase(-45804, JString.fromBase37(this.socialName37, (byte) -99)), this._flowObfuscator21);
                                if (this.privateChatSetting == 2) {
                                    this.privateChatSetting = 1;
                                    this.redrawPrivacySettings = true;
                                    this.out.p1isaac((byte) 6, 95);
                                    this.out.p1(this.publicChatSetting);
                                    this.out.p1(this.privateChatSetting);
                                    this.out.p1(this.tradeChatSetting);
                                }
                            }
                            if (this.socialAction == 4 && this.ignoreCount < 100) {
                                var12 = JString.toBase37(this.socialInput);
                                this.addIgnore(var12, 4);
                            }
                            if (this.socialAction == 5 && this.ignoreCount > 0) {
                                var12 = JString.toBase37(this.socialInput);
                                this.removeIgnore(3, var12);
                            }
                        }
                    } else if (this.chatbackInputOpen == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.chatbackInput.length() < 10) {
                            this.chatbackInput = this.chatbackInput + (char) var2;
                            this.redrawChatback = true;
                        }
                        if (var2 == 8 && this.chatbackInput.length() > 0) {
                            this.chatbackInput = this.chatbackInput.substring(0, this.chatbackInput.length() - 1);
                            this.redrawChatback = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.chatbackInput.length() > 0) {
                                var3 = 0;
                                try {
                                    var3 = Integer.parseInt(this.chatbackInput);
                                } catch (Exception var7) {
                                }
                                this.out.p1isaac((byte) 6, 208);
                                this.out.p4(var3);
                            }
                            this.chatbackInputOpen = 0;
                            this.redrawChatback = true;
                        }
                    } else if (this.chatbackInputOpen == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.chatbackInput.length() < 12) {
                            this.chatbackInput = this.chatbackInput + (char) var2;
                            this.redrawChatback = true;
                        }
                        if (var2 == 8 && this.chatbackInput.length() > 0) {
                            this.chatbackInput = this.chatbackInput.substring(0, this.chatbackInput.length() - 1);
                            this.redrawChatback = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.chatbackInput.length() > 0) {
                                this.out.p1isaac((byte) 6, 60);
                                this.out.p8(5, JString.toBase37(this.chatbackInput));
                            }
                            this.chatbackInputOpen = 0;
                            this.redrawChatback = true;
                        }
                    } else if (this.chatInterfaceId == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.chatTyped.length() < 80) {
                            this.chatTyped = this.chatTyped + (char) var2;
                            this.redrawChatback = true;
                        }
                        if (var2 == 8 && this.chatTyped.length() > 0) {
                            this.chatTyped = this.chatTyped.substring(0, this.chatTyped.length() - 1);
                            this.redrawChatback = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.chatTyped.length() > 0) {
                            if (this.rights == 2) {
                                if (this.chatTyped.equals("::clientdrop")) {
                                    this.tryReconnect(-670);
                                }
                                if (this.chatTyped.equals("::lag")) {
                                    this.debug((byte) 1);
                                }
                                if (this.chatTyped.equals("::prefetchmusic")) {
                                    for (var3 = 0; var3 < this.ondemand.getFileCount(79, 2); var3++) {
                                        this.ondemand.prefetch((byte) 1, 2, var3, (byte) 8);
                                    }
                                }
                                if (this.chatTyped.equals("::fpson")) {
                                    showFps = true;
                                }
                                if (this.chatTyped.equals("::fpsoff")) {
                                    showFps = false;
                                }
                                if (this.chatTyped.equals("::noclip")) {
                                    for (var3 = 0; var3 < 4; var3++) {
                                        for (int var4 = 1; var4 < 103; var4++) {
                                            for (int var5 = 1; var5 < 103; var5++) {
                                                this.levelCollisionMap[var3].flags[var4][var5] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.chatTyped.startsWith("::")) {
                                this.out.p1isaac((byte) 6, 103);
                                this.out.p1(this.chatTyped.length() - 1);
                                this.out.pjstr(this.chatTyped.substring(2));
                            } else {
                                String var9 = this.chatTyped.toLowerCase();
                                byte var10 = 0;
                                if (var9.startsWith("yellow:")) {
                                    var10 = 0;
                                    this.chatTyped = this.chatTyped.substring(7);
                                } else if (var9.startsWith("red:")) {
                                    var10 = 1;
                                    this.chatTyped = this.chatTyped.substring(4);
                                } else if (var9.startsWith("green:")) {
                                    var10 = 2;
                                    this.chatTyped = this.chatTyped.substring(6);
                                } else if (var9.startsWith("cyan:")) {
                                    var10 = 3;
                                    this.chatTyped = this.chatTyped.substring(5);
                                } else if (var9.startsWith("purple:")) {
                                    var10 = 4;
                                    this.chatTyped = this.chatTyped.substring(7);
                                } else if (var9.startsWith("white:")) {
                                    var10 = 5;
                                    this.chatTyped = this.chatTyped.substring(6);
                                } else if (var9.startsWith("flash1:")) {
                                    var10 = 6;
                                    this.chatTyped = this.chatTyped.substring(7);
                                } else if (var9.startsWith("flash2:")) {
                                    var10 = 7;
                                    this.chatTyped = this.chatTyped.substring(7);
                                } else if (var9.startsWith("flash3:")) {
                                    var10 = 8;
                                    this.chatTyped = this.chatTyped.substring(7);
                                } else if (var9.startsWith("glow1:")) {
                                    var10 = 9;
                                    this.chatTyped = this.chatTyped.substring(6);
                                } else if (var9.startsWith("glow2:")) {
                                    var10 = 10;
                                    this.chatTyped = this.chatTyped.substring(6);
                                } else if (var9.startsWith("glow3:")) {
                                    var10 = 11;
                                    this.chatTyped = this.chatTyped.substring(6);
                                }
                                var9 = this.chatTyped.toLowerCase();
                                byte var11 = 0;
                                if (var9.startsWith("wave:")) {
                                    var11 = 1;
                                    this.chatTyped = this.chatTyped.substring(5);
                                } else if (var9.startsWith("wave2:")) {
                                    var11 = 2;
                                    this.chatTyped = this.chatTyped.substring(6);
                                } else if (var9.startsWith("shake:")) {
                                    var11 = 3;
                                    this.chatTyped = this.chatTyped.substring(6);
                                } else if (var9.startsWith("scroll:")) {
                                    var11 = 4;
                                    this.chatTyped = this.chatTyped.substring(7);
                                } else if (var9.startsWith("slide:")) {
                                    var11 = 5;
                                    this.chatTyped = this.chatTyped.substring(6);
                                }
                                this.out.p1isaac((byte) 6, 4);
                                this.out.p1(0);
                                int var6 = this.out.pos;
                                this.out.p1_alt3(301, var11);
                                this.out.p1_alt3(301, var10);
                                this.chatBuffer.pos = 0;
                                WordPack.pack(this.chatTyped, this._flowObfuscator45, this.chatBuffer);
                                this.out.pdata_alt2(0, this._flowObfuscator39, this.chatBuffer.data, this.chatBuffer.pos);
                                this.out.psize1(this.out.pos - var6, (byte) 0);
                                this.chatTyped = WordPack.format(this.chatTyped, 0);
                                this.chatTyped = WordFilter.filter(this.chatTyped, 0);
                                localPlayer.chat = this.chatTyped;
                                localPlayer.chatColor = var10;
                                localPlayer.chatStyle = var11;
                                localPlayer.chatTimer = 150;
                                if (this.rights == 2) {
                                    this.addMessage(localPlayer.chat, 2, "@cr2@" + localPlayer.name, this._flowObfuscator21);
                                } else if (this.rights == 1) {
                                    this.addMessage(localPlayer.chat, 2, "@cr1@" + localPlayer.name, this._flowObfuscator21);
                                } else {
                                    this.addMessage(localPlayer.chat, 2, localPlayer.name, this._flowObfuscator21);
                                }
                                if (this.publicChatSetting == 2) {
                                    this.publicChatSetting = 3;
                                    this.redrawPrivacySettings = true;
                                    this.out.p1isaac((byte) 6, 95);
                                    this.out.p1(this.publicChatSetting);
                                    this.out.p1(this.privateChatSetting);
                                    this.out.p1(this.tradeChatSetting);
                                }
                            }
                            this.chatTyped = "";
                            this.redrawChatback = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.reportAbuseInput.length() < 12) {
                this.reportAbuseInput = this.reportAbuseInput + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)V")
    public final void handlePrivateChatInput(int arg0, int arg1, int arg2) {
        if (arg2 != this._flowObfuscator7) {
            this._flowObfuscator7 = this.randomIn.nextInt();
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; var5++) {
            if (this.messageText[var5] != null) {
                int var6 = this.messageType[var5];
                int var7 = 70 - var4 * 14 + this.chatScrollOffset + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.messageSender[var5];
                boolean var9 = false;
                if (var8 != null && var8.startsWith("@cr1@")) {
                    var8 = var8.substring(5);
                    var9 = true;
                }
                if (var8 != null && var8.startsWith("@cr2@")) {
                    var8 = var8.substring(5);
                    var9 = true;
                }
                if (var6 == 0) {
                    var4++;
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.publicChatSetting == 0 || this.publicChatSetting == 1 && this.isFriend(false, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(localPlayer.name)) {
                        if (this.rights >= 1) {
                            this.menuOption[this.menuSize] = "Report abuse @whi@" + var8;
                            this.menuAction[this.menuSize] = 606;
                            this.menuSize++;
                        }
                        this.menuOption[this.menuSize] = "Add ignore @whi@" + var8;
                        this.menuAction[this.menuSize] = 42;
                        this.menuSize++;
                        this.menuOption[this.menuSize] = "Add friend @whi@" + var8;
                        this.menuAction[this.menuSize] = 337;
                        this.menuSize++;
                    }
                    var4++;
                }
                if ((var6 == 3 || var6 == 7) && this.splitPrivateChat == 0 && (var6 == 7 || this.privateChatSetting == 0 || this.privateChatSetting == 1 && this.isFriend(false, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.rights >= 1) {
                            this.menuOption[this.menuSize] = "Report abuse @whi@" + var8;
                            this.menuAction[this.menuSize] = 606;
                            this.menuSize++;
                        }
                        this.menuOption[this.menuSize] = "Add ignore @whi@" + var8;
                        this.menuAction[this.menuSize] = 42;
                        this.menuSize++;
                        this.menuOption[this.menuSize] = "Add friend @whi@" + var8;
                        this.menuAction[this.menuSize] = 337;
                        this.menuSize++;
                    }
                    var4++;
                }
                if (var6 == 4 && (this.tradeChatSetting == 0 || this.tradeChatSetting == 1 && this.isFriend(false, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.menuOption[this.menuSize] = "Accept trade @whi@" + var8;
                        this.menuAction[this.menuSize] = 484;
                        this.menuSize++;
                    }
                    var4++;
                }
                if ((var6 == 5 || var6 == 6) && this.splitPrivateChat == 0 && this.privateChatSetting < 2) {
                    var4++;
                }
                if (var6 == 8 && (this.tradeChatSetting == 0 || this.tradeChatSetting == 1 && this.isFriend(false, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.menuOption[this.menuSize] = "Accept challenge @whi@" + var8;
                        this.menuAction[this.menuSize] = 6;
                        this.menuSize++;
                    }
                    var4++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILDUCMKFAY;)V")
    public final void updateInterfaceContent(int arg0, Component arg1) {
        int var3 = arg1.clientCode;
        if (arg0 <= 0) {
            this.out.p1(49);
        }
        int var4;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                var4 = this.friendCount;
                if (this.friendListStatus != 2) {
                    var4 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var4) {
                    arg1.text = "";
                    arg1.buttonType = 0;
                } else {
                    if (this.friendWorld[var3] == 0) {
                        arg1.text = "@red@Offline";
                    } else if (this.friendWorld[var3] == nodeId) {
                        arg1.text = "@gre@World-" + (this.friendWorld[var3] - 9);
                    } else {
                        arg1.text = "@yel@World-" + (this.friendWorld[var3] - 9);
                    }
                    arg1.buttonType = 1;
                }
            } else if (var3 == 203) {
                var4 = this.friendCount;
                if (this.friendListStatus != 2) {
                    var4 = 0;
                }
                arg1.scroll = var4 * 15 + 20;
                if (arg1.scroll <= arg1.height) {
                    arg1.scroll = arg1.height + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.friendListStatus == 0) {
                    arg1.text = "Loading ignore list";
                    arg1.buttonType = 0;
                } else if (var3 == 1 && this.friendListStatus == 0) {
                    arg1.text = "Please wait...";
                    arg1.buttonType = 0;
                } else {
                    var4 = this.ignoreCount;
                    if (this.friendListStatus == 0) {
                        var4 = 0;
                    }
                    if (var3 >= var4) {
                        arg1.text = "";
                        arg1.buttonType = 0;
                    } else {
                        arg1.text = JString.toSentenceCase(-45804, JString.fromBase37(this.ignoreName37[var3], (byte) -99));
                        arg1.buttonType = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.scroll = this.ignoreCount * 15 + 20;
                if (arg1.scroll <= arg1.height) {
                    arg1.scroll = arg1.height + 1;
                }
            } else if (var3 == 327) {
                arg1.xan = 150;
                arg1.yan = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 2047;
                if (this.updateDesignModel) {
                    for (var4 = 0; var4 < 7; var4++) {
                        int var5 = this.designIdentikits[var4];
                        if (var5 >= 0 && !IdkType.instances[var5].validateModel((byte) 2)) {
                            return;
                        }
                    }
                    this.updateDesignModel = false;
                    Model[] var11 = new Model[7];
                    int var6 = 0;
                    for (int var7 = 0; var7 < 7; var7++) {
                        int var8 = this.designIdentikits[var7];
                        if (var8 >= 0) {
                            var11[var6++] = IdkType.instances[var8].getModel(false);
                        }
                    }
                    Model var12 = new Model(var6, var11, -38);
                    for (int var9 = 0; var9 < 5; var9++) {
                        if (this.designColors[var9] != 0) {
                            var12.recolour(DESIGN_BODY_COLOR[var9][0], DESIGN_BODY_COLOR[var9][this.designColors[var9]]);
                            if (var9 == 1) {
                                var12.recolour(DESIGN_HAIR_COLOR[0], DESIGN_HAIR_COLOR[this.designColors[var9]]);
                            }
                        }
                    }
                    var12.createLabelReferences((byte) -71);
                    var12.applyTransform(SeqType.instances[localPlayer.seqStandId].frames[0], 40542);
                    var12.calculateNormals(64, 850, -30, -50, -30, true);
                    arg1.modelType = 5;
                    arg1.model = 0;
                    Component.cacheModel(0, this._flowObfuscator22, 5, var12);
                }
            } else if (var3 == 324) {
                if (this.genderButtonImage0 == null) {
                    this.genderButtonImage0 = arg1.graphic;
                    this.genderButtonImage1 = arg1.activeGraphic;
                }
                if (this.designGenderMale) {
                    arg1.graphic = this.genderButtonImage1;
                } else {
                    arg1.graphic = this.genderButtonImage0;
                }
            } else if (var3 == 325) {
                if (this.genderButtonImage0 == null) {
                    this.genderButtonImage0 = arg1.graphic;
                    this.genderButtonImage1 = arg1.activeGraphic;
                }
                if (this.designGenderMale) {
                    arg1.graphic = this.genderButtonImage0;
                } else {
                    arg1.graphic = this.genderButtonImage1;
                }
            } else if (var3 == 600) {
                arg1.text = this.reportAbuseInput;
                if (loopCycle % 20 < 10) {
                    arg1.text = arg1.text + "|";
                } else {
                    arg1.text = arg1.text + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.rights >= 1) {
                        if (this.reportAbuseMuteOption) {
                            arg1.colour = 16711680;
                            arg1.text = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.colour = 16777215;
                            arg1.text = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.text = "";
                    }
                }
                String var10;
                if (var3 == 650 || var3 == 655) {
                    if (this.lastAddress != 0) {
                        if (this.daysSinceLastLogin == 0) {
                            var10 = "earlier today";
                        } else if (this.daysSinceLastLogin == 1) {
                            var10 = "yesterday";
                        } else {
                            var10 = this.daysSinceLastLogin + " days ago";
                        }
                        arg1.text = "You last logged in " + var10 + " from: " + signlink.dns;
                    } else {
                        arg1.text = "";
                    }
                }
                if (var3 == 651) {
                    if (this.unreadMessages == 0) {
                        arg1.text = "0 unread messages";
                        arg1.colour = 16776960;
                    }
                    if (this.unreadMessages == 1) {
                        arg1.text = "1 unread message";
                        arg1.colour = 65280;
                    }
                    if (this.unreadMessages > 1) {
                        arg1.text = this.unreadMessages + " unread messages";
                        arg1.colour = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.daysSinceRecoveriesChanged == 201) {
                        if (this.warnMembersInNonMembers == 1) {
                            arg1.text = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg1.text = "";
                        }
                    } else if (this.daysSinceRecoveriesChanged == 200) {
                        arg1.text = "You have not yet set any password recovery questions.";
                    } else {
                        if (this.daysSinceRecoveriesChanged == 0) {
                            var10 = "Earlier today";
                        } else if (this.daysSinceRecoveriesChanged == 1) {
                            var10 = "Yesterday";
                        } else {
                            var10 = this.daysSinceRecoveriesChanged + " days ago";
                        }
                        arg1.text = var10 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.daysSinceRecoveriesChanged == 201) {
                        if (this.warnMembersInNonMembers == 1) {
                            arg1.text = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg1.text = "";
                        }
                    } else if (this.daysSinceRecoveriesChanged == 200) {
                        arg1.text = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg1.text = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.daysSinceRecoveriesChanged == 201) {
                        if (this.warnMembersInNonMembers == 1) {
                            arg1.text = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg1.text = "";
                        }
                    } else if (this.daysSinceRecoveriesChanged == 200) {
                        arg1.text = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg1.text = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.friendListStatus == 0) {
            arg1.text = "Loading friend list";
            arg1.buttonType = 0;
        } else if (var3 == 1 && this.friendListStatus == 1) {
            arg1.text = "Connecting to friendserver";
            arg1.buttonType = 0;
        } else if (var3 == 2 && this.friendListStatus != 2) {
            arg1.text = "Please wait...";
            arg1.buttonType = 0;
        } else {
            var4 = this.friendCount;
            if (this.friendListStatus != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                var3--;
            }
            if (var3 >= var4) {
                arg1.text = "";
                arg1.buttonType = 0;
            } else {
                arg1.text = this.friendName[var3];
                arg1.buttonType = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void drawPrivateMessages(byte arg0) {
        if (this.splitPrivateChat != 0) {
            PixFont var2 = this.fontPlain12;
            if (arg0 != this._flowObfuscator44) {
                _flowObfuscator42 = !_flowObfuscator42;
            }
            int var3 = 0;
            if (this.systemUpdateTimer != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; var4++) {
                if (this.messageText[var4] != null) {
                    int var5 = this.messageType[var4];
                    String var6 = this.messageSender[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    int var8;
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.privateChatSetting == 0 || this.privateChatSetting == 1 && this.isFriend(false, var6))) {
                        var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.drawString(0, "From", var8, 822, var9);
                        var2.drawString(65535, "From", var8 - 1, 822, var9);
                        int var10 = var9 + var2.stringWidthTag(this._flowObfuscator32, "From ");
                        if (var7 == 1) {
                            this.imageModIcons[0].draw(var10, 16083, var8 - 12);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.imageModIcons[1].draw(var10, 16083, var8 - 12);
                            var10 += 14;
                        }
                        var2.drawString(0, var6 + ": " + this.messageText[var4], var8, 822, var10);
                        var2.drawString(65535, var6 + ": " + this.messageText[var4], var8 - 1, 822, var10);
                        var3++;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.privateChatSetting < 2) {
                        var8 = 329 - var3 * 13;
                        var2.drawString(0, this.messageText[var4], var8, 822, 4);
                        var2.drawString(65535, this.messageText[var4], var8 - 1, 822, 4);
                        var3++;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.privateChatSetting < 2) {
                        var8 = 329 - var3 * 13;
                        var2.drawString(0, "To " + var6 + ": " + this.messageText[var4], var8, 822, 4);
                        var2.drawString(65535, "To " + var6 + ": " + this.messageText[var4], var8 - 1, 822, 4);
                        var3++;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)V")
    public final void addMessage(String arg0, int arg1, String arg2, boolean arg3) {
        if (!arg3) {
            if (arg1 == 0 && this.stickyChatInterfaceId != -1) {
                this.modalMessage = arg0;
                super.mouseClickButton = 0;
            }
            if (this.chatInterfaceId == -1) {
                this.redrawChatback = true;
            }
            for (int var5 = 99; var5 > 0; var5--) {
                this.messageType[var5] = this.messageType[var5 - 1];
                this.messageSender[var5] = this.messageSender[var5 - 1];
                this.messageText[var5] = this.messageText[var5 - 1];
            }
            this.messageType[0] = arg1;
            this.messageSender[0] = arg2;
            this.messageText[0] = arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
    public final void handleTabInput(int arg0) {
        int var2 = 72 / arg0;
        if (super.mouseClickButton == 1) {
            if (super.mouseClickX >= 539 && super.mouseClickX <= 573 && super.mouseClickY >= 169 && super.mouseClickY < 205 && this.tabInterfaceId[0] != -1) {
                this.redrawSidebar = true;
                this.selectedTab = 0;
                this.redrawSideicons = true;
            }
            if (super.mouseClickX >= 569 && super.mouseClickX <= 599 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.tabInterfaceId[1] != -1) {
                this.redrawSidebar = true;
                this.selectedTab = 1;
                this.redrawSideicons = true;
            }
            if (super.mouseClickX >= 597 && super.mouseClickX <= 627 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.tabInterfaceId[2] != -1) {
                this.redrawSidebar = true;
                this.selectedTab = 2;
                this.redrawSideicons = true;
            }
            if (super.mouseClickX >= 625 && super.mouseClickX <= 669 && super.mouseClickY >= 168 && super.mouseClickY < 203 && this.tabInterfaceId[3] != -1) {
                this.redrawSidebar = true;
                this.selectedTab = 3;
                this.redrawSideicons = true;
            }
            if (super.mouseClickX >= 666 && super.mouseClickX <= 696 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.tabInterfaceId[4] != -1) {
                this.redrawSidebar = true;
                this.selectedTab = 4;
                this.redrawSideicons = true;
            }
            if (super.mouseClickX >= 694 && super.mouseClickX <= 724 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.tabInterfaceId[5] != -1) {
                this.redrawSidebar = true;
                this.selectedTab = 5;
                this.redrawSideicons = true;
            }
            if (super.mouseClickX >= 722 && super.mouseClickX <= 756 && super.mouseClickY >= 169 && super.mouseClickY < 205 && this.tabInterfaceId[6] != -1) {
                this.redrawSidebar = true;
                this.selectedTab = 6;
                this.redrawSideicons = true;
            }
            if (super.mouseClickX >= 540 && super.mouseClickX <= 574 && super.mouseClickY >= 466 && super.mouseClickY < 502 && this.tabInterfaceId[7] != -1) {
                this.redrawSidebar = true;
                this.selectedTab = 7;
                this.redrawSideicons = true;
            }
            if (super.mouseClickX >= 572 && super.mouseClickX <= 602 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.tabInterfaceId[8] != -1) {
                this.redrawSidebar = true;
                this.selectedTab = 8;
                this.redrawSideicons = true;
            }
            if (super.mouseClickX >= 599 && super.mouseClickX <= 629 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.tabInterfaceId[9] != -1) {
                this.redrawSidebar = true;
                this.selectedTab = 9;
                this.redrawSideicons = true;
            }
            if (super.mouseClickX >= 627 && super.mouseClickX <= 671 && super.mouseClickY >= 467 && super.mouseClickY < 502 && this.tabInterfaceId[10] != -1) {
                this.redrawSidebar = true;
                this.selectedTab = 10;
                this.redrawSideicons = true;
            }
            if (super.mouseClickX >= 669 && super.mouseClickX <= 699 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.tabInterfaceId[11] != -1) {
                this.redrawSidebar = true;
                this.selectedTab = 11;
                this.redrawSideicons = true;
            }
            if (super.mouseClickX >= 696 && super.mouseClickX <= 726 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.tabInterfaceId[12] != -1) {
                this.redrawSidebar = true;
                this.selectedTab = 12;
                this.redrawSideicons = true;
            }
            if (super.mouseClickX >= 724 && super.mouseClickX <= 758 && super.mouseClickY >= 466 && super.mouseClickY < 502 && this.tabInterfaceId[13] != -1) {
                this.redrawSidebar = true;
                this.selectedTab = 13;
                this.redrawSideicons = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void prepareGameScreen(int arg0) {
        if (this.areaChatback == null) {
            this.unloadTitle(3);
            super.drawArea = null;
            this.imageTitle2 = null;
            this.imageTitle3 = null;
            this.imageTitle4 = null;
            this.imageTitle0 = null;
            this.imageTitle1 = null;
            this.imageTitle5 = null;
            this.imageTitle6 = null;
            this.imageTitle7 = null;
            this.imageTitle8 = null;
            this.areaChatback = new PixMap(479, 96, this.getBaseComponent(0), 0);
            this.areaMapback = new PixMap(172, 156, this.getBaseComponent(0), 0);
            Draw2D.clear(this._flowObfuscator38);
            this.imageMapback.draw(0, 16083, 0);
            this.areaSidebar = new PixMap(190, 261, this.getBaseComponent(0), 0);
            this.areaViewport = new PixMap(512, 334, this.getBaseComponent(0), 0);
            Draw2D.clear(this._flowObfuscator38);
            this.areaBackbase1 = new PixMap(496, 50, this.getBaseComponent(0), 0);
            if (arg0 != 1) {
                this.load();
            }
            this.areaBackbase2 = new PixMap(269, 37, this.getBaseComponent(0), 0);
            this.areaBackhmid1 = new PixMap(249, 45, this.getBaseComponent(0), 0);
            this.redrawTitleBackground = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)Ljava/lang/String;")
    public final String getHost(boolean arg0) {
        this.ingame &= arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.frame != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LCXGZMTJK;III)V")
    public final void drawMinimapHint(Pix24 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 * arg3 + arg2 * arg2;
        if (arg1 >= 0) {
            this.load();
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.orbitCameraYaw + this.minimapAnticheatAngle & 2047;
            int var7 = Model.sin[var6];
            int var8 = Model.cos[var6];
            int var15 = var7 * 256 / (this.minimapZoom + 256);
            int var16 = var8 * 256 / (this.minimapZoom + 256);
            int var9 = arg2 * var15 + arg3 * var16 >> 16;
            int var10 = arg2 * var16 - arg3 * var15 >> 16;
            double var11 = Math.atan2((double) var9, (double) var10);
            int var13 = (int) (Math.sin(var11) * 63.0D);
            int var14 = (int) (Math.cos(var11) * 57.0D);
            this.imageMapedge.drawRotated(83 - var14 - 20, 15, 20, 15, 41960, 256, 20, var11, 94 + var13 + 4 - 10);
        } else {
            this.drawOnMinimap(arg0, arg3, arg2, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
    public final void handleInput(int arg0) {
        if (this.objDragArea == 0) {
            this.menuOption[0] = "Cancel";
            this.menuAction[0] = 1107;
            this.menuSize = 1;
            this.handlePrivateChatInput(false);
            this.lastHoveredInterfaceId = 0;
            if (super.mouseX > 4 && super.mouseY > 4 && super.mouseX < 516 && super.mouseY < 338) {
                if (this.viewportInterfaceId != -1) {
                    this.handleInterfaceInput(4, 13037, Component.instances[this.viewportInterfaceId], super.mouseX, 4, super.mouseY, 0);
                } else {
                    this.handleViewportOptions(33660);
                }
            }
            if (this.lastHoveredInterfaceId != this.viewportHoveredInterfaceIndex) {
                this.viewportHoveredInterfaceIndex = this.lastHoveredInterfaceId;
            }
            this.lastHoveredInterfaceId = 0;
            if (super.mouseX > 553 && super.mouseY > 205 && super.mouseX < 743 && super.mouseY < 466) {
                if (this.sidebarInterfaceId != -1) {
                    this.handleInterfaceInput(553, 13037, Component.instances[this.sidebarInterfaceId], super.mouseX, 205, super.mouseY, 0);
                } else if (this.tabInterfaceId[this.selectedTab] != -1) {
                    this.handleInterfaceInput(553, 13037, Component.instances[this.tabInterfaceId[this.selectedTab]], super.mouseX, 205, super.mouseY, 0);
                }
            }
            if (this.lastHoveredInterfaceId != this.sidebarHoveredInterfaceIndex) {
                this.redrawSidebar = true;
                this.sidebarHoveredInterfaceIndex = this.lastHoveredInterfaceId;
            }
            this.lastHoveredInterfaceId = 0;
            if (super.mouseX > 17 && super.mouseY > 357 && super.mouseX < 496 && super.mouseY < 453) {
                if (this.chatInterfaceId != -1) {
                    this.handleInterfaceInput(17, 13037, Component.instances[this.chatInterfaceId], super.mouseX, 357, super.mouseY, 0);
                } else if (super.mouseY < 434 && super.mouseX < 426) {
                    this.handlePrivateChatInput(super.mouseX - 17, super.mouseY - 357, 9);
                }
            }
            if (this.chatInterfaceId != -1 && this.lastHoveredInterfaceId != this.chatHoveredInterfaceIndex) {
                this.redrawChatback = true;
                this.chatHoveredInterfaceIndex = this.lastHoveredInterfaceId;
            }
            boolean var2 = false;
            this.packetSize += arg0;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.menuSize - 1; var3++) {
                    if (this.menuAction[var3] < 1000 && this.menuAction[var3 + 1] > 1000) {
                        String var4 = this.menuOption[var3];
                        this.menuOption[var3] = this.menuOption[var3 + 1];
                        this.menuOption[var3 + 1] = var4;
                        int var5 = this.menuAction[var3];
                        this.menuAction[var3] = this.menuAction[var3 + 1];
                        this.menuAction[var3 + 1] = var5;
                        int var6 = this.menuParamB[var3];
                        this.menuParamB[var3] = this.menuParamB[var3 + 1];
                        this.menuParamB[var3 + 1] = var6;
                        int var7 = this.menuParamC[var3];
                        this.menuParamC[var3] = this.menuParamC[var3 + 1];
                        this.menuParamC[var3 + 1] = var7;
                        int var8 = this.menuParamA[var3];
                        this.menuParamA[var3] = this.menuParamA[var3 + 1];
                        this.menuParamA[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)I")
    public final int mix(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            this.levelObjStacks = null;
        }
        int var5 = 256 - arg3;
        return ((arg1 & 16711935) * var5 + (arg2 & 16711935) * arg3 & -16711936) + ((arg1 & 65280) * var5 + (arg2 & 65280) * arg3 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void login(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.loginMessage0 = "";
                this.loginMessage1 = "Connecting to server...";
                this.drawTitleScreen(true, false);
            }
            this.stream = new ClientStream(this, -978, this.openSocket(43594 + portOffset));
            long var4 = JString.toBase37(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.out.pos = 0;
            this.out.p1(14);
            this.out.p1(var6);
            this.stream.write(2, 0, this.out.data, 0);
            for (int var7 = 0; var7 < 8; var7++) {
                this.stream.read();
            }
            int var8 = this.stream.read();
            int var9 = var8;
            int var11;
            int var12;
            if (var8 == 0) {
                this.stream.read(this.in.data, 0, 8);
                this.in.pos = 0;
                this.serverSeed = this.in.g8(-35089);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.serverSeed >> 32), (int) this.serverSeed };
                this.out.pos = 0;
                this.out.p1(10);
                this.out.p4(var10[0]);
                this.out.p4(var10[1]);
                this.out.p4(var10[2]);
                this.out.p4(var10[3]);
                this.out.p4(signlink.uid);
                this.out.pjstr(arg0);
                this.out.pjstr(arg1);
                this.out.rsaenc(RSA_EXPONENT, RSA_MODULUS, (byte) 0);
                this.login.pos = 0;
                if (arg2) {
                    this.login.p1(18);
                } else {
                    this.login.p1(16);
                }
                this.login.p1(this.out.pos + 36 + 1 + 1 + 2);
                this.login.p1(255);
                this.login.p2(317);
                this.login.p1(lowMemory ? 1 : 0);
                for (var11 = 0; var11 < 9; var11++) {
                    this.login.p4(this.archiveChecksum[var11]);
                }
                this.login.pdata(this.out.data, this.out.pos, true, 0);
                this.out.random = new Isaac(-436, var10);
                for (var12 = 0; var12 < 4; var12++) {
                    var10[var12] += 50;
                }
                this.randomIn = new Isaac(-436, var10);
                this.stream.write(this.login.pos, 0, this.login.data, 0);
                var8 = this.stream.read();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var16) {
                }
                this.login(arg0, arg1, arg2);
            } else {
                int var20;
                if (var8 == 2) {
                    this.rights = this.stream.read();
                    flagged = this.stream.read() == 1;
                    this.prevMousePressTime = 0L;
                    this.lastWriteDuplicates = 0;
                    this.mouseTracking.length = 0;
                    super.hasFocus = true;
                    this.focused = true;
                    this.ingame = true;
                    this.out.pos = 0;
                    this.in.pos = 0;
                    this.packetType = -1;
                    this.lastPacketType0 = -1;
                    this.lastPacketType1 = -1;
                    this.lastPacketType2 = -1;
                    this.packetSize = 0;
                    this.idleNetCycles = 0;
                    this.systemUpdateTimer = 0;
                    this.idleTimeout = 0;
                    this.hintType = 0;
                    this.menuSize = 0;
                    this.menuVisible = false;
                    super.idleCycles = 0;
                    for (var20 = 0; var20 < 100; var20++) {
                        this.messageText[var20] = null;
                    }
                    this.objSelected = 0;
                    this.spellSelected = 0;
                    this.sceneState = 0;
                    this.waveCount = 0;
                    this.cameraAnticheatOffsetX = (int) (Math.random() * 100.0D) - 50;
                    this.cameraAnticheatOffsetZ = (int) (Math.random() * 110.0D) - 55;
                    this.cameraAnticheatAngle = (int) (Math.random() * 80.0D) - 40;
                    this.minimapAnticheatAngle = (int) (Math.random() * 120.0D) - 60;
                    this.minimapZoom = (int) (Math.random() * 30.0D) - 20;
                    this.orbitCameraYaw = (int) (Math.random() * 20.0D) - 10 & 2047;
                    this.minimapState = 0;
                    this.minimapLevel = -1;
                    this.flagSceneTileX = 0;
                    this.flagSceneTileZ = 0;
                    this.playerCount = 0;
                    this.npcCount = 0;
                    for (var11 = 0; var11 < this.MAX_PLAYER_COUNT; var11++) {
                        this.players[var11] = null;
                        this.playerAppearanceBuffer[var11] = null;
                    }
                    for (var12 = 0; var12 < 16384; var12++) {
                        this.npcs[var12] = null;
                    }
                    localPlayer = this.players[this.LOCAL_PLAYER_INDEX] = new PlayerEntity();
                    this.projectiles.clear();
                    this.spotanims.clear();
                    int var14;
                    int var15;
                    for (int var13 = 0; var13 < 4; var13++) {
                        for (var14 = 0; var14 < 104; var14++) {
                            for (var15 = 0; var15 < 104; var15++) {
                                this.levelObjStacks[var13][var14][var15] = null;
                            }
                        }
                    }
                    this.temporaryLocs = new LinkList(169);
                    this.friendListStatus = 0;
                    this.friendCount = 0;
                    this.stickyChatInterfaceId = -1;
                    this.chatInterfaceId = -1;
                    this.viewportInterfaceId = -1;
                    this.sidebarInterfaceId = -1;
                    this.viewportOverlayInterfaceId = -1;
                    this.pressedContinueOption = false;
                    this.selectedTab = 3;
                    this.chatbackInputOpen = 0;
                    this.menuVisible = false;
                    this.showSocialInput = false;
                    this.modalMessage = null;
                    this.inMultizone = 0;
                    this.flashingTab = -1;
                    this.designGenderMale = true;
                    this.validateCharacterDesign(0);
                    for (var14 = 0; var14 < 5; var14++) {
                        this.designColors[var14] = 0;
                    }
                    for (var15 = 0; var15 < 5; var15++) {
                        this.playerOptions[var15] = null;
                        this.playerOptionPushDown[var15] = false;
                    }
                    oplogic1 = 0;
                    oplogic2 = 0;
                    oplogic3 = 0;
                    oplogic4 = 0;
                    oplogic5 = 0;
                    oplogic6 = 0;
                    oplogic7 = 0;
                    oplogic8 = 0;
                    oplogic9 = 0;
                    oplogic10 = 0;
                    this.prepareGameScreen(1);
                } else if (var8 == 3) {
                    this.loginMessage0 = "";
                    this.loginMessage1 = "Invalid username or password.";
                } else if (var8 == 4) {
                    this.loginMessage0 = "Your account has been disabled.";
                    this.loginMessage1 = "Please check your message-centre for details.";
                } else if (var8 == 5) {
                    this.loginMessage0 = "Your account is already logged in.";
                    this.loginMessage1 = "Try again in 60 secs...";
                } else if (var8 == 6) {
                    this.loginMessage0 = "RuneScape has been updated!";
                    this.loginMessage1 = "Please reload this page.";
                } else if (var8 == 7) {
                    this.loginMessage0 = "This world is full.";
                    this.loginMessage1 = "Please use a different world.";
                } else if (var8 == 8) {
                    this.loginMessage0 = "Unable to connect.";
                    this.loginMessage1 = "Login server offline.";
                } else if (var8 == 9) {
                    this.loginMessage0 = "Login limit exceeded.";
                    this.loginMessage1 = "Too many connections from your address.";
                } else if (var8 == 10) {
                    this.loginMessage0 = "Unable to connect.";
                    this.loginMessage1 = "Bad session id.";
                } else if (var8 == 11) {
                    this.loginMessage1 = "Login server rejected session.";
                    this.loginMessage1 = "Please try again.";
                } else if (var8 == 12) {
                    this.loginMessage0 = "You need a members account to login to this world.";
                    this.loginMessage1 = "Please subscribe, or use a different world.";
                } else if (var8 == 13) {
                    this.loginMessage0 = "Could not complete login.";
                    this.loginMessage1 = "Please try using a different world.";
                } else if (var8 == 14) {
                    this.loginMessage0 = "The server is being updated.";
                    this.loginMessage1 = "Please wait 1 minute and try again.";
                } else if (var8 == 15) {
                    this.ingame = true;
                    this.out.pos = 0;
                    this.in.pos = 0;
                    this.packetType = -1;
                    this.lastPacketType0 = -1;
                    this.lastPacketType1 = -1;
                    this.lastPacketType2 = -1;
                    this.packetSize = 0;
                    this.idleNetCycles = 0;
                    this.systemUpdateTimer = 0;
                    this.menuSize = 0;
                    this.menuVisible = false;
                    this.sceneLoadStartTime = System.currentTimeMillis();
                } else if (var8 == 16) {
                    this.loginMessage0 = "Login attempts exceeded.";
                    this.loginMessage1 = "Please wait 1 minute and try again.";
                } else if (var8 == 17) {
                    this.loginMessage0 = "You are standing in a members-only area.";
                    this.loginMessage1 = "To play on this world move to a free area first";
                } else if (var8 == 20) {
                    this.loginMessage0 = "Invalid loginserver requested";
                    this.loginMessage1 = "Please try using a different world.";
                } else if (var8 != 21) {
                    if (var8 == -1) {
                        if (var9 == 0) {
                            if (this.loginAttempts < 2) {
                                try {
                                    Thread.sleep(2000L);
                                } catch (Exception var18) {
                                }
                                this.loginAttempts++;
                                this.login(arg0, arg1, arg2);
                            } else {
                                this.loginMessage0 = "No response from loginserver";
                                this.loginMessage1 = "Please wait 1 minute and try again.";
                            }
                        } else {
                            this.loginMessage0 = "No response from server";
                            this.loginMessage1 = "Please try using a different world.";
                        }
                    } else {
                        System.out.println("response:" + var8);
                        this.loginMessage0 = "Unexpected server response";
                        this.loginMessage1 = "Please try using a different world.";
                    }
                } else {
                    for (var20 = this.stream.read(); var20 >= 0; var20--) {
                        this.loginMessage0 = "You have only just left another world";
                        this.loginMessage1 = "Your profile will be transferred in: " + var20 + " seconds";
                        this.drawTitleScreen(true, false);
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var17) {
                        }
                    }
                    this.login(arg0, arg1, arg2);
                }
            }
        } catch (IOException var19) {
            this.loginMessage0 = "";
            this.loginMessage1 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public final boolean tryMove(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        int var16;
        for (int var15 = 0; var15 < var13; var15++) {
            for (var16 = 0; var16 < var14; var16++) {
                this.bfsDirection[var15][var16] = 0;
                this.bfsCost[var15][var16] = 99999999;
            }
        }
        var16 = arg9;
        int var17 = arg5;
        this.bfsDirection[arg9][arg5] = 99;
        this.bfsCost[arg9][arg5] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.bfsStepX[var18] = arg9;
        int var28 = var18 + 1;
        this.bfsStepZ[var18] = arg5;
        boolean var20 = false;
        int var21 = this.bfsStepX.length;
        int[][] var22 = this.levelCollisionMap[this.currentLevel].flags;
        int var23;
        while (var19 != var28) {
            var16 = this.bfsStepX[var19];
            var17 = this.bfsStepZ[var19];
            var19 = (var19 + 1) % var21;
            if (var16 == arg11 && var17 == arg8) {
                var20 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && this.levelCollisionMap[this.currentLevel].reachedWall(arg11, var16, var17, 0, arg1, arg4 - 1, arg8)) {
                    var20 = true;
                    break;
                }
                if (arg4 < 10 && this.levelCollisionMap[this.currentLevel].reachedWallDecoration(arg11, arg8, var17, arg4 - 1, arg1, var16, 0)) {
                    var20 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg2 != 0 && this.levelCollisionMap[this.currentLevel].reachedLoc((byte) 1, arg8, arg11, var16, arg2, arg7, arg6, var17)) {
                var20 = true;
                break;
            }
            var23 = this.bfsCost[var16][var17] + 1;
            if (var16 > 0 && this.bfsDirection[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.bfsStepX[var28] = var16 - 1;
                this.bfsStepZ[var28] = var17;
                var28 = (var28 + 1) % var21;
                this.bfsDirection[var16 - 1][var17] = 2;
                this.bfsCost[var16 - 1][var17] = var23;
            }
            if (var16 < var13 - 1 && this.bfsDirection[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.bfsStepX[var28] = var16 + 1;
                this.bfsStepZ[var28] = var17;
                var28 = (var28 + 1) % var21;
                this.bfsDirection[var16 + 1][var17] = 8;
                this.bfsCost[var16 + 1][var17] = var23;
            }
            if (var17 > 0 && this.bfsDirection[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.bfsStepX[var28] = var16;
                this.bfsStepZ[var28] = var17 - 1;
                var28 = (var28 + 1) % var21;
                this.bfsDirection[var16][var17 - 1] = 1;
                this.bfsCost[var16][var17 - 1] = var23;
            }
            if (var17 < var14 - 1 && this.bfsDirection[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.bfsStepX[var28] = var16;
                this.bfsStepZ[var28] = var17 + 1;
                var28 = (var28 + 1) % var21;
                this.bfsDirection[var16][var17 + 1] = 4;
                this.bfsCost[var16][var17 + 1] = var23;
            }
            if (var16 > 0 && var17 > 0 && this.bfsDirection[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.bfsStepX[var28] = var16 - 1;
                this.bfsStepZ[var28] = var17 - 1;
                var28 = (var28 + 1) % var21;
                this.bfsDirection[var16 - 1][var17 - 1] = 3;
                this.bfsCost[var16 - 1][var17 - 1] = var23;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.bfsDirection[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.bfsStepX[var28] = var16 + 1;
                this.bfsStepZ[var28] = var17 - 1;
                var28 = (var28 + 1) % var21;
                this.bfsDirection[var16 + 1][var17 - 1] = 9;
                this.bfsCost[var16 + 1][var17 - 1] = var23;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.bfsDirection[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.bfsStepX[var28] = var16 - 1;
                this.bfsStepZ[var28] = var17 + 1;
                var28 = (var28 + 1) % var21;
                this.bfsDirection[var16 - 1][var17 + 1] = 6;
                this.bfsCost[var16 - 1][var17 + 1] = var23;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.bfsDirection[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.bfsStepX[var28] = var16 + 1;
                this.bfsStepZ[var28] = var17 + 1;
                var28 = (var28 + 1) % var21;
                this.bfsDirection[var16 + 1][var17 + 1] = 12;
                this.bfsCost[var16 + 1][var17 + 1] = var23;
            }
        }
        this.tryMoveNearest = 0;
        int var24;
        int var25;
        int var26;
        if (!var20) {
            if (arg10) {
                var23 = 100;
                for (var24 = 1; var24 < 2; var24++) {
                    for (var25 = arg11 - var24; var25 <= arg11 + var24; var25++) {
                        for (var26 = arg8 - var24; var26 <= arg8 + var24; var26++) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.bfsCost[var25][var26] < var23) {
                                var23 = this.bfsCost[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.tryMoveNearest = 1;
                                var20 = true;
                            }
                        }
                    }
                    if (var20) {
                        break;
                    }
                }
            }
            if (!var20) {
                return false;
            }
        }
        byte var29 = 0;
        this.bfsStepX[var29] = var16;
        var19 = var29 + 1;
        this.bfsStepZ[var29] = var17;
        if (arg3 != -11308) {
            for (var25 = 1; var25 > 0; var25++) {
            }
        }
        var23 = var24 = this.bfsDirection[var16][var17];
        while (var16 != arg9 || var17 != arg5) {
            if (var23 != var24) {
                var24 = var23;
                this.bfsStepX[var19] = var16;
                this.bfsStepZ[var19++] = var17;
            }
            if ((var23 & 2) != 0) {
                var16++;
            } else if ((var23 & 8) != 0) {
                var16--;
            }
            if ((var23 & 1) != 0) {
                var17++;
            } else if ((var23 & 4) != 0) {
                var17--;
            }
            var23 = this.bfsDirection[var16][var17];
        }
        if (var19 <= 0) {
            if (arg0 == 1) {
                return false;
            } else {
                return true;
            }
        } else {
            var21 = var19;
            if (var19 > 25) {
                var21 = 25;
            }
            var19--;
            var25 = this.bfsStepX[var19];
            var26 = this.bfsStepZ[var19];
            oplogic4 += var21;
            if (oplogic4 >= 92) {
                this.out.p1isaac((byte) 6, 36);
                this.out.p4(0);
                oplogic4 = 0;
            }
            if (arg0 == 0) {
                this.out.p1isaac((byte) 6, 164);
                this.out.p1(var21 + var21 + 3);
            }
            if (arg0 == 1) {
                this.out.p1isaac((byte) 6, 248);
                this.out.p1(var21 + var21 + 3 + 14);
            }
            if (arg0 == 2) {
                this.out.p1isaac((byte) 6, 98);
                this.out.p1(var21 + var21 + 3);
            }
            this.out.p2_alt3(0, var25 + this.sceneBaseTileX);
            this.flagSceneTileX = this.bfsStepX[0];
            this.flagSceneTileZ = this.bfsStepZ[0];
            for (int var27 = 1; var27 < var21; var27++) {
                var19--;
                this.out.p1(this.bfsStepX[var19] - var25);
                this.out.p1(this.bfsStepZ[var19] - var26);
            }
            this.out.p2_alt1(true, var26 + this.sceneBaseTileZ);
            this.out.p1_alt2(super.actionKey[5] == 1 ? 1 : 0, 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILMBMGIXGO;Z)V")
    private final void readNpcUpdates(int arg0, Packet arg1, boolean arg2) {
        for (int var4 = 0; var4 < this.entityUpdateCount; var4++) {
            int var5 = this.entityUpdateIds[var4];
            NpcEntity var6 = this.npcs[var5];
            int var7 = arg1.g1();
            int var8;
            int var9;
            if ((var7 & 16) != 0) {
                var8 = arg1.g2_alt1((byte) 108);
                if (var8 == 65535) {
                    var8 = -1;
                }
                var9 = arg1.g1();
                if (var8 == var6.primarySeqId && var8 != -1) {
                    int var10 = SeqType.instances[var8].replacemode;
                    if (var10 == 1) {
                        var6.primarySeqFrame = 0;
                        var6.primarySeqCycle = 0;
                        var6.primarySeqDelay = var9;
                        var6.primarySeqLoop = 0;
                    }
                    if (var10 == 2) {
                        var6.primarySeqLoop = 0;
                    }
                } else if (var8 == -1 || var6.primarySeqId == -1 || SeqType.instances[var8].priority >= SeqType.instances[var6.primarySeqId].priority) {
                    var6.primarySeqId = var8;
                    var6.primarySeqFrame = 0;
                    var6.primarySeqCycle = 0;
                    var6.primarySeqDelay = var9;
                    var6.primarySeqLoop = 0;
                    var6.seqPathLength = var6.pathLength;
                }
            }
            if ((var7 & 8) != 0) {
                var8 = arg1.g1_alt1(0);
                var9 = arg1.g1_alt2(false);
                var6.hit(-35698, var9, var8, loopCycle);
                var6.combatCycle = loopCycle + 300;
                var6.health = arg1.g1_alt1(0);
                var6.totalHealth = arg1.g1();
            }
            if ((var7 & 128) != 0) {
                var6.spotanimId = arg1.g2();
                var8 = arg1.g4();
                var6.spotanimHeight = var8 >> 16;
                var6.spotanimLastCycle = loopCycle + (var8 & 65535);
                var6.spotanimFrame = 0;
                var6.spotanimCycle = 0;
                if (var6.spotanimLastCycle > loopCycle) {
                    var6.spotanimFrame = -1;
                }
                if (var6.spotanimId == 65535) {
                    var6.spotanimId = -1;
                }
            }
            if ((var7 & 32) != 0) {
                var6.targetId = arg1.g2();
                if (var6.targetId == 65535) {
                    var6.targetId = -1;
                }
            }
            if ((var7 & 1) != 0) {
                var6.chat = arg1.gjstr();
                var6.chatTimer = 100;
            }
            if ((var7 & 64) != 0) {
                var8 = arg1.g1_alt2(false);
                var9 = arg1.g1_alt3(2);
                var6.hit(-35698, var9, var8, loopCycle);
                var6.combatCycle = loopCycle + 300;
                var6.health = arg1.g1_alt3(2);
                var6.totalHealth = arg1.g1_alt2(false);
            }
            if ((var7 & 2) != 0) {
                var6.type = NpcType.get(arg1.g2_alt3((byte) -74));
                var6.size = var6.type.size;
                var6.turnSpeed = var6.type.turnspeed;
                var6.seqWalkId = var6.type.walkanim;
                var6.seqTurnAroundId = var6.type.walkanim_b;
                var6.seqTurnLeftId = var6.type.walkanim_r;
                var6.seqTurnRightId = var6.type.walkanim_l;
                var6.seqStandId = var6.type.readyanim;
            }
            if ((var7 & 4) != 0) {
                var6.targetTileX = arg1.g2_alt1((byte) 108);
                var6.targetTile = arg1.g2_alt1((byte) 108);
            }
        }
        this.ingame &= arg2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LCKDEJADD;IZII)V")
    public final void addNPCOptions(NpcType arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (this.menuSize < 400) {
            if (arg0.multinpc != null) {
                arg0 = arg0.getMultiNpc(this._flowObfuscator10);
            }
            if (arg0 != null) {
                if (arg0.active) {
                    String var6 = arg0.name;
                    if (arg2) {
                        _flowObfuscator14 = true;
                    }
                    if (arg0.vislevel != 0) {
                        var6 = var6 + getCombatLevelColorTag(localPlayer.combatLevel, arg0.vislevel, true) + " (level-" + arg0.vislevel + ")";
                    }
                    if (this.objSelected == 1) {
                        this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @yel@" + var6;
                        this.menuAction[this.menuSize] = 582;
                        this.menuParamA[this.menuSize] = arg1;
                        this.menuParamB[this.menuSize] = arg4;
                        this.menuParamC[this.menuSize] = arg3;
                        this.menuSize++;
                    } else {
                        if (this.spellSelected == 1) {
                            if ((this.activeSpellFlags & 2) == 2) {
                                this.menuOption[this.menuSize] = this.spellCaption + " @yel@" + var6;
                                this.menuAction[this.menuSize] = 413;
                                this.menuParamA[this.menuSize] = arg1;
                                this.menuParamB[this.menuSize] = arg4;
                                this.menuParamC[this.menuSize] = arg3;
                                this.menuSize++;
                                return;
                            }
                        } else {
                            int var7;
                            if (arg0.op != null) {
                                for (var7 = 4; var7 >= 0; var7--) {
                                    if (arg0.op[var7] != null && !arg0.op[var7].equalsIgnoreCase("attack")) {
                                        this.menuOption[this.menuSize] = arg0.op[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.menuAction[this.menuSize] = 20;
                                        }
                                        if (var7 == 1) {
                                            this.menuAction[this.menuSize] = 412;
                                        }
                                        if (var7 == 2) {
                                            this.menuAction[this.menuSize] = 225;
                                        }
                                        if (var7 == 3) {
                                            this.menuAction[this.menuSize] = 965;
                                        }
                                        if (var7 == 4) {
                                            this.menuAction[this.menuSize] = 478;
                                        }
                                        this.menuParamA[this.menuSize] = arg1;
                                        this.menuParamB[this.menuSize] = arg4;
                                        this.menuParamC[this.menuSize] = arg3;
                                        this.menuSize++;
                                    }
                                }
                            }
                            if (arg0.op != null) {
                                for (var7 = 4; var7 >= 0; var7--) {
                                    if (arg0.op[var7] != null && arg0.op[var7].equalsIgnoreCase("attack")) {
                                        short var8 = 0;
                                        if (arg0.vislevel > localPlayer.combatLevel) {
                                            var8 = 2000;
                                        }
                                        this.menuOption[this.menuSize] = arg0.op[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.menuAction[this.menuSize] = 20 + var8;
                                        }
                                        if (var7 == 1) {
                                            this.menuAction[this.menuSize] = 412 + var8;
                                        }
                                        if (var7 == 2) {
                                            this.menuAction[this.menuSize] = 225 + var8;
                                        }
                                        if (var7 == 3) {
                                            this.menuAction[this.menuSize] = 965 + var8;
                                        }
                                        if (var7 == 4) {
                                            this.menuAction[this.menuSize] = 478 + var8;
                                        }
                                        this.menuParamA[this.menuSize] = arg1;
                                        this.menuParamB[this.menuSize] = arg4;
                                        this.menuParamC[this.menuSize] = arg3;
                                        this.menuSize++;
                                    }
                                }
                            }
                            this.menuOption[this.menuSize] = "Examine @yel@" + var6;
                            this.menuAction[this.menuSize] = 1025;
                            this.menuParamA[this.menuSize] = arg1;
                            this.menuParamB[this.menuSize] = arg4;
                            this.menuParamC[this.menuSize] = arg3;
                            this.menuSize++;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILDLZHLHNK;ZI)V")
    public final void addPlayerOptions(int arg0, int arg1, PlayerEntity arg2, boolean arg3, int arg4) {
        if (arg2 != localPlayer) {
            if (this.menuSize < 400) {
                if (!arg3) {
                    String var6;
                    if (arg2.skillLevel == 0) {
                        var6 = arg2.name + getCombatLevelColorTag(localPlayer.combatLevel, arg2.combatLevel, true) + " (level-" + arg2.combatLevel + ")";
                    } else {
                        var6 = arg2.name + " (skill-" + arg2.skillLevel + ")";
                    }
                    int var7;
                    if (this.objSelected == 1) {
                        this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @whi@" + var6;
                        this.menuAction[this.menuSize] = 491;
                        this.menuParamA[this.menuSize] = arg1;
                        this.menuParamB[this.menuSize] = arg0;
                        this.menuParamC[this.menuSize] = arg4;
                        this.menuSize++;
                    } else if (this.spellSelected == 1) {
                        if ((this.activeSpellFlags & 8) == 8) {
                            this.menuOption[this.menuSize] = this.spellCaption + " @whi@" + var6;
                            this.menuAction[this.menuSize] = 365;
                            this.menuParamA[this.menuSize] = arg1;
                            this.menuParamB[this.menuSize] = arg0;
                            this.menuParamC[this.menuSize] = arg4;
                            this.menuSize++;
                        }
                    } else {
                        for (var7 = 4; var7 >= 0; var7--) {
                            if (this.playerOptions[var7] != null) {
                                this.menuOption[this.menuSize] = this.playerOptions[var7] + " @whi@" + var6;
                                short var8 = 0;
                                if (this.playerOptions[var7].equalsIgnoreCase("attack")) {
                                    if (arg2.combatLevel > localPlayer.combatLevel) {
                                        var8 = 2000;
                                    }
                                    if (localPlayer.team != 0 && arg2.team != 0) {
                                        if (localPlayer.team == arg2.team) {
                                            var8 = 2000;
                                        } else {
                                            var8 = 0;
                                        }
                                    }
                                } else if (this.playerOptionPushDown[var7]) {
                                    var8 = 2000;
                                }
                                if (var7 == 0) {
                                    this.menuAction[this.menuSize] = 561 + var8;
                                }
                                if (var7 == 1) {
                                    this.menuAction[this.menuSize] = 779 + var8;
                                }
                                if (var7 == 2) {
                                    this.menuAction[this.menuSize] = 27 + var8;
                                }
                                if (var7 == 3) {
                                    this.menuAction[this.menuSize] = 577 + var8;
                                }
                                if (var7 == 4) {
                                    this.menuAction[this.menuSize] = 729 + var8;
                                }
                                this.menuParamA[this.menuSize] = arg1;
                                this.menuParamB[this.menuSize] = arg0;
                                this.menuParamC[this.menuSize] = arg4;
                                this.menuSize++;
                            }
                        }
                    }
                    for (var7 = 0; var7 < this.menuSize; var7++) {
                        if (this.menuAction[var7] == 516) {
                            this.menuOption[var7] = "Walk here @whi@" + var6;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLDYMVKFXP;)V")
    private final void storeLoc(boolean arg0, LocSpawned arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.layer == 0) {
            var3 = this.scene.getWallBitset(arg1.level, arg1.localX, arg1.localZ);
        }
        if (arg1.layer == 1) {
            var3 = this.scene.getWallDecorationBitset(arg1.level, arg1.localX, 0, arg1.localZ);
        }
        if (arg1.layer == 2) {
            var3 = this.scene.getLocBitset(arg1.level, arg1.localX, arg1.localZ);
        }
        if (arg1.layer == 3) {
            var3 = this.scene.getGroundDecorationBitset(arg1.level, arg1.localX, arg1.localZ);
        }
        int var7;
        if (var3 != 0) {
            var7 = this.scene.getInfo(arg1.level, arg1.localX, arg1.localZ, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.previousType = var4;
        arg1.previousShape = var5;
        if (arg0) {
            for (var7 = 1; var7 > 0; var7++) {
            }
        }
        arg1.previousRotation = var6;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void updateAudio(boolean arg0) {
        if (arg0) {
            this.packetType = -1;
        }
        for (int var2 = 0; var2 < this.waveCount; var2++) {
            if (this.waveDelay[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.waveIds[var2] == this.lastWaveId && this.waveLoops[var2] == this.lastWaveLoops) {
                        if (!this.replayWave(11456)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.generate(this.waveLoops[var2], this.waveIds[var2], false);
                        if (System.currentTimeMillis() + (long) (var4.pos / 22) > this.lastWaveStartTime + (long) (this.lastWaveLength / 22)) {
                            this.lastWaveLength = var4.pos;
                            this.lastWaveStartTime = System.currentTimeMillis();
                            if (this.saveWave(var4.data, (byte) 116, var4.pos)) {
                                this.lastWaveId = this.waveIds[var2];
                                this.lastWaveLoops = this.waveLoops[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var5) {
                }
                if (var3 && this.waveDelay[var2] != -5) {
                    this.waveDelay[var2] = -5;
                } else {
                    this.waveCount--;
                    for (int var6 = var2; var6 < this.waveCount; var6++) {
                        this.waveIds[var6] = this.waveIds[var6 + 1];
                        this.waveLoops[var6] = this.waveLoops[var6 + 1];
                        this.waveDelay[var6] = this.waveDelay[var6 + 1];
                    }
                    var2--;
                }
            } else {
                int var10002 = this.waveDelay[var2]--;
            }
        }
        if (this.nextMusicDelay > 0) {
            this.nextMusicDelay -= 20;
            if (this.nextMusicDelay < 0) {
                this.nextMusicDelay = 0;
            }
            if (this.nextMusicDelay == 0 && this.midiActive && !lowMemory) {
                this.midiSong = this.nextMidiSong;
                this.midiFading = true;
                this.ondemand.request(2, this.midiSong);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void load() {
        this.drawProgress(20, (byte) 4, "Starting up");
        if (signlink.sunjava) {
            super.mindel = 5;
        }
        if (started) {
            this.errorStarted = true;
        } else {
            started = true;
            boolean var1 = false;
            String var2 = this.getHost(true);
            if (var2.endsWith("jagex.com")) {
                var1 = true;
            }
            if (var2.endsWith("runescape.com")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.2")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.229")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.228")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.227")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.226")) {
                var1 = true;
            }
            if (var2.endsWith("127.0.0.1")) {
                var1 = true;
            }
            if (!var1) {
                this.errorHost = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; var3++) {
                        this.fileStreams[var3] = new FileStream(500000, signlink.cache_dat, signlink.cache_idx[var3], var3 + 1, true);
                    }
                }
                try {
                    this.loadArchiveChecksums(533);
                    this.archiveTitle = this.loadArchive(1, "title screen", "title", this.archiveChecksum[1], (byte) -41, 25);
                    this.fontPlain11 = new PixFont(false, "p11_full", 0, this.archiveTitle);
                    this.fontPlain12 = new PixFont(false, "p12_full", 0, this.archiveTitle);
                    this.fontBold12 = new PixFont(false, "b12_full", 0, this.archiveTitle);
                    this.fontQuill8 = new PixFont(true, "q8_full", 0, this.archiveTitle);
                    this.loadTitleBackground(0);
                    this.loadTitleImages(215);
                    Jagfile var42 = this.loadArchive(2, "config", "config", this.archiveChecksum[2], (byte) -41, 30);
                    Jagfile var4 = this.loadArchive(3, "interface", "interface", this.archiveChecksum[3], (byte) -41, 35);
                    Jagfile var5 = this.loadArchive(4, "2d graphics", "media", this.archiveChecksum[4], (byte) -41, 40);
                    Jagfile var6 = this.loadArchive(6, "textures", "textures", this.archiveChecksum[6], (byte) -41, 45);
                    Jagfile var7 = this.loadArchive(7, "chat system", "wordenc", this.archiveChecksum[7], (byte) -41, 50);
                    Jagfile var8 = this.loadArchive(8, "sound effects", "sounds", this.archiveChecksum[8], (byte) -41, 55);
                    this.levelTileFlags = new byte[4][104][104];
                    this.levelHeightmap = new int[4][105][105];
                    this.scene = new World3D(104, (byte) 43, 104, this.levelHeightmap, 4);
                    for (int var9 = 0; var9 < 4; var9++) {
                        this.levelCollisionMap[var9] = new CollisionMap(104, 104, true);
                    }
                    this.imageMinimap = new Pix24(512, 512);
                    Jagfile var10 = this.loadArchive(5, "update list", "versionlist", this.archiveChecksum[5], (byte) -41, 60);
                    this.drawProgress(60, (byte) 4, "Connecting to update server");
                    this.ondemand = new OnDemand();
                    this.ondemand.load(var10, this);
                    AnimFrame.init(this.ondemand.getAnimCount(0));
                    Model.init(this.ondemand.getFileCount(79, 0), this.ondemand);
                    if (!lowMemory) {
                        this.midiSong = 0;
                        try {
                            this.midiSong = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var36) {
                        }
                        this.midiFading = true;
                        this.ondemand.request(2, this.midiSong);
                        while (this.ondemand.remaining() > 0) {
                            this.handleOnDemandRequests(false);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var35) {
                            }
                            if (this.ondemand.failCount > 3) {
                                this.showLoadError("ondemand");
                                return;
                            }
                        }
                    }
                    this.drawProgress(65, (byte) 4, "Requesting animations");
                    int var11 = this.ondemand.getFileCount(79, 1);
                    for (int var12 = 0; var12 < var11; var12++) {
                        this.ondemand.request(1, var12);
                    }
                    int var13;
                    while (this.ondemand.remaining() > 0) {
                        var13 = var11 - this.ondemand.remaining();
                        if (var13 > 0) {
                            this.drawProgress(65, (byte) 4, "Loading animations - " + var13 * 100 / var11 + "%");
                        }
                        this.handleOnDemandRequests(false);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var34) {
                        }
                        if (this.ondemand.failCount > 3) {
                            this.showLoadError("ondemand");
                            return;
                        }
                    }
                    this.drawProgress(70, (byte) 4, "Requesting models");
                    var11 = this.ondemand.getFileCount(79, 0);
                    int var14;
                    for (var13 = 0; var13 < var11; var13++) {
                        var14 = this.ondemand.getModelFlags(var13, -203);
                        if ((var14 & 1) != 0) {
                            this.ondemand.request(0, var13);
                        }
                    }
                    var11 = this.ondemand.remaining();
                    while (this.ondemand.remaining() > 0) {
                        var14 = var11 - this.ondemand.remaining();
                        if (var14 > 0) {
                            this.drawProgress(70, (byte) 4, "Loading models - " + var14 * 100 / var11 + "%");
                        }
                        this.handleOnDemandRequests(false);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var33) {
                        }
                    }
                    if (this.fileStreams[0] != null) {
                        this.drawProgress(75, (byte) 4, "Requesting maps");
                        this.ondemand.request(3, this.ondemand.getMapFile(0, 0, 48, 47));
                        this.ondemand.request(3, this.ondemand.getMapFile(1, 0, 48, 47));
                        this.ondemand.request(3, this.ondemand.getMapFile(0, 0, 48, 48));
                        this.ondemand.request(3, this.ondemand.getMapFile(1, 0, 48, 48));
                        this.ondemand.request(3, this.ondemand.getMapFile(0, 0, 48, 49));
                        this.ondemand.request(3, this.ondemand.getMapFile(1, 0, 48, 49));
                        this.ondemand.request(3, this.ondemand.getMapFile(0, 0, 47, 47));
                        this.ondemand.request(3, this.ondemand.getMapFile(1, 0, 47, 47));
                        this.ondemand.request(3, this.ondemand.getMapFile(0, 0, 47, 48));
                        this.ondemand.request(3, this.ondemand.getMapFile(1, 0, 47, 48));
                        this.ondemand.request(3, this.ondemand.getMapFile(0, 0, 148, 48));
                        this.ondemand.request(3, this.ondemand.getMapFile(1, 0, 148, 48));
                        var11 = this.ondemand.remaining();
                        while (this.ondemand.remaining() > 0) {
                            var14 = var11 - this.ondemand.remaining();
                            if (var14 > 0) {
                                this.drawProgress(75, (byte) 4, "Loading maps - " + var14 * 100 / var11 + "%");
                            }
                            this.handleOnDemandRequests(false);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var32) {
                            }
                        }
                    }
                    var11 = this.ondemand.getFileCount(79, 0);
                    int var15;
                    for (var14 = 0; var14 < var11; var14++) {
                        var15 = this.ondemand.getModelFlags(var14, -203);
                        byte var16 = 0;
                        if ((var15 & 8) != 0) {
                            var16 = 10;
                        } else if ((var15 & 32) != 0) {
                            var16 = 9;
                        } else if ((var15 & 16) != 0) {
                            var16 = 8;
                        } else if ((var15 & 64) != 0) {
                            var16 = 7;
                        } else if ((var15 & 128) != 0) {
                            var16 = 6;
                        } else if ((var15 & 2) != 0) {
                            var16 = 5;
                        } else if ((var15 & 4) != 0) {
                            var16 = 4;
                        }
                        if ((var15 & 1) != 0) {
                            var16 = 3;
                        }
                        if (var16 != 0) {
                            this.ondemand.prefetch(var16, 0, var14, (byte) 8);
                        }
                    }
                    this.ondemand.prefetchMaps(members, 0);
                    if (!lowMemory) {
                        var11 = this.ondemand.getFileCount(79, 2);
                        for (var15 = 1; var15 < var11; var15++) {
                            if (this.ondemand.shouldPrefetchMidi(var15, 5)) {
                                this.ondemand.prefetch((byte) 1, 2, var15, (byte) 8);
                            }
                        }
                    }
                    this.drawProgress(80, (byte) 4, "Unpacking media");
                    this.imageInvback = new Pix8(var5, "invback", 0);
                    this.imageChatback = new Pix8(var5, "chatback", 0);
                    this.imageMapback = new Pix8(var5, "mapback", 0);
                    this.imageBackbase1 = new Pix8(var5, "backbase1", 0);
                    this.imageBackbase2 = new Pix8(var5, "backbase2", 0);
                    this.imageBackhmid1 = new Pix8(var5, "backhmid1", 0);
                    for (var15 = 0; var15 < 13; var15++) {
                        this.imageSideicons[var15] = new Pix8(var5, "sideicons", var15);
                    }
                    this.imageCompass = new Pix24(var5, "compass", 0);
                    this.imageMapedge = new Pix24(var5, "mapedge", 0);
                    this.imageMapedge.crop(5059);
                    int var46;
                    try {
                        for (var46 = 0; var46 < 100; var46++) {
                            this.imageMapscene[var46] = new Pix8(var5, "mapscene", var46);
                        }
                    } catch (Exception var40) {
                    }
                    try {
                        for (var46 = 0; var46 < 100; var46++) {
                            this.imageMapfunction[var46] = new Pix24(var5, "mapfunction", var46);
                        }
                    } catch (Exception var39) {
                    }
                    try {
                        for (var46 = 0; var46 < 20; var46++) {
                            this.imageHitmarks[var46] = new Pix24(var5, "hitmarks", var46);
                        }
                    } catch (Exception var38) {
                    }
                    try {
                        for (var46 = 0; var46 < 20; var46++) {
                            this.imageHeadicons[var46] = new Pix24(var5, "headicons", var46);
                        }
                    } catch (Exception var37) {
                    }
                    this.imageMapmarker0 = new Pix24(var5, "mapmarker", 0);
                    this.imageMapmarker1 = new Pix24(var5, "mapmarker", 1);
                    for (var46 = 0; var46 < 8; var46++) {
                        this.imageCrosses[var46] = new Pix24(var5, "cross", var46);
                    }
                    this.imageMapdot0 = new Pix24(var5, "mapdots", 0);
                    this.imageMapdot1 = new Pix24(var5, "mapdots", 1);
                    this.imageMapdot2 = new Pix24(var5, "mapdots", 2);
                    this.imageMapdot3 = new Pix24(var5, "mapdots", 3);
                    this.imageMapdot4 = new Pix24(var5, "mapdots", 4);
                    this.imageScrollbar0 = new Pix8(var5, "scrollbar", 0);
                    this.imageScrollbar1 = new Pix8(var5, "scrollbar", 1);
                    this.imageRedstone1 = new Pix8(var5, "redstone1", 0);
                    this.imageRedstone2 = new Pix8(var5, "redstone2", 0);
                    this.imageRedstone3 = new Pix8(var5, "redstone3", 0);
                    this.imageRedstone1h = new Pix8(var5, "redstone1", 0);
                    this.imageRedstone1h.flipHorizontally(0);
                    this.imageRedstone2h = new Pix8(var5, "redstone2", 0);
                    this.imageRedstone2h.flipHorizontally(0);
                    this.imageRedstone1v = new Pix8(var5, "redstone1", 0);
                    this.imageRedstone1v.flipVertically(true);
                    this.imageRedstone2v = new Pix8(var5, "redstone2", 0);
                    this.imageRedstone2v.flipVertically(true);
                    this.imageRedstone3v = new Pix8(var5, "redstone3", 0);
                    this.imageRedstone3v.flipVertically(true);
                    this.imageRedstone1hv = new Pix8(var5, "redstone1", 0);
                    this.imageRedstone1hv.flipHorizontally(0);
                    this.imageRedstone1hv.flipVertically(true);
                    this.imageRedstone2hv = new Pix8(var5, "redstone2", 0);
                    this.imageRedstone2hv.flipHorizontally(0);
                    this.imageRedstone2hv.flipVertically(true);
                    for (int var17 = 0; var17 < 2; var17++) {
                        this.imageModIcons[var17] = new Pix8(var5, "mod_icons", var17);
                    }
                    Pix24 var18 = new Pix24(var5, "backleft1", 0);
                    this.areaBackleft1 = new PixMap(var18.cropRight, var18.cropBottom, this.getBaseComponent(0), 0);
                    var18.blitOpaque(0, 0, -32357);
                    Pix24 var43 = new Pix24(var5, "backleft2", 0);
                    this.areaBackleft2 = new PixMap(var43.cropRight, var43.cropBottom, this.getBaseComponent(0), 0);
                    var43.blitOpaque(0, 0, -32357);
                    Pix24 var44 = new Pix24(var5, "backright1", 0);
                    this.areaBackright1 = new PixMap(var44.cropRight, var44.cropBottom, this.getBaseComponent(0), 0);
                    var44.blitOpaque(0, 0, -32357);
                    Pix24 var45 = new Pix24(var5, "backright2", 0);
                    this.areaBackright2 = new PixMap(var45.cropRight, var45.cropBottom, this.getBaseComponent(0), 0);
                    var45.blitOpaque(0, 0, -32357);
                    Pix24 var47 = new Pix24(var5, "backtop1", 0);
                    this.areaBacktop1 = new PixMap(var47.cropRight, var47.cropBottom, this.getBaseComponent(0), 0);
                    var47.blitOpaque(0, 0, -32357);
                    Pix24 var48 = new Pix24(var5, "backvmid1", 0);
                    this.areaBackvmid1 = new PixMap(var48.cropRight, var48.cropBottom, this.getBaseComponent(0), 0);
                    var48.blitOpaque(0, 0, -32357);
                    Pix24 var49 = new Pix24(var5, "backvmid2", 0);
                    this.areaBackvmid2 = new PixMap(var49.cropRight, var49.cropBottom, this.getBaseComponent(0), 0);
                    var49.blitOpaque(0, 0, -32357);
                    Pix24 var50 = new Pix24(var5, "backvmid3", 0);
                    this.areaBackvmid3 = new PixMap(var50.cropRight, var50.cropBottom, this.getBaseComponent(0), 0);
                    var50.blitOpaque(0, 0, -32357);
                    Pix24 var51 = new Pix24(var5, "backhmid2", 0);
                    this.areaBackhmid2 = new PixMap(var51.cropRight, var51.cropBottom, this.getBaseComponent(0), 0);
                    var51.blitOpaque(0, 0, -32357);
                    int var19 = (int) (Math.random() * 21.0D) - 10;
                    int var20 = (int) (Math.random() * 21.0D) - 10;
                    int var21 = (int) (Math.random() * 21.0D) - 10;
                    int var22 = (int) (Math.random() * 41.0D) - 20;
                    for (int var23 = 0; var23 < 100; var23++) {
                        if (this.imageMapfunction[var23] != null) {
                            this.imageMapfunction[var23].translate(var19 + var22, var20 + var22, var21 + var22, 0);
                        }
                        if (this.imageMapscene[var23] != null) {
                            this.imageMapscene[var23].translate(var19 + var22, var20 + var22, var21 + var22, 0);
                        }
                    }
                    this.drawProgress(83, (byte) 4, "Unpacking textures");
                    Draw3D.unpackTextures(var6, 0);
                    Draw3D.setBrightness(0.8D, _flowObfuscator37);
                    Draw3D.initPool(20, true);
                    this.drawProgress(86, (byte) 4, "Unpacking config");
                    SeqType.unpack(0, var42);
                    LocType.unpack(var42);
                    FloType.unpack(0, var42);
                    ObjType.unpack(var42);
                    NpcType.unpack(var42);
                    IdkType.unpack(0, var42);
                    SpotAnimType.unpack(0, var42);
                    VarpType.unpack(0, var42);
                    VarbitType.unpack(0, var42);
                    ObjType.membersWorld = members;
                    if (!lowMemory) {
                        this.drawProgress(90, (byte) 4, "Unpacking sounds");
                        byte[] var24 = var8.read("sounds.dat", (byte[]) null);
                        Packet var25 = new Packet(var24, 891);
                        Wave.unpack(0, var25);
                    }
                    this.drawProgress(95, (byte) 4, "Unpacking interfaces");
                    PixFont[] var52 = new PixFont[] { this.fontPlain11, this.fontPlain12, this.fontBold12, this.fontQuill8 };
                    Component.unpack(var4, var52, (byte) -84, var5);
                    this.drawProgress(100, (byte) 4, "Preparing game engine");
                    int var26;
                    int var27;
                    int var28;
                    for (int var53 = 0; var53 < 33; var53++) {
                        var26 = 999;
                        var27 = 0;
                        for (var28 = 0; var28 < 34; var28++) {
                            if (this.imageMapback.pixels[var28 + var53 * this.imageMapback.cropRight] == 0) {
                                if (var26 == 999) {
                                    var26 = var28;
                                }
                            } else if (var26 != 999) {
                                var27 = var28;
                                break;
                            }
                        }
                        this.compassMaskLineOffsets[var53] = var26;
                        this.compassMaskLineLengths[var53] = var27 - var26;
                    }
                    int var29;
                    for (var26 = 5; var26 < 156; var26++) {
                        var27 = 999;
                        var28 = 0;
                        for (var29 = 25; var29 < 172; var29++) {
                            if (this.imageMapback.pixels[var29 + var26 * this.imageMapback.cropRight] == 0 && (var29 > 34 || var26 > 34)) {
                                if (var27 == 999) {
                                    var27 = var29;
                                }
                            } else if (var27 != 999) {
                                var28 = var29;
                                break;
                            }
                        }
                        this.minimapMaskLineOffsets[var26 - 5] = var27 - 25;
                        this.minimapMaskLineLengths[var26 - 5] = var28 - var27;
                    }
                    Draw3D.init3D(-950, 479, 96);
                    this.areaChatbackOffsets = Draw3D.lineOffset;
                    Draw3D.init3D(-950, 190, 261);
                    this.areaSidebarOffsets = Draw3D.lineOffset;
                    Draw3D.init3D(-950, 512, 334);
                    this.areaViewportOffsets = Draw3D.lineOffset;
                    int[] var54 = new int[9];
                    for (var28 = 0; var28 < 9; var28++) {
                        var29 = 128 + var28 * 32 + 15;
                        int var30 = 600 + var29 * 3;
                        int var31 = Draw3D.sin[var29];
                        var54[var28] = var30 * var31 >> 16;
                    }
                    World3D.init(500, 800, 512, 334, var54, _flowObfuscator42);
                    WordFilter.unpack(var7);
                    this.mouseTracking = new MouseTracking(this, _flowObfuscator29);
                    this.startThread(this.mouseTracking, 10);
                    LocEntity.varProvider = this;
                    LocType.varProvider = this;
                    NpcType.varProvider = this;
                } catch (Exception var41) {
                    signlink.reporterror("loaderror " + this.lastProgressMessage + " " + this.lastProgressPercent);
                    this.errorLoading = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LMBMGIXGO;IB)V")
    private final void readNewPlayers(Packet arg0, int arg1, byte arg2) {
        if (arg2 == 8) {
            boolean var10 = false;
        } else {
            this._flowObfuscator34 = -50;
        }
        while (arg0.bitPos + 10 < arg1 * 8) {
            int var4 = arg0.gBit(11, 0);
            if (var4 == 2047) {
                break;
            }
            if (this.players[var4] == null) {
                this.players[var4] = new PlayerEntity();
                if (this.playerAppearanceBuffer[var4] != null) {
                    this.players[var4].read(0, this.playerAppearanceBuffer[var4]);
                }
            }
            this.playerIds[this.playerCount++] = var4;
            PlayerEntity var5 = this.players[var4];
            var5.cycle = loopCycle;
            int var6 = arg0.gBit(1, 0);
            if (var6 == 1) {
                this.entityUpdateIds[this.entityUpdateCount++] = var4;
            }
            int var7 = arg0.gBit(1, 0);
            int var8 = arg0.gBit(5, 0);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = arg0.gBit(5, 0);
            if (var9 > 15) {
                var9 -= 32;
            }
            var5.move(localPlayer.pathTileX[0] + var9, localPlayer.pathTileZ[0] + var8, var7 == 1, false);
        }
        arg0.accessBytes(true);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    public final void handleMinimapInput(boolean arg0) {
        this.ingame &= arg0;
        if (this.minimapState == 0) {
            if (super.mouseClickButton == 1) {
                int var2 = super.mouseClickX - 25 - 550;
                int var3 = super.mouseClickY - 5 - 4;
                int var4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    var4 = this.orbitCameraYaw + this.minimapAnticheatAngle & 2047;
                    int var5 = Draw3D.sin[var4];
                    int var6 = Draw3D.cos[var4];
                    int var12 = var5 * (this.minimapZoom + 256) >> 8;
                    int var13 = var6 * (this.minimapZoom + 256) >> 8;
                    int var7 = var3 * var12 + var2 * var13 >> 11;
                    int var8 = var3 * var13 - var2 * var12 >> 11;
                    int var9 = localPlayer.x + var7 >> 7;
                    int var10 = localPlayer.z - var8 >> 7;
                    boolean var11 = this.tryMove(1, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var10, localPlayer.pathTileX[0], true, var9);
                    if (var11) {
                        this.out.p1(var2);
                        this.out.p1(var3);
                        this.out.p2(this.orbitCameraYaw);
                        this.out.p1(57);
                        this.out.p1(this.minimapAnticheatAngle);
                        this.out.p1(this.minimapZoom);
                        this.out.p1(89);
                        this.out.p2(localPlayer.x);
                        this.out.p2(localPlayer.z);
                        this.out.p1(this.tryMoveNearest);
                        this.out.p1(63);
                    }
                }
                gamelogic5++;
                if (gamelogic5 > 1151) {
                    gamelogic5 = 0;
                    this.out.p1isaac((byte) 6, 246);
                    this.out.p1(0);
                    var4 = this.out.pos;
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.out.p1(101);
                    }
                    this.out.p1(197);
                    this.out.p2((int) (Math.random() * 65536.0D));
                    this.out.p1((int) (Math.random() * 256.0D));
                    this.out.p1(67);
                    this.out.p2(14214);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.out.p2(29487);
                    }
                    this.out.p2((int) (Math.random() * 65536.0D));
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.out.p1(220);
                    }
                    this.out.p1(180);
                    this.out.psize1(this.out.pos - var4, (byte) 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
    public final String getIntString(int arg0, int arg1) {
        if (arg0 <= 0) {
            this.packetType = this.in.g1();
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public final void drawError(int arg0) {
        if (arg0 != -13873) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Graphics var4 = this.getBaseComponent(0).getGraphics();
        var4.setColor(Color.black);
        var4.fillRect(0, 0, 765, 503);
        this.setFramerate(false, 1);
        byte var3;
        int var5;
        if (this.errorLoading) {
            this.flameActive = false;
            var4.setFont(new Font("Helvetica", 1, 16));
            var4.setColor(Color.yellow);
            var3 = 35;
            var4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var3);
            var5 = var3 + 50;
            var4.setColor(Color.white);
            var4.drawString("To fix this try the following (in order):", 30, var5);
            int var6 = var5 + 50;
            var4.setColor(Color.white);
            var4.setFont(new Font("Helvetica", 1, 12));
            var4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var6);
            int var7 = var6 + 30;
            var4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var7);
            int var8 = var7 + 30;
            var4.drawString("3: Try using a different game-world", 30, var8);
            int var9 = var8 + 30;
            var4.drawString("4: Try rebooting your computer", 30, var9);
            int var10 = var9 + 30;
            var4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var10);
        }
        if (this.errorHost) {
            this.flameActive = false;
            var4.setFont(new Font("Helvetica", 1, 20));
            var4.setColor(Color.white);
            var4.drawString("Error - unable to load game!", 50, 50);
            var4.drawString("To play RuneScape make sure you play from", 50, 100);
            var4.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.errorStarted) {
            this.flameActive = false;
            var4.setColor(Color.yellow);
            var3 = 35;
            var4.drawString("Error a copy of RuneScape already appears to be loaded", 30, var3);
            var5 = var3 + 50;
            var4.setColor(Color.white);
            var4.drawString("To fix this try the following (in order):", 30, var5);
            var5 += 50;
            var4.setColor(Color.white);
            var4.setFont(new Font("Helvetica", 1, 12));
            var4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var5);
            var5 += 30;
            var4.drawString("2: Try rebooting your computer, and reloading", 30, var5);
            var5 += 30;
        }
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.frame != null) {
                    return new URL("http://127.0.0.1:" + (80 + portOffset));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void updateNpcs(int arg0) {
        for (int var2 = 0; var2 < this.npcCount; var2++) {
            int var3 = this.npcIds[var2];
            NpcEntity var4 = this.npcs[var3];
            if (var4 != null) {
                this.updateEntity(46988, var4.type.size, var4);
            }
        }
        if (arg0 != -8066) {
            this._flowObfuscator40 = 148;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILGQOSZKJC;)V")
    public final void updateEntity(int arg0, int arg1, PathingEntity arg2) {
        if (arg0 != 46988) {
            this.packetType = -1;
        }
        if (arg2.x < 128 || arg2.z < 128 || arg2.x >= 13184 || arg2.z >= 13184) {
            arg2.primarySeqId = -1;
            arg2.spotanimId = -1;
            arg2.forceMoveEndCycle = 0;
            arg2.forceMoveStartCycle = 0;
            arg2.x = arg2.pathTileX[0] * 128 + arg2.size * 64;
            arg2.z = arg2.pathTileZ[0] * 128 + arg2.size * 64;
            arg2.resetPath(true);
        }
        if (arg2 == localPlayer && (arg2.x < 1536 || arg2.z < 1536 || arg2.x >= 11776 || arg2.z >= 11776)) {
            arg2.primarySeqId = -1;
            arg2.spotanimId = -1;
            arg2.forceMoveEndCycle = 0;
            arg2.forceMoveStartCycle = 0;
            arg2.x = arg2.pathTileX[0] * 128 + arg2.size * 64;
            arg2.z = arg2.pathTileZ[0] * 128 + arg2.size * 64;
            arg2.resetPath(true);
        }
        if (arg2.forceMoveEndCycle > loopCycle) {
            this.updateForceMovement(arg2, true);
        } else if (arg2.forceMoveStartCycle >= loopCycle) {
            this.startForceMovement(arg2, this._flowObfuscator23);
        } else {
            this.updateMovement((byte) 34, arg2);
        }
        this.updateFacingDirection(arg2, -843);
        this.updateSequences(arg2, -805);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LGQOSZKJC;Z)V")
    public final void updateForceMovement(PathingEntity arg0, boolean arg1) {
        int var3 = arg0.forceMoveEndCycle - loopCycle;
        int var4 = arg0.forceMoveStartSceneTileX * 128 + arg0.size * 64;
        int var5 = arg0.forceMoveStartSceneTileZ * 128 + arg0.size * 64;
        arg0.x += (var4 - arg0.x) / var3;
        if (arg1) {
            arg0.z += (var5 - arg0.z) / var3;
            arg0.seqTrigger = 0;
            if (arg0.forceMoveFaceDirection == 0) {
                arg0.dstYaw = 1024;
            }
            if (arg0.forceMoveFaceDirection == 1) {
                arg0.dstYaw = 1536;
            }
            if (arg0.forceMoveFaceDirection == 2) {
                arg0.dstYaw = 0;
            }
            if (arg0.forceMoveFaceDirection == 3) {
                arg0.dstYaw = 512;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LGQOSZKJC;B)V")
    public final void startForceMovement(PathingEntity arg0, byte arg1) {
        if (arg0.forceMoveStartCycle == loopCycle || arg0.primarySeqId == -1 || arg0.primarySeqDelay != 0 || arg0.primarySeqCycle + 1 > SeqType.instances[arg0.primarySeqId].getFrameDuration(arg0.primarySeqFrame, (byte) -39)) {
            int var3 = arg0.forceMoveStartCycle - arg0.forceMoveEndCycle;
            int var4 = loopCycle - arg0.forceMoveEndCycle;
            int var5 = arg0.forceMoveStartSceneTileX * 128 + arg0.size * 64;
            int var6 = arg0.forceMoveStartSceneTileZ * 128 + arg0.size * 64;
            int var7 = arg0.forceMoveEndSceneTileX * 128 + arg0.size * 64;
            int var8 = arg0.forceMoveEndSceneTileZ * 128 + arg0.size * 64;
            arg0.x = (var5 * (var3 - var4) + var7 * var4) / var3;
            arg0.z = (var6 * (var3 - var4) + var8 * var4) / var3;
        }
        arg0.seqTrigger = 0;
        if (arg0.forceMoveFaceDirection == 0) {
            arg0.dstYaw = 1024;
        }
        if (arg0.forceMoveFaceDirection == 1) {
            arg0.dstYaw = 1536;
        }
        if (arg0.forceMoveFaceDirection == 2) {
            arg0.dstYaw = 0;
        }
        if (arg0.forceMoveFaceDirection == 3) {
            arg0.dstYaw = 512;
        }
        arg0.yaw = arg0.dstYaw;
        if (arg1 != this._flowObfuscator23) {
            _flowObfuscator29 = -383;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLGQOSZKJC;)V")
    public final void updateMovement(byte arg0, PathingEntity arg1) {
        arg1.secondarySeqId = arg1.seqStandId;
        if (arg1.pathLength == 0) {
            arg1.seqTrigger = 0;
        } else {
            if (arg1.primarySeqId != -1 && arg1.primarySeqDelay == 0) {
                SeqType var3 = SeqType.instances[arg1.primarySeqId];
                if (arg1.seqPathLength > 0 && var3.preanim_move == 0) {
                    arg1.seqTrigger++;
                    return;
                }
                if (arg1.seqPathLength <= 0 && var3.postanim_move == 0) {
                    arg1.seqTrigger++;
                    return;
                }
            }
            int var10 = arg1.x;
            int var4 = arg1.z;
            int var5 = arg1.pathTileX[arg1.pathLength - 1] * 128 + arg1.size * 64;
            int var6 = arg1.pathTileZ[arg1.pathLength - 1] * 128 + arg1.size * 64;
            if (var5 - var10 <= 256 && var5 - var10 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                if (var10 < var5) {
                    if (var4 < var6) {
                        arg1.dstYaw = 1280;
                    } else if (var4 > var6) {
                        arg1.dstYaw = 1792;
                    } else {
                        arg1.dstYaw = 1536;
                    }
                } else if (var10 > var5) {
                    if (var4 < var6) {
                        arg1.dstYaw = 768;
                    } else if (var4 > var6) {
                        arg1.dstYaw = 256;
                    } else {
                        arg1.dstYaw = 512;
                    }
                } else if (var4 < var6) {
                    arg1.dstYaw = 1024;
                } else {
                    arg1.dstYaw = 0;
                }
                int var7 = arg1.dstYaw - arg1.yaw & 2047;
                if (var7 > 1024) {
                    var7 -= 2048;
                }
                int var8 = arg1.seqTurnAroundId;
                if (var7 >= -256 && var7 <= 256) {
                    var8 = arg1.seqWalkId;
                } else if (var7 >= 256 && var7 < 768) {
                    var8 = arg1.seqTurnRightId;
                } else if (var7 >= -768 && var7 <= -256) {
                    var8 = arg1.seqTurnLeftId;
                }
                if (var8 == -1) {
                    var8 = arg1.seqWalkId;
                }
                arg1.secondarySeqId = var8;
                int var9 = 4;
                if (arg0 != 34) {
                    _flowObfuscator29 = 285;
                }
                if (arg1.yaw != arg1.dstYaw && arg1.targetId == -1 && arg1.turnSpeed != 0) {
                    var9 = 2;
                }
                if (arg1.pathLength > 2) {
                    var9 = 6;
                }
                if (arg1.pathLength > 3) {
                    var9 = 8;
                }
                if (arg1.seqTrigger > 0 && arg1.pathLength > 1) {
                    var9 = 8;
                    arg1.seqTrigger--;
                }
                if (arg1.pathRunning[arg1.pathLength - 1]) {
                    var9 <<= 1;
                }
                if (var9 >= 8 && arg1.secondarySeqId == arg1.seqWalkId && arg1.seqRunId != -1) {
                    arg1.secondarySeqId = arg1.seqRunId;
                }
                if (var10 < var5) {
                    arg1.x += var9;
                    if (arg1.x > var5) {
                        arg1.x = var5;
                    }
                } else if (var10 > var5) {
                    arg1.x -= var9;
                    if (arg1.x < var5) {
                        arg1.x = var5;
                    }
                }
                if (var4 < var6) {
                    arg1.z += var9;
                    if (arg1.z > var6) {
                        arg1.z = var6;
                    }
                } else if (var4 > var6) {
                    arg1.z -= var9;
                    if (arg1.z < var6) {
                        arg1.z = var6;
                    }
                }
                if (arg1.x == var5 && arg1.z == var6) {
                    arg1.pathLength--;
                    if (arg1.seqPathLength > 0) {
                        arg1.seqPathLength--;
                        return;
                    }
                }
            } else {
                arg1.x = var5;
                arg1.z = var6;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LGQOSZKJC;I)V")
    public final void updateFacingDirection(PathingEntity arg0, int arg1) {
        if (arg1 < 0) {
            if (arg0.turnSpeed != 0) {
                int var4;
                int var5;
                if (arg0.targetId != -1 && arg0.targetId < 32768) {
                    NpcEntity var3 = this.npcs[arg0.targetId];
                    if (var3 != null) {
                        var4 = arg0.x - var3.x;
                        var5 = arg0.z - var3.z;
                        if (var4 != 0 || var5 != 0) {
                            arg0.dstYaw = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                        }
                    }
                }
                int var7;
                if (arg0.targetId >= 32768) {
                    var7 = arg0.targetId - 32768;
                    if (var7 == this.localPid) {
                        var7 = this.LOCAL_PLAYER_INDEX;
                    }
                    PlayerEntity var8 = this.players[var7];
                    if (var8 != null) {
                        var5 = arg0.x - var8.x;
                        int var6 = arg0.z - var8.z;
                        if (var5 != 0 || var6 != 0) {
                            arg0.dstYaw = (int) (Math.atan2((double) var5, (double) var6) * 325.949D) & 2047;
                        }
                    }
                }
                if ((arg0.targetTileX != 0 || arg0.targetTile != 0) && (arg0.pathLength == 0 || arg0.seqTrigger > 0)) {
                    var7 = arg0.x - (arg0.targetTileX - this.sceneBaseTileX - this.sceneBaseTileX) * 64;
                    var4 = arg0.z - (arg0.targetTile - this.sceneBaseTileZ - this.sceneBaseTileZ) * 64;
                    if (var7 != 0 || var4 != 0) {
                        arg0.dstYaw = (int) (Math.atan2((double) var7, (double) var4) * 325.949D) & 2047;
                    }
                    arg0.targetTileX = 0;
                    arg0.targetTile = 0;
                }
                var7 = arg0.dstYaw - arg0.yaw & 2047;
                if (var7 != 0) {
                    if (var7 >= arg0.turnSpeed && var7 <= 2048 - arg0.turnSpeed) {
                        if (var7 > 1024) {
                            arg0.yaw -= arg0.turnSpeed;
                        } else {
                            arg0.yaw += arg0.turnSpeed;
                        }
                    } else {
                        arg0.yaw = arg0.dstYaw;
                    }
                    arg0.yaw &= 2047;
                    if (arg0.secondarySeqId == arg0.seqStandId && arg0.yaw != arg0.dstYaw) {
                        if (arg0.seqTurnId != -1) {
                            arg0.secondarySeqId = arg0.seqTurnId;
                            return;
                        }
                        arg0.secondarySeqId = arg0.seqWalkId;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LGQOSZKJC;I)V")
    public final void updateSequences(PathingEntity arg0, int arg1) {
        if (arg1 >= 0) {
            _flowObfuscator14 = true;
        }
        arg0.needsForwardDrawPadding = false;
        SeqType var3;
        if (arg0.secondarySeqId != -1) {
            var3 = SeqType.instances[arg0.secondarySeqId];
            arg0.secondarySeqCycle++;
            if (arg0.secondarySeqFrame < var3.frameCount && arg0.secondarySeqCycle > var3.getFrameDuration(arg0.secondarySeqFrame, (byte) -39)) {
                arg0.secondarySeqCycle = 0;
                arg0.secondarySeqFrame++;
            }
            if (arg0.secondarySeqFrame >= var3.frameCount) {
                arg0.secondarySeqCycle = 0;
                arg0.secondarySeqFrame = 0;
            }
        }
        if (arg0.spotanimId != -1 && loopCycle >= arg0.spotanimLastCycle) {
            if (arg0.spotanimFrame < 0) {
                arg0.spotanimFrame = 0;
            }
            var3 = SpotAnimType.instances[arg0.spotanimId].seq;
            arg0.spotanimCycle++;
            while (arg0.spotanimFrame < var3.frameCount && arg0.spotanimCycle > var3.getFrameDuration(arg0.spotanimFrame, (byte) -39)) {
                arg0.spotanimCycle -= var3.getFrameDuration(arg0.spotanimFrame, (byte) -39);
                arg0.spotanimFrame++;
            }
            if (arg0.spotanimFrame >= var3.frameCount && (arg0.spotanimFrame < 0 || arg0.spotanimFrame >= var3.frameCount)) {
                arg0.spotanimId = -1;
            }
        }
        if (arg0.primarySeqId != -1 && arg0.primarySeqDelay <= 1) {
            var3 = SeqType.instances[arg0.primarySeqId];
            if (var3.preanim_move == 1 && arg0.seqPathLength > 0 && arg0.forceMoveEndCycle <= loopCycle && arg0.forceMoveStartCycle < loopCycle) {
                arg0.primarySeqDelay = 1;
                return;
            }
        }
        if (arg0.primarySeqId != -1 && arg0.primarySeqDelay == 0) {
            var3 = SeqType.instances[arg0.primarySeqId];
            arg0.primarySeqCycle++;
            while (arg0.primarySeqFrame < var3.frameCount && arg0.primarySeqCycle > var3.getFrameDuration(arg0.primarySeqFrame, (byte) -39)) {
                arg0.primarySeqCycle -= var3.getFrameDuration(arg0.primarySeqFrame, (byte) -39);
                arg0.primarySeqFrame++;
            }
            if (arg0.primarySeqFrame >= var3.frameCount) {
                arg0.primarySeqFrame -= var3.replayoff;
                arg0.primarySeqLoop++;
                if (arg0.primarySeqLoop >= var3.replaycount) {
                    arg0.primarySeqId = -1;
                }
                if (arg0.primarySeqFrame < 0 || arg0.primarySeqFrame >= var3.frameCount) {
                    arg0.primarySeqId = -1;
                }
            }
            arg0.needsForwardDrawPadding = var3.stretches;
        }
        if (arg0.primarySeqDelay > 0) {
            arg0.primarySeqDelay--;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
    public final void drawGame(boolean arg0) {
        if (!arg0) {
            this._flowObfuscator18 = this.randomIn.nextInt();
        }
        if (this.redrawTitleBackground) {
            this.redrawTitleBackground = false;
            this.areaBackleft1.draw(4, 23680, super.graphics, 0);
            this.areaBackleft2.draw(357, 23680, super.graphics, 0);
            this.areaBackright1.draw(4, 23680, super.graphics, 722);
            this.areaBackright2.draw(205, 23680, super.graphics, 743);
            this.areaBacktop1.draw(0, 23680, super.graphics, 0);
            this.areaBackvmid1.draw(4, 23680, super.graphics, 516);
            this.areaBackvmid2.draw(205, 23680, super.graphics, 516);
            this.areaBackvmid3.draw(357, 23680, super.graphics, 496);
            this.areaBackhmid2.draw(338, 23680, super.graphics, 0);
            this.redrawSidebar = true;
            this.redrawChatback = true;
            this.redrawSideicons = true;
            this.redrawPrivacySettings = true;
            if (this.sceneState != 2) {
                this.areaViewport.draw(4, 23680, super.graphics, 4);
                this.areaMapback.draw(4, 23680, super.graphics, 550);
            }
        }
        if (this.sceneState == 2) {
            this.drawScene((byte) 1);
        }
        if (this.menuVisible && this.menuArea == 1) {
            this.redrawSidebar = true;
        }
        boolean var2;
        if (this.sidebarInterfaceId != -1) {
            var2 = this.updateInterfaceAnimation(this.sceneDelta, false, this.sidebarInterfaceId);
            if (var2) {
                this.redrawSidebar = true;
            }
        }
        if (this.selectedArea == 2) {
            this.redrawSidebar = true;
        }
        if (this.objDragArea == 2) {
            this.redrawSidebar = true;
        }
        if (this.redrawSidebar) {
            this.drawSidebar((byte) -81);
            this.redrawSidebar = false;
        }
        if (this.chatInterfaceId == -1) {
            this.chatInterface.scrollPosition = this.chatScrollHeight - this.chatScrollOffset - 77;
            if (super.mouseX > 448 && super.mouseX < 560 && super.mouseY > 332) {
                this.handleScrollInput(463, 77, super.mouseX - 17, super.mouseY - 357, this.chatInterface, 0, false, this.chatScrollHeight, 0);
            }
            int var3 = this.chatScrollHeight - 77 - this.chatInterface.scrollPosition;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.chatScrollHeight - 77) {
                var3 = this.chatScrollHeight - 77;
            }
            if (this.chatScrollOffset != var3) {
                this.chatScrollOffset = var3;
                this.redrawChatback = true;
            }
        }
        if (this.chatInterfaceId != -1) {
            var2 = this.updateInterfaceAnimation(this.sceneDelta, false, this.chatInterfaceId);
            if (var2) {
                this.redrawChatback = true;
            }
        }
        if (this.selectedArea == 3) {
            this.redrawChatback = true;
        }
        if (this.objDragArea == 3) {
            this.redrawChatback = true;
        }
        if (this.modalMessage != null) {
            this.redrawChatback = true;
        }
        if (this.menuVisible && this.menuArea == 2) {
            this.redrawChatback = true;
        }
        if (this.redrawChatback) {
            this.drawChat(6);
            this.redrawChatback = false;
        }
        if (this.sceneState == 2) {
            this.drawMinimap(false);
            this.areaMapback.draw(4, 23680, super.graphics, 550);
        }
        if (this.flashingTab != -1) {
            this.redrawSideicons = true;
        }
        if (this.redrawSideicons) {
            if (this.flashingTab != -1 && this.flashingTab == this.selectedTab) {
                this.flashingTab = -1;
                this.out.p1isaac((byte) 6, 120);
                this.out.p1(this.selectedTab);
            }
            this.redrawSideicons = false;
            this.areaBackhmid1.bind(0);
            this.imageBackhmid1.draw(0, 16083, 0);
            if (this.sidebarInterfaceId == -1) {
                if (this.tabInterfaceId[this.selectedTab] != -1) {
                    if (this.selectedTab == 0) {
                        this.imageRedstone1.draw(22, 16083, 10);
                    }
                    if (this.selectedTab == 1) {
                        this.imageRedstone2.draw(54, 16083, 8);
                    }
                    if (this.selectedTab == 2) {
                        this.imageRedstone2.draw(82, 16083, 8);
                    }
                    if (this.selectedTab == 3) {
                        this.imageRedstone3.draw(110, 16083, 8);
                    }
                    if (this.selectedTab == 4) {
                        this.imageRedstone2h.draw(153, 16083, 8);
                    }
                    if (this.selectedTab == 5) {
                        this.imageRedstone2h.draw(181, 16083, 8);
                    }
                    if (this.selectedTab == 6) {
                        this.imageRedstone1h.draw(209, 16083, 9);
                    }
                }
                if (this.tabInterfaceId[0] != -1 && (this.flashingTab != 0 || loopCycle % 20 < 10)) {
                    this.imageSideicons[0].draw(29, 16083, 13);
                }
                if (this.tabInterfaceId[1] != -1 && (this.flashingTab != 1 || loopCycle % 20 < 10)) {
                    this.imageSideicons[1].draw(53, 16083, 11);
                }
                if (this.tabInterfaceId[2] != -1 && (this.flashingTab != 2 || loopCycle % 20 < 10)) {
                    this.imageSideicons[2].draw(82, 16083, 11);
                }
                if (this.tabInterfaceId[3] != -1 && (this.flashingTab != 3 || loopCycle % 20 < 10)) {
                    this.imageSideicons[3].draw(115, 16083, 12);
                }
                if (this.tabInterfaceId[4] != -1 && (this.flashingTab != 4 || loopCycle % 20 < 10)) {
                    this.imageSideicons[4].draw(153, 16083, 13);
                }
                if (this.tabInterfaceId[5] != -1 && (this.flashingTab != 5 || loopCycle % 20 < 10)) {
                    this.imageSideicons[5].draw(180, 16083, 11);
                }
                if (this.tabInterfaceId[6] != -1 && (this.flashingTab != 6 || loopCycle % 20 < 10)) {
                    this.imageSideicons[6].draw(208, 16083, 13);
                }
            }
            this.areaBackhmid1.draw(160, 23680, super.graphics, 516);
            this.areaBackbase2.bind(0);
            this.imageBackbase2.draw(0, 16083, 0);
            if (this.sidebarInterfaceId == -1) {
                if (this.tabInterfaceId[this.selectedTab] != -1) {
                    if (this.selectedTab == 7) {
                        this.imageRedstone1v.draw(42, 16083, 0);
                    }
                    if (this.selectedTab == 8) {
                        this.imageRedstone2v.draw(74, 16083, 0);
                    }
                    if (this.selectedTab == 9) {
                        this.imageRedstone2v.draw(102, 16083, 0);
                    }
                    if (this.selectedTab == 10) {
                        this.imageRedstone3v.draw(130, 16083, 1);
                    }
                    if (this.selectedTab == 11) {
                        this.imageRedstone2hv.draw(173, 16083, 0);
                    }
                    if (this.selectedTab == 12) {
                        this.imageRedstone2hv.draw(201, 16083, 0);
                    }
                    if (this.selectedTab == 13) {
                        this.imageRedstone1hv.draw(229, 16083, 0);
                    }
                }
                if (this.tabInterfaceId[8] != -1 && (this.flashingTab != 8 || loopCycle % 20 < 10)) {
                    this.imageSideicons[7].draw(74, 16083, 2);
                }
                if (this.tabInterfaceId[9] != -1 && (this.flashingTab != 9 || loopCycle % 20 < 10)) {
                    this.imageSideicons[8].draw(102, 16083, 3);
                }
                if (this.tabInterfaceId[10] != -1 && (this.flashingTab != 10 || loopCycle % 20 < 10)) {
                    this.imageSideicons[9].draw(137, 16083, 4);
                }
                if (this.tabInterfaceId[11] != -1 && (this.flashingTab != 11 || loopCycle % 20 < 10)) {
                    this.imageSideicons[10].draw(174, 16083, 2);
                }
                if (this.tabInterfaceId[12] != -1 && (this.flashingTab != 12 || loopCycle % 20 < 10)) {
                    this.imageSideicons[11].draw(201, 16083, 2);
                }
                if (this.tabInterfaceId[13] != -1 && (this.flashingTab != 13 || loopCycle % 20 < 10)) {
                    this.imageSideicons[12].draw(226, 16083, 2);
                }
            }
            this.areaBackbase2.draw(466, 23680, super.graphics, 496);
            this.areaViewport.bind(0);
        }
        if (this.redrawPrivacySettings) {
            this.redrawPrivacySettings = false;
            this.areaBackbase1.bind(0);
            this.imageBackbase1.draw(0, 16083, 0);
            this.fontPlain12.drawStringCenterTag(16777215, 55, this._flowObfuscator18, "Public chat", 28, true);
            if (this.publicChatSetting == 0) {
                this.fontPlain12.drawStringCenterTag(65280, 55, this._flowObfuscator18, "On", 41, true);
            }
            if (this.publicChatSetting == 1) {
                this.fontPlain12.drawStringCenterTag(16776960, 55, this._flowObfuscator18, "Friends", 41, true);
            }
            if (this.publicChatSetting == 2) {
                this.fontPlain12.drawStringCenterTag(16711680, 55, this._flowObfuscator18, "Off", 41, true);
            }
            if (this.publicChatSetting == 3) {
                this.fontPlain12.drawStringCenterTag(65535, 55, this._flowObfuscator18, "Hide", 41, true);
            }
            this.fontPlain12.drawStringCenterTag(16777215, 184, this._flowObfuscator18, "Private chat", 28, true);
            if (this.privateChatSetting == 0) {
                this.fontPlain12.drawStringCenterTag(65280, 184, this._flowObfuscator18, "On", 41, true);
            }
            if (this.privateChatSetting == 1) {
                this.fontPlain12.drawStringCenterTag(16776960, 184, this._flowObfuscator18, "Friends", 41, true);
            }
            if (this.privateChatSetting == 2) {
                this.fontPlain12.drawStringCenterTag(16711680, 184, this._flowObfuscator18, "Off", 41, true);
            }
            this.fontPlain12.drawStringCenterTag(16777215, 324, this._flowObfuscator18, "Trade/compete", 28, true);
            if (this.tradeChatSetting == 0) {
                this.fontPlain12.drawStringCenterTag(65280, 324, this._flowObfuscator18, "On", 41, true);
            }
            if (this.tradeChatSetting == 1) {
                this.fontPlain12.drawStringCenterTag(16776960, 324, this._flowObfuscator18, "Friends", 41, true);
            }
            if (this.tradeChatSetting == 2) {
                this.fontPlain12.drawStringCenterTag(16711680, 324, this._flowObfuscator18, "Off", 41, true);
            }
            this.fontPlain12.drawStringCenterTag(16777215, 458, this._flowObfuscator18, "Report abuse", 33, true);
            this.areaBackbase1.draw(453, 23680, super.graphics, 0);
            this.areaViewport.bind(0);
        }
        this.sceneDelta = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LDUCMKFAY;Z)Z")
    public final boolean handleSocialMenuOption(Component arg0, boolean arg1) {
        int var3 = arg0.clientCode;
        if (arg1) {
            this.load();
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.menuOption[this.menuSize] = "Remove @whi@" + arg0.text;
                this.menuAction[this.menuSize] = 322;
                this.menuSize++;
                return true;
            } else {
                return false;
            }
        } else {
            if (var3 >= 801) {
                var3 -= 701;
            } else if (var3 >= 701) {
                var3 -= 601;
            } else if (var3 >= 101) {
                var3 -= 101;
            } else {
                var3--;
            }
            this.menuOption[this.menuSize] = "Remove @whi@" + this.friendName[var3];
            this.menuAction[this.menuSize] = 792;
            this.menuSize++;
            this.menuOption[this.menuSize] = "Message @whi@" + this.friendName[var3];
            this.menuAction[this.menuSize] = 639;
            this.menuSize++;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
    public final void pushSpotanims(boolean arg0) {
        SpotAnimEntity var2 = (SpotAnimEntity) this.spotanims.head();
        this.ingame &= arg0;
        while (var2 != null) {
            if (var2.level == this.currentLevel && !var2.seqComplete) {
                if (loopCycle >= var2.startCycle) {
                    var2.update(this.sceneDelta, true);
                    if (var2.seqComplete) {
                        var2.unlink();
                    } else {
                        this.scene.addTemporary(var2.level, 0, (byte) 6, var2.y, -1, var2.z, 60, var2.x, var2, false);
                    }
                }
            } else {
                var2.unlink();
            }
            var2 = (SpotAnimEntity) this.spotanims.next(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILDUCMKFAY;I)V")
    public final void drawInterface(int arg0, int arg1, int arg2, Component arg3, int arg4) {
        if (arg0 != 8) {
            this._flowObfuscator21 = !this._flowObfuscator21;
        }
        if (arg3.type == 0 && arg3.children != null) {
            if (!arg3.hide || this.viewportHoveredInterfaceIndex == arg3.id || this.sidebarHoveredInterfaceIndex == arg3.id || this.chatHoveredInterfaceIndex == arg3.id) {
                int var6 = Draw2D.left;
                int var7 = Draw2D.top;
                int var8 = Draw2D.right;
                int var9 = Draw2D.bottom;
                Draw2D.setBounds(arg4 + arg3.height, arg2, false, arg2 + arg3.width, arg4);
                int var10 = arg3.children.length;
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = arg3.childX[var11] + arg2;
                    int var13 = arg3.childY[var11] + arg4 - arg1;
                    Component var14 = Component.instances[arg3.children[var11]];
                    int var26 = var12 + var14.x;
                    int var27 = var13 + var14.y;
                    if (var14.clientCode > 0) {
                        this.updateInterfaceContent(950, var14);
                    }
                    if (var14.type == 0) {
                        if (var14.scrollPosition > var14.scroll - var14.height) {
                            var14.scrollPosition = var14.scroll - var14.height;
                        }
                        if (var14.scrollPosition < 0) {
                            var14.scrollPosition = 0;
                        }
                        this.drawInterface(8, var14.scrollPosition, var26, var14, var27);
                        if (var14.scroll > var14.height) {
                            this.drawScrollbar(519, var14.height, var14.scrollPosition, var27, var26 + var14.width, var14.scroll);
                        }
                    } else if (var14.type != 1) {
                        int var16;
                        int var17;
                        int var18;
                        int var21;
                        int var22;
                        int var28;
                        int var36;
                        if (var14.type == 2) {
                            var28 = 0;
                            for (var16 = 0; var16 < var14.height; var16++) {
                                for (var17 = 0; var17 < var14.width; var17++) {
                                    var18 = var26 + var17 * (32 + var14.marginX);
                                    int var35 = var27 + var16 * (32 + var14.marginY);
                                    if (var28 < 20) {
                                        var18 += var14.invSlotOffsetX[var28];
                                        var35 += var14.invSlotOffsetY[var28];
                                    }
                                    if (var14.invSlotObjId[var28] <= 0) {
                                        if (var14.invSlotGraphic != null && var28 < 20) {
                                            Pix24 var39 = var14.invSlotGraphic[var28];
                                            if (var39 != null) {
                                                var39.draw(var18, 16083, var35);
                                            }
                                        }
                                    } else {
                                        var36 = 0;
                                        var21 = 0;
                                        var22 = var14.invSlotObjId[var28] - 1;
                                        if (var18 > Draw2D.left - 32 && var18 < Draw2D.right && var35 > Draw2D.top - 32 && var35 < Draw2D.bottom || this.objDragArea != 0 && this.objDragSlot == var28) {
                                            int var23 = 0;
                                            if (this.objSelected == 1 && this.objSelectedSlot == var28 && this.objSelectedInterface == var14.id) {
                                                var23 = 16777215;
                                            }
                                            Pix24 var24 = ObjType.getIcon(var22, var14.invSlotObjCount[var28], var23, 9);
                                            if (var24 != null) {
                                                int var25;
                                                if (this.objDragArea != 0 && this.objDragSlot == var28 && this.objDragInterfaceId == var14.id) {
                                                    var36 = super.mouseX - this.objGrabX;
                                                    var21 = super.mouseY - this.objGrabY;
                                                    if (var36 < 5 && var36 > -5) {
                                                        var36 = 0;
                                                    }
                                                    if (var21 < 5 && var21 > -5) {
                                                        var21 = 0;
                                                    }
                                                    if (this.objDragCycles < 5) {
                                                        var36 = 0;
                                                        var21 = 0;
                                                    }
                                                    var24.drawAlpha(var18 + var36, var35 + var21, 128, this._flowObfuscator25);
                                                    if (var35 + var21 < Draw2D.top && arg3.scrollPosition > 0) {
                                                        var25 = this.sceneDelta * (Draw2D.top - var35 - var21) / 3;
                                                        if (var25 > this.sceneDelta * 10) {
                                                            var25 = this.sceneDelta * 10;
                                                        }
                                                        if (var25 > arg3.scrollPosition) {
                                                            var25 = arg3.scrollPosition;
                                                        }
                                                        arg3.scrollPosition -= var25;
                                                        this.objGrabY += var25;
                                                    }
                                                    if (var35 + var21 + 32 > Draw2D.bottom && arg3.scrollPosition < arg3.scroll - arg3.height) {
                                                        var25 = this.sceneDelta * (var35 + var21 + 32 - Draw2D.bottom) / 3;
                                                        if (var25 > this.sceneDelta * 10) {
                                                            var25 = this.sceneDelta * 10;
                                                        }
                                                        if (var25 > arg3.scroll - arg3.height - arg3.scrollPosition) {
                                                            var25 = arg3.scroll - arg3.height - arg3.scrollPosition;
                                                        }
                                                        arg3.scrollPosition += var25;
                                                        this.objGrabY -= var25;
                                                    }
                                                } else if (this.selectedArea != 0 && this.selectedItem == var28 && this.selectedInterface == var14.id) {
                                                    var24.drawAlpha(var18, var35, 128, this._flowObfuscator25);
                                                } else {
                                                    var24.draw(var18, 16083, var35);
                                                }
                                                if (var24.width == 33 || var14.invSlotObjCount[var28] != 1) {
                                                    var25 = var14.invSlotObjCount[var28];
                                                    this.fontPlain11.drawString(0, formatObjCount(-33245, var25), var35 + 10 + var21, 822, var18 + 1 + var36);
                                                    this.fontPlain11.drawString(16776960, formatObjCount(-33245, var25), var35 + 9 + var21, 822, var18 + var36);
                                                }
                                            }
                                        }
                                    }
                                    var28++;
                                }
                            }
                        } else if (var14.type == 3) {
                            boolean var34 = false;
                            if (this.chatHoveredInterfaceIndex == var14.id || this.sidebarHoveredInterfaceIndex == var14.id || this.viewportHoveredInterfaceIndex == var14.id) {
                                var34 = true;
                            }
                            if (this.executeInterfaceScript(var14, false)) {
                                var28 = var14.activeColour;
                                if (var34 && var14.activeOverColour != 0) {
                                    var28 = var14.activeOverColour;
                                }
                            } else {
                                var28 = var14.colour;
                                if (var34 && var14.overColour != 0) {
                                    var28 = var14.overColour;
                                }
                            }
                            if (var14.alpha == 0) {
                                if (var14.fill) {
                                    Draw2D.fillRect(var14.height, var27, var26, var28, var14.width, 0);
                                } else {
                                    Draw2D.drawRect(var26, var14.width, var14.height, var28, var27, true);
                                }
                            } else if (var14.fill) {
                                Draw2D.fillRect(var28, var27, var14.width, var14.height, 256 - (var14.alpha & 255), 0, var26);
                            } else {
                                Draw2D.drawRect(var27, var14.height, 256 - (var14.alpha & 255), var28, var14.width, var26, -17319);
                            }
                        } else {
                            PixFont var15;
                            if (var14.type == 4) {
                                var15 = var14.font;
                                String var30 = var14.text;
                                boolean var31 = false;
                                if (this.chatHoveredInterfaceIndex == var14.id || this.sidebarHoveredInterfaceIndex == var14.id || this.viewportHoveredInterfaceIndex == var14.id) {
                                    var31 = true;
                                }
                                if (this.executeInterfaceScript(var14, false)) {
                                    var16 = var14.activeColour;
                                    if (var31 && var14.activeOverColour != 0) {
                                        var16 = var14.activeOverColour;
                                    }
                                    if (var14.activeText.length() > 0) {
                                        var30 = var14.activeText;
                                    }
                                } else {
                                    var16 = var14.colour;
                                    if (var31 && var14.overColour != 0) {
                                        var16 = var14.overColour;
                                    }
                                }
                                if (var14.buttonType == 6 && this.pressedContinueOption) {
                                    var30 = "Please wait...";
                                    var16 = var14.colour;
                                }
                                if (Draw2D.width2d == 479) {
                                    if (var16 == 16776960) {
                                        var16 = 255;
                                    }
                                    if (var16 == 49152) {
                                        var16 = 16777215;
                                    }
                                }
                                var36 = var27 + var15.height;
                                while (var30.length() > 0) {
                                    if (var30.indexOf("%") != -1) {
                                        label354: while (true) {
                                            var21 = var30.indexOf("%1");
                                            if (var21 == -1) {
                                                while (true) {
                                                    var21 = var30.indexOf("%2");
                                                    if (var21 == -1) {
                                                        while (true) {
                                                            var21 = var30.indexOf("%3");
                                                            if (var21 == -1) {
                                                                while (true) {
                                                                    var21 = var30.indexOf("%4");
                                                                    if (var21 == -1) {
                                                                        while (true) {
                                                                            var21 = var30.indexOf("%5");
                                                                            if (var21 == -1) {
                                                                                break label354;
                                                                            }
                                                                            var30 = var30.substring(0, var21) + this.getIntString(369, this.executeClientscript1(341, var14, 4)) + var30.substring(var21 + 2);
                                                                        }
                                                                    }
                                                                    var30 = var30.substring(0, var21) + this.getIntString(369, this.executeClientscript1(341, var14, 3)) + var30.substring(var21 + 2);
                                                                }
                                                            }
                                                            var30 = var30.substring(0, var21) + this.getIntString(369, this.executeClientscript1(341, var14, 2)) + var30.substring(var21 + 2);
                                                        }
                                                    }
                                                    var30 = var30.substring(0, var21) + this.getIntString(369, this.executeClientscript1(341, var14, 1)) + var30.substring(var21 + 2);
                                                }
                                            }
                                            var30 = var30.substring(0, var21) + this.getIntString(369, this.executeClientscript1(341, var14, 0)) + var30.substring(var21 + 2);
                                        }
                                    }
                                    var21 = var30.indexOf("\\n");
                                    String var33;
                                    if (var21 != -1) {
                                        var33 = var30.substring(0, var21);
                                        var30 = var30.substring(var21 + 2);
                                    } else {
                                        var33 = var30;
                                        var30 = "";
                                    }
                                    if (var14.center) {
                                        var15.drawStringCenterTag(var16, var26 + var14.width / 2, this._flowObfuscator18, var33, var36, var14.shadowed);
                                    } else {
                                        var15.drawStringTag(false, var14.shadowed, var26, var16, var33, var36);
                                    }
                                    var36 += var15.height;
                                }
                            } else if (var14.type == 5) {
                                Pix24 var29;
                                if (this.executeInterfaceScript(var14, false)) {
                                    var29 = var14.activeGraphic;
                                } else {
                                    var29 = var14.graphic;
                                }
                                if (var29 != null) {
                                    var29.draw(var26, 16083, var27);
                                }
                            } else if (var14.type == 6) {
                                var28 = Draw3D.centerX;
                                var16 = Draw3D.centerY;
                                Draw3D.centerX = var26 + var14.width / 2;
                                Draw3D.centerY = var27 + var14.height / 2;
                                var17 = Draw3D.sin[var14.xan] * var14.zoom >> 16;
                                var18 = Draw3D.cos[var14.xan] * var14.zoom >> 16;
                                boolean var32 = this.executeInterfaceScript(var14, false);
                                if (var32) {
                                    var36 = var14.activeAnim;
                                } else {
                                    var36 = var14.anim;
                                }
                                Model var37;
                                if (var36 == -1) {
                                    var37 = var14.getModel(0, -1, -1, var32);
                                } else {
                                    SeqType var38 = SeqType.instances[var36];
                                    var37 = var14.getModel(0, var38.iframes[var14.animFrame], var38.frames[var14.animFrame], var32);
                                }
                                if (var37 != null) {
                                    var37.drawSimple(0, var14.yan, 0, var14.xan, 0, var17, var18);
                                }
                                Draw3D.centerX = var28;
                                Draw3D.centerY = var16;
                            } else if (var14.type == 7) {
                                var15 = var14.font;
                                var16 = 0;
                                for (var17 = 0; var17 < var14.height; var17++) {
                                    for (var18 = 0; var18 < var14.width; var18++) {
                                        if (var14.invSlotObjId[var16] > 0) {
                                            ObjType var19 = ObjType.get(var14.invSlotObjId[var16] - 1);
                                            String var20 = var19.name;
                                            if (var19.stackable || var14.invSlotObjCount[var16] != 1) {
                                                var20 = var20 + " x" + formatObjCountTagged(var14.invSlotObjCount[var16], 0);
                                            }
                                            var21 = var26 + var18 * (115 + var14.marginX);
                                            var22 = var27 + var17 * (12 + var14.marginY);
                                            if (var14.center) {
                                                var15.drawStringCenterTag(var14.colour, var21 + var14.width / 2, this._flowObfuscator18, var20, var22, var14.shadowed);
                                            } else {
                                                var15.drawStringTag(false, var14.shadowed, var21, var14.colour, var20, var22);
                                            }
                                        }
                                        var16++;
                                    }
                                }
                            }
                        }
                    }
                }
                Draw2D.setBounds(var9, var6, false, var8, var7);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LDSMJIEPN;I)V")
    public final void updateFlameBuffer(Pix8 arg0, int arg1) {
        short var3 = 256;
        if (arg1 >= 0) {
            this.out.p1(126);
        }
        for (int var4 = 0; var4 < this.flameBuffer0.length; var4++) {
            this.flameBuffer0[var4] = 0;
        }
        int var6;
        for (int var5 = 0; var5 < 5000; var5++) {
            var6 = (int) (Math.random() * 128.0D * (double) var3);
            this.flameBuffer0[var6] = (int) (Math.random() * 256.0D);
        }
        int var7;
        int var8;
        int var9;
        for (var6 = 0; var6 < 20; var6++) {
            for (var7 = 1; var7 < var3 - 1; var7++) {
                for (var8 = 1; var8 < 127; var8++) {
                    var9 = var8 + (var7 << 7);
                    this.flameBuffer1[var9] = (this.flameBuffer0[var9 - 1] + this.flameBuffer0[var9 + 1] + this.flameBuffer0[var9 - 128] + this.flameBuffer0[var9 + 128]) / 4;
                }
            }
            int[] var13 = this.flameBuffer0;
            this.flameBuffer0 = this.flameBuffer1;
            this.flameBuffer1 = var13;
        }
        if (arg0 != null) {
            var7 = 0;
            for (var8 = 0; var8 < arg0.cropBottom; var8++) {
                for (var9 = 0; var9 < arg0.cropRight; var9++) {
                    if (arg0.pixels[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.cropLeft;
                        int var11 = var8 + 16 + arg0.cropTop;
                        int var12 = var10 + (var11 << 7);
                        this.flameBuffer0[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILMBMGIXGO;BLDLZHLHNK;)V")
    private final void readPlayerUpdates(int arg0, int arg1, Packet arg2, byte arg3, PlayerEntity arg4) {
        if (arg3 != 25) {
            this.levelObjStacks = null;
        }
        if ((arg0 & 1024) != 0) {
            arg4.forceMoveStartSceneTileX = arg2.g1_alt3(2);
            arg4.forceMoveStartSceneTileZ = arg2.g1_alt3(2);
            arg4.forceMoveEndSceneTileX = arg2.g1_alt3(2);
            arg4.forceMoveEndSceneTileZ = arg2.g1_alt3(2);
            arg4.forceMoveEndCycle = arg2.g2_alt3((byte) -74) + loopCycle;
            arg4.forceMoveStartCycle = arg2.g2_alt2(true) + loopCycle;
            arg4.forceMoveFaceDirection = arg2.g1_alt3(2);
            arg4.resetPath(true);
        }
        int var6;
        if ((arg0 & 256) != 0) {
            arg4.spotanimId = arg2.g2_alt1((byte) 108);
            var6 = arg2.g4();
            arg4.spotanimHeight = var6 >> 16;
            arg4.spotanimLastCycle = loopCycle + (var6 & 65535);
            arg4.spotanimFrame = 0;
            arg4.spotanimCycle = 0;
            if (arg4.spotanimLastCycle > loopCycle) {
                arg4.spotanimFrame = -1;
            }
            if (arg4.spotanimId == 65535) {
                arg4.spotanimId = -1;
            }
        }
        int var7;
        int var8;
        if ((arg0 & 8) != 0) {
            var6 = arg2.g2_alt1((byte) 108);
            if (var6 == 65535) {
                var6 = -1;
            }
            var7 = arg2.g1_alt2(false);
            if (var6 == arg4.primarySeqId && var6 != -1) {
                var8 = SeqType.instances[var6].replacemode;
                if (var8 == 1) {
                    arg4.primarySeqFrame = 0;
                    arg4.primarySeqCycle = 0;
                    arg4.primarySeqDelay = var7;
                    arg4.primarySeqLoop = 0;
                }
                if (var8 == 2) {
                    arg4.primarySeqLoop = 0;
                }
            } else if (var6 == -1 || arg4.primarySeqId == -1 || SeqType.instances[var6].priority >= SeqType.instances[arg4.primarySeqId].priority) {
                arg4.primarySeqId = var6;
                arg4.primarySeqFrame = 0;
                arg4.primarySeqCycle = 0;
                arg4.primarySeqDelay = var7;
                arg4.primarySeqLoop = 0;
                arg4.seqPathLength = arg4.pathLength;
            }
        }
        if ((arg0 & 4) != 0) {
            arg4.chat = arg2.gjstr();
            if (arg4.chat.charAt(0) == '~') {
                arg4.chat = arg4.chat.substring(1);
                this.addMessage(arg4.chat, 2, arg4.name, this._flowObfuscator21);
            } else if (arg4 == localPlayer) {
                this.addMessage(arg4.chat, 2, arg4.name, this._flowObfuscator21);
            }
            arg4.chatColor = 0;
            arg4.chatStyle = 0;
            arg4.chatTimer = 150;
        }
        if ((arg0 & 128) != 0) {
            var6 = arg2.g2_alt1((byte) 108);
            var7 = arg2.g1();
            var8 = arg2.g1_alt2(false);
            int var9 = arg2.pos;
            if (arg4.name != null && arg4.visible) {
                long var10 = JString.toBase37(arg4.name);
                boolean var12 = false;
                if (var7 <= 1) {
                    for (int var13 = 0; var13 < this.ignoreCount; var13++) {
                        if (this.ignoreName37[var13] == var10) {
                            var12 = true;
                            break;
                        }
                    }
                }
                if (!var12 && this.overrideChat == 0) {
                    try {
                        this.chatBuffer.pos = 0;
                        arg2.gdata_alt1(var8, 0, true, this.chatBuffer.data);
                        this.chatBuffer.pos = 0;
                        String var17 = WordPack.unpack(var8, true, this.chatBuffer);
                        String var18 = WordFilter.filter(var17, 0);
                        arg4.chat = var18;
                        arg4.chatColor = var6 >> 8;
                        arg4.chatStyle = var6 & 255;
                        arg4.chatTimer = 150;
                        if (var7 != 2 && var7 != 3) {
                            if (var7 == 1) {
                                this.addMessage(var18, 1, "@cr1@" + arg4.name, this._flowObfuscator21);
                            } else {
                                this.addMessage(var18, 2, arg4.name, this._flowObfuscator21);
                            }
                        } else {
                            this.addMessage(var18, 1, "@cr2@" + arg4.name, this._flowObfuscator21);
                        }
                    } catch (Exception var14) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg2.pos = var9 + var8;
        }
        if ((arg0 & 1) != 0) {
            arg4.targetId = arg2.g2_alt1((byte) 108);
            if (arg4.targetId == 65535) {
                arg4.targetId = -1;
            }
        }
        if ((arg0 & 16) != 0) {
            var6 = arg2.g1_alt2(false);
            byte[] var15 = new byte[var6];
            Packet var16 = new Packet(var15, 891);
            arg2.gdata(var6, this._flowObfuscator15, 0, var15);
            this.playerAppearanceBuffer[arg1] = var16;
            arg4.read(0, var16);
        }
        if ((arg0 & 2) != 0) {
            arg4.targetTileX = arg2.g2_alt3((byte) -74);
            arg4.targetTile = arg2.g2_alt1((byte) 108);
        }
        if ((arg0 & 32) != 0) {
            var6 = arg2.g1();
            var7 = arg2.g1_alt1(0);
            arg4.hit(-35698, var7, var6, loopCycle);
            arg4.combatCycle = loopCycle + 300;
            arg4.health = arg2.g1_alt2(false);
            arg4.totalHealth = arg2.g1();
        }
        if ((arg0 & 512) != 0) {
            var6 = arg2.g1();
            var7 = arg2.g1_alt3(2);
            arg4.hit(-35698, var7, var6, loopCycle);
            arg4.combatCycle = loopCycle + 300;
            arg4.health = arg2.g1();
            arg4.totalHealth = arg2.g1_alt2(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public final void updateOrbitCamera(int arg0) {
        if (arg0 != 3) {
            this.packetType = -1;
        }
        try {
            int var2 = localPlayer.x + this.cameraAnticheatOffsetX;
            int var3 = localPlayer.z + this.cameraAnticheatOffsetZ;
            if (this.orbitCameraX - var2 < -500 || this.orbitCameraX - var2 > 500 || this.orbitCameraZ - var3 < -500 || this.orbitCameraZ - var3 > 500) {
                this.orbitCameraX = var2;
                this.orbitCameraZ = var3;
            }
            if (this.orbitCameraX != var2) {
                this.orbitCameraX += (var2 - this.orbitCameraX) / 16;
            }
            if (this.orbitCameraZ != var3) {
                this.orbitCameraZ += (var3 - this.orbitCameraZ) / 16;
            }
            if (super.actionKey[1] == 1) {
                this.orbitCameraYawVelocity += (-24 - this.orbitCameraYawVelocity) / 2;
            } else if (super.actionKey[2] == 1) {
                this.orbitCameraYawVelocity += (24 - this.orbitCameraYawVelocity) / 2;
            } else {
                this.orbitCameraYawVelocity /= 2;
            }
            if (super.actionKey[3] == 1) {
                this.orbitCameraPitchVelocity += (12 - this.orbitCameraPitchVelocity) / 2;
            } else if (super.actionKey[4] == 1) {
                this.orbitCameraPitchVelocity += (-12 - this.orbitCameraPitchVelocity) / 2;
            } else {
                this.orbitCameraPitchVelocity /= 2;
            }
            this.orbitCameraYaw = this.orbitCameraYaw + this.orbitCameraYawVelocity / 2 & 2047;
            this.orbitCameraPitch += this.orbitCameraPitchVelocity / 2;
            if (this.orbitCameraPitch < 128) {
                this.orbitCameraPitch = 128;
            }
            if (this.orbitCameraPitch > 383) {
                this.orbitCameraPitch = 383;
            }
            int var4 = this.orbitCameraX >> 7;
            int var5 = this.orbitCameraZ >> 7;
            int var6 = this.getHeightmapY(this.currentLevel, this.orbitCameraZ, true, this.orbitCameraX);
            int var7 = 0;
            int var8;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                        int var10 = this.currentLevel;
                        if (var10 < 3 && (this.levelTileFlags[1][var8][var9] & 2) == 2) {
                            var10++;
                        }
                        int var11 = var6 - this.levelHeightmap[var10][var8][var9];
                        if (var11 > var7) {
                            var7 = var11;
                        }
                    }
                }
            }
            gamelogic2++;
            if (gamelogic2 > 1512) {
                gamelogic2 = 0;
                this.out.p1isaac((byte) 6, 77);
                this.out.p1(0);
                var8 = this.out.pos;
                this.out.p1((int) (Math.random() * 256.0D));
                this.out.p1(101);
                this.out.p1(233);
                this.out.p2(45092);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.out.p2(35784);
                }
                this.out.p1((int) (Math.random() * 256.0D));
                this.out.p1(64);
                this.out.p1(38);
                this.out.p2((int) (Math.random() * 65536.0D));
                this.out.p2((int) (Math.random() * 65536.0D));
                this.out.psize1(this.out.pos - var8, (byte) 0);
            }
            var8 = var7 * 192;
            if (var8 > 98048) {
                var8 = 98048;
            }
            if (var8 < 32768) {
                var8 = 32768;
            }
            if (var8 > this.cameraPitchClamp) {
                this.cameraPitchClamp += (var8 - this.cameraPitchClamp) / 24;
            } else if (var8 < this.cameraPitchClamp) {
                this.cameraPitchClamp += (var8 - this.cameraPitchClamp) / 80;
            }
        } catch (Exception var12) {
            signlink.reporterror("glfc_ex " + localPlayer.x + "," + localPlayer.z + "," + this.orbitCameraX + "," + this.orbitCameraZ + "," + this.sceneCenterZoneX + "," + this.sceneCenterZoneZ + "," + this.sceneBaseTileX + "," + this.sceneBaseTileZ);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void draw(int arg0) {
        if (!this.errorStarted && !this.errorLoading && !this.errorHost) {
            drawCycle++;
            if (arg0 != 0) {
                this.packetType = -1;
            }
            if (!this.ingame) {
                this.drawTitleScreen(false, false);
            } else {
                this.drawGame(true);
            }
            this.dragCycles = 0;
        } else {
            this.drawError(-13873);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean isFriend(boolean arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.friendCount; var3++) {
                if (arg1.equalsIgnoreCase(this.friendName[var3])) {
                    return true;
                }
            }
            if (arg0) {
                this.out.p1(138);
            }
            return arg1.equalsIgnoreCase(localPlayer.name);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
    public static final String getCombatLevelColorTag(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            throw new NullPointerException();
        } else {
            int var3 = arg0 - arg1;
            if (var3 < -9) {
                return "@red@";
            } else if (var3 < -6) {
                return "@or3@";
            } else if (var3 < -3) {
                return "@or2@";
            } else if (var3 < 0) {
                return "@or1@";
            } else if (var3 > 9) {
                return "@gre@";
            } else if (var3 > 6) {
                return "@gr3@";
            } else if (var3 > 3) {
                return "@gr2@";
            } else {
                return var3 > 0 ? "@gr1@" : "@yel@";
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    public final void setWaveVolume(byte arg0, int arg1) {
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            this.load();
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
    public final void draw3DEntityElements(int arg0) {
        if (arg0 != 8) {
            this._flowObfuscator18 = 130;
        }
        this.drawPrivateMessages((byte) -13);
        if (this.crossMode == 1) {
            this.imageCrosses[this.crossCycle / 100].draw(this.crossX - 8 - 4, 16083, this.crossY - 8 - 4);
            gamelogic6++;
            if (gamelogic6 > 67) {
                gamelogic6 = 0;
                this.out.p1isaac((byte) 6, 78);
            }
        }
        if (this.crossMode == 2) {
            this.imageCrosses[4 + this.crossCycle / 100].draw(this.crossX - 8 - 4, 16083, this.crossY - 8 - 4);
        }
        if (this.viewportOverlayInterfaceId != -1) {
            this.updateInterfaceAnimation(this.sceneDelta, false, this.viewportOverlayInterfaceId);
            this.drawInterface(8, 0, 0, Component.instances[this.viewportOverlayInterfaceId], 0);
        }
        if (this.viewportInterfaceId != -1) {
            this.updateInterfaceAnimation(this.sceneDelta, false, this.viewportInterfaceId);
            this.drawInterface(8, 0, 0, Component.instances[this.viewportInterfaceId], 0);
        }
        this.drawWildyLevel(184);
        if (!this.menuVisible) {
            this.handleInput(0);
            this.drawTooltip(45706);
        } else if (this.menuArea == 0) {
            this.drawMenu((byte) 9);
        }
        if (this.inMultizone == 1) {
            this.imageHeadicons[1].draw(472, 16083, 296);
        }
        int var9;
        if (showFps) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.fps < 15) {
                var4 = 16711680;
            }
            this.fontPlain12.drawStringRight("Fps:" + super.fps, var2, var4, (byte) -80, var3);
            var9 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            var4 = 16776960;
            if (var6 > 33554432 && lowMemory) {
                var4 = 16711680;
            }
            this.fontPlain12.drawStringRight("Mem:" + var6 + "k", var2, 16776960, (byte) -80, var9);
            var9 += 15;
        }
        if (this.systemUpdateTimer != 0) {
            int var7 = this.systemUpdateTimer / 50;
            var9 = var7 / 60;
            int var8 = var7 % 60;
            if (var8 < 10) {
                this.fontPlain12.drawString(16776960, "System update in: " + var9 + ":0" + var8, 329, 822, 4);
            } else {
                this.fontPlain12.drawString(16776960, "System update in: " + var9 + ":" + var8, 329, 822, 4);
            }
            cyclelogic1++;
            if (cyclelogic1 > 75) {
                cyclelogic1 = 0;
                this.out.p1isaac((byte) 6, 148);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
    public final void addIgnore(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.ignoreCount >= 100) {
                this.addMessage("Your ignore list is full. Max of 100 hit", 0, "", this._flowObfuscator21);
            } else {
                String var4 = JString.toSentenceCase(-45804, JString.fromBase37(arg0, (byte) -99));
                for (int var5 = 0; var5 < this.ignoreCount; var5++) {
                    if (this.ignoreName37[var5] == arg0) {
                        this.addMessage(var4 + " is already on your ignore list", 0, "", this._flowObfuscator21);
                        return;
                    }
                }
                if (arg1 >= 4 && arg1 <= 4) {
                    for (int var6 = 0; var6 < this.friendCount; var6++) {
                        if (this.friendName37[var6] == arg0) {
                            this.addMessage("Please remove " + var4 + " from your friend list first", 0, "", this._flowObfuscator21);
                            return;
                        }
                    }
                    this.ignoreName37[this.ignoreCount++] = arg0;
                    this.redrawSidebar = true;
                    this.out.p1isaac((byte) 6, 133);
                    this.out.p8(5, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public final void updatePlayers(byte arg0) {
        if (arg0 == this._flowObfuscator20) {
            for (int var2 = -1; var2 < this.playerCount; var2++) {
                int var3;
                if (var2 == -1) {
                    var3 = this.LOCAL_PLAYER_INDEX;
                } else {
                    var3 = this.playerIds[var2];
                }
                PlayerEntity var4 = this.players[var3];
                if (var4 != null) {
                    this.updateEntity(46988, 1, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    private final void updateTemporaryLocs(byte arg0) {
        if (arg0 == 8) {
            boolean var3 = false;
        } else {
            this.out.p1(101);
        }
        if (this.sceneState == 2) {
            for (LocSpawned var2 = (LocSpawned) this.temporaryLocs.head(); var2 != null; var2 = (LocSpawned) this.temporaryLocs.next(false)) {
                if (var2.duration > 0) {
                    var2.duration--;
                }
                if (var2.duration == 0) {
                    if (var2.previousType < 0 || World.isLocReady(var2.previousType, var2.previousShape, 8)) {
                        this.addLoc(var2.localZ, var2.level, var2.previousRotation, var2.previousShape, var2.localX, var2.layer, var2.previousType, 4);
                        var2.unlink();
                    }
                } else {
                    if (var2.delay > 0) {
                        var2.delay--;
                    }
                    if (var2.delay == 0 && var2.localX >= 1 && var2.localZ >= 1 && var2.localX <= 102 && var2.localZ <= 102 && (var2.type < 0 || World.isLocReady(var2.type, var2.shape, 8))) {
                        this.addLoc(var2.localZ, var2.level, var2.rotation, var2.shape, var2.localX, var2.layer, var2.type, 4);
                        var2.delay = -1;
                        if (var2.type == var2.previousType && var2.previousType == -1) {
                            var2.unlink();
                        } else if (var2.type == var2.previousType && var2.rotation == var2.previousRotation && var2.shape == var2.previousShape) {
                            var2.unlink();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
    public final void showContextMenu(boolean arg0) {
        int var2 = this.fontBold12.stringWidthTag(this._flowObfuscator32, "Choose Option");
        this.ingame &= arg0;
        int var4;
        for (int var3 = 0; var3 < this.menuSize; var3++) {
            var4 = this.fontBold12.stringWidthTag(this._flowObfuscator32, this.menuOption[var3]);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        var4 = 15 * this.menuSize + 21;
        int var5;
        int var6;
        if (super.mouseClickX > 4 && super.mouseClickY > 4 && super.mouseClickX < 516 && super.mouseClickY < 338) {
            var5 = super.mouseClickX - 4 - var2 / 2;
            if (var5 + var2 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            var6 = super.mouseClickY - 4;
            if (var6 + var4 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.menuVisible = true;
            this.menuArea = 0;
            this.menuX = var5;
            this.menuY = var6;
            this.menuWidth = var2;
            this.menuHeight = 15 * this.menuSize + 22;
        }
        if (super.mouseClickX > 553 && super.mouseClickY > 205 && super.mouseClickX < 743 && super.mouseClickY < 466) {
            var5 = super.mouseClickX - 553 - var2 / 2;
            if (var5 < 0) {
                var5 = 0;
            } else if (var5 + var2 > 190) {
                var5 = 190 - var2;
            }
            var6 = super.mouseClickY - 205;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 + var4 > 261) {
                var6 = 261 - var4;
            }
            this.menuVisible = true;
            this.menuArea = 1;
            this.menuX = var5;
            this.menuY = var6;
            this.menuWidth = var2;
            this.menuHeight = 15 * this.menuSize + 22;
        }
        if (super.mouseClickX > 17 && super.mouseClickY > 357 && super.mouseClickX < 496 && super.mouseClickY < 453) {
            var5 = super.mouseClickX - 17 - var2 / 2;
            if (var5 < 0) {
                var5 = 0;
            } else if (var5 + var2 > 479) {
                var5 = 479 - var2;
            }
            var6 = super.mouseClickY - 357;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 + var4 > 96) {
                var6 = 96 - var4;
            }
            this.menuVisible = true;
            this.menuArea = 2;
            this.menuX = var5;
            this.menuY = var6;
            this.menuWidth = var2;
            this.menuHeight = 15 * this.menuSize + 22;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LMBMGIXGO;IB)V")
    private final void readLocalPlayer(Packet arg0, int arg1, byte arg2) {
        arg0.accessBits(this._flowObfuscator33);
        if (arg2 == 5) {
            boolean var10 = false;
        } else {
            this.packetType = arg0.g1();
        }
        int var4 = arg0.gBit(1, 0);
        if (var4 != 0) {
            int var5 = arg0.gBit(2, 0);
            if (var5 == 0) {
                this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
            } else {
                int var6;
                int var7;
                if (var5 == 1) {
                    var6 = arg0.gBit(3, 0);
                    localPlayer.step(false, (byte) 20, var6);
                    var7 = arg0.gBit(1, 0);
                    if (var7 == 1) {
                        this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
                    }
                } else {
                    int var8;
                    if (var5 == 2) {
                        var6 = arg0.gBit(3, 0);
                        localPlayer.step(true, (byte) 20, var6);
                        var7 = arg0.gBit(3, 0);
                        localPlayer.step(true, (byte) 20, var7);
                        var8 = arg0.gBit(1, 0);
                        if (var8 == 1) {
                            this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
                        }
                    } else if (var5 == 3) {
                        this.currentLevel = arg0.gBit(2, 0);
                        var6 = arg0.gBit(1, 0);
                        var7 = arg0.gBit(1, 0);
                        if (var7 == 1) {
                            this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
                        }
                        var8 = arg0.gBit(7, 0);
                        int var9 = arg0.gBit(7, 0);
                        localPlayer.move(var9, var8, var6 == 1, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
    public final void unloadTitle(int arg0) {
        this.flameActive = false;
        while (this.flameThread) {
            this.flameActive = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.imageTitlebox = null;
        this.imageTitlebutton = null;
        this.imageRunes = null;
        this.flameGradient = null;
        this.flameGradient0 = null;
        this.flameGradient1 = null;
        this.flameGradient2 = null;
        this.flameBuffer0 = null;
        this.flameBuffer1 = null;
        this.flameBuffer3 = null;
        this.flameBuffer2 = null;
        this.imageFlamesLeft = null;
        this.imageFlamesRight = null;
        if (arg0 < 3 || arg0 > 3) {
            this.levelObjStacks = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IZI)Z")
    public final boolean updateInterfaceAnimation(int arg0, boolean arg1, int arg2) {
        boolean var4 = false;
        if (arg1) {
            throw new NullPointerException();
        } else {
            Component var5 = Component.instances[arg2];
            for (int var6 = 0; var6 < var5.children.length && var5.children[var6] != -1; var6++) {
                Component var7 = Component.instances[var5.children[var6]];
                if (var7.type == 1) {
                    var4 |= this.updateInterfaceAnimation(arg0, false, var7.id);
                }
                if (var7.type == 6 && (var7.anim != -1 || var7.activeAnim != -1)) {
                    boolean var8 = this.executeInterfaceScript(var7, false);
                    int var9;
                    if (var8) {
                        var9 = var7.activeAnim;
                    } else {
                        var9 = var7.anim;
                    }
                    if (var9 != -1) {
                        SeqType var10 = SeqType.instances[var9];
                        var7.animCycle += arg0;
                        while (var7.animCycle > var10.getFrameDuration(var7.animFrame, (byte) -39)) {
                            var7.animCycle -= var10.getFrameDuration(var7.animFrame, (byte) -39) + 1;
                            var7.animFrame++;
                            if (var7.animFrame >= var10.frameCount) {
                                var7.animFrame -= var10.replayoff;
                                if (var7.animFrame < 0 || var7.animFrame >= var10.frameCount) {
                                    var7.animFrame = 0;
                                }
                            }
                            var4 = true;
                        }
                    }
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)I")
    public final int getTopLevel(int arg0) {
        if (arg0 <= 0) {
            _flowObfuscator41 = !_flowObfuscator41;
        }
        int var2 = 3;
        if (this.cameraPitch < 310) {
            int var3 = this.cameraX >> 7;
            int var4 = this.cameraZ >> 7;
            int var5 = localPlayer.x >> 7;
            int var6 = localPlayer.z >> 7;
            if ((this.levelTileFlags[this.currentLevel][var3][var4] & 4) != 0) {
                var2 = this.currentLevel;
            }
            int var7;
            if (var5 > var3) {
                var7 = var5 - var3;
            } else {
                var7 = var3 - var5;
            }
            int var8;
            if (var6 > var4) {
                var8 = var6 - var4;
            } else {
                var8 = var4 - var6;
            }
            int var9;
            int var10;
            if (var7 > var8) {
                var9 = var8 * 65536 / var7;
                var10 = 32768;
                while (var3 != var5) {
                    if (var3 < var5) {
                        var3++;
                    } else if (var3 > var5) {
                        var3--;
                    }
                    if ((this.levelTileFlags[this.currentLevel][var3][var4] & 4) != 0) {
                        var2 = this.currentLevel;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            var4++;
                        } else if (var4 > var6) {
                            var4--;
                        }
                        if ((this.levelTileFlags[this.currentLevel][var3][var4] & 4) != 0) {
                            var2 = this.currentLevel;
                        }
                    }
                }
            } else {
                var9 = var7 * 65536 / var8;
                var10 = 32768;
                while (var4 != var6) {
                    if (var4 < var6) {
                        var4++;
                    } else if (var4 > var6) {
                        var4--;
                    }
                    if ((this.levelTileFlags[this.currentLevel][var3][var4] & 4) != 0) {
                        var2 = this.currentLevel;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var5) {
                            var3++;
                        } else if (var3 > var5) {
                            var3--;
                        }
                        if ((this.levelTileFlags[this.currentLevel][var3][var4] & 4) != 0) {
                            var2 = this.currentLevel;
                        }
                    }
                }
            }
        }
        if ((this.levelTileFlags[this.currentLevel][localPlayer.x >> 7][localPlayer.z >> 7] & 4) != 0) {
            var2 = this.currentLevel;
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "K", descriptor = "(I)I")
    public final int getTopLevelCutscene(int arg0) {
        while (arg0 >= 0) {
            this.out.p1(21);
        }
        int var2 = this.getHeightmapY(this.currentLevel, this.cameraZ, true, this.cameraX);
        if (var2 - this.cameraY < 800 && (this.levelTileFlags[this.currentLevel][this.cameraX >> 7][this.cameraZ >> 7] & 4) != 0) {
            return this.currentLevel;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public final void removeIgnore(int arg0, long arg1) {
        if (arg0 != 3) {
            this.load();
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.ignoreCount; var4++) {
                if (this.ignoreName37[var4] == arg1) {
                    this.ignoreCount--;
                    this.redrawSidebar = true;
                    for (int var5 = var4; var5 < this.ignoreCount; var5++) {
                        this.ignoreName37[var5] = this.ignoreName37[var5 + 1];
                    }
                    this.out.p1isaac((byte) 6, 74);
                    this.out.p8(5, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BZI)V")
    public final void setMidiVolume(byte arg0, boolean arg1, int arg2) {
        if (arg0 == 0) {
            boolean var4 = false;
        } else {
            this.levelObjStacks = null;
        }
        signlink.midivol = arg2;
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILDUCMKFAY;I)I")
    public final int executeClientscript1(int arg0, Component arg1, int arg2) {
        int var18 = 91 / arg0;
        if (arg1.scripts != null && arg2 < arg1.scripts.length) {
            try {
                int[] var4 = arg1.scripts[arg2];
                int var5 = 0;
                int var6 = 0;
                byte var7 = 0;
                while (true) {
                    int var8 = var4[var6++];
                    int var9 = 0;
                    byte var10 = 0;
                    if (var8 == 0) {
                        return var5;
                    }
                    if (var8 == 1) {
                        var9 = this.skillLevel[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.skillBaseLevel[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.skillExperience[var4[var6++]];
                    }
                    Component var11;
                    int var12;
                    int var13;
                    if (var8 == 4) {
                        var11 = Component.instances[var4[var6++]];
                        var12 = var4[var6++];
                        if (var12 >= 0 && var12 < ObjType.count && (!ObjType.get(var12).members || members)) {
                            for (var13 = 0; var13 < var11.invSlotObjId.length; var13++) {
                                if (var11.invSlotObjId[var13] == var12 + 1) {
                                    var9 += var11.invSlotObjCount[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.varps[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = levelExperience[this.skillBaseLevel[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.varps[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = localPlayer.combatLevel;
                    }
                    int var19;
                    if (var8 == 9) {
                        for (var19 = 0; var19 < Stats.count; var19++) {
                            if (Stats.enabled[var19]) {
                                var9 += this.skillBaseLevel[var19];
                            }
                        }
                    }
                    if (var8 == 10) {
                        var11 = Component.instances[var4[var6++]];
                        var12 = var4[var6++] + 1;
                        if (var12 >= 0 && var12 < ObjType.count && (!ObjType.get(var12).members || members)) {
                            for (var13 = 0; var13 < var11.invSlotObjId.length; var13++) {
                                if (var11.invSlotObjId[var13] == var12) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.energy;
                    }
                    if (var8 == 12) {
                        var9 = this.weightCarried;
                    }
                    if (var8 == 13) {
                        var19 = this.varps[var4[var6++]];
                        var12 = var4[var6++];
                        var9 = (var19 & 1 << var12) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        var19 = var4[var6++];
                        VarbitType var20 = VarbitType.instances[var19];
                        var13 = var20.basevar;
                        int var14 = var20.startbit;
                        int var15 = var20.endbit;
                        int var16 = BITMASK[var15 - var14];
                        var9 = this.varps[var13] >> var14 & var16;
                    }
                    if (var8 == 15) {
                        var10 = 1;
                    }
                    if (var8 == 16) {
                        var10 = 2;
                    }
                    if (var8 == 17) {
                        var10 = 3;
                    }
                    if (var8 == 18) {
                        var9 = (localPlayer.x >> 7) + this.sceneBaseTileX;
                    }
                    if (var8 == 19) {
                        var9 = (localPlayer.z >> 7) + this.sceneBaseTileZ;
                    }
                    if (var8 == 20) {
                        var9 = var4[var6++];
                    }
                    if (var10 == 0) {
                        if (var7 == 0) {
                            var5 += var9;
                        }
                        if (var7 == 1) {
                            var5 -= var9;
                        }
                        if (var7 == 2 && var9 != 0) {
                            var5 /= var9;
                        }
                        if (var7 == 3) {
                            var5 *= var9;
                        }
                        var7 = 0;
                    } else {
                        var7 = var10;
                    }
                }
            } catch (Exception var17) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
    public final void drawTooltip(int arg0) {
        if (this.menuSize >= 2 || this.objSelected != 0 || this.spellSelected != 0) {
            String var2;
            if (this.objSelected == 1 && this.menuSize < 2) {
                var2 = "Use " + this.objSelectedName + " with...";
            } else if (this.spellSelected == 1 && this.menuSize < 2) {
                var2 = this.spellCaption + "...";
            } else {
                var2 = this.menuOption[this.menuSize - 1];
            }
            if (this.menuSize > 2) {
                var2 = var2 + "@whi@ / " + (this.menuSize - 2) + " more options";
            }
            this.fontBold12.drawStringTooltip(true, 4, 16777215, var2, loopCycle / 1000, 973, 15);
            if (arg0 != 45706) {
                for (int var3 = 1; var3 > 0; var3++) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
    public final void drawMinimap(boolean arg0) {
        if (!arg0) {
            this.areaMapback.bind(0);
            int var4;
            int var5;
            if (this.minimapState == 2) {
                byte[] var15 = this.imageMapback.pixels;
                int[] var16 = Draw2D.data;
                var4 = var15.length;
                for (var5 = 0; var5 < var4; var5++) {
                    if (var15[var5] == 0) {
                        var16[var5] = 0;
                    }
                }
                this.imageCompass.drawRotatedMasked(33, this.orbitCameraYaw, this.compassMaskLineLengths, 256, this.compassMaskLineOffsets, -236, 25, 0, 0, 33, 25);
                this.areaViewport.bind(0);
            } else {
                int var2 = this.orbitCameraYaw + this.minimapAnticheatAngle & 2047;
                int var3 = 48 + localPlayer.x / 32;
                var4 = 464 - localPlayer.z / 32;
                this.imageMinimap.drawRotatedMasked(151, var2, this.minimapMaskLineLengths, 256 + this.minimapZoom, this.minimapMaskLineOffsets, -236, var4, 5, 25, 146, var3);
                this.imageCompass.drawRotatedMasked(33, this.orbitCameraYaw, this.compassMaskLineLengths, 256, this.compassMaskLineOffsets, -236, 25, 0, 0, 33, 25);
                for (var5 = 0; var5 < this.activeMapFunctionCount; var5++) {
                    var3 = this.activeMapFunctionX[var5] * 4 + 2 - localPlayer.x / 32;
                    var4 = this.activeMapFunctionZ[var5] * 4 + 2 - localPlayer.z / 32;
                    this.drawOnMinimap(this.activeMapFunctions[var5], var3, var4, false);
                }
                int var7;
                for (int var6 = 0; var6 < 104; var6++) {
                    for (var7 = 0; var7 < 104; var7++) {
                        LinkList var8 = this.levelObjStacks[this.currentLevel][var6][var7];
                        if (var8 != null) {
                            var3 = var6 * 4 + 2 - localPlayer.x / 32;
                            var4 = var7 * 4 + 2 - localPlayer.z / 32;
                            this.drawOnMinimap(this.imageMapdot0, var3, var4, false);
                        }
                    }
                }
                for (var7 = 0; var7 < this.npcCount; var7++) {
                    NpcEntity var17 = this.npcs[this.npcIds[var7]];
                    if (var17 != null && var17.isVisible(_flowObfuscator41)) {
                        NpcType var9 = var17.type;
                        if (var9.multinpc != null) {
                            var9 = var9.getMultiNpc(this._flowObfuscator10);
                        }
                        if (var9 != null && var9.minimap && var9.active) {
                            var3 = var17.x / 32 - localPlayer.x / 32;
                            var4 = var17.z / 32 - localPlayer.z / 32;
                            this.drawOnMinimap(this.imageMapdot1, var3, var4, false);
                        }
                    }
                }
                PlayerEntity var19;
                for (int var18 = 0; var18 < this.playerCount; var18++) {
                    var19 = this.players[this.playerIds[var18]];
                    if (var19 != null && var19.isVisible(_flowObfuscator41)) {
                        var3 = var19.x / 32 - localPlayer.x / 32;
                        var4 = var19.z / 32 - localPlayer.z / 32;
                        boolean var10 = false;
                        long var11 = JString.toBase37(var19.name);
                        for (int var13 = 0; var13 < this.friendCount; var13++) {
                            if (var11 == this.friendName37[var13] && this.friendWorld[var13] != 0) {
                                var10 = true;
                                break;
                            }
                        }
                        boolean var14 = false;
                        if (localPlayer.team != 0 && var19.team != 0 && localPlayer.team == var19.team) {
                            var14 = true;
                        }
                        if (var10) {
                            this.drawOnMinimap(this.imageMapdot3, var3, var4, false);
                        } else if (var14) {
                            this.drawOnMinimap(this.imageMapdot4, var3, var4, false);
                        } else {
                            this.drawOnMinimap(this.imageMapdot2, var3, var4, false);
                        }
                    }
                }
                if (this.hintType != 0 && loopCycle % 20 < 10) {
                    if (this.hintType == 1 && this.hintNpc >= 0 && this.hintNpc < this.npcs.length) {
                        NpcEntity var20 = this.npcs[this.hintNpc];
                        if (var20 != null) {
                            var3 = var20.x / 32 - localPlayer.x / 32;
                            var4 = var20.z / 32 - localPlayer.z / 32;
                            this.drawMinimapHint(this.imageMapmarker1, -760, var4, var3);
                        }
                    }
                    if (this.hintType == 2) {
                        var3 = (this.hintTileX - this.sceneBaseTileX) * 4 + 2 - localPlayer.x / 32;
                        var4 = (this.hintTileZ - this.sceneBaseTileZ) * 4 + 2 - localPlayer.z / 32;
                        this.drawMinimapHint(this.imageMapmarker1, -760, var4, var3);
                    }
                    if (this.hintType == 10 && this.hintPlayer >= 0 && this.hintPlayer < this.players.length) {
                        var19 = this.players[this.hintPlayer];
                        if (var19 != null) {
                            var3 = var19.x / 32 - localPlayer.x / 32;
                            var4 = var19.z / 32 - localPlayer.z / 32;
                            this.drawMinimapHint(this.imageMapmarker1, -760, var4, var3);
                        }
                    }
                }
                if (this.flagSceneTileX != 0) {
                    var3 = this.flagSceneTileX * 4 + 2 - localPlayer.x / 32;
                    var4 = this.flagSceneTileZ * 4 + 2 - localPlayer.z / 32;
                    this.drawOnMinimap(this.imageMapmarker0, var3, var4, false);
                }
                Draw2D.fillRect(3, 78, 97, 16777215, 3, 0);
                this.areaViewport.bind(0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLGQOSZKJC;I)V")
    public final void projectFromGround(boolean arg0, PathingEntity arg1, int arg2) {
        if (!arg0) {
            this.packetType = this.in.g1();
        }
        this.projectFromGround(arg1.x, arg2, this._flowObfuscator9, arg1.z);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
    public final void projectFromGround(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 128 && arg3 >= 128 && arg0 <= 13056 && arg3 <= 13056) {
            int var5 = this.getHeightmapY(this.currentLevel, arg3, true, arg0) - arg1;
            int var11 = arg0 - this.cameraX;
            int var15 = var5 - this.cameraY;
            int var13 = arg3 - this.cameraZ;
            int var6 = Model.sin[this.cameraPitch];
            int var7 = Model.cos[this.cameraPitch];
            int var8 = Model.sin[this.cameraYaw];
            int var9 = Model.cos[this.cameraYaw];
            int var10 = var13 * var8 + var11 * var9 >> 16;
            int var14 = var13 * var9 - var11 * var8 >> 16;
            int var12 = var10;
            if (arg2 >= 0) {
                this.out.p1(27);
            }
            var10 = var15 * var7 - var14 * var6 >> 16;
            var13 = var15 * var6 + var14 * var7 >> 16;
            if (var13 >= 50) {
                this.projectX = Draw3D.centerX + (var12 << 9) / var13;
                this.projectY = Draw3D.centerY + (var10 << 9) / var13;
            } else {
                this.projectX = -1;
                this.projectY = -1;
            }
        } else {
            this.projectX = -1;
            this.projectY = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
    public final void handlePrivateChatInput(boolean arg0) {
        if (this.splitPrivateChat != 0) {
            int var2 = 0;
            if (arg0) {
                this.packetType = -1;
            }
            if (this.systemUpdateTimer != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; var3++) {
                if (this.messageText[var3] != null) {
                    int var4 = this.messageType[var3];
                    String var5 = this.messageSender[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        var6 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        var6 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.privateChatSetting == 0 || this.privateChatSetting == 1 && this.isFriend(false, var5))) {
                        int var7 = 329 - var2 * 13;
                        if (super.mouseX > 4 && super.mouseY - 4 > var7 - 10 && super.mouseY - 4 <= var7 + 3) {
                            int var8 = this.fontPlain12.stringWidthTag(this._flowObfuscator32, "From:  " + var5 + this.messageText[var3]) + 25;
                            if (var8 > 450) {
                                var8 = 450;
                            }
                            if (super.mouseX < 4 + var8) {
                                if (this.rights >= 1) {
                                    this.menuOption[this.menuSize] = "Report abuse @whi@" + var5;
                                    this.menuAction[this.menuSize] = 2606;
                                    this.menuSize++;
                                }
                                this.menuOption[this.menuSize] = "Add ignore @whi@" + var5;
                                this.menuAction[this.menuSize] = 2042;
                                this.menuSize++;
                                this.menuOption[this.menuSize] = "Add friend @whi@" + var5;
                                this.menuAction[this.menuSize] = 2337;
                                this.menuSize++;
                            }
                        }
                        var2++;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.privateChatSetting < 2) {
                        var2++;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void appendLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        for (LocSpawned var12 = (LocSpawned) this.temporaryLocs.head(); var12 != null; var12 = (LocSpawned) this.temporaryLocs.next(false)) {
            if (var12.level == arg7 && var12.localX == arg8 && var12.localZ == arg5 && var12.layer == arg4) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.level = arg7;
            var11.layer = arg4;
            var11.localX = arg8;
            var11.localZ = arg5;
            this.storeLoc(false, var11);
            this.temporaryLocs.addTail(var11);
        }
        var11.type = arg2;
        var11.shape = arg6;
        var11.rotation = arg3;
        var11.delay = arg9;
        var11.duration = arg1;
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LDUCMKFAY;Z)Z")
    public final boolean executeInterfaceScript(Component arg0, boolean arg1) {
        if (arg1) {
            this._flowObfuscator12 = -211;
        }
        if (arg0.scriptComparator == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.scriptComparator.length; var3++) {
                int var4 = this.executeClientscript1(341, arg0, var3);
                int var5 = arg0.scriptOperand[var3];
                if (arg0.scriptComparator[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.scriptComparator[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.scriptComparator[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream openUrl(String arg0) throws IOException {
        if (!this.jaggrabEnabled) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.jaggrabSocket != null) {
                try {
                    this.jaggrabSocket.close();
                } catch (Exception var4) {
                }
                this.jaggrabSocket = null;
            }
            this.jaggrabSocket = this.openSocket(43595);
            this.jaggrabSocket.setSoTimeout(10000);
            InputStream var2 = this.jaggrabSocket.getInputStream();
            OutputStream var3 = this.jaggrabSocket.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
    public final void drawFlames(byte arg0) {
        short var2 = 256;
        int var3;
        if (this.flameGradientCycle0 > 0) {
            for (var3 = 0; var3 < 256; var3++) {
                if (this.flameGradientCycle0 > 768) {
                    this.flameGradient[var3] = this.mix(true, this.flameGradient0[var3], this.flameGradient1[var3], 1024 - this.flameGradientCycle0);
                } else if (this.flameGradientCycle0 > 256) {
                    this.flameGradient[var3] = this.flameGradient1[var3];
                } else {
                    this.flameGradient[var3] = this.mix(true, this.flameGradient1[var3], this.flameGradient0[var3], 256 - this.flameGradientCycle0);
                }
            }
        } else if (this.flameGradientCycle1 > 0) {
            for (var3 = 0; var3 < 256; var3++) {
                if (this.flameGradientCycle1 > 768) {
                    this.flameGradient[var3] = this.mix(true, this.flameGradient0[var3], this.flameGradient2[var3], 1024 - this.flameGradientCycle1);
                } else if (this.flameGradientCycle1 > 256) {
                    this.flameGradient[var3] = this.flameGradient2[var3];
                } else {
                    this.flameGradient[var3] = this.mix(true, this.flameGradient2[var3], this.flameGradient0[var3], 256 - this.flameGradientCycle1);
                }
            }
        } else {
            for (var3 = 0; var3 < 256; var3++) {
                this.flameGradient[var3] = this.flameGradient0[var3];
            }
        }
        for (var3 = 0; var3 < 33920; var3++) {
            this.imageTitle0.data[var3] = this.imageFlamesLeft.pixels[var3];
        }
        int var4 = 0;
        int var5 = 1152;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        for (int var6 = 1; var6 < var2 - 1; var6++) {
            var7 = this.flameLineOffset[var6] * (var2 - var6) / var2;
            var8 = 22 + var7;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (var9 = var8; var9 < 128; var9++) {
                var10 = this.flameBuffer3[var4++];
                if (var10 != 0) {
                    var11 = var10;
                    var12 = 256 - var10;
                    var10 = this.flameGradient[var10];
                    var13 = this.imageTitle0.data[var5];
                    this.imageTitle0.data[var5++] = ((var10 & 16711935) * var11 + (var13 & 16711935) * var12 & -16711936) + ((var10 & 65280) * var11 + (var13 & 65280) * var12 & 16711680) >> 8;
                } else {
                    var5++;
                }
            }
            var5 += var8;
        }
        this.imageTitle0.draw(0, 23680, super.graphics, 0);
        for (var7 = 0; var7 < 33920; var7++) {
            this.imageTitle1.data[var7] = this.imageFlamesRight.pixels[var7];
        }
        var4 = 0;
        var5 = 1176;
        for (var8 = 1; var8 < var2 - 1; var8++) {
            var9 = this.flameLineOffset[var8] * (var2 - var8) / var2;
            var10 = 103 - var9;
            var5 += var9;
            for (var11 = 0; var11 < var10; var11++) {
                var12 = this.flameBuffer3[var4++];
                if (var12 != 0) {
                    var13 = var12;
                    int var14 = 256 - var12;
                    var12 = this.flameGradient[var12];
                    int var15 = this.imageTitle1.data[var5];
                    this.imageTitle1.data[var5++] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & 65280) * var13 + (var15 & 65280) * var14 & 16711680) >> 8;
                } else {
                    var5++;
                }
            }
            var4 += 128 - var10;
            var5 += 128 - var10 - var9;
        }
        this.imageTitle1.draw(0, 23680, super.graphics, 637);
        if (arg0 != 9) {
            this.packetType = this.in.g1();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILMBMGIXGO;)V")
    private final void readPlayers(byte arg0, int arg1, Packet arg2) {
        int var4 = arg2.gBit(8, 0);
        int var5;
        if (var4 < this.playerCount) {
            for (var5 = var4; var5 < this.playerCount; var5++) {
                this.entityRemovalIds[this.entityRemovalCount++] = this.playerIds[var5];
            }
        }
        if (var4 > this.playerCount) {
            signlink.reporterror(this.username + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.playerCount = 0;
            for (var5 = 0; var5 < var4; var5++) {
                int var6 = this.playerIds[var5];
                PlayerEntity var7 = this.players[var6];
                int var8 = arg2.gBit(1, 0);
                if (var8 == 0) {
                    this.playerIds[this.playerCount++] = var6;
                    var7.cycle = loopCycle;
                } else {
                    int var9 = arg2.gBit(2, 0);
                    if (var9 == 0) {
                        this.playerIds[this.playerCount++] = var6;
                        var7.cycle = loopCycle;
                        this.entityUpdateIds[this.entityUpdateCount++] = var6;
                    } else {
                        int var10;
                        int var11;
                        if (var9 == 1) {
                            this.playerIds[this.playerCount++] = var6;
                            var7.cycle = loopCycle;
                            var10 = arg2.gBit(3, 0);
                            var7.step(false, (byte) 20, var10);
                            var11 = arg2.gBit(1, 0);
                            if (var11 == 1) {
                                this.entityUpdateIds[this.entityUpdateCount++] = var6;
                            }
                        } else if (var9 == 2) {
                            this.playerIds[this.playerCount++] = var6;
                            var7.cycle = loopCycle;
                            var10 = arg2.gBit(3, 0);
                            var7.step(true, (byte) 20, var10);
                            var11 = arg2.gBit(3, 0);
                            var7.step(true, (byte) 20, var11);
                            int var12 = arg2.gBit(1, 0);
                            if (var12 == 1) {
                                this.entityUpdateIds[this.entityUpdateCount++] = var6;
                            }
                        } else if (var9 == 3) {
                            this.entityRemovalIds[this.entityRemovalCount++] = var6;
                        }
                    }
                }
            }
            if (arg0 != 2) {
                this._flowObfuscator18 = -80;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
    public final void drawTitleScreen(boolean arg0, boolean arg1) {
        this.loadTitle(0);
        this.imageTitle4.bind(0);
        this.imageTitlebox.draw(0, 16083, 0);
        short var3 = 360;
        short var4 = 200;
        if (!arg1) {
            int var5;
            int var6;
            int var7;
            if (this.titleScreenState == 0) {
                var5 = var4 / 2 + 80;
                this.fontPlain11.drawStringCenterTag(7711145, var3 / 2, this._flowObfuscator18, this.ondemand.message, var5, true);
                int var8 = var4 / 2 - 20;
                this.fontBold12.drawStringCenterTag(16776960, var3 / 2, this._flowObfuscator18, "Welcome to RuneScape", var8, true);
                int var9 = var8 + 30;
                var6 = var3 / 2 - 80;
                var7 = var4 / 2 + 20;
                this.imageTitlebutton.draw(var6 - 73, 16083, var7 - 20);
                this.fontBold12.drawStringCenterTag(16777215, var6, this._flowObfuscator18, "New User", var7 + 5, true);
                int var10 = var3 / 2 + 80;
                this.imageTitlebutton.draw(var10 - 73, 16083, var7 - 20);
                this.fontBold12.drawStringCenterTag(16777215, var10, this._flowObfuscator18, "Existing User", var7 + 5, true);
            }
            if (this.titleScreenState == 2) {
                var5 = var4 / 2 - 40;
                if (this.loginMessage0.length() > 0) {
                    this.fontBold12.drawStringCenterTag(16776960, var3 / 2, this._flowObfuscator18, this.loginMessage0, var5 - 15, true);
                    this.fontBold12.drawStringCenterTag(16776960, var3 / 2, this._flowObfuscator18, this.loginMessage1, var5, true);
                    var5 += 30;
                } else {
                    this.fontBold12.drawStringCenterTag(16776960, var3 / 2, this._flowObfuscator18, this.loginMessage1, var5 - 7, true);
                    var5 += 30;
                }
                this.fontBold12.drawStringTag(false, true, var3 / 2 - 90, 16777215, "Username: " + this.username + (this.titleLoginField == 0 & loopCycle % 40 < 20 ? "@yel@|" : ""), var5);
                var5 += 15;
                this.fontBold12.drawStringTag(false, true, var3 / 2 - 88, 16777215, "Password: " + JString.censor(this.password, 0) + (this.titleLoginField == 1 & loopCycle % 40 < 20 ? "@yel@|" : ""), var5);
                var5 += 15;
                if (!arg0) {
                    var6 = var3 / 2 - 80;
                    var7 = var4 / 2 + 50;
                    this.imageTitlebutton.draw(var6 - 73, 16083, var7 - 20);
                    this.fontBold12.drawStringCenterTag(16777215, var6, this._flowObfuscator18, "Login", var7 + 5, true);
                    var6 = var3 / 2 + 80;
                    this.imageTitlebutton.draw(var6 - 73, 16083, var7 - 20);
                    this.fontBold12.drawStringCenterTag(16777215, var6, this._flowObfuscator18, "Cancel", var7 + 5, true);
                }
            }
            if (this.titleScreenState == 3) {
                this.fontBold12.drawStringCenterTag(16776960, var3 / 2, this._flowObfuscator18, "Create a free account", var4 / 2 - 60, true);
                var5 = var4 / 2 - 35;
                this.fontBold12.drawStringCenterTag(16777215, var3 / 2, this._flowObfuscator18, "To create a new account you need to", var5, true);
                var5 += 15;
                this.fontBold12.drawStringCenterTag(16777215, var3 / 2, this._flowObfuscator18, "go back to the main RuneScape webpage", var5, true);
                var5 += 15;
                this.fontBold12.drawStringCenterTag(16777215, var3 / 2, this._flowObfuscator18, "and choose the red 'create account'", var5, true);
                var5 += 15;
                this.fontBold12.drawStringCenterTag(16777215, var3 / 2, this._flowObfuscator18, "button at the top right of that page.", var5, true);
                var5 += 15;
                var6 = var3 / 2;
                var7 = var4 / 2 + 50;
                this.imageTitlebutton.draw(var6 - 73, 16083, var7 - 20);
                this.fontBold12.drawStringCenterTag(16777215, var6, this._flowObfuscator18, "Cancel", var7 + 5, true);
            }
            this.imageTitle4.draw(171, 23680, super.graphics, 202);
            if (this.redrawTitleBackground) {
                this.redrawTitleBackground = false;
                this.imageTitle2.draw(0, 23680, super.graphics, 128);
                this.imageTitle3.draw(371, 23680, super.graphics, 202);
                this.imageTitle5.draw(265, 23680, super.graphics, 0);
                this.imageTitle6.draw(265, 23680, super.graphics, 562);
                this.imageTitle7.draw(171, 23680, super.graphics, 128);
                this.imageTitle8.draw(171, 23680, super.graphics, 562);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
    public final void runFlames(byte arg0) {
        this.flameThread = true;
        if (arg0 != 59) {
            this._flowObfuscator27 = -186;
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.flameActive) {
                this.frameCycle++;
                this.updateFlames(25106);
                this.updateFlames(25106);
                this.drawFlames((byte) 9);
                var4++;
                if (var4 > 10) {
                    long var6 = System.currentTimeMillis();
                    int var8 = (int) (var6 - var2) / 10 - var5;
                    var5 = 40 - var8;
                    if (var5 < 5) {
                        var5 = 5;
                    }
                    var4 = 0;
                    var2 = var6;
                }
                try {
                    Thread.sleep((long) var5);
                } catch (Exception var9) {
                }
            }
        } catch (Exception var10) {
        }
        this.flameThread = false;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void refresh(byte arg0) {
        this.redrawTitleBackground = true;
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this._flowObfuscator40 = this.randomIn.nextInt();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILMBMGIXGO;I)V")
    public final void readZonePacket(int arg0, Packet arg1, int arg2) {
        while (arg0 >= 0) {
            arg2 = -1;
        }
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        if (arg2 == 84) {
            var4 = arg1.g1();
            var5 = this.baseX + (var4 >> 4 & 7);
            var6 = this.baseZ + (var4 & 7);
            var7 = arg1.g2();
            var8 = arg1.g2();
            var9 = arg1.g2();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                LinkList var36 = this.levelObjStacks[this.currentLevel][var5][var6];
                if (var36 != null) {
                    for (ObjStackEntity var33 = (ObjStackEntity) var36.head(); var33 != null; var33 = (ObjStackEntity) var36.next(false)) {
                        if (var33.type == (var7 & 32767) && var33.count == var8) {
                            var33.count = var9;
                            break;
                        }
                    }
                    this.sortObjStacks(var5, var6);
                }
            }
        } else {
            int var10;
            if (arg2 == 105) {
                var4 = arg1.g1();
                var5 = this.baseX + (var4 >> 4 & 7);
                var6 = this.baseZ + (var4 & 7);
                var7 = arg1.g2();
                var8 = arg1.g1();
                var9 = var8 >> 4 & 15;
                var10 = var8 & 7;
                if (localPlayer.pathTileX[0] >= var5 - var9 && localPlayer.pathTileX[0] <= var5 + var9 && localPlayer.pathTileZ[0] >= var6 - var9 && localPlayer.pathTileZ[0] <= var6 + var9 && this.waveEnabled && !lowMemory && this.waveCount < 50) {
                    this.waveIds[this.waveCount] = var7;
                    this.waveLoops[this.waveCount] = var10;
                    this.waveDelay[this.waveCount] = Wave.delays[var7];
                    this.waveCount++;
                }
            }
            if (arg2 == 215) {
                var4 = arg1.g2_alt2(true);
                var5 = arg1.g1_alt3(2);
                var6 = this.baseX + (var5 >> 4 & 7);
                var7 = this.baseZ + (var5 & 7);
                var8 = arg1.g2_alt2(true);
                var9 = arg1.g2();
                if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var8 != this.localPid) {
                    ObjStackEntity var35 = new ObjStackEntity();
                    var35.type = var4;
                    var35.count = var9;
                    if (this.levelObjStacks[this.currentLevel][var6][var7] == null) {
                        this.levelObjStacks[this.currentLevel][var6][var7] = new LinkList(169);
                    }
                    this.levelObjStacks[this.currentLevel][var6][var7].addTail(var35);
                    this.sortObjStacks(var6, var7);
                }
            } else {
                ObjStackEntity var31;
                if (arg2 == 156) {
                    var4 = arg1.g1_alt1(0);
                    var5 = this.baseX + (var4 >> 4 & 7);
                    var6 = this.baseZ + (var4 & 7);
                    var7 = arg1.g2();
                    if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                        LinkList var34 = this.levelObjStacks[this.currentLevel][var5][var6];
                        if (var34 != null) {
                            for (var31 = (ObjStackEntity) var34.head(); var31 != null; var31 = (ObjStackEntity) var34.next(false)) {
                                if (var31.type == (var7 & 32767)) {
                                    var31.unlink();
                                    break;
                                }
                            }
                            if (var34.head() == null) {
                                this.levelObjStacks[this.currentLevel][var5][var6] = null;
                            }
                            this.sortObjStacks(var5, var6);
                        }
                    }
                } else {
                    int var11;
                    int var12;
                    int var13;
                    int var14;
                    int var15;
                    int var17;
                    if (arg2 == 160) {
                        var4 = arg1.g1_alt3(2);
                        var5 = this.baseX + (var4 >> 4 & 7);
                        var6 = this.baseZ + (var4 & 7);
                        var7 = arg1.g1_alt3(2);
                        var8 = var7 >> 2;
                        var9 = var7 & 3;
                        var10 = this.LOC_LAYER[var8];
                        var11 = arg1.g2_alt2(true);
                        if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                            var12 = this.levelHeightmap[this.currentLevel][var5][var6];
                            var13 = this.levelHeightmap[this.currentLevel][var5 + 1][var6];
                            var14 = this.levelHeightmap[this.currentLevel][var5 + 1][var6 + 1];
                            var15 = this.levelHeightmap[this.currentLevel][var5][var6 + 1];
                            if (var10 == 0) {
                                Wall var38 = this.scene.getWall(this.currentLevel, var5, var6, false);
                                if (var38 != null) {
                                    var17 = var38.bitset >> 14 & 32767;
                                    if (var8 == 2) {
                                        var38.modelA = new LocEntity(var17, 4 + var9, 2, var13, (byte) 7, var14, var12, var15, var11, false);
                                        var38.modelB = new LocEntity(var17, var9 + 1 & 3, 2, var13, (byte) 7, var14, var12, var15, var11, false);
                                    } else {
                                        var38.modelA = new LocEntity(var17, var9, var8, var13, (byte) 7, var14, var12, var15, var11, false);
                                    }
                                }
                            }
                            if (var10 == 1) {
                                WallDecoration var40 = this.scene.getWallDecoration(var5, 866, var6, this.currentLevel);
                                if (var40 != null) {
                                    var40.model = new LocEntity(var40.bitset >> 14 & 32767, 0, 4, var13, (byte) 7, var14, var12, var15, var11, false);
                                }
                            }
                            if (var10 == 2) {
                                Loc var41 = this.scene.getLoc(var5, var6, (byte) 4, this.currentLevel);
                                if (var8 == 11) {
                                    var8 = 10;
                                }
                                if (var41 != null) {
                                    var41.model = new LocEntity(var41.bitset >> 14 & 32767, var9, var8, var13, (byte) 7, var14, var12, var15, var11, false);
                                }
                            }
                            if (var10 == 3) {
                                GroundDecoration var42 = this.scene.getGroundDecoration(var6, var5, this.currentLevel, 0);
                                if (var42 != null) {
                                    var42.model = new LocEntity(var42.bitset >> 14 & 32767, var9, 22, var13, (byte) 7, var14, var12, var15, var11, false);
                                }
                            }
                        }
                    } else {
                        if (arg2 == 147) {
                            var4 = arg1.g1_alt3(2);
                            var5 = this.baseX + (var4 >> 4 & 7);
                            var6 = this.baseZ + (var4 & 7);
                            var7 = arg1.g2();
                            byte var29 = arg1.g1b_alt3(0);
                            var9 = arg1.g2_alt1((byte) 108);
                            byte var30 = arg1.g1b_alt2((byte) -57);
                            var11 = arg1.g2();
                            var12 = arg1.g1_alt3(2);
                            var13 = var12 >> 2;
                            var14 = var12 & 3;
                            var15 = this.LOC_LAYER[var13];
                            byte var16 = arg1.g1b();
                            var17 = arg1.g2();
                            byte var18 = arg1.g1b_alt2((byte) -57);
                            PlayerEntity var19;
                            if (var7 == this.localPid) {
                                var19 = localPlayer;
                            } else {
                                var19 = this.players[var7];
                            }
                            if (var19 != null) {
                                LocType var20 = LocType.get(var17);
                                int var21 = this.levelHeightmap[this.currentLevel][var5][var6];
                                int var22 = this.levelHeightmap[this.currentLevel][var5 + 1][var6];
                                int var23 = this.levelHeightmap[this.currentLevel][var5 + 1][var6 + 1];
                                int var24 = this.levelHeightmap[this.currentLevel][var5][var6 + 1];
                                Model var25 = var20.getModel(var13, var14, var21, var22, var23, var24, -1);
                                if (var25 != null) {
                                    this.appendLoc(404, var11 + 1, -1, 0, var15, var6, 0, this.currentLevel, var5, var9 + 1);
                                    var19.locStartCycle = var9 + loopCycle;
                                    var19.locStopCycle = var11 + loopCycle;
                                    var19.locModel = var25;
                                    int var26 = var20.width;
                                    int var27 = var20.length;
                                    if (var14 == 1 || var14 == 3) {
                                        var26 = var20.length;
                                        var27 = var20.width;
                                    }
                                    var19.locOffsetX = var5 * 128 + var26 * 64;
                                    var19.locOffsetZ = var6 * 128 + var27 * 64;
                                    var19.locOffsetY = this.getHeightmapY(this.currentLevel, var19.locOffsetZ, true, var19.locOffsetX);
                                    byte var28;
                                    if (var16 > var29) {
                                        var28 = var16;
                                        var16 = var29;
                                        var29 = var28;
                                    }
                                    if (var18 > var30) {
                                        var28 = var18;
                                        var18 = var30;
                                        var30 = var28;
                                    }
                                    var19.minTileX = var5 + var16;
                                    var19.maxTileX = var5 + var29;
                                    var19.minTileZ = var6 + var18;
                                    var19.maxTileZ = var6 + var30;
                                }
                            }
                        }
                        if (arg2 == 151) {
                            var4 = arg1.g1_alt1(0);
                            var5 = this.baseX + (var4 >> 4 & 7);
                            var6 = this.baseZ + (var4 & 7);
                            var7 = arg1.g2_alt1((byte) 108);
                            var8 = arg1.g1_alt3(2);
                            var9 = var8 >> 2;
                            var10 = var8 & 3;
                            var11 = this.LOC_LAYER[var9];
                            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                                this.appendLoc(404, -1, var7, var10, var11, var6, var9, this.currentLevel, var5, 0);
                            }
                        } else if (arg2 == 4) {
                            var4 = arg1.g1();
                            var5 = this.baseX + (var4 >> 4 & 7);
                            var6 = this.baseZ + (var4 & 7);
                            var7 = arg1.g2();
                            var8 = arg1.g1();
                            var9 = arg1.g2();
                            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                                var5 = var5 * 128 + 64;
                                var6 = var6 * 128 + 64;
                                SpotAnimEntity var32 = new SpotAnimEntity(this.currentLevel, loopCycle, 6, var9, var7, this.getHeightmapY(this.currentLevel, var6, true, var5) - var8, var6, var5);
                                this.spotanims.addTail(var32);
                            }
                        } else if (arg2 == 44) {
                            var4 = arg1.g2_alt3((byte) -74);
                            var5 = arg1.g2();
                            var6 = arg1.g1();
                            var7 = this.baseX + (var6 >> 4 & 7);
                            var8 = this.baseZ + (var6 & 7);
                            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                                var31 = new ObjStackEntity();
                                var31.type = var4;
                                var31.count = var5;
                                if (this.levelObjStacks[this.currentLevel][var7][var8] == null) {
                                    this.levelObjStacks[this.currentLevel][var7][var8] = new LinkList(169);
                                }
                                this.levelObjStacks[this.currentLevel][var7][var8].addTail(var31);
                                this.sortObjStacks(var7, var8);
                            }
                        } else if (arg2 == 101) {
                            var4 = arg1.g1_alt2(false);
                            var5 = var4 >> 2;
                            var6 = var4 & 3;
                            var7 = this.LOC_LAYER[var5];
                            var8 = arg1.g1();
                            var9 = this.baseX + (var8 >> 4 & 7);
                            var10 = this.baseZ + (var8 & 7);
                            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                                this.appendLoc(404, -1, -1, var6, var7, var10, var5, this.currentLevel, var9, 0);
                            }
                        } else if (arg2 == 117) {
                            var4 = arg1.g1();
                            var5 = this.baseX + (var4 >> 4 & 7);
                            var6 = this.baseZ + (var4 & 7);
                            var7 = var5 + arg1.g1b();
                            var8 = var6 + arg1.g1b();
                            var9 = arg1.g2b();
                            var10 = arg1.g2();
                            var11 = arg1.g1() * 4;
                            var12 = arg1.g1() * 4;
                            var13 = arg1.g2();
                            var14 = arg1.g2();
                            var15 = arg1.g1();
                            int var37 = arg1.g1();
                            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var10 != 65535) {
                                var5 = var5 * 128 + 64;
                                var6 = var6 * 128 + 64;
                                var7 = var7 * 128 + 64;
                                var8 = var8 * 128 + 64;
                                ProjectileEntity var39 = new ProjectileEntity(var15, var12, 46883, var13 + loopCycle, var14 + loopCycle, var37, this.currentLevel, this.getHeightmapY(this.currentLevel, var6, true, var5) - var11, var6, var5, var9, var10);
                                var39.updateVelocity(var13 + loopCycle, var8, this.getHeightmapY(this.currentLevel, var8, true, var7) - var12, var7, (byte) -83);
                                this.projectiles.addTail(var39);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
    public static final void setLowMemory(byte arg0) {
        World3D.lowMemory = true;
        if (arg0 != _flowObfuscator5) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        Draw3D.lowMemory = true;
        lowMemory = true;
        World.lowMemory = true;
        LocType.lowMemory = true;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LMBMGIXGO;II)V")
    private final void readNpcs(Packet arg0, int arg1, int arg2) {
        if (arg1 >= 0) {
            this._flowObfuscator33 = -7;
        }
        arg0.accessBits(this._flowObfuscator33);
        int var4 = arg0.gBit(8, 0);
        int var5;
        if (var4 < this.npcCount) {
            for (var5 = var4; var5 < this.npcCount; var5++) {
                this.entityRemovalIds[this.entityRemovalCount++] = this.npcIds[var5];
            }
        }
        if (var4 > this.npcCount) {
            signlink.reporterror(this.username + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.npcCount = 0;
            for (var5 = 0; var5 < var4; var5++) {
                int var6 = this.npcIds[var5];
                NpcEntity var7 = this.npcs[var6];
                int var8 = arg0.gBit(1, 0);
                if (var8 == 0) {
                    this.npcIds[this.npcCount++] = var6;
                    var7.cycle = loopCycle;
                } else {
                    int var9 = arg0.gBit(2, 0);
                    if (var9 == 0) {
                        this.npcIds[this.npcCount++] = var6;
                        var7.cycle = loopCycle;
                        this.entityUpdateIds[this.entityUpdateCount++] = var6;
                    } else {
                        int var10;
                        int var11;
                        if (var9 == 1) {
                            this.npcIds[this.npcCount++] = var6;
                            var7.cycle = loopCycle;
                            var10 = arg0.gBit(3, 0);
                            var7.step(false, (byte) 20, var10);
                            var11 = arg0.gBit(1, 0);
                            if (var11 == 1) {
                                this.entityUpdateIds[this.entityUpdateCount++] = var6;
                            }
                        } else if (var9 == 2) {
                            this.npcIds[this.npcCount++] = var6;
                            var7.cycle = loopCycle;
                            var10 = arg0.gBit(3, 0);
                            var7.step(true, (byte) 20, var10);
                            var11 = arg0.gBit(3, 0);
                            var7.step(true, (byte) 20, var11);
                            int var12 = arg0.gBit(1, 0);
                            if (var12 == 1) {
                                this.entityUpdateIds[this.entityUpdateCount++] = var6;
                            }
                        } else if (var9 == 3) {
                            this.entityRemovalIds[this.entityRemovalCount++] = var6;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
    public final void updateTitle(boolean arg0) {
        if (!arg0) {
            this.levelObjStacks = null;
        }
        int var2;
        int var3;
        if (this.titleScreenState == 0) {
            var2 = super.screenWidth / 2 - 80;
            var3 = super.screenHeight / 2 + 20;
            var3 += 20;
            if (super.mouseClickButton == 1 && super.mouseClickX >= var2 - 75 && super.mouseClickX <= var2 + 75 && super.mouseClickY >= var3 - 20 && super.mouseClickY <= var3 + 20) {
                this.titleScreenState = 3;
                this.titleLoginField = 0;
            }
            var2 = super.screenWidth / 2 + 80;
            if (super.mouseClickButton == 1 && super.mouseClickX >= var2 - 75 && super.mouseClickX <= var2 + 75 && super.mouseClickY >= var3 - 20 && super.mouseClickY <= var3 + 20) {
                this.loginMessage0 = "";
                this.loginMessage1 = "Enter your username & password.";
                this.titleScreenState = 2;
                this.titleLoginField = 0;
            }
        } else if (this.titleScreenState == 2) {
            var2 = super.screenHeight / 2 - 40;
            var2 += 30;
            var2 += 25;
            if (super.mouseClickButton == 1 && super.mouseClickY >= var2 - 15 && super.mouseClickY < var2) {
                this.titleLoginField = 0;
            }
            var2 += 15;
            if (super.mouseClickButton == 1 && super.mouseClickY >= var2 - 15 && super.mouseClickY < var2) {
                this.titleLoginField = 1;
            }
            var2 += 15;
            var3 = super.screenWidth / 2 - 80;
            int var4 = super.screenHeight / 2 + 50;
            int var9 = var4 + 20;
            if (super.mouseClickButton == 1 && super.mouseClickX >= var3 - 75 && super.mouseClickX <= var3 + 75 && super.mouseClickY >= var9 - 20 && super.mouseClickY <= var9 + 20) {
                this.loginAttempts = 0;
                this.login(this.username, this.password, false);
                if (this.ingame) {
                    return;
                }
            }
            var3 = super.screenWidth / 2 + 80;
            if (super.mouseClickButton == 1 && super.mouseClickX >= var3 - 75 && super.mouseClickX <= var3 + 75 && super.mouseClickY >= var9 - 20 && super.mouseClickY <= var9 + 20) {
                this.titleScreenState = 0;
                this.username = "";
                this.password = "";
            }
            while (true) {
                while (true) {
                    int var5 = this.pollKey(-796);
                    if (var5 == -1) {
                        return;
                    }
                    boolean var6 = false;
                    for (int var7 = 0; var7 < CHARSET.length(); var7++) {
                        if (var5 == CHARSET.charAt(var7)) {
                            var6 = true;
                            break;
                        }
                    }
                    if (this.titleLoginField == 0) {
                        if (var5 == 8 && this.username.length() > 0) {
                            this.username = this.username.substring(0, this.username.length() - 1);
                        }
                        if (var5 == 9 || var5 == 10 || var5 == 13) {
                            this.titleLoginField = 1;
                        }
                        if (var6) {
                            this.username = this.username + (char) var5;
                        }
                        if (this.username.length() > 12) {
                            this.username = this.username.substring(0, 12);
                        }
                    } else if (this.titleLoginField == 1) {
                        if (var5 == 8 && this.password.length() > 0) {
                            this.password = this.password.substring(0, this.password.length() - 1);
                        }
                        if (var5 == 9 || var5 == 10 || var5 == 13) {
                            this.titleLoginField = 0;
                        }
                        if (var6) {
                            this.password = this.password + (char) var5;
                        }
                        if (this.password.length() > 20) {
                            this.password = this.password.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.titleScreenState == 3) {
                var2 = super.screenWidth / 2;
                var3 = super.screenHeight / 2 + 50;
                int var8 = var3 + 20;
                if (super.mouseClickButton == 1 && super.mouseClickX >= var2 - 75 && super.mouseClickX <= var2 + 75 && super.mouseClickY >= var8 - 20 && super.mouseClickY <= var8 + 20) {
                    this.titleScreenState = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LCXGZMTJK;IIZ)V")
    public final void drawOnMinimap(Pix24 arg0, int arg1, int arg2, boolean arg3) {
        int var5 = this.orbitCameraYaw + this.minimapAnticheatAngle & 2047;
        int var6 = arg1 * arg1 + arg2 * arg2;
        if (!arg3) {
            if (var6 <= 6400) {
                int var7 = Model.sin[var5];
                int var8 = Model.cos[var5];
                int var11 = var7 * 256 / (this.minimapZoom + 256);
                int var12 = var8 * 256 / (this.minimapZoom + 256);
                int var9 = arg2 * var11 + arg1 * var12 >> 16;
                int var10 = arg2 * var12 - arg1 * var11 >> 16;
                if (var6 > 2500) {
                    arg0.drawMasked(this.imageMapback, false, 83 - var10 - arg0.height / 2 - 4, 94 + var9 - arg0.width / 2 + 4);
                } else {
                    arg0.draw(94 + var9 - arg0.width / 2 + 4, 16083, 83 - var10 - arg0.height / 2 - 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
    private final void addLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 < 4 || arg7 > 4) {
            this.packetType = this.in.g1();
        }
        if (arg4 >= 1 && arg0 >= 1 && arg4 <= 102 && arg0 <= 102) {
            if (lowMemory && arg1 != this.currentLevel) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg5 == 0) {
                var9 = this.scene.getWallBitset(arg1, arg4, arg0);
            }
            if (arg5 == 1) {
                var9 = this.scene.getWallDecorationBitset(arg1, arg4, 0, arg0);
            }
            if (arg5 == 2) {
                var9 = this.scene.getLocBitset(arg1, arg4, arg0);
            }
            if (arg5 == 3) {
                var9 = this.scene.getGroundDecorationBitset(arg1, arg4, arg0);
            }
            int var13;
            if (var9 != 0) {
                var13 = this.scene.getInfo(arg1, arg4, arg0, var9);
                int var15 = var9 >> 14 & 32767;
                int var16 = var13 & 31;
                int var17 = var13 >> 6;
                LocType var14;
                if (arg5 == 0) {
                    this.scene.removeWall(arg4, arg1, arg0, (byte) -119);
                    var14 = LocType.get(var15);
                    if (var14.blockwalk) {
                        this.levelCollisionMap[arg1].removeWall(var17, var16, var14.blockrange, true, arg4, arg0);
                    }
                }
                if (arg5 == 1) {
                    this.scene.removeWallDecoration(0, arg0, arg1, arg4);
                }
                if (arg5 == 2) {
                    this.scene.removeLoc(arg1, -978, arg4, arg0);
                    var14 = LocType.get(var15);
                    if (arg4 + var14.width > 103 || arg0 + var14.width > 103 || arg4 + var14.length > 103 || arg0 + var14.length > 103) {
                        return;
                    }
                    if (var14.blockwalk) {
                        this.levelCollisionMap[arg1].removeLoc(var17, var14.width, arg4, arg0, (byte) 6, var14.length, var14.blockrange);
                    }
                }
                if (arg5 == 3) {
                    this.scene.removeGroundDecoration((byte) 9, arg1, arg0, arg4);
                    var14 = LocType.get(var15);
                    if (var14.blockwalk && var14.active) {
                        this.levelCollisionMap[arg1].removeBlocked(360, arg0, arg4);
                    }
                }
            }
            if (arg6 >= 0) {
                var13 = arg1;
                if (arg1 < 3 && (this.levelTileFlags[1][arg4][arg0] & 2) == 2) {
                    var13 = arg1 + 1;
                }
                World.addLoc(this.scene, arg2, arg0, arg3, var13, this.levelCollisionMap[arg1], this.levelHeightmap, arg4, arg6, arg1, (byte) 93);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILMBMGIXGO;I)V")
    private final void readPlayerInfo(int arg0, Packet arg1, int arg2) {
        this.entityRemovalCount = 0;
        if (arg2 != 9759) {
            this.packetType = arg1.g1();
        }
        this.entityUpdateCount = 0;
        this.readLocalPlayer(arg1, arg0, (byte) 5);
        this.readPlayers((byte) 2, arg0, arg1);
        this.readNewPlayers(arg1, arg0, (byte) 8);
        this.readPlayerUpdates(arg0, (byte) 2, arg1);
        int var5;
        for (int var4 = 0; var4 < this.entityRemovalCount; var4++) {
            var5 = this.entityRemovalIds[var4];
            if (this.players[var5].cycle != loopCycle) {
                this.players[var5] = null;
            }
        }
        if (arg1.pos != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.pos + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (var5 = 0; var5 < this.playerCount; var5++) {
                if (this.players[this.playerIds[var5]] == null) {
                    signlink.reporterror(this.username + " null entry in pl list - pos:" + var5 + " size:" + this.playerCount);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public final void orbitCamera(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg2 & 2047;
        int var9 = 2048 - arg5 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg1;
        if (arg0 != 0) {
            this.load();
        }
        int var13;
        int var14;
        int var15;
        if (var8 != 0) {
            var13 = Model.sin[var8];
            var14 = Model.cos[var8];
            var15 = var11 * var14 - arg1 * var13 >> 16;
            var12 = var11 * var13 + arg1 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            var13 = Model.sin[var9];
            var14 = Model.cos[var9];
            var15 = var12 * var13 + var10 * var14 >> 16;
            var12 = var12 * var14 - var10 * var13 >> 16;
            var10 = var15;
        }
        this.cameraX = arg3 - var10;
        this.cameraY = arg4 - var11;
        this.cameraZ = arg6 - var12;
        this.cameraPitch = arg2;
        this.cameraYaw = arg5;
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)Z")
    public final boolean read(boolean arg0) {
        if (!arg0) {
            this.levelObjStacks = null;
        }
        if (this.stream == null) {
            return false;
        } else {
            String var3;
            int var4;
            try {
                int var2 = this.stream.available();
                if (var2 == 0) {
                    return false;
                }
                if (this.packetType == -1) {
                    this.stream.read(this.in.data, 0, 1);
                    this.packetType = this.in.data[0] & 255;
                    if (this.randomIn != null) {
                        this.packetType = this.packetType - this.randomIn.nextInt() & 255;
                    }
                    this.packetSize = Protocol.serverProtSizes[this.packetType];
                    var2--;
                }
                if (this.packetSize == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.stream.read(this.in.data, 0, 1);
                    this.packetSize = this.in.data[0] & 255;
                    var2--;
                }
                if (this.packetSize == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.stream.read(this.in.data, 0, 2);
                    this.in.pos = 0;
                    this.packetSize = this.in.g2();
                    var2 -= 2;
                }
                if (var2 < this.packetSize) {
                    return false;
                }
                this.in.pos = 0;
                this.stream.read(this.in.data, 0, this.packetSize);
                this.idleNetCycles = 0;
                this.lastPacketType2 = this.lastPacketType1;
                this.lastPacketType1 = this.lastPacketType0;
                this.lastPacketType0 = this.packetType;
                if (this.packetType == 81) {
                    this.readPlayerInfo(this.packetSize, this.in, 9759);
                    this.awaitingSync = false;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 176) {
                    this.daysSinceRecoveriesChanged = this.in.g1_alt2(false);
                    this.unreadMessages = this.in.g2_alt2(true);
                    this.warnMembersInNonMembers = this.in.g1();
                    this.lastAddress = this.in.g4_alt3(true);
                    this.daysSinceLastLogin = this.in.g2();
                    if (this.lastAddress != 0 && this.viewportInterfaceId == -1) {
                        signlink.dnslookup(JString.formatName(this.lastAddress, true));
                        this.closeInterfaces(537);
                        short var51 = 650;
                        if (this.daysSinceRecoveriesChanged != 201 || this.warnMembersInNonMembers == 1) {
                            var51 = 655;
                        }
                        this.reportAbuseInput = "";
                        this.reportAbuseMuteOption = false;
                        for (var4 = 0; var4 < Component.instances.length; var4++) {
                            if (Component.instances[var4] != null && Component.instances[var4].clientCode == var51) {
                                this.viewportInterfaceId = Component.instances[var4].layer;
                                break;
                            }
                        }
                    }
                    this.packetType = -1;
                    return true;
                }
                int var23;
                if (this.packetType == 64) {
                    this.baseX = this.in.g1_alt2(false);
                    this.baseZ = this.in.g1_alt3(2);
                    for (var23 = this.baseX; var23 < this.baseX + 8; var23++) {
                        for (var4 = this.baseZ; var4 < this.baseZ + 8; var4++) {
                            if (this.levelObjStacks[this.currentLevel][var23][var4] != null) {
                                this.levelObjStacks[this.currentLevel][var23][var4] = null;
                                this.sortObjStacks(var23, var4);
                            }
                        }
                    }
                    for (LocSpawned var50 = (LocSpawned) this.temporaryLocs.head(); var50 != null; var50 = (LocSpawned) this.temporaryLocs.next(false)) {
                        if (var50.localX >= this.baseX && var50.localX < this.baseX + 8 && var50.localZ >= this.baseZ && var50.localZ < this.baseZ + 8 && var50.level == this.currentLevel) {
                            var50.duration = 0;
                        }
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 185) {
                    var23 = this.in.g2_alt3((byte) -74);
                    Component.instances[var23].modelType = 3;
                    if (localPlayer.npc == null) {
                        Component.instances[var23].model = (localPlayer.colors[0] << 25) + (localPlayer.colors[4] << 20) + (localPlayer.appearances[0] << 15) + (localPlayer.appearances[8] << 10) + (localPlayer.appearances[11] << 5) + localPlayer.appearances[1];
                    } else {
                        Component.instances[var23].model = (int) (305419896L + localPlayer.npc.type);
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 107) {
                    this.cutscene = false;
                    for (var23 = 0; var23 < 5; var23++) {
                        this.cameraModifierEnabled[var23] = false;
                    }
                    this.packetType = -1;
                    return true;
                }
                int var5;
                Component var24;
                if (this.packetType == 72) {
                    var23 = this.in.g2_alt1((byte) 108);
                    var24 = Component.instances[var23];
                    for (var5 = 0; var5 < var24.invSlotObjId.length; var5++) {
                        var24.invSlotObjId[var5] = -1;
                        var24.invSlotObjId[var5] = 0;
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 214) {
                    this.ignoreCount = this.packetSize / 8;
                    for (var23 = 0; var23 < this.ignoreCount; var23++) {
                        this.ignoreName37[var23] = this.in.g8(-35089);
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 166) {
                    this.cutscene = true;
                    this.cutsceneSrcLocalTileX = this.in.g1();
                    this.cutsceneSrcLocalTileZ = this.in.g1();
                    this.cutsceneSrcHeight = this.in.g2();
                    this.cutsceneMoveSpeed = this.in.g1();
                    this.cutsceneMoveAcceleration = this.in.g1();
                    if (this.cutsceneMoveAcceleration >= 100) {
                        this.cameraX = this.cutsceneSrcLocalTileX * 128 + 64;
                        this.cameraZ = this.cutsceneSrcLocalTileZ * 128 + 64;
                        this.cameraY = this.getHeightmapY(this.currentLevel, this.cameraZ, true, this.cameraX) - this.cutsceneSrcHeight;
                    }
                    this.packetType = -1;
                    return true;
                }
                int var6;
                if (this.packetType == 134) {
                    this.redrawSidebar = true;
                    var23 = this.in.g1();
                    var4 = this.in.g4_alt2((byte) 41);
                    var5 = this.in.g1();
                    this.skillExperience[var23] = var4;
                    this.skillLevel[var23] = var5;
                    this.skillBaseLevel[var23] = 1;
                    for (var6 = 0; var6 < 98; var6++) {
                        if (var4 >= levelExperience[var6]) {
                            this.skillBaseLevel[var23] = var6 + 2;
                        }
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 71) {
                    var23 = this.in.g2();
                    var4 = this.in.g1_alt1(0);
                    if (var23 == 65535) {
                        var23 = -1;
                    }
                    this.tabInterfaceId[var4] = var23;
                    this.redrawSidebar = true;
                    this.redrawSideicons = true;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 74) {
                    var23 = this.in.g2_alt1((byte) 108);
                    if (var23 == 65535) {
                        var23 = -1;
                    }
                    if (var23 != this.nextMidiSong && this.midiActive && !lowMemory && this.nextMusicDelay == 0) {
                        this.midiSong = var23;
                        this.midiFading = true;
                        this.ondemand.request(2, this.midiSong);
                    }
                    this.nextMidiSong = var23;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 121) {
                    var23 = this.in.g2_alt3((byte) -74);
                    var4 = this.in.g2_alt2(true);
                    if (this.midiActive && !lowMemory) {
                        this.midiSong = var23;
                        this.midiFading = false;
                        this.ondemand.request(2, this.midiSong);
                        this.nextMusicDelay = var4;
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 109) {
                    this.logout(true);
                    this.packetType = -1;
                    return false;
                }
                if (this.packetType == 70) {
                    var23 = this.in.g2b();
                    var4 = this.in.g2b_alt1(-665);
                    var5 = this.in.g2_alt1((byte) 108);
                    Component var39 = Component.instances[var5];
                    var39.x = var23;
                    var39.y = var4;
                    this.packetType = -1;
                    return true;
                }
                int var7;
                int var8;
                int var9;
                int var10;
                if (this.packetType == 73 || this.packetType == 241) {
                    var23 = this.sceneCenterZoneX;
                    var4 = this.sceneCenterZoneZ;
                    if (this.packetType == 73) {
                        var23 = this.in.g2_alt2(true);
                        var4 = this.in.g2();
                        this.sceneInstanced = false;
                    }
                    if (this.packetType == 241) {
                        var4 = this.in.g2_alt2(true);
                        this.in.accessBits(this._flowObfuscator33);
                        var5 = 0;
                        while (true) {
                            if (var5 >= 4) {
                                this.in.accessBytes(true);
                                var23 = this.in.g2();
                                this.sceneInstanced = true;
                                break;
                            }
                            for (var6 = 0; var6 < 13; var6++) {
                                for (var7 = 0; var7 < 13; var7++) {
                                    var8 = this.in.gBit(1, 0);
                                    if (var8 == 1) {
                                        this.levelChunkBitset[var5][var6][var7] = this.in.gBit(26, 0);
                                    } else {
                                        this.levelChunkBitset[var5][var6][var7] = -1;
                                    }
                                }
                            }
                            var5++;
                        }
                    }
                    if (this.sceneCenterZoneX == var23 && this.sceneCenterZoneZ == var4 && this.sceneState == 2) {
                        this.packetType = -1;
                        return true;
                    }
                    this.sceneCenterZoneX = var23;
                    this.sceneCenterZoneZ = var4;
                    this.sceneBaseTileX = (this.sceneCenterZoneX - 6) * 8;
                    this.sceneBaseTileZ = (this.sceneCenterZoneZ - 6) * 8;
                    this.withinTutorialIsland = false;
                    if ((this.sceneCenterZoneX / 8 == 48 || this.sceneCenterZoneX / 8 == 49) && this.sceneCenterZoneZ / 8 == 48) {
                        this.withinTutorialIsland = true;
                    }
                    if (this.sceneCenterZoneX / 8 == 48 && this.sceneCenterZoneZ / 8 == 148) {
                        this.withinTutorialIsland = true;
                    }
                    this.sceneState = 1;
                    this.sceneLoadStartTime = System.currentTimeMillis();
                    this.areaViewport.bind(0);
                    this.fontPlain12.drawStringCenter(0, "Loading - please wait.", 23693, 151, 257);
                    this.fontPlain12.drawStringCenter(16777215, "Loading - please wait.", 23693, 150, 256);
                    this.areaViewport.draw(4, 23680, super.graphics, 4);
                    if (this.packetType == 73) {
                        var5 = 0;
                        var6 = (this.sceneCenterZoneX - 6) / 8;
                        label1094: while (true) {
                            if (var6 > (this.sceneCenterZoneX + 6) / 8) {
                                this.sceneMapLandData = new byte[var5][];
                                this.sceneMapLocData = new byte[var5][];
                                this.sceneMapIndex = new int[var5];
                                this.sceneMapLandFile = new int[var5];
                                this.sceneMapLocFile = new int[var5];
                                var5 = 0;
                                var7 = (this.sceneCenterZoneX - 6) / 8;
                                while (true) {
                                    if (var7 > (this.sceneCenterZoneX + 6) / 8) {
                                        break label1094;
                                    }
                                    for (var8 = (this.sceneCenterZoneZ - 6) / 8; var8 <= (this.sceneCenterZoneZ + 6) / 8; var8++) {
                                        this.sceneMapIndex[var5] = (var7 << 8) + var8;
                                        if (!this.withinTutorialIsland || var8 != 49 && var8 != 149 && var8 != 147 && var7 != 50 && (var7 != 49 || var8 != 47)) {
                                            var9 = this.sceneMapLandFile[var5] = this.ondemand.getMapFile(0, 0, var8, var7);
                                            if (var9 != -1) {
                                                this.ondemand.request(3, var9);
                                            }
                                            var10 = this.sceneMapLocFile[var5] = this.ondemand.getMapFile(1, 0, var8, var7);
                                            if (var10 != -1) {
                                                this.ondemand.request(3, var10);
                                            }
                                            var5++;
                                        } else {
                                            this.sceneMapLandFile[var5] = -1;
                                            this.sceneMapLocFile[var5] = -1;
                                            var5++;
                                        }
                                    }
                                    var7++;
                                }
                            }
                            for (var7 = (this.sceneCenterZoneZ - 6) / 8; var7 <= (this.sceneCenterZoneZ + 6) / 8; var7++) {
                                var5++;
                            }
                            var6++;
                        }
                    }
                    if (this.packetType == 241) {
                        var5 = 0;
                        int[] var36 = new int[676];
                        var7 = 0;
                        label1053: while (true) {
                            int var13;
                            int var37;
                            int var42;
                            if (var7 >= 4) {
                                this.sceneMapLandData = new byte[var5][];
                                this.sceneMapLocData = new byte[var5][];
                                this.sceneMapIndex = new int[var5];
                                this.sceneMapLandFile = new int[var5];
                                this.sceneMapLocFile = new int[var5];
                                var8 = 0;
                                while (true) {
                                    if (var8 >= var5) {
                                        break label1053;
                                    }
                                    var9 = this.sceneMapIndex[var8] = var36[var8];
                                    var10 = var9 >> 8 & 255;
                                    var37 = var9 & 255;
                                    var42 = this.sceneMapLandFile[var8] = this.ondemand.getMapFile(0, 0, var37, var10);
                                    if (var42 != -1) {
                                        this.ondemand.request(3, var42);
                                    }
                                    var13 = this.sceneMapLocFile[var8] = this.ondemand.getMapFile(1, 0, var37, var10);
                                    if (var13 != -1) {
                                        this.ondemand.request(3, var13);
                                    }
                                    var8++;
                                }
                            }
                            for (var8 = 0; var8 < 13; var8++) {
                                for (var9 = 0; var9 < 13; var9++) {
                                    var10 = this.levelChunkBitset[var7][var8][var9];
                                    if (var10 != -1) {
                                        var37 = var10 >> 14 & 1023;
                                        var42 = var10 >> 3 & 2047;
                                        var13 = (var37 / 8 << 8) + var42 / 8;
                                        for (int var14 = 0; var14 < var5; var14++) {
                                            if (var36[var14] == var13) {
                                                var13 = -1;
                                                break;
                                            }
                                        }
                                        if (var13 != -1) {
                                            var36[var5++] = var13;
                                        }
                                    }
                                }
                            }
                            var7++;
                        }
                    }
                    var5 = this.sceneBaseTileX - this.scenePrevBaseTileX;
                    var6 = this.sceneBaseTileZ - this.scenePrevBaseTileZ;
                    this.scenePrevBaseTileX = this.sceneBaseTileX;
                    this.scenePrevBaseTileZ = this.sceneBaseTileZ;
                    for (var7 = 0; var7 < 16384; var7++) {
                        NpcEntity var44 = this.npcs[var7];
                        if (var44 != null) {
                            for (var9 = 0; var9 < 10; var9++) {
                                var44.pathTileX[var9] -= var5;
                                var44.pathTileZ[var9] -= var6;
                            }
                            var44.x -= var5 * 128;
                            var44.z -= var6 * 128;
                        }
                    }
                    for (var8 = 0; var8 < this.MAX_PLAYER_COUNT; var8++) {
                        PlayerEntity var46 = this.players[var8];
                        if (var46 != null) {
                            for (var10 = 0; var10 < 10; var10++) {
                                var46.pathTileX[var10] -= var5;
                                var46.pathTileZ[var10] -= var6;
                            }
                            var46.x -= var5 * 128;
                            var46.z -= var6 * 128;
                        }
                    }
                    this.awaitingSync = true;
                    byte var48 = 0;
                    byte var40 = 104;
                    byte var41 = 1;
                    if (var5 < 0) {
                        var48 = 103;
                        var40 = -1;
                        var41 = -1;
                    }
                    byte var43 = 0;
                    byte var45 = 104;
                    byte var47 = 1;
                    if (var6 < 0) {
                        var43 = 103;
                        var45 = -1;
                        var47 = -1;
                    }
                    for (int var15 = var48; var15 != var40; var15 += var41) {
                        for (int var16 = var43; var16 != var45; var16 += var47) {
                            int var17 = var15 + var5;
                            int var18 = var16 + var6;
                            for (int var19 = 0; var19 < 4; var19++) {
                                if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                                    this.levelObjStacks[var19][var15][var16] = this.levelObjStacks[var19][var17][var18];
                                } else {
                                    this.levelObjStacks[var19][var15][var16] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var49 = (LocSpawned) this.temporaryLocs.head(); var49 != null; var49 = (LocSpawned) this.temporaryLocs.next(false)) {
                        var49.localX -= var5;
                        var49.localZ -= var6;
                        if (var49.localX < 0 || var49.localZ < 0 || var49.localX >= 104 || var49.localZ >= 104) {
                            var49.unlink();
                        }
                    }
                    if (this.flagSceneTileX != 0) {
                        this.flagSceneTileX -= var5;
                        this.flagSceneTileZ -= var6;
                    }
                    this.cutscene = false;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 208) {
                    var23 = this.in.g2b_alt1(-665);
                    if (var23 >= 0) {
                        this.resetInterfaceAnimation(var23, (byte) 6);
                    }
                    this.viewportOverlayInterfaceId = var23;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 99) {
                    this.minimapState = this.in.g1();
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 75) {
                    var23 = this.in.g2_alt3((byte) -74);
                    var4 = this.in.g2_alt3((byte) -74);
                    Component.instances[var4].modelType = 2;
                    Component.instances[var4].model = var23;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 114) {
                    this.systemUpdateTimer = this.in.g2_alt1((byte) 108) * 30;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 60) {
                    this.baseZ = this.in.g1();
                    this.baseX = this.in.g1_alt2(false);
                    while (this.in.pos < this.packetSize) {
                        var23 = this.in.g1();
                        this.readZonePacket(this._flowObfuscator34, this.in, var23);
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 35) {
                    var23 = this.in.g1();
                    var4 = this.in.g1();
                    var5 = this.in.g1();
                    var6 = this.in.g1();
                    this.cameraModifierEnabled[var23] = true;
                    this.cameraModifierJitter[var23] = var4;
                    this.cameraModifierWobbleScale[var23] = var5;
                    this.cameraModifierWobbleSpeed[var23] = var6;
                    this.cameraModifierCycle[var23] = 0;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 174) {
                    var23 = this.in.g2();
                    var4 = this.in.g1();
                    var5 = this.in.g2();
                    if (this.waveEnabled && !lowMemory && this.waveCount < 50) {
                        this.waveIds[this.waveCount] = var23;
                        this.waveLoops[this.waveCount] = var4;
                        this.waveDelay[this.waveCount] = var5 + Wave.delays[var23];
                        this.waveCount++;
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 104) {
                    var23 = this.in.g1_alt2(false);
                    var4 = this.in.g1_alt1(0);
                    String var33 = this.in.gjstr();
                    if (var23 >= 1 && var23 <= 5) {
                        if (var33.equalsIgnoreCase("null")) {
                            var33 = null;
                        }
                        this.playerOptions[var23 - 1] = var33;
                        this.playerOptionPushDown[var23 - 1] = var4 == 0;
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 78) {
                    this.flagSceneTileX = 0;
                    this.packetType = -1;
                    return true;
                }
                String var34;
                boolean var35;
                if (this.packetType == 253) {
                    var3 = this.in.gjstr();
                    long var28;
                    String var38;
                    if (var3.endsWith(":tradereq:")) {
                        var38 = var3.substring(0, var3.indexOf(":"));
                        var28 = JString.toBase37(var38);
                        var35 = false;
                        for (var8 = 0; var8 < this.ignoreCount; var8++) {
                            if (this.ignoreName37[var8] == var28) {
                                var35 = true;
                                break;
                            }
                        }
                        if (!var35 && this.overrideChat == 0) {
                            this.addMessage("wishes to trade with you.", 4, var38, this._flowObfuscator21);
                        }
                    } else if (var3.endsWith(":duelreq:")) {
                        var38 = var3.substring(0, var3.indexOf(":"));
                        var28 = JString.toBase37(var38);
                        var35 = false;
                        for (var8 = 0; var8 < this.ignoreCount; var8++) {
                            if (this.ignoreName37[var8] == var28) {
                                var35 = true;
                                break;
                            }
                        }
                        if (!var35 && this.overrideChat == 0) {
                            this.addMessage("wishes to duel with you.", 8, var38, this._flowObfuscator21);
                        }
                    } else if (!var3.endsWith(":chalreq:")) {
                        this.addMessage(var3, 0, "", this._flowObfuscator21);
                    } else {
                        var38 = var3.substring(0, var3.indexOf(":"));
                        var28 = JString.toBase37(var38);
                        var35 = false;
                        for (var8 = 0; var8 < this.ignoreCount; var8++) {
                            if (this.ignoreName37[var8] == var28) {
                                var35 = true;
                                break;
                            }
                        }
                        if (!var35 && this.overrideChat == 0) {
                            var34 = var3.substring(var3.indexOf(":") + 1, var3.length() - 9);
                            this.addMessage(var34, 8, var38, this._flowObfuscator21);
                        }
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 1) {
                    for (var23 = 0; var23 < this.players.length; var23++) {
                        if (this.players[var23] != null) {
                            this.players[var23].primarySeqId = -1;
                        }
                    }
                    for (var4 = 0; var4 < this.npcs.length; var4++) {
                        if (this.npcs[var4] != null) {
                            this.npcs[var4].primarySeqId = -1;
                        }
                    }
                    this.packetType = -1;
                    return true;
                }
                long var32;
                if (this.packetType == 50) {
                    var32 = this.in.g8(-35089);
                    var5 = this.in.g1();
                    String var30 = JString.toSentenceCase(-45804, JString.fromBase37(var32, (byte) -99));
                    for (var7 = 0; var7 < this.friendCount; var7++) {
                        if (var32 == this.friendName37[var7]) {
                            if (this.friendWorld[var7] != var5) {
                                this.friendWorld[var7] = var5;
                                this.redrawSidebar = true;
                                if (var5 > 0) {
                                    this.addMessage(var30 + " has logged in.", 5, "", this._flowObfuscator21);
                                }
                                if (var5 == 0) {
                                    this.addMessage(var30 + " has logged out.", 5, "", this._flowObfuscator21);
                                }
                            }
                            var30 = null;
                            break;
                        }
                    }
                    if (var30 != null && this.friendCount < 200) {
                        this.friendName37[this.friendCount] = var32;
                        this.friendName[this.friendCount] = var30;
                        this.friendWorld[this.friendCount] = var5;
                        this.friendCount++;
                        this.redrawSidebar = true;
                    }
                    boolean var31 = false;
                    while (!var31) {
                        var31 = true;
                        for (var9 = 0; var9 < this.friendCount - 1; var9++) {
                            if (this.friendWorld[var9] != nodeId && this.friendWorld[var9 + 1] == nodeId || this.friendWorld[var9] == 0 && this.friendWorld[var9 + 1] != 0) {
                                var10 = this.friendWorld[var9];
                                this.friendWorld[var9] = this.friendWorld[var9 + 1];
                                this.friendWorld[var9 + 1] = var10;
                                String var11 = this.friendName[var9];
                                this.friendName[var9] = this.friendName[var9 + 1];
                                this.friendName[var9 + 1] = var11;
                                long var12 = this.friendName37[var9];
                                this.friendName37[var9] = this.friendName37[var9 + 1];
                                this.friendName37[var9 + 1] = var12;
                                this.redrawSidebar = true;
                                var31 = false;
                            }
                        }
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 110) {
                    if (this.selectedTab == 12) {
                        this.redrawSidebar = true;
                    }
                    this.energy = this.in.g1();
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 254) {
                    this.hintType = this.in.g1();
                    if (this.hintType == 1) {
                        this.hintNpc = this.in.g2();
                    }
                    if (this.hintType >= 2 && this.hintType <= 6) {
                        if (this.hintType == 2) {
                            this.hintOffsetX = 64;
                            this.hintOffsetZ = 64;
                        }
                        if (this.hintType == 3) {
                            this.hintOffsetX = 0;
                            this.hintOffsetZ = 64;
                        }
                        if (this.hintType == 4) {
                            this.hintOffsetX = 128;
                            this.hintOffsetZ = 64;
                        }
                        if (this.hintType == 5) {
                            this.hintOffsetX = 64;
                            this.hintOffsetZ = 0;
                        }
                        if (this.hintType == 6) {
                            this.hintOffsetX = 64;
                            this.hintOffsetZ = 128;
                        }
                        this.hintType = 2;
                        this.hintTileX = this.in.g2();
                        this.hintTileZ = this.in.g2();
                        this.hintHeight = this.in.g1();
                    }
                    if (this.hintType == 10) {
                        this.hintPlayer = this.in.g2();
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 248) {
                    var23 = this.in.g2_alt2(true);
                    var4 = this.in.g2();
                    if (this.chatInterfaceId != -1) {
                        this.chatInterfaceId = -1;
                        this.redrawChatback = true;
                    }
                    if (this.chatbackInputOpen != 0) {
                        this.chatbackInputOpen = 0;
                        this.redrawChatback = true;
                    }
                    this.viewportInterfaceId = var23;
                    this.sidebarInterfaceId = var4;
                    this.redrawSidebar = true;
                    this.redrawSideicons = true;
                    this.pressedContinueOption = false;
                    this.packetType = -1;
                    return true;
                }
                Component var26;
                if (this.packetType == 79) {
                    var23 = this.in.g2_alt1((byte) 108);
                    var4 = this.in.g2_alt2(true);
                    var26 = Component.instances[var23];
                    if (var26 != null && var26.type == 0) {
                        if (var4 < 0) {
                            var4 = 0;
                        }
                        if (var4 > var26.scroll - var26.height) {
                            var4 = var26.scroll - var26.height;
                        }
                        var26.scrollPosition = var4;
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 68) {
                    for (var23 = 0; var23 < this.varps.length; var23++) {
                        if (this.varps[var23] != this.varCache[var23]) {
                            this.varps[var23] = this.varCache[var23];
                            this.updateVarp(false, var23);
                            this.redrawSidebar = true;
                        }
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 196) {
                    var32 = this.in.g8(-35089);
                    var5 = this.in.g4();
                    var6 = this.in.g1();
                    var35 = false;
                    for (var8 = 0; var8 < 100; var8++) {
                        if (this.messageIds[var8] == var5) {
                            var35 = true;
                            break;
                        }
                    }
                    if (var6 <= 1) {
                        for (var9 = 0; var9 < this.ignoreCount; var9++) {
                            if (this.ignoreName37[var9] == var32) {
                                var35 = true;
                                break;
                            }
                        }
                    }
                    if (!var35 && this.overrideChat == 0) {
                        try {
                            this.messageIds[this.privateMessageCount] = var5;
                            this.privateMessageCount = (this.privateMessageCount + 1) % 100;
                            var34 = WordPack.unpack(this.packetSize - 13, true, this.in);
                            if (var6 != 3) {
                                var34 = WordFilter.filter(var34, 0);
                            }
                            if (var6 != 2 && var6 != 3) {
                                if (var6 == 1) {
                                    this.addMessage(var34, 7, "@cr1@" + JString.toSentenceCase(-45804, JString.fromBase37(var32, (byte) -99)), this._flowObfuscator21);
                                } else {
                                    this.addMessage(var34, 3, JString.toSentenceCase(-45804, JString.fromBase37(var32, (byte) -99)), this._flowObfuscator21);
                                }
                            } else {
                                this.addMessage(var34, 7, "@cr2@" + JString.toSentenceCase(-45804, JString.fromBase37(var32, (byte) -99)), this._flowObfuscator21);
                            }
                        } catch (Exception var20) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 85) {
                    this.baseZ = this.in.g1_alt2(false);
                    this.baseX = this.in.g1_alt2(false);
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 24) {
                    this.flashingTab = this.in.g1_alt3(2);
                    if (this.flashingTab == this.selectedTab) {
                        if (this.flashingTab == 3) {
                            this.selectedTab = 1;
                        } else {
                            this.selectedTab = 3;
                        }
                        this.redrawSidebar = true;
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 246) {
                    var23 = this.in.g2_alt1((byte) 108);
                    var4 = this.in.g2();
                    var5 = this.in.g2();
                    if (var5 == 65535) {
                        Component.instances[var23].modelType = 0;
                        this.packetType = -1;
                        return true;
                    }
                    ObjType var27 = ObjType.get(var5);
                    Component.instances[var23].modelType = 4;
                    Component.instances[var23].model = var5;
                    Component.instances[var23].xan = var27.xan2d;
                    Component.instances[var23].yan = var27.yan2d;
                    Component.instances[var23].zoom = var27.zoom2d * 100 / var4;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 171) {
                    boolean var29 = this.in.g1() == 1;
                    var4 = this.in.g2();
                    Component.instances[var4].hide = var29;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 142) {
                    var23 = this.in.g2_alt1((byte) 108);
                    this.resetInterfaceAnimation(var23, (byte) 6);
                    if (this.chatInterfaceId != -1) {
                        this.chatInterfaceId = -1;
                        this.redrawChatback = true;
                    }
                    if (this.chatbackInputOpen != 0) {
                        this.chatbackInputOpen = 0;
                        this.redrawChatback = true;
                    }
                    this.sidebarInterfaceId = var23;
                    this.redrawSidebar = true;
                    this.redrawSideicons = true;
                    this.viewportInterfaceId = -1;
                    this.pressedContinueOption = false;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 126) {
                    var3 = this.in.gjstr();
                    var4 = this.in.g2_alt2(true);
                    Component.instances[var4].text = var3;
                    if (Component.instances[var4].layer == this.tabInterfaceId[this.selectedTab]) {
                        this.redrawSidebar = true;
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 206) {
                    this.publicChatSetting = this.in.g1();
                    this.privateChatSetting = this.in.g1();
                    this.tradeChatSetting = this.in.g1();
                    this.redrawPrivacySettings = true;
                    this.redrawChatback = true;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 240) {
                    if (this.selectedTab == 12) {
                        this.redrawSidebar = true;
                    }
                    this.weightCarried = this.in.g2b();
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 8) {
                    var23 = this.in.g2_alt3((byte) -74);
                    var4 = this.in.g2();
                    Component.instances[var23].modelType = 1;
                    Component.instances[var23].model = var4;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 122) {
                    var23 = this.in.g2_alt3((byte) -74);
                    var4 = this.in.g2_alt3((byte) -74);
                    var5 = var4 >> 10 & 31;
                    var6 = var4 >> 5 & 31;
                    var7 = var4 & 31;
                    Component.instances[var23].colour = (var5 << 19) + (var6 << 11) + (var7 << 3);
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 53) {
                    this.redrawSidebar = true;
                    var23 = this.in.g2();
                    var24 = Component.instances[var23];
                    var5 = this.in.g2();
                    for (var6 = 0; var6 < var5; var6++) {
                        var7 = this.in.g1();
                        if (var7 == 255) {
                            var7 = this.in.g4_alt3(true);
                        }
                        var24.invSlotObjId[var6] = this.in.g2_alt3((byte) -74);
                        var24.invSlotObjCount[var6] = var7;
                    }
                    for (var7 = var5; var7 < var24.invSlotObjId.length; var7++) {
                        var24.invSlotObjId[var7] = 0;
                        var24.invSlotObjCount[var7] = 0;
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 230) {
                    var23 = this.in.g2_alt2(true);
                    var4 = this.in.g2();
                    var5 = this.in.g2();
                    var6 = this.in.g2_alt3((byte) -74);
                    Component.instances[var4].xan = var5;
                    Component.instances[var4].yan = var6;
                    Component.instances[var4].zoom = var23;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 221) {
                    this.friendListStatus = this.in.g1();
                    this.redrawSidebar = true;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 177) {
                    this.cutscene = true;
                    this.cutsceneDstLocalTileX = this.in.g1();
                    this.cutsceneDstLocalTileZ = this.in.g1();
                    this.cutsceneDstHeight = this.in.g2();
                    this.cutsceneRotateSpeed = this.in.g1();
                    this.cutsceneRotateAcceleration = this.in.g1();
                    if (this.cutsceneRotateAcceleration >= 100) {
                        var23 = this.cutsceneDstLocalTileX * 128 + 64;
                        var4 = this.cutsceneDstLocalTileZ * 128 + 64;
                        var5 = this.getHeightmapY(this.currentLevel, var4, true, var23) - this.cutsceneDstHeight;
                        var6 = var23 - this.cameraX;
                        var7 = var5 - this.cameraY;
                        var8 = var4 - this.cameraZ;
                        var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
                        this.cameraPitch = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 2047;
                        this.cameraYaw = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 2047;
                        if (this.cameraPitch < 128) {
                            this.cameraPitch = 128;
                        }
                        if (this.cameraPitch > 383) {
                            this.cameraPitch = 383;
                        }
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 249) {
                    this.isMember = this.in.g1_alt1(0);
                    this.localPid = this.in.g2_alt3((byte) -74);
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 65) {
                    this.readNpcInfo(this.in, this.packetSize, 973);
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 27) {
                    this.showSocialInput = false;
                    this.chatbackInputOpen = 1;
                    this.chatbackInput = "";
                    this.redrawChatback = true;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 187) {
                    this.showSocialInput = false;
                    this.chatbackInputOpen = 2;
                    this.chatbackInput = "";
                    this.redrawChatback = true;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 97) {
                    var23 = this.in.g2();
                    this.resetInterfaceAnimation(var23, (byte) 6);
                    if (this.sidebarInterfaceId != -1) {
                        this.sidebarInterfaceId = -1;
                        this.redrawSidebar = true;
                        this.redrawSideicons = true;
                    }
                    if (this.chatInterfaceId != -1) {
                        this.chatInterfaceId = -1;
                        this.redrawChatback = true;
                    }
                    if (this.chatbackInputOpen != 0) {
                        this.chatbackInputOpen = 0;
                        this.redrawChatback = true;
                    }
                    this.viewportInterfaceId = var23;
                    this.pressedContinueOption = false;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 218) {
                    var23 = this.in.g2b_alt3(false);
                    this.stickyChatInterfaceId = var23;
                    this.redrawChatback = true;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 87) {
                    var23 = this.in.g2_alt1((byte) 108);
                    var4 = this.in.g4_alt2((byte) 41);
                    this.varCache[var23] = var4;
                    if (this.varps[var23] != var4) {
                        this.varps[var23] = var4;
                        this.updateVarp(false, var23);
                        this.redrawSidebar = true;
                        if (this.stickyChatInterfaceId != -1) {
                            this.redrawChatback = true;
                        }
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 36) {
                    var23 = this.in.g2_alt1((byte) 108);
                    byte var25 = this.in.g1b();
                    this.varCache[var23] = var25;
                    if (this.varps[var23] != var25) {
                        this.varps[var23] = var25;
                        this.updateVarp(false, var23);
                        this.redrawSidebar = true;
                        if (this.stickyChatInterfaceId != -1) {
                            this.redrawChatback = true;
                        }
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 61) {
                    this.inMultizone = this.in.g1();
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 200) {
                    var23 = this.in.g2();
                    var4 = this.in.g2b();
                    var26 = Component.instances[var23];
                    var26.anim = var4;
                    if (var4 == -1) {
                        var26.animFrame = 0;
                        var26.animCycle = 0;
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 219) {
                    if (this.sidebarInterfaceId != -1) {
                        this.sidebarInterfaceId = -1;
                        this.redrawSidebar = true;
                        this.redrawSideicons = true;
                    }
                    if (this.chatInterfaceId != -1) {
                        this.chatInterfaceId = -1;
                        this.redrawChatback = true;
                    }
                    if (this.chatbackInputOpen != 0) {
                        this.chatbackInputOpen = 0;
                        this.redrawChatback = true;
                    }
                    this.viewportInterfaceId = -1;
                    this.pressedContinueOption = false;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 34) {
                    this.redrawSidebar = true;
                    var23 = this.in.g2();
                    var24 = Component.instances[var23];
                    while (this.in.pos < this.packetSize) {
                        var5 = this.in.gsmarts();
                        var6 = this.in.g2();
                        var7 = this.in.g1();
                        if (var7 == 255) {
                            var7 = this.in.g4();
                        }
                        if (var5 >= 0 && var5 < var24.invSlotObjId.length) {
                            var24.invSlotObjId[var5] = var6;
                            var24.invSlotObjCount[var5] = var7;
                        }
                    }
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 105 || this.packetType == 84 || this.packetType == 147 || this.packetType == 215 || this.packetType == 4 || this.packetType == 117 || this.packetType == 156 || this.packetType == 44 || this.packetType == 160 || this.packetType == 101 || this.packetType == 151) {
                    this.readZonePacket(this._flowObfuscator34, this.in, this.packetType);
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 106) {
                    this.selectedTab = this.in.g1_alt2(false);
                    this.redrawSidebar = true;
                    this.redrawSideicons = true;
                    this.packetType = -1;
                    return true;
                }
                if (this.packetType == 164) {
                    var23 = this.in.g2_alt1((byte) 108);
                    this.resetInterfaceAnimation(var23, (byte) 6);
                    if (this.sidebarInterfaceId != -1) {
                        this.sidebarInterfaceId = -1;
                        this.redrawSidebar = true;
                        this.redrawSideicons = true;
                    }
                    this.chatInterfaceId = var23;
                    this.redrawChatback = true;
                    this.viewportInterfaceId = -1;
                    this.pressedContinueOption = false;
                    this.packetType = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.packetType + "," + this.packetSize + " - " + this.lastPacketType1 + "," + this.lastPacketType2);
                this.logout(true);
            } catch (IOException var21) {
                this.tryReconnect(-670);
            } catch (Exception var22) {
                var3 = "T2 - " + this.packetType + "," + this.lastPacketType1 + "," + this.lastPacketType2 + " - " + this.packetSize + "," + (this.sceneBaseTileX + localPlayer.pathTileX[0]) + "," + (this.sceneBaseTileZ + localPlayer.pathTileZ[0]) + " - ";
                for (var4 = 0; var4 < this.packetSize && var4 < 50; var4++) {
                    var3 = var3 + this.in.data[var4] + ",";
                }
                signlink.reporterror(var3);
                this.logout(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
    public final void drawScene(byte arg0) {
        this.sceneCycle++;
        this.pushPlayers(0, true);
        this.pushNpcs(true, this._flowObfuscator11);
        this.pushPlayers(0, false);
        this.pushNpcs(false, this._flowObfuscator11);
        this.pushProjectiles(-948);
        this.pushSpotanims(true);
        int var2;
        int var3;
        if (!this.cutscene) {
            var2 = this.orbitCameraPitch;
            if (this.cameraPitchClamp / 256 > var2) {
                var2 = this.cameraPitchClamp / 256;
            }
            if (this.cameraModifierEnabled[4] && this.cameraModifierWobbleScale[4] + 128 > var2) {
                var2 = this.cameraModifierWobbleScale[4] + 128;
            }
            var3 = this.orbitCameraYaw + this.cameraAnticheatAngle & 2047;
            this.orbitCamera(0, 600 + var2 * 3, var2, this.orbitCameraX, this.getHeightmapY(this.currentLevel, localPlayer.z, true, localPlayer.x) - 50, var3, this.orbitCameraZ);
        }
        if (!this.cutscene) {
            var2 = this.getTopLevel(111);
        } else {
            var2 = this.getTopLevelCutscene(this._flowObfuscator28);
        }
        var3 = this.cameraX;
        int var4 = this.cameraY;
        int var5 = this.cameraZ;
        int var6 = this.cameraPitch;
        int var7 = this.cameraYaw;
        int var9;
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.cameraModifierEnabled[var8]) {
                var9 = (int) (Math.random() * (double) (this.cameraModifierJitter[var8] * 2 + 1) - (double) this.cameraModifierJitter[var8] + Math.sin((double) this.cameraModifierCycle[var8] * ((double) this.cameraModifierWobbleSpeed[var8] / 100.0D)) * (double) this.cameraModifierWobbleScale[var8]);
                if (var8 == 0) {
                    this.cameraX += var9;
                }
                if (var8 == 1) {
                    this.cameraY += var9;
                }
                if (var8 == 2) {
                    this.cameraZ += var9;
                }
                if (var8 == 3) {
                    this.cameraYaw = this.cameraYaw + var9 & 2047;
                }
                if (var8 == 4) {
                    this.cameraPitch += var9;
                    if (this.cameraPitch < 128) {
                        this.cameraPitch = 128;
                    }
                    if (this.cameraPitch > 383) {
                        this.cameraPitch = 383;
                    }
                }
            }
        }
        var9 = Draw3D.cycle;
        Model.checkHover = true;
        if (arg0 == 1) {
            Model.pickedCount = 0;
            Model.mouseX = super.mouseX - 4;
            Model.mouseY = super.mouseY - 4;
            Draw2D.clear(this._flowObfuscator38);
            this.scene.draw(this.cameraX, this.cameraZ, this.cameraYaw, this.cameraY, var2, this.cameraPitch, false);
            this.scene.clearTemporaryLocs((byte) 104);
            this.draw2DEntityElements(this._flowObfuscator13);
            this.drawTileHint(-252);
            this.updateTextures(854, var9);
            this.draw3DEntityElements(8);
            this.areaViewport.draw(4, 23680, super.graphics, 4);
            this.cameraX = var3;
            this.cameraY = var4;
            this.cameraZ = var5;
            this.cameraPitch = var6;
            this.cameraYaw = var7;
        }
    }

    @OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
    public final void closeInterfaces(int arg0) {
        this.out.p1isaac((byte) 6, 130);
        if (this.sidebarInterfaceId != -1) {
            this.sidebarInterfaceId = -1;
            this.redrawSidebar = true;
            this.pressedContinueOption = false;
            this.redrawSideicons = true;
        }
        if (this.chatInterfaceId != -1) {
            this.chatInterfaceId = -1;
            this.redrawChatback = true;
            this.pressedContinueOption = false;
        }
        this.viewportInterfaceId = -1;
        if (arg0 <= 0) {
            this.out.p1(13);
        }
    }

    static {
        int var0 = 0;
        int var1;
        for (var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            levelExperience[var1] = var0 / 4;
        }
        RSA_EXPONENT = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        _flowObfuscator29 = -192;
        CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        _flowObfuscator37 = 9;
        DESIGN_HAIR_COLOR = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        _flowObfuscator41 = true;
        BITMASK = new int[32];
        var0 = 2;
        for (var1 = 0; var1 < 32; var1++) {
            BITMASK[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
