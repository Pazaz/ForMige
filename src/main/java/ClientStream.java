import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NQABEVLK")
public class ClientStream implements Runnable {

    @OriginalMember(owner = "client!NQABEVLK", name = "a", descriptor = "I")
    private int _flowObfuscator1 = -53;

    @OriginalMember(owner = "client!NQABEVLK", name = "b", descriptor = "Z")
    private boolean _flowObfuscator2 = true;

    @OriginalMember(owner = "client!NQABEVLK", name = "c", descriptor = "I")
    private int _flowObfuscator3 = 519;

    @OriginalMember(owner = "client!NQABEVLK", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream in;

    @OriginalMember(owner = "client!NQABEVLK", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream out;

    @OriginalMember(owner = "client!NQABEVLK", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket socket;

    @OriginalMember(owner = "client!NQABEVLK", name = "g", descriptor = "Z")
    private boolean dummy = false;

    @OriginalMember(owner = "client!NQABEVLK", name = "h", descriptor = "LKHACHIFW;")
    public GameShell shell;

    @OriginalMember(owner = "client!NQABEVLK", name = "i", descriptor = "[B")
    private byte[] data;

    @OriginalMember(owner = "client!NQABEVLK", name = "j", descriptor = "I")
    private int tcyl;

    @OriginalMember(owner = "client!NQABEVLK", name = "k", descriptor = "I")
    private int tnum;

    @OriginalMember(owner = "client!NQABEVLK", name = "l", descriptor = "Z")
    private boolean writer = false;

    @OriginalMember(owner = "client!NQABEVLK", name = "m", descriptor = "Z")
    private boolean ioerror = false;

    @OriginalMember(owner = "client!NQABEVLK", name = "<init>", descriptor = "(LKHACHIFW;ILjava/net/Socket;)V")
    public ClientStream(GameShell arg0, int arg1, Socket arg2) throws IOException {
        while (arg1 >= 0) {
            this._flowObfuscator2 = !this._flowObfuscator2;
        }
        this.shell = arg0;
        this.socket = arg2;
        this.socket.setSoTimeout(30000);
        this.socket.setTcpNoDelay(true);
        this.in = this.socket.getInputStream();
        this.out = this.socket.getOutputStream();
    }

    @OriginalMember(owner = "client!NQABEVLK", name = "a", descriptor = "()V")
    public void close() {
        this.dummy = true;
        try {
            if (this.in != null) {
                this.in.close();
            }
            if (this.out != null) {
                this.out.close();
            }
            if (this.socket != null) {
                this.socket.close();
            }
        } catch (IOException var3) {
            System.out.println("Error closing stream");
        }
        this.writer = false;
        synchronized (this) {
            this.notify();
        }
        this.data = null;
    }

    @OriginalMember(owner = "client!NQABEVLK", name = "b", descriptor = "()I")
    public int read() throws IOException {
        return this.dummy ? 0 : this.in.read();
    }

    @OriginalMember(owner = "client!NQABEVLK", name = "c", descriptor = "()I")
    public int available() throws IOException {
        return this.dummy ? 0 : this.in.available();
    }

    @OriginalMember(owner = "client!NQABEVLK", name = "a", descriptor = "([BII)V")
    public void read(byte[] arg0, int arg1, int arg2) throws IOException {
        if (!this.dummy) {
            while (arg2 > 0) {
                int var4 = this.in.read(arg0, arg1, arg2);
                if (var4 <= 0) {
                    throw new IOException("EOF");
                }
                arg1 += var4;
                arg2 -= var4;
            }
        }
    }

    @OriginalMember(owner = "client!NQABEVLK", name = "a", descriptor = "(II[BI)V")
    public void write(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (!this.dummy) {
            if (this.ioerror) {
                this.ioerror = false;
                throw new IOException("Error in writer thread");
            } else {
                if (this.data == null) {
                    this.data = new byte[5000];
                }
                synchronized (this) {
                    for (int var7 = 0; var7 < arg0; var7++) {
                        this.data[this.tnum] = arg2[var7 + arg3];
                        this.tnum = (this.tnum + 1) % 5000;
                        if (this.tnum == (this.tcyl + 4900) % 5000) {
                            throw new IOException("buffer overflow");
                        }
                    }
                    if (!this.writer) {
                        this.writer = true;
                        this.shell.startThread(this, 3);
                    }
                    this.notify();
                }
                if (arg1 != 0) {
                    this._flowObfuscator3 = 255;
                }
            }
        }
    }

    @OriginalMember(owner = "client!NQABEVLK", name = "run", descriptor = "()V")
    public void run() {
        while (this.writer) {
            int var1;
            int var2;
            synchronized (this) {
                if (this.tnum == this.tcyl) {
                    try {
                        this.wait();
                    } catch (InterruptedException var7) {
                    }
                }
                if (!this.writer) {
                    return;
                }
                var2 = this.tcyl;
                if (this.tnum >= this.tcyl) {
                    var1 = this.tnum - this.tcyl;
                } else {
                    var1 = 5000 - this.tcyl;
                }
            }
            if (var1 > 0) {
                try {
                    this.out.write(this.data, var2, var1);
                } catch (IOException var6) {
                    this.ioerror = true;
                }
                this.tcyl = (this.tcyl + var1) % 5000;
                try {
                    if (this.tnum == this.tcyl) {
                        this.out.flush();
                    }
                } catch (IOException var5) {
                    this.ioerror = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!NQABEVLK", name = "a", descriptor = "(B)V")
    public void debug(byte arg0) {
        if (arg0 != 1) {
            this._flowObfuscator1 = 457;
        }
        System.out.println("dummy:" + this.dummy);
        System.out.println("tcycl:" + this.tcyl);
        System.out.println("tnum:" + this.tnum);
        System.out.println("writer:" + this.writer);
        System.out.println("ioerror:" + this.ioerror);
        try {
            System.out.println("available:" + this.available());
        } catch (IOException var2) {
        }
    }
}
