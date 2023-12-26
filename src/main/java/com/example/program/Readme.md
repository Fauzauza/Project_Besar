### Spesifikasi Program: "Sistem Pemesanan Makanan - Restoran Pelopor"

### 1. Deskripsi Program:
Program ini adalah aplikasi pemesanan makanan yang dirancang untuk Restoran Pelopor. Melalui antarmuka grafis menggunakan JavaFX, pengguna dapat menjelajahi menu, memilih kategori, memesan makanan, mengelola jumlah pesanan, dan melakukan transaksi pembayaran.

### 2. Kelas Utama: `PemesananMakananApp`

#### 2.1. **Metode Utama:**
- `main(String[] args)`: Metode utama untuk menjalankan aplikasi.

#### 2.2. **Kelas Bantuan:**
- `MenuManager`: Kelas yang mengelola logika utama aplikasi.
- `Order`: Kelas yang merepresentasikan pesanan pelanggan.
- `Menu` (Interface): Interface yang menyediakan spesifikasi untuk objek menu.
- `Category`: Kelas yang mengelola kategori menu.
- `MenuItem`: Implementasi dari interface `Menu`, merepresentasikan item menu.

### 3. Fitur Utama:

#### 3.1. **Tampilan Menu:**
- Menampilkan kategori menu: Makanan Utama, Makanan Pembuka, Desserts.
- Menampilkan item menu dalam setiap kategori.

#### 3.2. **Pemesanan:**
- Pengguna dapat memilih kategori dan melihat daftar menu.
- Memungkinkan pengguna untuk memilih menu, menentukan jumlah pesanan, dan menambahkannya ke dalam pesanan.

#### 3.3. **Penanganan Pesanan:**
- Menampilkan rincian pesanan saat ini, termasuk jumlah dan harga.
- Memungkinkan pengguna untuk menghapus pesanan atau mengurangi jumlah pesanan.

#### 3.4. **Pengaturan Nama Pemesan:**
- Pengguna dapat memasukkan nama pemesan.
- Validasi nama untuk memastikan hanya huruf dan spasi yang diperbolehkan.

#### 3.5. **Pembayaran:**
- Menghitung total harga pesanan.
- Memungkinkan pengguna untuk memasukkan jumlah pembayaran.
- Menampilkan total bayar dan kembalian.
- Menyimpan rincian pembayaran ke dalam pesanan.

#### 3.6. **Penyimpanan Pesanan ke File:**
- Menyimpan rincian pesanan (nama pemesan, item pesanan, total harga) ke dalam file teks dengan format yang sesuai.

#### 3.7. **Cetak Struk ke File:**
- Memungkinkan pengguna untuk memasukkan jumlah uang yang dibayarkan.
- Menyimpan struk pembayaran ke dalam file teks dengan format yang sesuai.

### 4. Penggunaan Teknologi:

- Menggunakan JavaFX untuk antarmuka grafis.
- Menyimpan rincian pesanan dan struk pembayaran dalam file teks.

### 5. Keamanan dan Defensive Programming:

- **Validasi Nama Pemesan:**
    - Memastikan input nama hanya mengandung huruf dan spasi.

- **Validasi Jumlah Pesanan:**
    - Mencegah jumlah pesanan menjadi negatif.

- **Pengecekan Pembayaran Cukup:**
    - Menyediakan validasi saat pembayaran untuk memastikan jumlah yang dibayarkan mencukupi.

- **Handling Eksepsi:**
    - Menangani eksepsi saat penulisan ke file atau saat parsing input angka.

- **Validasi Input Kategori dan Menu:**
    - Memastikan bahwa kategori dan menu yang dipilih adalah valid sebelum menambahkannya ke pesanan.

- **Validasi Pembayaran Input:**
    - Menangani input yang tidak valid saat mencetak struk ke file.

### 6. Fungsionalitas Tambahan:

- Pilihan untuk mencetak struk langsung atau menyimpan ke file.
- Kemampuan untuk mengatur dan mengubah jumlah pesanan dengan tombol plus dan minus.
- Pilihan untuk menghapus item pesanan dari daftar.

### 7. Catatan Tambahan:

- Program ini memberikan pengguna pengalaman berinteraksi yang intuitif untuk melakukan pemesanan makanan dan pembayaran.
- Interface yang ramah pengguna dan fitur defensif meningkatkan keandalan dan keamanan aplikasi.
- Pembagian logika antara kelas-kelas membantu dalam pemeliharaan dan perluasan kode di masa depan.
- Program ini dirancang untuk dapat dengan mudah diintegrasikan dengan database atau sistem backend lainnya di masa mendatang.