package domain.entity;

/**
 * Entity inti yang merepresentasikan satu transaksi keuangan.
 * Berada di layer domain — tidak bergantung pada layer lain dan bebas dari
 * urusan tampilan maupun penyimpanan.
 */
public class Transaction {
    /** ID unik transaksi, tidak boleh diubah setelah dibuat. */
    private final int id;

    /** Keterangan transaksi. */
    private String description;

    /** Nominal transaksi dalam Rupiah (selalu positif). */
    private long amount;

    /** Jenis transaksi: pemasukan atau pengeluaran. */
    private TransactionType type;

    /** Membuat transaksi baru. Nominal harus lebih dari 0. */
    public Transaction(int id, String description, long amount, TransactionType type) {
        requirePositive(amount);
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public long getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    /** Mengubah keterangan transaksi. */
    public void changeDescription(String description) {
        this.description = description;
    }

    /** Mengubah nominal transaksi. Nominal harus lebih dari 0. */
    public void changeAmount(long amount) {
        requirePositive(amount);
        this.amount = amount;
    }

    /** Mengubah jenis transaksi. */
    public void changeType(TransactionType type) {
        this.type = type;
    }

    /** Aturan domain: nominal transaksi harus lebih dari 0. */
    private static void requirePositive(long amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Nominal transaksi harus lebih dari 0");
        }
    }
}
