package domain.entity;

/**
 * Jenis transaksi keuangan.
 * Urutan deklarasi dipakai sebagai urutan natural (pemasukan lebih dulu).
 */
public enum TransactionType {
    /** Uang masuk (menambah saldo). */
    INCOME,

    /** Uang keluar (mengurangi saldo). */
    EXPENSE
}
