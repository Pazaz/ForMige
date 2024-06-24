import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GCPOSBWX")
public class LruCache {

    @OriginalMember(owner = "client!GCPOSBWX", name = "a", descriptor = "Z")
    private boolean _flowObfuscator1 = false;

    @OriginalMember(owner = "client!GCPOSBWX", name = "b", descriptor = "I")
    private static int _flowObfuscator2;

    @OriginalMember(owner = "client!GCPOSBWX", name = "c", descriptor = "Z")
    private boolean _flowObfuscator3 = false;

    @OriginalMember(owner = "client!GCPOSBWX", name = "d", descriptor = "I")
    private int _flowObfuscator4;

    @OriginalMember(owner = "client!GCPOSBWX", name = "e", descriptor = "I")
    private int _flowObfuscator5;

    @OriginalMember(owner = "client!GCPOSBWX", name = "f", descriptor = "LPPOHBEGB;")
    private DoublyLinkable search = new DoublyLinkable();

    @OriginalMember(owner = "client!GCPOSBWX", name = "g", descriptor = "I")
    private int capacity;

    @OriginalMember(owner = "client!GCPOSBWX", name = "h", descriptor = "I")
    private int available;

    @OriginalMember(owner = "client!GCPOSBWX", name = "i", descriptor = "LARZPHHDH;")
    private HashTable table;

    @OriginalMember(owner = "client!GCPOSBWX", name = "j", descriptor = "LBISVHPUN;")
    private DoublyLinkList history = new DoublyLinkList(_flowObfuscator2);

    @OriginalMember(owner = "client!GCPOSBWX", name = "<init>", descriptor = "(ZI)V")
    public LruCache(boolean arg0, int arg1) {
        this.capacity = arg1;
        this.available = arg1;
        this.table = new HashTable(-877, 1024);
        if (arg0) {
            _flowObfuscator2 = -225;
        }
    }

    @OriginalMember(owner = "client!GCPOSBWX", name = "a", descriptor = "(J)LPPOHBEGB;")
    public DoublyLinkable get(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.table.get(arg0);
        if (var3 != null) {
            this.history.addTail(var3);
            this._flowObfuscator5++;
        } else {
            this._flowObfuscator4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!GCPOSBWX", name = "a", descriptor = "(LPPOHBEGB;JB)V")
    public void put(DoublyLinkable arg0, long arg1, byte arg2) {
        if (arg2 != 2) {
            this._flowObfuscator3 = !this._flowObfuscator3;
        }
        if (this.available == 0) {
            DoublyLinkable var5 = this.history.removeHead();
            var5.unlink();
            var5.unlinkDouble();
            if (var5 == this.search) {
                var5 = this.history.removeHead();
                var5.unlink();
                var5.unlinkDouble();
            }
        } else {
            this.available--;
        }
        this.table.put(arg0, arg1, (byte) 7);
        this.history.addTail(arg0);
        if (Linkable._flowObfuscator2) {
        }
    }

    @OriginalMember(owner = "client!GCPOSBWX", name = "a", descriptor = "()V")
    public void clear() {
        while (true) {
            DoublyLinkable var1 = this.history.removeHead();
            if (var1 == null) {
                this.available = this.capacity;
                return;
            }
            var1.unlink();
            var1.unlinkDouble();
        }
    }
}
